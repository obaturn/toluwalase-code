package src.src;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int squaredNumber1 = num1 * num1;
        int squaredNumber2 = num2 * num2;
        int sum = squaredNumber1 + squaredNumber2;
        int subtract = squaredNumber1 - squaredNumber2;
        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The difference is: " + subtract);
        System.out.println("The product first Squared input: " + squaredNumber1);
        System.out.println("The product second Squared input: " + squaredNumber2);

    }
}
