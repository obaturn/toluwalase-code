import java.util.Scanner;

public class ChapterThreeQuestion3 {

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("enter the first number");

int firstNumber = input.nextInt();

System.out.println("enter the second number");

int secondNumber = input.nextInt();

System.out.println("enter the third number");

int thirdNumber = input.nextInt();

int sum = firstNumber + secondNumber + thirdNumber;

int average = sum / 3 ;

int product = firstNumber * secondNumber * thirdNumber;

int smallest;

int largest;

smallest = firstNumber;

if(secondNumber < smallest){

smallest = secondNumber;

}

if(thirdNumber < smallest){

smallest = thirdNumber;

}

largest = firstNumber;

if(secondNumber > largest){

largest = secondNumber;

}

if(thirdNumber > largest){

largest = thirdNumber;

}
System.out.printf("the total number is %d%n" , sum);

System.out.printf("the division number is %d%n" , average );

System.out.printf("the smallest number is %d%n" , smallest);

System.out.printf("the multiple number is %d%n" , product);

System.out.printf("the maximum number is %d%n" , largest);
    }
 }

