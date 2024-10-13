package src.src;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int Number = sc.nextInt();
        if (Number % 3 == 0) {
            System.out.println(Number+"number is divided by 3!");
        } else{
            System.out.println(Number+"number is not divisible by 3!");
        }
    }
}
