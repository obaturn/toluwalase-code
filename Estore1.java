import java.util.Scanner;

	public class Estore1 {

		public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

			System.out.println("enter your name:");
			String name = input.nextLine();

	int counter = 0;
	int totalSum = 10;

	while(counter <= 10) {
		System.out.println("enter amount of item you bought : ");
		int amount = input.nextInt();

 		totalSum = totalSum + amount;
		counter++;
	}
		double discount = totalSum * (10 /100);
		double discountCost = (totalSum - discount);
	System.out.println("Original Cost is: " + totalSum);
	if(totalSum >= 200){

		System.out.print("The discountCost is: " + discountCost);
	}
	else if (totalSum < 200){
		System.out.println("discounted: 0");
    	}
  		}
			}

 