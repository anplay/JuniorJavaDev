package com.lessons.lesson5;

/**
 * Created by dev-anplay on 21.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("Uasya")
                .secondName("Ivanov")
                .email("uasya@ivanov.com")
                .phone("00-00-00-00")
                .build();

        Person copyPerson = new Person.Builder(person)
                .phone("99-99-99-99")
                .build();

        System.out.println(person.toString());
        System.out.println(copyPerson.toString());

    }
}
