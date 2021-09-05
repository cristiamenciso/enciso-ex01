package exercise01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Exercise 1 - Saying Hello
        Create a program that prompts for your name and prints a greeting using your name.

        Example Output
        What is your name? Brian
        Hello, Brian, nice to meet you!
        Constraint
        Perform the input, string concatenation, and output in separate statements.
        Challenges
        Write a new version of the program without using any variables.
        Write a version of the program that displays different greetings for different people.
        Write a version of the program that displays the greeting in a GUI window.
*/
import java.util.Scanner;
// create a scanner object
// Prompt user for their name
// Store user input in String variable
// create output string
// Print out the message with the given input.


public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        String greeting = "Hello, " + name + ", nice to meet you!";

        System.out.println(greeting);
    }
}
