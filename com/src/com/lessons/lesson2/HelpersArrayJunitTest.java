package com.lessons.lesson2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by dev-anplay on 14.10.2014.
 */
public class HelpersArrayJunitTest {
    @Test
    public void testInnerUnion() throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("Test testOuterUnion");
//        initialize var inputs
        int[] firstArray = new int[] {1,5,4,23,65,32,78};;
        int[] secondArray = new int[] {3,5,24,4,1,2,34,45,32,5};

        int[] expectedValues = {1, 5, 4, 32};

//        init class to test
        HelpersArrays helpersArrays = new HelpersArrays();

//        invoke method on class to test
        int[] returnedValue = helpersArrays.innerArray(firstArray, secondArray);
        System.out.println("Inner Array - " + Arrays.toString(returnedValue));

//        assert return value
        Assert.assertArrayEquals("Arrays should be equals", expectedValues, returnedValue);
    }

    @Test
    public void testLeftUnion() {
        System.out.println("--------------------------------------");
        System.out.println("Test testLeftUnion");
//        initialize var inputs
        int[] firstArray = new int[] {1,4,8,7,9};
        int[] secondArray = new int[] {11,4,7,10,0};
        int[] expectedArray = {1,4,8,7,9,4,7};

        HelpersArrays helpersArrays = new HelpersArrays();
        System.out.println(helpersArrays.getLengthResultArrayForLeft(firstArray, secondArray));
        int[] returnedValue = helpersArrays.leftArray(firstArray, secondArray);
        System.out.println("LeftUnion result - " + Arrays.toString(returnedValue));

        Assert.assertArrayEquals("Arrays should be equals", expectedArray, returnedValue);
    }
    @Test
    public void testLeftUnionNullFirstArray() {
        System.out.println("--------------------------------------");
        System.out.println("Test testLeftUnion");
//        initialize var inputs
        int[] firstArray = null;
        int[] secondArray = new int[] {11,4,7,10,0};
        int[] expectedArray = {};

        HelpersArrays helpersArrays = new HelpersArrays();
        System.out.println(helpersArrays.getLengthResultArrayForLeft(firstArray, secondArray));
        int[] returnedValue = helpersArrays.leftArray(firstArray, secondArray);
        System.out.println("LeftUnion result - " + Arrays.toString(returnedValue));

        Assert.assertArrayEquals("Arrays should be equals", expectedArray, returnedValue);
    }
}
