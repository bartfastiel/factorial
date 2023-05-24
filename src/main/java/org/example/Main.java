package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    public static int factorial(int number) {
        int result = 1;
        int i = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        return result;
    }
}