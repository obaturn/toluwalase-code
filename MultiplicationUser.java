import java.util.Scanner;

	public class MultiplicationUser{

		public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

System.out.println("enter your multiplication table of your choice");

int user = input.nextInt();

int result =0;

int counter = 1;

for(counter = 1 ; counter <= user ; counter ++){

			 result = counter* user;
		}

	System.out.println(user + counter + "=" + result);
	}
    }