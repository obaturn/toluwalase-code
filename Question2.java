package src;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be compare: ");
        int number = sc.nextInt();
        int squared = number * number;
        if(squared > 100){
            System.out.println("Squared number is greater than 100 squared" + squared);
        } else if(squared < 100){
            System.out.println("Squared number is less than 100 squared" + squared);
        }
        if(squared == 100){
            System.out.println("Squared number is equal to 100 squared" + squared);
        }
        if(squared != 100){
            System.out.println("Squared number is not equal to 100 squared" + squared);
        }
        if(squared == 0){
            System.out.println("Squared number is zero squared" + squared);
        }
        if(number == 100){
            System.out.println("number is equal to 100 number"  + number);
        }
        if (number != 100) {
            System.out.println("number is not equal to 100 number" +number);

        }
        if(number == 0){
            System.out.println("number is zero number" + number);
        }
        if(number > 100){
            System.out.println("number is greater than 100 number"+number);
        }else if(number < 100){
            System.out.println("number is less than 100 number" + number);
        }
    }
}
