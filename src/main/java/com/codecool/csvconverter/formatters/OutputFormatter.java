package com.codecool.csvconverter.formatters;

import com.codecool.csvconverter.filereader.FileReader;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class OutputFormatter {
    FileReader fileReader;

    @Autowired
    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void printToConsole() {
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = fileReader.nextLine()) != null) {
            String[] elements = line.split(",");
            appendElementsToStringBuilder(sb, elements);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    abstract void appendElementsToStringBuilder(StringBuilder sb, String[] elements);
}
