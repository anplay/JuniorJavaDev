package com.lessons.lesson2;

import com.lessons.lesson5.Person;
import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by dev-anplay on 13.10.2014.
 */
public class HelpersArrays {
    public int[] merge(int[] firstArray, int[] secondArray){
        return new int[] {1, 2};
    }
    public int getLengthResultArrayForInner(int[] firstArray, int[] secondArray) {
        int lengthNewArray = 0;
        for (int aFirstArray : firstArray) {
            for (int aSecondArray : secondArray) {
                if (aFirstArray == aSecondArray) {
                    lengthNewArray++;
                    break;
                }
            }
        }
        return lengthNewArray;
    }

    public Person[] mergePersonArray(Person[] personArray1, Person[] personArray2){
        if ((personArray1 == null) || (personArray2 == null))  return new Person[] {};
        int lengthNewArray = getLengthResultArrayForMerge(personArray1, personArray2);
        Person[] resultArray = new Person[lengthNewArray];
        int first = 0;
        for (Person aFirstArray : personArray1) {
            for (Person aSecondArray : personArray2) {
                if (aFirstArray.equals(aSecondArray)) {
                    resultArray[first] = aFirstArray;
                    first++;
                    break;
                }
            }
        }
        return resultArray;
    }

    public int getLengthResultArrayForMerge(Person[] firstArray, Person[] secondArray) {
        int lengthNewArray = 0;
        for (Person aFirstArray : firstArray) {
            for (Person aSecondArray : secondArray) {
                if (aFirstArray.equals(secondArray)) {
                    lengthNewArray++;
                    break;
                }
            }
        }
        return lengthNewArray;
    }

    public int[] innerArray(int[] firstArray, int[] secondArray){
        if ((firstArray == null) || (secondArray == null))  return new int[] {};
        int lengthNewArray = getLengthResultArrayForInner(firstArray, secondArray);
        int[] resultArray = new int[lengthNewArray];
        int first = 0;
        for (int aFirstArray : firstArray) {
            for (int aSecondArray : secondArray) {
                if (aFirstArray == aSecondArray) {
                    resultArray[first] = aFirstArray;
                    first++;
                    break;
                }
            }
        }
        return resultArray;
    }

    public int getLengthResultArrayForOuter(int[] firstArray, int[] secondArray) {
        int lengthNewArray = 0;
        for (int aFirstArray1 : firstArray) {
            boolean check = false;
            for (int aSecondArray : secondArray) {
                if (aFirstArray1 == aSecondArray) {
                    check = true;
                    break;
                }
            }
            if (!check) lengthNewArray++;
        }
        for (int aSecondArray : secondArray) {
            boolean check = false;
            for (int aFirstArray : firstArray) {
                if (aFirstArray == aSecondArray) {
                    check = true;
                    break;
                }
            }
            if (!check) lengthNewArray++;
        }
        return lengthNewArray;
    }

    public int[] outerArray(int[] firstArray, int[] secondArray){
        if ((firstArray == null) || (secondArray == null)) return new int[] {};
        int lengthNewArray = getLengthResultArrayForOuter(firstArray, secondArray);
        int[] resultArray = new int[lengthNewArray];
        int first = 0;
        for (int aFirstArray1 : firstArray) {
            boolean check = false;
            for (int aSecondArray : secondArray) {
                if (aFirstArray1 == aSecondArray) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                resultArray[first] = aFirstArray1;
                first++;
            }
            ;
        }
        for (int aSecondArray : secondArray) {
            boolean check = false;
            for (int aFirstArray : firstArray) {
                if (aFirstArray == aSecondArray) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                resultArray[first] = aSecondArray;
                first++;
            }
            ;
        }
        return resultArray;
    }

    public int getLengthResultArrayForLeft(int[] firstArray, int[] secondArray) {
        int lengthNewArray = 0;
        for (int aFirstArray : firstArray) {
            for (int aSecondArray : secondArray) {
                if (aFirstArray == aSecondArray) {
                    lengthNewArray++;
                    break;
                }
            }
        }
        return lengthNewArray + firstArray.length;
    }

    public int[] leftArray(int[] firstArray, int[] secondArray) {
        if ((firstArray == null) || (firstArray.equals(new int[]{}))) return new int[] {};
        int lengthNewArray = getLengthResultArrayForLeft(firstArray, secondArray);
        int[] resultArray = new int[lengthNewArray];
        int first;
        for(first = 0; first < firstArray.length; first++){
            resultArray[first] = firstArray[first];
        }
        for (int aFirstArray : firstArray) {
            for (int aSecondArray : secondArray) {
                if (aFirstArray == aSecondArray) {
                    resultArray[first] = aFirstArray;
                    first++;
                    break;
                }
            }
        }
        return resultArray;
    }
}
