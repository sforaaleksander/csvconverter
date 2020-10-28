package com.codecool.csvconverter.formatters;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(SupportedFormat outputFormat) {
        switch (outputFormat) {
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            default:
                return new TableOutputFormatter();
        }
    }
}

