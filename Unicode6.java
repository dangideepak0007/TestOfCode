/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays.testproblems;

/**
 *
 * @author Deepak Dangi
 */
public class Unicode6 {
    public static void main(String[] args) {
        int start = 50;
        int end = 200;

        for (int codePoint = start; codePoint <= end; codePoint++) {
            char character = (char) codePoint;
            System.out.println("Code Point: " + codePoint + " Character: " + character);
        }
    }
}


