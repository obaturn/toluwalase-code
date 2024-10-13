package Chapter2Java;

import java.util.Scanner;

public class SquareShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the box: ");
        int height = input.nextInt();
        System.out.print("Enter the width of the box: ");
        int width = input.nextInt();
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }


    }
}
