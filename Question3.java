package src;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int number4 = sc.nextInt();
        System.out.println("Enter the fifth number: ");
        int number5 = sc.nextInt();
        int largest = Math.max(Math.max(Math.max(number1, number2),Math.max(number3,number4)),(number5));
        int smallest = Math.min(Math.min(Math.min(number1,number2),Math.min(number3,number4)),(number5));
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

    }
}
