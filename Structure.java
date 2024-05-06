import java.util.Scanner;
	public class Structure{
 public static void main(String [] args) {
 	Scanner input = new Scanner(System.in);
   int number;
  System.out.print("enter number");
	number= input.nextInt();
   if (number == 1){
	System .out.println("keep repeating to enter number again");
}
else{
	System.out.println("press only number 2 to stop asking for another number: " ); 
}
}
}