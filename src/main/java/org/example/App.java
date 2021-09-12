package org.example;
import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age? ");
        String strAge = input.nextLine();
        System.out.println("At what age would you like to retire? ");
        String strRetire = input.nextLine();

        int numAge = Integer.parseInt(strAge);
        int numRetire = Integer.parseInt(strRetire);
        int years = numRetire - numAge;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if((numRetire - numAge) <= 0)
        {
            System.out.println("You can already retire!");
        }
        else
        {
            System.out.println("You have " + years + " years left until you can retire\nIt's " + currentYear + ", so you can retire in " + (currentYear + years));
        }
    }
}
