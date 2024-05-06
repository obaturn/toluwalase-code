import java.util.Scanner;
import java.util.Arrays;
public class MbtiQuestions3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] questions = {
            {"A. Expend energy, enjoy groups"}, {"B. Conserve energy, enjoy one-on-one"},
            {"A. Interpret literally"}, {"B. Look for meaning and possibilities"},
            {"A. Logical thinking, questioning"},{"B. Empathetic, feeling, accommodating"},
            {"A. Organized, orderly"}, {"B. Flexible, adaptable"},
            {"A. More outgoing, think out loud"}, {"B. More reserved, think to yourself"},
            {"A. Practical, realistic, experimental"}, {"B. Imaginative, innovative, theoretical"},
            {"A. Candid, straightforward, frank"}, {"B. Tactful, kind, encouraging"},
            {"A. Plan schedule"}, {"B. Unplanned schedule"},
            {"A. Seek many tasks, public activities, interactive with others"}, {"B. Seek private, solitary activities with quiet to concentrate"},
            {"A. Standard, usual, conventional, hold the line"},{"B. Different, novel, unique"},
            {"A. Firm, tend to criticize, hold the line"}, {"B. Gentle, tend to appreciate, conciliate"},
            {"A. Regulated, structured"}, {"B. Easy-going, live and let live"},
            {"A. External, communicative, express yourself"}, {"B. Internal, reticent, keep to yourself"},
            {"A. Focus on here and now"}, {"B. Look to the future, global perspective, big picture"},
            {"A. Tough-minded, just"}, {"B. Tender-hearted, merciful"},
            {"A. Preparation, plan ahead"}, {"B. Go with the flow, adapt as you go"},
            {"A. Active, initiate"},{"B. Reflective, deliberate"},
            {"A. Facts, things, what is, issue-oriented"}, {"B. Ideas, dreams, what could be, philosophical"},
            {"A. Matter of fact, issue-oriented"},{"B. Sensitive, people-oriented, compassionate"},
            {"A. Control, govern"}, {"B. Latitude, freedom"},
        };

        String[] results = new String[questions.length/2];
        int counter = 0;
        for (int count = 0; count < questions.length; count+=2) {
            for (int index = 0; index < questions[count].length; index++) {
                System.out.println(questions[count][index] + " " +  questions[count + 1][index]);
                System.out.println("Enter A or B:    ");
                String userInput = scanner.next();
               
                  if(userInput.equalsIgnoreCase("A")){
                     results[counter] = userInput + " " + questions[count][index];
                     counter++;   
                   }

                    if(userInput.equalsIgnoreCase("B")){
                     results[counter] = userInput + " " + questions[count + 1][index];
                     counter++;   
                   }
            
	   } 
       }
          System.out.println(Arrays.toString(results));
    }
	
}   

