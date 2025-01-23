# Jackson Explorer

A Java project to explore the capabilities of the **Jackson library**, including:

- Object-to-JSON serialization
- JSON-to-Object deserialization
- Tree model usage for dynamic JSON handling
- Memory-efficient JSON parsing/generation using the Streaming API

## Project Details

- **Group ID**: `com.practice`
- **Artifact ID**: `jackson-explorer`
- **Version**: `1.0-SNAPSHOT`

## Prerequisites

- **Java Version**: `1.6` or later
- **Maven**: `3.6.0` or later

## Setup and Build

1. Clone this repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
    ```bash
   cd jackson-explorer
   ```
3. Build the project using Maven:
    ```bash
   cd jackson-explorer
   ```
## Running the Project

1. Clone this repository:
    ```bash
    mvn compile exec:java -Dexec.mainClass="com.practice.App"
    ```
   
2. Navigate to the project directory:
   ```bash
   mvn package
   java -cp target/jackson-explorer-1.0-SNAPSHOT.jar com.practice.App
   ```

## Key Features
- **ObjectMapper Usage**: Convert Java objects to JSON and vice versa.
- **Generic Methods**: Generic methods to handle different types of JSON serialization/deserialization.
- **Tree Model**: Extract dynamic fields from JSON using JsonNode.
- **Streaming API**: Parse and generate JSON in a memory-efficient way.

## Example Code
### Object to JSON Example
```java
Person person = new Person("John Doe", 30);
JacksonExample.convertToJSON(person);
```
### JSON to Object Example
```java
JacksonExample.convertToObj("{\"name\":\"John\",\"age\":30}", Person.class);
```
## License
This project is licensed under the MIT License.

 
