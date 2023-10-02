package MethodExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:The smallest value is 25.0
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        smallestOfThreeNumbers(num1, num2,num3);
    }

    public static void smallestOfThreeNumbers(int num1, int num2, int num3){

        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(num1);
        arr.add(num2);
        arr.add(num3);

        int min =arr.get(0);

        for (Integer w:arr) {
            min=Math.min(min, w);
        }

        System.out.println("The smallest value is "+ min);



    }



}
