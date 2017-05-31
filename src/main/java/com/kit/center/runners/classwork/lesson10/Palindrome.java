package com.kit.center.runners.classwork.lesson10;


public class Palindrome {
        public static void main(String[] args) {
            String palindrome = "alla";
            boolean isPalindrome = true;
            for (int i = 0; i < palindrome.length() / 2; i++) {
                isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
            }
            if (isPalindrome)
                System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");
        }
    }

