package com.codecool.csvconverter;

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
        FileReader fileReader = new FileReader();
        Converter converter = new Converter(fileReader);
        if (args.length == 1) {
            converter.convert(file, SupportedFormat.TABLE);
            return;
        }
        converter.convert(file, SupportedFormat.valueOf(args[1].toUpperCase()));
    }
}
