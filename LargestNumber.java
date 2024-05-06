import java .util.Scanner;

   public class LargestNumber{
   public static void main(String [] args){

   Scanner input = new Scanner(System.in);
	int count = 1;
	int number = 0;
	int largest = 0;
	
	while (count < 10){
		System.out.println("Enter number: ");
		number = input.nextInt();
		if (largest < number){
			largest = number;
		}
		count++;
	}
	System.out.println("The largest number is " + largest);

}







}