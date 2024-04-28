import java.util.Scanner;

	public class StudentGrade2 {
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

				if(studentGrade[row][column] < 0 && studentGrade[row][column] >= 100){
					count++;
					total +=studentGrade[row][column];
					average[row] = (double)total/subject; 
					}
				}
			}
		}
		
      }
}