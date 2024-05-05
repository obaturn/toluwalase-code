import java.util.Scanner;

public class ChapterTwoQuestion1 {

public static void main(String [] arg) {

Scanner input = new Scanner(System.in);

	System.out.println("enter the first number");
	int firstInteger = input.nextInt();

	System.out.println("enter the second number");
	int secondInteger = input.nextInt();

	int firstProduct = firstInteger * firstInteger;

	int secondProduct = secondInteger * secondInteger;

	int sum = firstProduct + secondProduct ;

	int diffrence = firstProduct - secondProduct;

System.out.println("the squared number of the first integer is"  + firstProduct);

System.out.println("the squared number of the second integer is " + secondProduct);

System.out.println("the total sum is "  + sum);

System.out.println("the diffrence number is"  + diffrence);
 }
}