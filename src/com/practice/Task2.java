package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, pass the size of your array:");

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("This is not the integer number, please try once again:");
        }

        //size of array
        int size = sc.nextInt();

        int[] numbers = new int[size];
        double avgArray;
        int sumArray = 0;
        int maxValueArray;

        System.out.println("Please, pass " + size + " numbers.");
        //getting the numbers to array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " number:");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("This is not the integer number, please try once again:");
            }
            numbers[i] = sc.nextInt();

            //sum of Array numbers
            sumArray += numbers[i];
        }

        //maxValue of Array
        Arrays.sort(numbers);
        maxValueArray = numbers[numbers.length - 1];

        //avg of Array
        avgArray = Math.round((double) sumArray / (double) size);

        //print result
        System.out.println("Created array of numbers: " + Arrays.toString(numbers) + '\n' +
                "Max value in the array: " + maxValueArray + '\n' +
                "Average of numbers in the array: " + avgArray);
    }
}
