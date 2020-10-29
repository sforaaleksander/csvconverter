package com.codecool.csvconverter.formatters;

import java.io.*;

public class TableOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(File data) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(data));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            String[] elements = line.split(",");
            appendElementsToStringBuilder(sb, elements);
            sb.append("\n");
        }
        System.out.println(sb.toString());
        System.out.println("Printing table");
    }

    private void appendElementsToStringBuilder(StringBuilder sb, String[] elements) {
        int rowSize = 15;
        for (String element : elements) {
            sb.append(" ");
            int spaces = rowSize - element.length();
            sb.append(element);
            for (int i = 0; i < spaces; i++) {
                sb.append(" ");
            }
            sb.append("|");
        }
    }
}