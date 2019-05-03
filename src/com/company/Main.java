package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String Str;

        Str = JOptionPane.showInputDialog(null, "Welcome, please enter a word:");

        JOptionPane.showMessageDialog(null,"The word " + Str + " is palindrome: " + isPalindrome(Str) );
    }
    public static boolean isPalindrome(String word) {
        int left  = 0;
        int right = word.length() -1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
