package com.codecool.csvconverter;

public class App
{
    public static void main( String[] args )
    {
        if (args.length < 1) {
            System.out.println("Please provide file name to convert");
            return;
        }
        Converter converter = new Converter();
        if (args.length == 1) {
            converter.convert(args[0], SupportedFormat.TABLE);
            return;
        }
        converter.convert(args[1], SupportedFormat.valueOf(args[0].toUpperCase()));
    }
}
