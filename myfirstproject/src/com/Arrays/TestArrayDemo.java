package com.Arrays;

import java.util.Scanner;

public class TestArrayDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");

        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements:");

        for(int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();

        }

        System.out.println("Array elements are:");

        for(int i = 0; i < size; i++) {

            System.out.println(numbers[i]);

        }

        sc.close();

    }
}