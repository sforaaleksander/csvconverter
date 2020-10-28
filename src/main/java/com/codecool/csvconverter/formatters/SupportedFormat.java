package com.codecool.csvconverter.formatters;

public enum SupportedFormat {
    JSON("json"), XML("xml"), TABLE("table");

    String string;

    SupportedFormat(String string) {
        this.string = string;
    }
}
