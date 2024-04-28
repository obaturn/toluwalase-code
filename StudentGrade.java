import java.util.Scanner;

import java.util.Arrays;

	public class StudentGrade{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	String [] names = new String [5];
	int [] grades = new int [5];	
	int student = 0;
	String userInput = null;
	for(int counter = 0; counter < 5 ; counter++){

	System.out.println("enter your name");
	 userInput = input.next();
	names[counter] = userInput;

	System.out.println("enter student grade");
	 student = input.nextInt();
	grades[counter] = student;

	}
	for(int index = 0; index < 5 ; index++){
		System.out.println(names [index]);
		System.out.println(grades[index]);
	}
      }
    }