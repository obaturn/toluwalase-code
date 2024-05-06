import java.util.Scanner;
public class Welcome{
public static void main(String [] args) {
Scanner input = new Scanner(System.in);
int largestValue = 0;
int smallestValue=0;
int number = 1;
int counter = 10 ;
while(number <= 10 ){
System.out.print("enter how many times will you love to play");
 number = input.nextInt();
counter = counter ++; 
if(number > largestValue){
 largestValue = number; 
}
if( number < smallestValue){
  smallestValue = number; 
}
}
}
}