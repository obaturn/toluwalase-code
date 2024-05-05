import java.util.Scanner;

public class ChapterTwoQuestion2 {

public static void main(String [] args){

Scanner input = new Scanner(System.in);

	System.out.print("enter a number");
	int userInput = input.nextInt();

	int square = userInput * userInput;

if(userInput > 100){

System.out.println("the number is  greater than" + 100);

}

if(square < 100){

System.out.println("the square of the userInput is not up to" + 100);

}

else if(userInput == 100){

System.out.println("the userInput is equal to 100");

}
else if(userInput != 100) {

System.out.println("the userInput is not equal to 100");
	}
else if(square < 100){
System.out.println("the square of the userInput is greater than " + 100);
}
else if(square == 100){

System.out.println("the square is equalto 100");
}

else if(square != 100){
System.out.println("the square is not equal to 100");
      }
    }
  }
	








   
  
 