import java.util.Scanner;
	
	public class Multiples4 {

	public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);

	int passes = 0;

	int failures = 0;

	for(int i = 0 ; i<=15 ; i++){

	System.out.println("enter your scores");

	int scores = input.nextInt();

	if(scores >= 45 ){

	passes = passes+1;

	}

	else {

	failures = failures+1;
	
	}
    
     }

	System.out.println("the total number of pass is" + passes);

	System.out.println("the total number of failures is" + failures);
  }
}
