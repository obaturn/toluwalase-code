import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] studentGrade;

        System.out.println("How many students do you have?");
        int student = input.nextInt();

        System.out.println("How many subjects do you offer?");
        int subject = input.nextInt();

        studentGrade = new int[student][subject];
        double[] average = new double[student];
        int[] totalScores = new int[student];
        
        for (int row = 0; row < student; row++) {
            int total = 0;
            System.out.println("This is for student " + (row + 1));
            for (int column = 0; column < subject; column++) {
                int count = 0;
                while (count == 0) {
                    System.out.println("Enter the student's score (1-100) for subject " + (column + 1));
                    studentGrade[row][column] = input.nextInt();

                    if (studentGrade[row][column] <= 100 && studentGrade[row][column] >= 0) {
                        count++;
                        total += studentGrade[row][column];
                    } else {
                        System.out.println("Invalid score, please enter a score between 1 and 100.");
                    }
                }
            }
            totalScores[row] = total;
            average[row] = (double) total / subject;
        }

        System.out.println("*********************************");
        System.out.print("STUDENT   ");
        for (int index = 0; index < subject; index++) {
            System.out.print("SUB" + (index + 1) + " ");
        }
        System.out.print("TOT AVE POS");
        System.out.println("\n*********************************");

        Integer[] positions = new Integer[student];
        for (int i = 0; i < student; i++) {
            positions[i] = i;
        }

        Arrays.sort(positions, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Double.compare(average[o2], average[o1]);
            }
        });

        int[] rate = new int[student];
        for (int i = 0; i < student; i++) {
            rate[positions[i]] = i + 1;
        }

        for (int oba = 0; oba < student; oba++) {
            int total = 0;
            System.out.print("student" + (oba + 1) + "   ");
            for (int turn = 0; turn < subject; turn++) {
                System.out.print(studentGrade[oba][turn] + "  ");
                total += studentGrade[oba][turn];
            }
            System.out.print(total + "  ");
            System.out.print(String.format("%.2f", average[oba]) + "  ");
            System.out.println(rate[oba]);
        }
    }
}
