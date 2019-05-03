package com.company;

public class palindromo2 {

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;          // if chars are different, finished
            }
            left++;
            right--;
        }

        return true;                   // if finished, all chars were same
    }


}