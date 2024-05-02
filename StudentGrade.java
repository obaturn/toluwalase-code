import java.util.Scanner;
import java.util.Arrays;
	public class StudentGrade {
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);
	int [][] studentGrade;

System.out.println("how many student do you have");
int student = input.nextInt();

System.out.println("how  many subject do you offer");
int subject = input.nextInt();

studentGrade = new int [student] [subject];
double[] average = new double[student]; 

for(int row= 0 ; row< student ; row++){
int total = 0;
System.out.println("This is for student" +(row+1));
	for(int column= 0 ; column< subject ; column++){

int count = 0;
while (count == 0){
System.out.println("Enter the students score(1-100) for subject" +(column+1));
studentGrade[row][column] = input.nextInt();

if(studentGrade[row][column] < 100 && studentGrade[row][column] > 0){
count++;
total +=studentGrade[row][column];
average[row] = (double)total/subject; 
			}
		}
	}
}
System.out.println("*********************************");
System.out.print("STUDENT   ");
for(int index = 0;index < subject; index++){
System.out.print("SUB" +(index+1)+ " ");
}
System.out.print("TOT AVE POS");
System.out.println("\n*********************************");
	

		
for(int oba = 0;oba < student;oba++){
int total = 0;
System.out.print("student" +(oba+1) +"   ");
for(int turn = 0; turn < subject; turn++){
System.out.print(studentGrade[oba][turn]+ "  ");
total += studentGrade[oba][turn];
}
System.out.print(total + "  ");
System.out.print(total/student + "  ");
for(int tolu = 0;tolu < student; tolu++){
if((double) total/subject == average [tolu]){
System.out.println(tolu+1);
				}
}
System.out.println();
	} 
		

		
 }
}