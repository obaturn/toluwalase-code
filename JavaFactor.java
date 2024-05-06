import java.util.Scanner;

public class JavaFactor{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System .out.print("enter number");

int userInput = input.nextInt();

int factor = 0;

int counter = 0;

while (counter <=  userInput){

if(userInput % counter == 0);

factor = factor +1;

}
counter = counter +1;

System.out.println(factor);
}
}