/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays.testproblems;

/**
 *
 * @author Deepak Dangi
 */
public class PyramidOfAlphabets7 {
    
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Adjust the number of spaces for formatting
            }

            // Print characters in increasing order
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }

            // Print characters in decreasing order (excluding 'A')
            for (int j = i - 1; j >= 1; j--) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }

            System.out.println(); 
        }
    }
}
