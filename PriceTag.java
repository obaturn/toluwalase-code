import java.util.Scanner;
public class PriceTag {
public static void main(String [] args) {
Scanner input = new Scanner (System.in);
System.out.print("enter Your price");
int price = input.nextInt();
int discount = 10;
int total = (price * discount / 100);
System.out.println(total);
}
}