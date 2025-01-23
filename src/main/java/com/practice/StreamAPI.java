package com.practice;

import com.fasterxml.jackson.core.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamAPI {


    public static void parseJSON() throws Exception {
        // to read file resource (that are packaged in jar)
        InputStream inputStream = StreamAPI.class.getClassLoader().getResourceAsStream("data.json");
        if (inputStream == null) {
            throw new FileNotFoundException("data.json not found in classpath");
        }

        // Create a JsonParser
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(inputStream);


        // Parse JSON token by token
        while (!parser.isClosed()) {
            JsonToken token = parser.nextToken(); // Read the next token

            if (token == JsonToken.FIELD_NAME) {
                String fieldName = parser.getCurrentName();
                System.out.println("Field Name: " + fieldName);

                // Move to the value token
                token = parser.nextToken();

                if ("name".equals(fieldName)) {
                    System.out.println("Name: " + parser.getValueAsString());
                } else if ("age".equals(fieldName)) {
                    System.out.println("Age: " + parser.getIntValue());
                } else if ("skills".equals(fieldName)) {
                    System.out.println("Skills:");
                    while (parser.nextToken() != JsonToken.END_ARRAY) {
                        System.out.println("- " + parser.getValueAsString());
                    }
                }
            }
        }
        parser.close();
    }

    // Generating the JSON
    public static void jsonGenerator() throws Exception{
    // Create a JsonGenerator
    JsonFactory factory = new JsonFactory();
    JsonGenerator generator = factory.createGenerator(new File("output.json"), JsonEncoding.UTF8);

    // Write JSON data token by token
        generator.writeStartObject(); // Start JSON Object

        generator.writeStringField("name", "Alice");
        generator.writeNumberField("age", 25);

        generator.writeFieldName("skills"); // Field Name
        generator.writeStartArray();       // Start Array
        generator.writeString("Java");
        generator.writeString("Python");
        generator.writeEndArray();         // End Array

        generator.writeEndObject();        // End JSON Object

        generator.close();
    }
}
