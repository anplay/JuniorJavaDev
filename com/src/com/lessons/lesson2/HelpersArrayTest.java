package com.lessons.lesson2;

import java.util.Arrays;

/**
 * Created by dev-anplay on 14.10.2014.
 */
public class HelpersArrayTest {
    public static void main(String[] args) throws Exception {
        HelpersArrayTest test = new HelpersArrayTest();
        boolean[] arrayBooleal = new boolean[3];
        arrayBooleal[0] = test.testInnerUnion();
        arrayBooleal[1] =test.testInnerUnion_FirstArrayIsEmpty();
        arrayBooleal[2] =test.testInnerUnion_ArrayIsNull();
        int coutPassTests = 0;
        int coutFailTests = 0;
        for(boolean result: arrayBooleal){
            if (result)
                coutPassTests++;
            else
                coutFailTests++;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total test count: " + arrayBooleal.length);
        System.out.println("Success test count:  " + coutPassTests);
        System.out.println("Fail test count: " + coutFailTests);
        System.out.println("--------------------------------------");
    }

    public boolean testInnerUnion() throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("Test testInnerUnion");
//        initialize var inputs
        int[] firstArray = new int[] {1,5,4,23,65,32,78};
        int[] secondArray = new int[] {3,5,24,4,1,2,34,45,32,5};

        int[] expectedValues = {1, 5, 4, 32};

//        init class to test
        HelpersArrays helpersArrays = new HelpersArrays();

//        invoke method on class to test
        int[] returnedValue = helpersArrays.innerArray(firstArray, secondArray);
        System.out.println("Inner Array - " + Arrays.toString(returnedValue));

//        assert return value
        boolean assertResult = Arrays.equals(returnedValue, expectedValues);
        System.out.println("Is test successful = " + assertResult);
        return assertResult;
    }

    public boolean testInnerUnion_FirstArrayIsEmpty() throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("Test testOuterUnion_FirstArrayIsEmpty");
//        initialize var inputs
        int[] firstArray = new int[] {};
        int[] secondArray = new int[] {3,5,24,4,1,2,34,45,32,5};

        int[] expectedValues = {1};

//        init class to test
        HelpersArrays helpersArrays = new HelpersArrays();

//        invoke method on class to test
        int[] returnedValue = helpersArrays.innerArray(firstArray, secondArray);
        System.out.println("Inner Array - " + Arrays.toString(returnedValue));

//        assert return value
        boolean assertResult = Arrays.equals(returnedValue, expectedValues);
        System.out.println("Is test successful = " + assertResult);
        return assertResult;
    }

    public boolean testInnerUnion_ArrayIsNull() throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("Test testOuterUnion_ArrayIsNull");
//        initialize var inputs
        int[] firstArray = null;
        int[] secondArray = new int[] {3,5,24,4,1,2,34,45,32,5};

        int[] expectedValues = null;

//        init class to test
        HelpersArrays helpersArrays = new HelpersArrays();

//        invoke method on class to test
        int[] returnedValue = helpersArrays.innerArray(firstArray, secondArray);
        System.out.println("Inner Array - " + Arrays.toString(returnedValue));

//        assert return value
        boolean assertResult = Arrays.equals(returnedValue, expectedValues);
        System.out.println("Is test successful = " + assertResult);
        return assertResult;
    }
}
