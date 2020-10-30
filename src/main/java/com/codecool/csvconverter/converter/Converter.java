package com.codecool.csvconverter.converter;

import com.codecool.csvconverter.filereader.FileReader;
import com.codecool.csvconverter.formatters.OutputFormatter;
import com.codecool.csvconverter.formatters.OutputFormatterFactory;
import com.codecool.csvconverter.formatters.SupportedFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    private final FileReader fileReader;

    @Autowired
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
