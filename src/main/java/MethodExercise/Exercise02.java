package MethodExercise;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
/*
Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        averageOfThreeNumbers(num1,num2,num3);

    }

    public static void averageOfThreeNumbers (int num1, int num2, int num3){
        double average = (num1+num2+num3)/3;
        System.out.println("The average value is "+average);
    }

}
