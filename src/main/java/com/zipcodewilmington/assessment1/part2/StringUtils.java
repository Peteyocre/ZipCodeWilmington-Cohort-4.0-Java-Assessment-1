package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] splitWordsIntoAnArray = sentence.split("\\s+");
        for (int i =0; i <splitWordsIntoAnArray.length; i++) {
            splitWordsIntoAnArray[i] = splitWordsIntoAnArray[i].replaceAll("[^\\w]", "");
        }
        return splitWordsIntoAnArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] splitWordsIntoAnArray = getWords(sentence);
        return splitWordsIntoAnArray[0].toString();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String wordToReverse = getFirstWord(sentence);
        StringBuilder reversedWord = new StringBuilder(wordToReverse);
        String newString = reversedWord.reverse().toString();
        return newString;

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String wordToReverse = getFirstWord(sentence).toLowerCase();
        StringBuilder reversedWord = new StringBuilder(wordToReverse);
        String newString = reversedWord.reverse().toString();
        Character firstChar = newString.charAt(0);
        String firsCharacter = firstChar.toString().toUpperCase();
        return firsCharacter + newString.substring(1);
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        StringBuilder  wordConstructor = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            if (i != index) {
                wordConstructor.append(str.charAt(i));
            }
        }
        return wordConstructor.toString();
    }

}
