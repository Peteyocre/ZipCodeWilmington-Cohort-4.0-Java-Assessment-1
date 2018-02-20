package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++)
            if (objectToCount.equals(objectArray[i])) {
                count++;
            }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {


        int countIfTrue = 0;
        int countOccurences = getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] arrayWithoutRemovedObject = new Integer[objectArray.length -countOccurences];
        for (int p =0; p < objectArray.length; p++) {
            if (!objectArray[p].equals(objectToRemove)) {
                arrayWithoutRemovedObject[countIfTrue] = objectArray[p];
                countIfTrue++;
            }
        }
        return arrayWithoutRemovedObject;
    }

    public static String[] removeValue(String[] objectArray, String objectToRemove) {


        int countIfTrue = 0;
        int countOccurences = getNumberOfOccurrences(objectArray, objectToRemove);
        String[] arrayWithoutRemovedObject = new String[objectArray.length -countOccurences];
        for (int p =0; p < objectArray.length; p++) {
            if (!objectArray[p].equals(objectToRemove)) {
                arrayWithoutRemovedObject[countIfTrue] = objectArray[p];
                countIfTrue++;
            }
        }
        return arrayWithoutRemovedObject;
    }

    public static Character[] removeValue(Character[] objectArray, Character objectToRemove) {


        int countIfTrue = 0;
        int countOccurences = getNumberOfOccurrences(objectArray, objectToRemove);
        Character[] arrayWithoutRemovedObject = new Character[objectArray.length -countOccurences];
        for (int p =0; p < objectArray.length; p++) {
            if (!objectArray[p].equals(objectToRemove)) {
                arrayWithoutRemovedObject[countIfTrue] = objectArray[p];
                countIfTrue++;
            }
        }
        return arrayWithoutRemovedObject;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        int count = 0;
        int newCount;
        int currentHighestOccurence =objectArray[0];
        int temporaryInteger;
        for (int i =0; i <objectArray.length; i++) {
            temporaryInteger = objectArray[i];
            newCount =0;
            for (int p = 0; p < objectArray.length; p++) {
                if (temporaryInteger == objectArray[p]) {
                    newCount++;
                }
            } if (newCount > count) {
                currentHighestOccurence =temporaryInteger;
            }

        }

        return currentHighestOccurence;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        int count = 0;
        int newCount;
        int currentLowestOccurence =objectArray[0];
        int temporaryInteger;
        for (int i =0; i <objectArray.length; i++) {
            temporaryInteger = objectArray[i];
            newCount = 0;
            for (int p = 0; p < objectArray.length; p++) {
                if (temporaryInteger == objectArray[p]) {
                    newCount++;
                } if (count > newCount) {
                    currentLowestOccurence = temporaryInteger;
                }
            }

        }

        return currentLowestOccurence;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static <T> T[] mergeArrays(T[] objectArray, T[] objectArrayToAdd) {
        // initializes a generic array to be sized equal to the added lengths of both arrays
        T[] resultOfMergingTwoArrays = Arrays.copyOf(objectArray, objectArray.length + objectArrayToAdd.length);
        //copies the arrays to each other as long as there are only the two arrays
        System.arraycopy(objectArrayToAdd, 0, resultOfMergingTwoArrays, objectArray.length, objectArrayToAdd.length);
        return resultOfMergingTwoArrays;
    }
}
