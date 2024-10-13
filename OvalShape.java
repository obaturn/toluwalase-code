package Chapter2Java;

import java.util.Scanner;

public class OvalShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the width of the oval (odd number): ");
        int width = sc.nextInt();

        System.out.print("Enter the height of the oval: ");
        int height = sc.nextInt();


        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                if ((i == 0 || i == height - 1) && (j > 1 && j < width - 2)) {

                    System.out.print("*");
                } else if ((i == 1 || i == height - 2) && (j > 0 && j < width - 1)) {

                    System.out.print("*");
                } else if (i > 1 && i < height - 2) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }



    }
}
