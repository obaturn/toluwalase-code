import java.util.Scanner;

	public class BackToSender2{

	public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.println("enter the sucessful delivery"); 
int delivery = input.nextInt(); 
  
int riders = BackToSender.sucessfulDelivery(delivery); 
System.out.print(riders);  
}
}      