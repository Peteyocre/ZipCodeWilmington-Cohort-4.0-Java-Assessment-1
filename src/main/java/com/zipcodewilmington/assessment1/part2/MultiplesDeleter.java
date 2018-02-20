package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        StringBuilder evenNumbersNotIncluded = new StringBuilder();
        for (int i =0; i < ints.length; i++) {
            if( ints[i] % 2 !=0) {
                evenNumbersNotIncluded.append(ints[i] + ", ");
            }
        }   System.out.println(evenNumbersNotIncluded);
        String[] oddNumberSt = evenNumbersNotIncluded.toString().split(", ");
        Integer[] oddNumbers = new Integer[oddNumberSt.length];
        for (int i =0; i<oddNumberSt.length; i++)
            oddNumbers[i] = Integer.parseInt(oddNumberSt[i]);
        return oddNumbers;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        StringBuilder oddNumbersNotIncluded = new StringBuilder();
        for (int i =0; i < ints.length; i++) {
            if(ints[i] % 2 ==0) {
                oddNumbersNotIncluded.append(ints[i] + ", ");
            }
        }   System.out.println(oddNumbersNotIncluded);
        String[] evenNumberSt = oddNumbersNotIncluded.toString().split(", ");
        Integer[] evenNumbers = new Integer[evenNumberSt.length];
        for (int i =0; i<evenNumberSt.length; i++)
            evenNumbers[i] = Integer.parseInt(evenNumberSt[i]);
        return evenNumbers;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        StringBuilder multiplesOf3NotIncluded = new StringBuilder();
        for (int i =0; i < ints.length; i++) {
            if(ints[i] % 3 != 0) {
                multiplesOf3NotIncluded.append(ints[i] + ", ");
            }
        }   System.out.println(multiplesOf3NotIncluded);
        String[] mult3NumberSt = multiplesOf3NotIncluded.toString().split(", ");
        Integer[] mult3Numbers = new Integer[mult3NumberSt.length];
        for (int i =0; i<mult3NumberSt.length; i++)
            mult3Numbers[i] = Integer.parseInt(mult3NumberSt[i]);
        return mult3Numbers;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        StringBuilder multiplesOfNNotIncluded = new StringBuilder();
        for (int i =0; i < ints.length; i++) {
            if(ints[i] % multiple != 0) {
                multiplesOfNNotIncluded.append(ints[i] + ", ");
            }
        }   System.out.println(multiplesOfNNotIncluded);
        String[] multNNumberSt = multiplesOfNNotIncluded.toString().split(", ");
        Integer[] multNNumbers = new Integer[multNNumberSt.length];
        for (int i =0; i<multNNumberSt.length; i++)
            multNNumbers[i] = Integer.parseInt(multNNumberSt[i]);
        return multNNumbers;

    }
}
