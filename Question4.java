package src;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();
        int num1Triple = num1 * num1 * num1;
        int num2Double = num2 * num2;
        if (num1Triple % num2Double == 0) {
            System.out.println(num1Triple+"is a multiple of "+num2Double);
        } else{
            System.out.println(num1Triple+"is not a multiple of "+num2Double);
        }
    }
}
