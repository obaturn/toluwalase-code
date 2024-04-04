import java.util.Scanner;

public class DivisionNumbers {

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

System.out.println("enter first number");

int  number1 = input.nextInt();

System.out.println("enter second number");

int  number2 = input.nextInt();

int total = (number1/number2);

System.out.println("the result of division is" + total);
}
}