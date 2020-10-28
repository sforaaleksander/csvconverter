package com.codecool.csvconverter;

public class Converter {
    private FileReader fileReader;

    public Converter(FileReader fileReader) {
    this.fileReader = fileReader;
    }

    public void convert(String fileName, SupportedFormat format) {
        System.out.println("converting to output format");
    }
}
