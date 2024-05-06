import java. util. Scanner;
  public class Average {
   public static void main(String [] args){
    Scanner input = new Scanner (System.in);
     int number = 0;
	int number1 = 0;
     int count ; 
   for(count = 0 ; count <= 10 ; count ++){

	number += count;
	number1 = number1 + count;

 }
	System.out.println(number);
	System.out.println(number1);
}
}  