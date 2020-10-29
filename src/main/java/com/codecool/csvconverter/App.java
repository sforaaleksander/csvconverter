package com.codecool.csvconverter;

import com.codecool.csvconverter.converter.Converter;
import com.codecool.csvconverter.filereader.FileReader;
import com.codecool.csvconverter.formatters.SupportedFormat;

import java.io.File;

public class App
{
    public static void main( String[] args )
    {
        if (args.length < 1) {
            System.out.println("Please provide file name to convert");
            return;
        }
        File file = new File(args[0]);
        FileReader fileReader = new FileReader(file);
        Converter converter = new Converter(fileReader);
        if (args.length == 1) {
            converter.convert(SupportedFormat.TABLE);
            return;
        }
        converter.convert(SupportedFormat.valueOf(args[1].toUpperCase()));
    }
}
