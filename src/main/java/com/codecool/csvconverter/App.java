package com.codecool.csvconverter;

import com.codecool.csvconverter.converter.Converter;
import com.codecool.csvconverter.filereader.FileReader;
import com.codecool.csvconverter.formatters.SupportedFormat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.File;

public class App
{
    public static void main( String[] args )
    {
        if (args.length < 1) {
            System.out.println("Please provide file name to convert");
            return;
        }

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/config.xml");

        File file = new File(args[0]);

        FileReader fileReader = (FileReader) applicationContext.getBean("fileReader");
        
        fileReader.setFile(file);

        Converter converter = (Converter) applicationContext.getBean("converter", fileReader);
        if (args.length == 1) {
            converter.convert(SupportedFormat.TABLE);
            return;
        }
        converter.convert(SupportedFormat.valueOf(args[1].toUpperCase()));
    }
}
