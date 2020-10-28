package com.codecool.csvconverter;

import com.codecool.csvconverter.formatters.OutputFormatter;
import com.codecool.csvconverter.formatters.OutputFormatterFactory;
import com.codecool.csvconverter.formatters.SupportedFormat;

import java.io.File;
import java.io.IOException;

public class Converter {
    private FileReader fileReader;

    public Converter(FileReader fileReader) {
    this.fileReader = fileReader;
    }

    public void convert(File file, SupportedFormat format) {
        OutputFormatter outputFormatter = new OutputFormatterFactory().createByFormat(format);
        try {
            outputFormatter.printToConsole(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("converting to output format");
    }
}
