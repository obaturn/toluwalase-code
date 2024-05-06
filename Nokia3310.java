       import java.util.Scanner;

	 public class Nokia3310 {

	 public static void main(String [] args){

         String prompt = """

	Welcome to our phone function
  
        Here is our menu function

	1 -> Phonebook
	2 -> Messages
	3 -> Chart
	4 -> Call register
	5 -> Tones
	6 -> Settings
	7 -> Call divert
	8 -> Games
	9 -> Calculator
	10-> Reminders
	11-> Clock
	12-> Profiles
	13 -> Sim service
                   """;
	 System.out.println(prompt);

   	 Scanner input = new scanner(system.in);

   	 int userInput = input.nextInt();

  	Switch(userInput){

case 1 -> System.out.println("Phonebook");
case 2 -> System.out.println("Messages");
case 3 -> System.out.println("Chart");
case 4 -> System.out.println("Call register");
case 5 -> System.out.println("Tones");
case 6 -> System.out.println("Settings");
case 7 -> System.out.println("Call divert");
case 8 -> System.out.println("Games");
case 9 -> System.out.println("Calculator");
case10 -> System.out.println("Reminders")
case 11 -> System.out.println("Clock");
case 12 -> System.out.println("Profiles");
case 13 -> System.out.println("Sim service");
default -> System.out.println("invalid input");
           }          

}

            }