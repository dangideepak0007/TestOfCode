
package com.mycompany.arrays.testproblems;

public class StringToUppercase8 {

    public static String toUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 'a' + 'A');
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "hello world";
        String upperStr = toUpperCase(str);
        System.out.println(upperStr); // Output: "HELLO WORLD"

    }

}
