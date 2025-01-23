package com.practice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;


import java.util.List;

public class JacksonExample {
    // Serialize list/Object to JSON
    public static <T> void convertToJSON(T obj) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonInString = objectMapper.writeValueAsString(obj);
        System.out.println("JSON: "+jsonInString);
    }

    // we create a generic method for convert JSON to object
    public static <T> void convertToObj(String jsonString, Class<T> cls)  throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        T obj = objectMapper.readValue(jsonString, cls);
        System.out.println(obj);
    }

    // we create a generic method for convert JSON to Collection object
    public static <T> void convertToList(String jsonString, List<T> list)  throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<T>> tyeRef = new TypeReference<List<T>>(){};   // creates an anonymous subclass of TypeReference
        list = objectMapper.readValue(jsonString, tyeRef);
        System.out.println("List :"+list);
    }

    // tree model, dynamic ways to get values
    public static void treeModel(String jsonString) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        String name = jsonNode.get("name").toString();
        int age = jsonNode.get("age").asInt();
        System.out.println("Name:"+name+", age:"+age);
    }
}