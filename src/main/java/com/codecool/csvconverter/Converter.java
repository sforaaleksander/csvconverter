package com.codecool.csvconverter;

import com.codecool.csvconverter.formatters.SupportedFormat;

public class Converter {
    private FileReader fileReader;

    public Converter(FileReader fileReader) {
    this.fileReader = fileReader;
    }

    public void convert(String fileName, SupportedFormat format) {
        System.out.println("converting to output format");
    }
}
