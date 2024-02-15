package com.napier.GP14;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        //System.out.println("Boo yah!");

        Scanner keyboard = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What report would you like?");
        System.out.println("A. Country");
        System.out.println("B. City");
        System.out.println("C. Capital");
        System.out.println("D. Population");
        System.out.println("E. Population of ___");
        System.out.println("F. Language");
        System.out.println("G. Complex");

        String selection = keyboard.nextLine();
        while(!(selection.equals("A"))){
            System.out.println("Invalid choice, please re-enter");
            selection = keyboard.nextLine();
        }



        if(selection.equals("A")){
            //should clear screen to keep things tidy
            System.out.print("\033[H\033[2J");
            System.out.flush();
            //doesnt appear to work on the intellij "terminal"
            System.out.println("Please enter the country you wish to get a report on");
            selection = keyboard.nextLine();
            //following line will perform a function called country report by passing the value of selection to it
            //countryReport(selection);

        }
    }

    //Basic Structure of code
    //Read in SQl Database into array of objects
    //Offer selection menu of report types to user, selected via input of a number.
    //Second menu for level of report requested, eg: country or city
    //Using Primary Key variables in the various objects fulfill the requested reports parameters
    //Print the report
}
