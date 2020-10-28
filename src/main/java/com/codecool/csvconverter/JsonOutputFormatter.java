package com.codecool.csvconverter;

import java.io.File;

public class JsonOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(File data) {
        System.out.println("Printing json");
    }
}
