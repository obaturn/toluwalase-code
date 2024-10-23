package Rehersal;

import java.util.Scanner;

public class RehersalOnWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter any number: ");
        int number = sc.nextInt();


        int largestNumber = number;
        int smallerNumber = number;

        int counter = 0;
        int counter2 = -1;


        while (counter != counter2) {
            counter = counter + 1;
            System.out.println("Enter another number (or -1 to stop): ");
            number = sc.nextInt();

            if (number == -1) {
                break;
            }


            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallerNumber) {
                smallerNumber = number;
            }
        }

        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The smallest number is: " + smallerNumber);

    }
}

