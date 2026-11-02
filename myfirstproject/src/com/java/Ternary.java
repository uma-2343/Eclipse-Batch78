package com.java;

public class Ternary {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 1;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Maximum number is: " + max);
    }
}


