package com.codecool.csvconverter.formatters;

import com.codecool.csvconverter.FileReader;

public abstract class OutputFormatter {
    FileReader fileReader;

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void printToConsole() {
        String line;
        StringBuilder sb = new StringBuilder();
        while (fileReader.hasLine()) {
            line = fileReader.read();
            String[] elements = line.split(",");
            appendElementsToStringBuilder(sb, elements);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    abstract void appendElementsToStringBuilder(StringBuilder sb, String[] elements);
}
