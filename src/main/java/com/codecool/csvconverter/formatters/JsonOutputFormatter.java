package com.codecool.csvconverter.formatters;

public class JsonOutputFormatter extends OutputFormatter {

    public void appendElementsToStringBuilder(StringBuilder sb, String[] elements) {
        sb.append("{");
        for (int i=0;i<elements.length;i++) {
            if (elements[i].equals("")){
                continue;
            }
            sb.append('"');
            sb.append(elements[i]);
            sb.append('"');
            if (i != elements.length -1) {
                sb.append(", ");
            }
        }
        sb.append("}");
    }
}
