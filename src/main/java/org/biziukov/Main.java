package org.biziukov;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Serialize to JSON
        Person person = new Person("Mikhail", "Mikhailov", 30);
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        System.out.println("Person в виде json:\n" + personJson);

        // Deserialize from JSON
        Person personFromJson = gson.fromJson(personJson, Person.class);
        System.out.println("Десериализованный из json объект Person:\n" + personFromJson);
    }
}