import java .util.Scanner;

	public class Estore2 {

	    public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("WELCOME TO OUR E-STORE");

		System.out.println("enter your name:");
		String name = input.nextLine();

		System.out.println("enter amount of item purchased:");
		int itemPurchased = input.nextInt();

		System.out.println("enter the percentage discount");
		double percentageDiscount = input.nextInt();

		int counter = 1;
		int total = 0;

		while (counter <= itemPurchased){

			System.out.println("enter amount of item you buy : ");

			int amount = input.nextInt();

			 total = total + amount;

			counter++;
		}
		
			System.out.println("the customer name is" + name);

			System.out.println(" the percentageDiscount is" + percentageDiscount);

			System.out.println("the amount of itempurchased you buy is" + itemPurchased );

			double discount = total* 10 / 100;

			double discountCost = ( total- discount);

			System.out.println("Original Cost is: " + itemPurchased);
			if(itemPurchased >= 200){

			System.out.print("The discountCost is: " + discountCost);
		}
			else if (itemPurchased < 200){
			System.out.println("discounted: 0");
    		     }
		  }
		}