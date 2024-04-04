import java.util.Scanner;

public class MortageCalculator {

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

int numberOfMonths = 12;

int percentage = 100;

System.out.println("enter amount your amount of principal: ");

double amount  = input.nextInt();

System.out.println("enter your  interest rate : ");

double interestRate = input.nextInt();

System.out.println("enter the duration in years : ");

double years = input.nextInt();

	double number1 = 12 * years;
 
	double rate = interestRate / 100;

	double monthlyRate = rate /12;

	double monthBase = 1 + monthlyRate;

	double base = Math.pow(monthBase,years);
 
	double number2 = (amount + monthlyRate);

	double number3 = (base -2);

	double monthlyPayment = number2 + base / number3;

System.out.println("The monthly payment is " + monthlyPayment);
 }
}
