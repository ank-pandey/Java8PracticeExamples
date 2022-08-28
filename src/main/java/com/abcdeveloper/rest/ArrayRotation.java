package com.abcdeveloper.rest;

public class ArrayRotation {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] ar = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original Array ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 2; i++) {
            int j, last;
            last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("\nRight rotated Array ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 1; i++) {
            int j, first;
            first = ar[0];
            for (j = 0; j < ar.length-1; j++) {
                ar[j] = ar[j + 1];
            }
            ar[j] = first;
        }
        System.out.println("\nLeft rotated Array ::");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        int num1 = 6;
        int[] fibonacciArray = new int[num1];
        int fibonacci;
        int num = 0;
        int num2 = 1;
        System.out.println("\nFibonacci Series ::");
        for (int loop = 0; loop < num1; loop++) {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
            fibonacciArray[loop] = num;
            System.out.print(fibonacciArray[loop] + " ");
        }
        System.out.println("\n" + num);
    }
}
