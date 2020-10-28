package com.codecool.csvconverter.formatters;

import java.io.File;

public class TableOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(File data) {
        System.out.println("Printing table");
    }
}
