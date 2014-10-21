package com.lessons.lesson5;

import com.lessons.lesson2.HelpersArrays;

/**
 * Created by dev-anplay on 21.10.2014.
 */
public class ServiceForDelegation {
    private final HelpersArrays helpersArrays;

    public ServiceForDelegation(HelpersArrays helpersArrays) {
        this.helpersArrays = helpersArrays;
    }
     public Person[] mergePerson(Person[] array1, Person[] array2) {
         System.out.println("Merge called");
         Person[] persons = helpersArrays.mergePersonArray(array1, array2);
         System.out.println(persons.toString());
         return persons;
     }
}
