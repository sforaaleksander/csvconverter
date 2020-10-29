package com.codecool.csvconverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    BufferedReader bufferedReader;

    public FileReader(File file) {
        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "error occurred";
        }
    }

    public boolean hasLine(){
        try {
            return bufferedReader.readLine() != null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
