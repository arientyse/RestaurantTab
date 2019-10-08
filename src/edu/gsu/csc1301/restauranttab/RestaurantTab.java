package edu.gsu.csc1301.restauranttab;

/**
 * This creates a restaurant tab for a customer by calculating the tax, original total, tip, 
 * and final total of the meal.
 * 
 * 
 * @author Ariana Tyson
 * @version 10/07/2019
 *
 */

import java.util.Scanner;

public class RestaurantTab 
{
	public static void main(String[] args) 
	{
		
		final double TAX_RATE = 0.075;
		final double TIP_RATE = 0.18;
		
		Scanner in = new Scanner(System.in);
		
		//Input
		
		System.out.println("What is the server's first name? "); //Asks for the server's first name
		String fname = in.next();
		
		System.out.println("What is the server's last name? "); //Asks for the server's last name
		String lname = in.next();
		
		System.out.println("What was the charge for the meal? "); //Asks for the charge for the meal
		double meal = in.nextDouble();
		
		//Calculations
		
		double tax = meal * TAX_RATE; //The tax amount after adjusting for the 7.5% rate
		double tip = (meal + tax) * TIP_RATE; //The tip amount after adjusting for the 18% tip
		double total = meal + tax + tip; //The calculated total amount for the customer's meal
		
		//Output
		
		System.out.println("Restaurant Bill Summary ");
		System.out.print("Server: " + lname + ", ");
		System.out.printf("%.1s \n", fname); //Outputs Server's last name and first initial
		
		System.out.printf("Meal:    $%.2f \n", meal); //The charge amount for the meal that was inputted
		System.out.printf("Tax:     $%.2f \n", tax);
		System.out.printf("Tip:     $%.2f \n", tip);
		System.out.printf("Total:   $%.2f \n", total);
		
	}

}
