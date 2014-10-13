package com.lessons.lesson2;

import java.util.Arrays;

/**
 * Created by dev-anplay on 13.10.2014.
 */
public class Main {
    private static int[] firstArray = {1,5,4,23,65,32,78};
    private static int[] secondArray = {3,5,24,4,1,2,34,45,32,5};

    public static void main(String[] args) {
        int[] resultArrayForInner = HelpersArrays.innerArray(firstArray, secondArray);
        System.out.println("Inner Array - " + Arrays.toString(resultArrayForInner));
        int[] resultArrayForOuter = HelpersArrays.outerArray(firstArray, secondArray);
        System.out.println("Outer Array - " + Arrays.toString(resultArrayForOuter));
    }
}
