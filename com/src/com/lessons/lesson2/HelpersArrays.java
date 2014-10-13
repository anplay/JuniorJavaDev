package com.lessons.lesson2;

/**
 * Created by dev-anplay on 13.10.2014.
 */
public class HelpersArrays {
    public static int getLengthResultArrayForInner(int[] firstArray, int[] secondArray) {
        int lengthNewArray = 0;
        for(int i=0; i < firstArray.length; i++){
            for(int n=0; n < secondArray.length; n++){
                if (firstArray[i] == secondArray[n]){
                    lengthNewArray++;
                    break;
                }
            }
        }
        return lengthNewArray;
    }

    public static int[] innerArray(int[] firstArray, int[] secondArray){
        int lengthNewArray = getLengthResultArrayForInner(firstArray, secondArray);
        int[] resultArray = new int[lengthNewArray];
        int first = 0;
        for(int i=0; i < firstArray.length; i++){
            for(int n=0; n < secondArray.length; n++){
                if (firstArray[i] == secondArray[n]){
                    resultArray[first] = firstArray[i];
                    first++;
                    break;
                }
            }
        }
        return resultArray;
    }

    public static int getLengthResultArrayForOuter(int[] firstArray, int[] secondArray) {
        int lengthNewArray = 0;
        for(int i=0; i < firstArray.length; i++){
            boolean check = false;
            for(int n=0; n < secondArray.length; n++){
                if (firstArray[i] == secondArray[n]){
                    check = true;
                    break;
                }
            }
            if (!check) lengthNewArray++;
        }
        for(int i=0; i < secondArray.length; i++){
            boolean check = false;
            for(int n=0; n < firstArray.length; n++){
                if (firstArray[n] == secondArray[i]){
                    check = true;
                    break;
                }
            }
            if (!check) lengthNewArray++;
        }
        return lengthNewArray;
    }

    public static int[] outerArray(int[] firstArray, int[] secondArray){
        int lengthNewArray = getLengthResultArrayForOuter(firstArray, secondArray);
        int[] resultArray = new int[lengthNewArray];
        int first = 0;
        for(int i=0; i < firstArray.length; i++){
            boolean check = false;
            for(int n=0; n < secondArray.length; n++){
                if (firstArray[i] == secondArray[n]){
                    check = true;
                    break;
                }
            }
            if (!check) {
                resultArray[first] = firstArray[i];
                first++;
            };
        }
        for(int i=0; i < secondArray.length; i++) {
            boolean check = false;
            for (int n = 0; n < firstArray.length; n++) {
                if (firstArray[n] == secondArray[i]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                resultArray[first] = secondArray[i];
                first++;
            };
        }
        return resultArray;
    }
}
