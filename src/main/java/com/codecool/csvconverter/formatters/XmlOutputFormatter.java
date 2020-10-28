package com.codecool.csvconverter.formatters;

import java.io.File;

public class XmlOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(File data) {
        System.out.println("Printing Xml");
    }
}
