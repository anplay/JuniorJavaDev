package com.lessons.lesson2;

import com.lessons.lesson5.Person;
import com.lessons.lesson5.ServiceForDelegation;

import java.util.Arrays;

/**
 * Created by dev-anplay on 13.10.2014.
 */
public class Main {

    public static void main(String[] args) {
        int[] firstArray = new int[] {1,5,4,23,65,32,78};
        int[] secondArray = new int[] {3,5,24,4,1,2,34,45,32,5};
        HelpersArrays helpersArrays = new HelpersArrays();
        int[] resultArrayForInner = helpersArrays.innerArray(firstArray, secondArray);

        System.out.println("Inner Array - " + Arrays.toString(resultArrayForInner));
        int[] resultArrayForOuter = helpersArrays.outerArray(firstArray, secondArray);
        System.out.println("Outer Array - " + Arrays.toString(resultArrayForOuter));

        ServiceForDelegation serviceForDelegation = new ServiceForDelegation(helpersArrays);
        serviceForDelegation.mergePerson();
    }
}
