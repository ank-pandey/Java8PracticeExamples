package com.abcdeveloper.rest;

public class RecursionExample {

    public static void main(String[] args) {
      int resultFactorial = factorial(6);
      System.out.println("resultFactorial :: " + resultFactorial);

      int resultFibonacci = fibonacci(10);
      System.out.println("Fibonacci number on position :: " + 10 + " is :: " + resultFibonacci);

        int resultSum = sumOfDigits(4);
        System.out.println("sum of digits of number :: " + 4 + " is :: " + resultSum);
        String s = "abc";
        s.substring(1);
        int resultPower = powerOfNumber(4,3);
        System.out.println("power :: "+ 3 + " of given number :: " + 4 + " is :: " + resultPower);

        int resultGCD = gcdOfNumbers(36,24);
        System.out.println("GCD of numbers :: "+ 36 + " & :: " + 24 + " is :: " + resultGCD);

        int resultBinary = conversionToBinary(13);
        System.out.println("Binary format of number :: "+ 13 +" is :: " + resultBinary);
    }

    private static int conversionToBinary(int i) {
        if(i == 0){
            return 0;
        }
        return i%2 + 10*conversionToBinary(i/2);
    }

    private static int gcdOfNumbers(int a, int b) {
        if(a < 0 || b < 0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcdOfNumbers(b, a%b);
    }

    private static int powerOfNumber(int base, int exp) {
        if(exp == 0){
            return 1;
        }
        if(exp < 0){
            return -1;
        }
        return base*powerOfNumber(base, exp-1);
    }

    private static int sumOfDigits(int n) {
        if( n <= 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    private static int factorial(int n) {
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    private static int fibonacci(int n) {
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
