package com.lessons.lesson6;

import java.util.*;

/**
 * Created by dev-anplay on 23.10.2014.
 */
public class CollectionsHelper {

    public ArrayList<String> mergeList(ArrayList<String> firstList, ArrayList<String> secondList) {
        ArrayList<String> tempList = new ArrayList<String>();
        ArrayList<String> mergeList = new ArrayList<String>();

        tempList.addAll(firstList);
        tempList.addAll(secondList);

        Set<String> setList = new HashSet<String>(tempList);
        mergeList.addAll(setList);

        return mergeList;
    }

    public ArrayList<String> innerList(ArrayList<String> firstList, ArrayList<String> secondList){
        if ((firstList == null) || (secondList == null))  return new ArrayList<String>();
        ArrayList<String> resultList = new ArrayList<String>();
        for (String aFirstArray : firstList) {
                if (secondList.contains(aFirstArray)) {
                    resultList.add(aFirstArray);
                    break;
                }
        }
        return resultList;
    }
}
