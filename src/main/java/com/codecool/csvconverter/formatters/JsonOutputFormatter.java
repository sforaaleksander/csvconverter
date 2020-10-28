package com.codecool.csvconverter.formatters;

import java.io.*;

public class JsonOutputFormatter implements OutputFormatter {
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
            sb.append("{");
            String[] elements = line.split(",");
            appendElementsToStringBuilder(sb, elements);
            sb.append("}");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        System.out.println("Printing json");
    }

    private void appendElementsToStringBuilder(StringBuilder sb, String[] elements) {
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
    }
}
