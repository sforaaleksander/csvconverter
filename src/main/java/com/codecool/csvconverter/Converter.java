package com.codecool.csvconverter;

import com.codecool.csvconverter.formatters.OutputFormatter;
import com.codecool.csvconverter.formatters.OutputFormatterFactory;
import com.codecool.csvconverter.formatters.SupportedFormat;


public class Converter {
    private FileReader fileReader;

    public Converter(FileReader fileReader) {
    this.fileReader = fileReader;
    }

    public void convert(SupportedFormat format) {
        OutputFormatter outputFormatter = new OutputFormatterFactory().createByFormat(format);
        outputFormatter.setFileReader(fileReader);
        outputFormatter.printToConsole();
        System.out.println("converting to output format");
    }
}
