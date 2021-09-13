/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double orderAmount;
        String state;
        String county;
        double tax;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount?");
        orderAmount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What state do you live in?");
        state = scanner.nextLine();

        System.out.println("What county do you live in?");
        county = scanner.nextLine();

        scanner.close();

        if(state.equalsIgnoreCase("illinois"))
        {
            tax = 0.08;
        }
        else if(state.equalsIgnoreCase("wisconsin"))
        {
            tax = 0.05;
            if(county.equalsIgnoreCase("eau claire"))
                tax += 0.005;
            else if(county.equalsIgnoreCase("dunn"))
                tax += 0.004;
        }
        else
            tax = 0;

        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax * orderAmount, (tax * orderAmount) + orderAmount);
    }
}