package com.mycompany.arrays.testproblems;

public class FirstOccurrenceOfNumber4 {

    public static int findFirstOccurrence(int[] array, int number) {
        int index = 0;

        while (index < array.length && array[index] != number) {
            index++;
        }

        if (index < array.length) {
            return index; // Return the index of the first occurrence
        } else {
            return -1; // Return -1 if the target number is not found
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 8, 15, 16, 23, 42, 15, 12, 7, 3, 9, 15, 6, 19, 1};
        int number = 7; // Change this to the desired number

        int firstOccurrenceIndex = findFirstOccurrence(array, number);

        if (firstOccurrenceIndex != -1) {
            System.out.println("The first occurrence of " + number + " is at index: " + firstOccurrenceIndex);
        } else {
            System.out.println(number + " was not found in the array.");
        }
    }
}
