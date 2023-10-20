
package com.mycompany.arrays.testproblems;

public class Test1 {
    //reverseString
    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        
        while (left < right) {
            // Swap the characters at the left and right indices
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            
            // Move the indices towards the center
            left++;
            right--;
        }
        
        return new String(characters);
    }

    public static void main(String[] args) {
        //Q1
        String originalStr = "Deepak Dangi";
        String reversedStr = reverseString(originalStr);
        System.out.println("Original String: " + originalStr);
        System.out.println("Reversed String: " + reversedStr);
        //Q2
        String input = "Hello, World!";
        int[] vowelFrequency = getVowelFrequency(input);
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i] + ": " + vowelFrequency[i]);
        }
    }
    public static int[] getVowelFrequency(String input) {
        int[] vowelFrequency = new int[5]; // Array to store frequencies for 'a', 'e', 'i', 'o', 'u'
        input = input.toLowerCase(); // Convert to lowercase to handle both cases

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a') {
                vowelFrequency[0]++;
            } else if (c == 'e') {
                vowelFrequency[1]++;
            } else if (c == 'i') {
                vowelFrequency[2]++;
            } else if (c == 'o') {
                vowelFrequency[3]++;
            } else if (c == 'u') {
                vowelFrequency[4]++;
            }
        }

        return vowelFrequency;
    }
}
     


