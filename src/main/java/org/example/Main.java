package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false

        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
        System.out.println(numberToWords(123));// "One Two Three"
        System.out.println(numberToWords(-12));// "Invalid Value"
    }

    public static boolean isPalindrome(int value){
        char[] chars = String.valueOf(value).replace("-","").toCharArray();
        int length = chars.length;

        //Palindrome kontrolu
        for( int i =0; i<length/2;i++){
            if(chars[i] != chars[length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int number){
        if(number<0){
            return false;
        }
        int sum =0;
        //Kendisi hariç bölenleri bulmak için
        for(int i=1; i < number ; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;

    }

    public static String numberToWords(int number){
        if(number<0) return "Invalid Value";

        String[] nums = String.valueOf(number).split("");
        String[] words= { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String result = "";

        for (String num:nums){
            result=result.concat(words[Integer.parseInt(num)]).concat(" ");
        }
        return result.trim();
    }
}
