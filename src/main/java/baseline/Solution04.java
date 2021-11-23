/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
package baseline;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Enter a noun: dog
//        Enter a verb: walk
//        Enter an adjective: blue
//        Enter an adverb: quickly
//        Do you walk your blue dog quickly? That's hilarious!

        // Prompt and read first word
        System.out.print("Enter a noun: ");
        String noun = in.next();

        // Prompt and read second word
        System.out.print("Enter a verb: ");
        String verb = in.next();

        // Prompt and read third word
        System.out.print("Enter an adjective: ");
        String adj = in.next();

        // Prompt and read fourth word
        System.out.print("Enter a adverb: ");
        String adv = in.next();

        // Create a sentence compiling the words together
        System.out.printf("%nDo you %s your %s %s %s? That's hilarious!%n", verb, adj, noun, adv);
    }
}