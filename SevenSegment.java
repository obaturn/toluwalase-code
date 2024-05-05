import java.util.Scanner;

public class SevenSegment{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int count = 0; 
 
    for(count = 0; count <= 9; count++) {
System.out.println("Enter binary number");
  int userinput = input.nextInt();
 
if(userinput == 0110000)  {
    System.out.print("|\n|");
 } 

if(userinput == 1101101) {
   System.out.print(" _\n|\n|_\n"); 
 }

if(userinput == 1111001)  {
 System.out.print(" __\n|\n_|\n ");
  }
 
if(userinput == 110011) {
   System.out.print("|_|\n  |\n");
  }

if(userinput == 1011011) {
    System.out.print(" _\n|\n_|\n");
 }

if(userinput == 1011111)  {
 System.out.print(" _\n|\n|_|\n");
  }

if(userinput == 1110000)  {
   System.out.print(" __\n  |\n  |\n");
  }

if(userinput == 1111111)  {
   System.out.print("\n|\n|\n|\n_\n|\n");
   }
}

}

}
