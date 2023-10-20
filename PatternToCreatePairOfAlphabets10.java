
package com.mycompany.arrays.testproblems;

public class PatternToCreatePairOfAlphabets10 {
     
    public static char[][] charCount(String input) {
        input = input.toLowerCase();
        char inputCharArray[] = input.toCharArray();

        char vowel[] = {'a', 'e', 'i', 'o', 'u'};
        char vowelCount[][] = new char[5][2];
        int row = 0;
        for (char vowelChar : vowel) {
            int count = 0;
            for (char inputChar : inputCharArray) {
                if (vowelChar == inputChar) {
                    count++;
                }

            }
            vowelCount[row][0] = vowelChar;
            vowelCount[row][1] = (char) count;
            row++;
        }

        return vowelCount;

    }

//    public static String stringPair(String input) {
//
//        char inputCharArray[] = input.toCharArray();
//        int leftIndex = 0;
//        int rightIndex = input.length() - 1;
//        input = "";
//
//        while (rightIndex >= leftIndex) {
//            if (leftIndex != rightIndex) {
//                input = input.concat(String.valueOf(inputCharArray[leftIndex])).concat(String.valueOf(inputCharArray[rightIndex]));
//                leftIndex++;
//                rightIndex--;
//            } else {
//                input = input.concat(String.valueOf(inputCharArray[leftIndex]));
//                leftIndex++;
//                rightIndex--;
//            }
//        }
//        return input;
//    }

    public static void main(String[] args) {
        System.out.println("");
        char vowelCount[][] = charCount("ye jo desh he mera swedesh he mera...");
        for (int i = 0; i < vowelCount.length; i++) {
            System.out.println(vowelCount[i][0] + " " + (int) vowelCount[i][1]);
        }

      //  System.out.println(stringPair("abcdef1234566"));
    }
}
