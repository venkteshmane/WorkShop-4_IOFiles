package com.UC14CSVFiles;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class OpenCSVWriter {
    private static final String STRING_ARRAY_SAMPLE = "C:\\Users\\user\\Desktop\\WorkShop4\\src\\com\\UC14\\AddressBook.csv";

    public static void main(String[] args) throws IOException {
        try (
            Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));

            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
        ) {
            String[] headerRecord = {"Name", "Email", "Phone", "Country"};
            csvWriter.writeNext(headerRecord);

            csvWriter.writeNext(new String[]{"Venktesh Mane", "venktesh.mane18@gmail.com", "+91-95787718", "India"});
            csvWriter.writeNext(new String[]{"Vineet Jadhav", "VineetJadhav@gmail.com", "+91-957872718", "India"});
        }
    }
}