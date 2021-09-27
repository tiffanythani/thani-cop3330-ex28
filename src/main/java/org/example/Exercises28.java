/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */

import java.util.Scanner;

public class Exercises28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalvalue = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            totalvalue += in.nextInt();
        }
        System.out.println("The total is " + totalvalue + ".");
    }
}
