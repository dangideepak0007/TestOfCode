package com.mycompany.arrays.testproblems;

import java.util.Arrays;

public class StringAscendingOrder5 {

    public static String arrangeAlphabets(String str) {
        char[] chararray = str.toCharArray();
        Arrays.sort(chararray);
        return new String(chararray);

    }

    public static void main(String[] args) {
        System.out.println("Q5=implement method to arrange all alphabet of any string in ascending order");
        String str = "hello world";
        String sortedStr = arrangeAlphabets(str);
        System.out.println(sortedStr); // Output: "dehllloorw"

    }
}
