package com.codecool.csvconverter.formatters;

import java.io.File;
import java.io.IOException;

public interface OutputFormatter {
    void printToConsole(File data) throws IOException;
}
