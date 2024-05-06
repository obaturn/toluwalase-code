import java.util.Scanner;
import java.util.Arrays;
public class Rehersal {
public static void main(String [] args){
Scanner input = new Scanner(System.in);
int [] [] studentGrade;
System.out.println("enter the student score");
int score = input.nextInt();
System.out.println("enter the student subject");
int subject = input.nextInt();
studentGrade [] [] = [score] [subject];
for(int row = 0 ; row < score.length ; row++){
int total = 0;
System.out.println(this is for student score +(row+1));
for(int column = 0 ;column < subject.length column++) {
double [] [] average = new double;
System.out.println(this is for student subject+(column+1));
int count = 0;
while(count == 0)
System.out.println("enter the student score from 1 - 100 from the subject above ");
studentGrade [row] [column] = input.nextInt();
if [row] [column] < 0 && [row] [column] >= 100
total+=[row] [column]
average = /row (total/column)


