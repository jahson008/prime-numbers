package com.nishant.services;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice number:: ");
        int reader = scanner.nextInt();

        float avg = PrintAvg(reader);
        int even = PrintSumOfEven(reader);
        int prime = PrintSumOfPrime(reader);

        System.out.println("\nThe average of numbers from 1 to " +reader+" :: " + avg);

        System.out.println("\nThe sum of all even numbers from 1 to " +reader+" :: " + even);

        System.out.println("\nThe sum of all prime numbers from 1 to " +reader+" :: " + prime);

        System.out.println("\nThe sum of all prime numbers less than then even number:: " + (prime - even));


    }
    public static float PrintAvg(int number) {
        int total = 0;
        for (int i = 1; i<=number; i++)
        {
            total+= i;
        }
        return total/(float)number;
    }



    public static int PrintSumOfPrime(int n) {

        int i, number, count, sum = 0;

        for(number = 1; number <= n; number++) {
            count = 0;
            for (i = 2; i <= number/2; i++) {
                if(number % i == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 ) {
                sum += number;
            }
        }
        return  sum;
    }



    public static int PrintSumOfEven(int numb) {
        int i, evenSum = 0;


        for(i = 1; i <= numb; i++) {
            if(i % 2 == 0)
            {
                evenSum = evenSum + i;
            }
        }
        return (evenSum);
    }
}


