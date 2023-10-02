package MethodExercise;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {


/*
Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be one middle characters.
b) If the length of the string is even there will be two middle character.
Test Data:
Input a string: 350
Expected Output:
The middle character in the string: 5
 */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        displayMiddleChar(str);

    }

    public static void displayMiddleChar(String str) {

        if (str.length() % 2 != 0) {
            System.out.println(str.charAt(str.length() / 2));
        } else {
            System.out.println(""+str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2));
        }

    }
}
