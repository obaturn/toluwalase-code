package src;

import java.util.Scanner;

public class TSquareShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the T: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the T: ");
        int height = scanner.nextInt();


        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();



        int center = width / 2;
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < center; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

    }
}
