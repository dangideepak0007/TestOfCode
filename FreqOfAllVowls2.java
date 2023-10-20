
package com.mycompany.arrays.testproblems;

public class FreqOfAllVowls2 {
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
    
    public static void main(String[] args) {
        System.out.println("");
        char vowelCount[][] = charCount("ye jo desh he mera swedesh he mera...");
        for (int i = 0; i < vowelCount.length; i++) {
            System.out.println(vowelCount[i][0] + " " + (int) vowelCount[i][1]);
        }
    }
}

