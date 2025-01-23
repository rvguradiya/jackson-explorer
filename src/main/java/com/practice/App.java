package com.practice;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            // convert object to json
            System.out.println("Hello World!");
            Person person = new Person("John Doe", 30);
            JacksonExample.convertToJSON(person);

            // convert Jsont to object
            JacksonExample.convertToObj("{\"name\":\"John\",\"age\":30}", Person.class);

            // with additional parameter
            Employee emp = new Employee("Emp name",27,"password");
            JacksonExample.convertToJSON(emp);
            // convert to objet
            JacksonExample.convertToObj("{\"full_name\":\"John\",\"age\":30}", Employee.class);

            // Serialize and Deserialize to JSON/Obj
            List<Person> persons = Arrays.asList(person, new Person("ravi patidar",27));
            JacksonExample.convertToJSON(persons);
            JacksonExample.convertToList("[{\"full_name\":\"Alice\",\"age\":30},{\"full_name\":\"Bob\",\"age\":25}]", persons);

            // Json tree model
            JacksonExample.treeModel("{\"name\":\"John\",\"age\":30}");


            // Streaming API
            StreamAPI.parseJSON(); // JSONParsing
            StreamAPI.jsonGenerator();
        }
            catch ( Exception e ){
            e.printStackTrace();
        }
    }
}
