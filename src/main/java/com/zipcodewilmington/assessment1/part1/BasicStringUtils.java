package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder newStr = new StringBuilder();
        Character newChar = (str.charAt(0));
        newStr.append(newChar.toString().toUpperCase());
        newStr.append(str.substring(1));
        return newStr.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        return reversedStr.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String reversedString = reverse(str);
        return  camelCase(reversedString);
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder strWithFirstAndLastCharacterRemoved = new StringBuilder();
        for (int i =1; i <str.length()-1; i++) {
            strWithFirstAndLastCharacterRemoved.append(str.charAt(i));
        }
        return strWithFirstAndLastCharacterRemoved.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] invertedCase = str.toCharArray();
        for (int currentCharCount = 0; currentCharCount <str.length() ; currentCharCount++) {
            char currentChar = invertedCase[currentCharCount];
            if (Character.isUpperCase(currentChar)) {
                invertedCase[currentCharCount] = Character.toLowerCase(currentChar);
            }
            else if(Character.isLowerCase(currentChar)) {
                invertedCase[currentCharCount] = Character.toUpperCase(currentChar);
            }

        }
        return new String(invertedCase);
    }
}
