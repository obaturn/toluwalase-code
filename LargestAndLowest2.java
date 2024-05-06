import java.util.Scanner;

public class LargestAndLowest2 {

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

int smallest  = 0;

int largest  = 0;

int counter = 1;

System.out.println("enter a number");

int num = input.nextInt();
smallest = num;
while(num != -1) { 

if(num > largest) {

largest = num;
}
if(num < smallest) {

smallest = num;
	counter ++;

}
System.out.println("enter a number");
 num = input.nextInt();

}

System.out.println("the largest number is" + largest);

System.out.println("the smallest number is" + smallest);
}
}