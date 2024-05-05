import java.util.Scanner;
public class ChapterSixQuestion6 {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
int smallest;
int largest;
int firstInteger;
int secondInteger;
int thirdInteger;
int fourthInteger;
int fifthInteger;
System.out.println("enter the first number");
firstInteger = input.nextInt();
System.out.println("enter the second number");
secondInteger = input.nextInt();
System.out.println("enter the third number");
thirdInteger = input.nextInt();
System.out.println("enter the fourth number");
fourthInteger = input.nextInt();
System.out.println("enter the fifth number");
fifthInteger = input.nextInt();

smallest = firstInteger;


if (secondInteger < smallest){
smallest = secondInteger;
}
if (thirdInteger < smallest ){
smallest = thirdInteger;
}
if (fourthInteger < smallest){
smallest = fourthInteger;
}
if (fifthInteger < smallest) {
smallest = fifthInteger;
}
largest = firstInteger;


if (secondInteger > largest){
largest = secondInteger;
}
if (thirdInteger > largest) {
largest = thirdInteger;
}
if (fourthInteger > largest){
largest = fourthInteger;
}
if (fifthInteger > largest) {
largest = fifthInteger;
}
System.out.println("the smallest numberis" + smallest);
System.out.println("the slargest number is" ,+ largest);
}
}
