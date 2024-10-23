import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;

        System.out.printf("enter first NUmber");
        int n1 = input.nextInt();
        System.out.printf("enter second NUmber");
        int n2 = input.nextInt();
        System.out.printf("enter third NUmber");
        int n3 = input.nextInt();
        System.out.printf("enter fourth NUmber");
        int n4 = input.nextInt();
        System.out.printf("enter fifth NUmber");
        int n5 = input.nextInt();
        if (n1 > largest) {
            largest = n1;
        }
        if (n2 > largest) {
            largest = n2;
        }
        if (n3 > largest) {
            largest = n3;
        }
        if (n4 > largest) {
            largest = n4;
        }
        if (n5 > largest) {
            largest = n5;
        }
        System.out.printf("%d", largest);


        }
    }
