package com.napier.GP14;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {


        //Basic Structure of code
        //Read in SQl Database into array of objects
        //Offer selection menu of report types to user, selected via input of a number.
        //Second menu for level of report requested, eg: country or city
        //Using Primary Key variables in the various objects fulfill the requested reports parameters
        //Print the report

        Scanner keyboard = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What report would you like?");
        System.out.println("A. Country");
        System.out.println("B. City");
        System.out.println("C. Capital");
        System.out.println("D. Population");
        System.out.println("E. Population of ___");
        System.out.println("F. Language");
        System.out.println("G. Complex");
        //complex leads to further menus to access the users specific requirements

        String selection = keyboard.nextLine();
        while(!(selection.equals("A") || selection.equals("B"))){
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
            //following line will perform a function called countryReport by passing the value of selection to it
            countryReport(selection);

        }

        if(selection.equals("B")){
            //should clear screen to keep things tidy
            System.out.print("\033[H\033[2J");
            System.out.flush();
            //doesnt appear to work on the intellij "terminal"
            System.out.println("Please enter the city you wish to get a report on");
            selection = keyboard.nextLine();
            //following line will perform a function called cityReport by passing the value of selection to it
            //cityReport(selection);

        }
    }

    public static void countryReport(String Country){
        System.out.println(Country);
        //look for country in array of object type country
        //if found display the requested values
        //else return error message
    }

    public static void cityReport(String City){
        System.out.println(City);
        //look for country in array of object type city
        //if found display the requested values
        //else return error message
    }




}
