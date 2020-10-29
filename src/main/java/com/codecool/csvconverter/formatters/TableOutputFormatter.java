package com.codecool.csvconverter.formatters;

public class TableOutputFormatter implements OutputFormatter {

    @Override
    public void appendElementsToStringBuilder(StringBuilder sb, String[] elements) {
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