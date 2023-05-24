package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1;i <= number;i++) {
            result = result * i;
        }
        return result;
    }
}