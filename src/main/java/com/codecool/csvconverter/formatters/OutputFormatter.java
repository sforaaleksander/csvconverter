package com.codecool.csvconverter.formatters;

import java.io.*;

public interface OutputFormatter {

   default void printToConsole(File data) throws IOException {
       BufferedReader bufferedReader;
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
   }

    void appendElementsToStringBuilder(StringBuilder sb, String[] elements);
}
