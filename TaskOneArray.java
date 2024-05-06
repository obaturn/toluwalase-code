import java.util.Scanner;

import java.util.Arrays;

	public class TaskOneArray {

	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	int [] scores = new int [10];

	for(int i = 0;  i <10 ;i++) {
	 System.out.println("enter your scores");
	   int userInput = input.nextInt();
		scores [i] = userInput;
		}
	   for(int j = 0; j<10 ;j++) { 
	System.out.print(scores [j]);
	
      }
    }
} 