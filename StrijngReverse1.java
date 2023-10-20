
package com.mycompany.arrays.testproblems;

public class StrijngReverse1 {
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
    }      
}
    
