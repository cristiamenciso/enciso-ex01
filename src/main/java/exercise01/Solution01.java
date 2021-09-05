package exercise01;

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
