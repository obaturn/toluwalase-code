import java.util.Arrays;
import java.util.Scanner;

	public class MbtiQuestions2{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	String [][] words = {
	         {"A.expend energy, enjoy groups"}, {"B.Conserve energy, enjoy one_on_one"},
	         {"A.Interpret, literally"}, {"B. look for meaning and possibilities"},
	         {"A.Logical thinking, questioning"}, {"B.emphatetic, feeling ,accomodating"},
	         {"A.Organised, orderly"}, {"B.flexible, adaptable"},
	         {"A.More outgoing, think out loud"}, {"B.more reserved, think to yourself"},
	         {"A.practical realistic, experimental"}, {"B.imaginative, innovative,theoretical"},
	         {"A.candid , straight forward,frank"}, {"B.tactful,kind,encouraging"},
	         {"A.plan schedule"}, {"B.unplan, schedule"},
	         {"A.Seek many tasks, public activities, interactive with others"}, {"B.seek private,solitary activities with quiet to concentrate"},
	         {"A.Standard , usual,conventional,hold the line"}, {"B.diffrent,novel,unique"},
	         {"A.Firm,tend to criticise,hold the line"}, {"B.gentle tend to appreciate conciliate"},
	         {"A.regulated structured"}, {"B.easy going live and let live"},
	         {"A.external,communicative,express yourself"}, {"B.internal reticent, keep to yourself"},
	         {"A.focus on here and now"}, {"B.look to the fulture, global perspective,big picture"},
	         {"A.tough minded just"}, {"B.tender hearted merciful"},
	         {"A.preparation , plan ahead"}, {"B.go with the flow adapt as you go"},  
	         {"A.active, initiate"}, {"B.reflective delibrate"},
	         {"A.facts things what is issue oriented"}, {"B.ideas dreams what could be philosophical"},
	         {"A.matter of fact, issue oriented"}, {"B.sensitive people, oriented compassionate"},
	         {"A.control, govern"}, {"B.latitude,freedom"},
        };

	String[] result = new String[words.length/2];
	int counter = 0;
	for(int count = 0 ;count<words.length; count+=2){
             for(int innerCount = 0; innerCount < words[count].length; innerCount++){
		System.out.println(words[count][innerCount] + " " + words[count + 1][innerCount]);
	        System.out.println("Enter either options A or B :  ");
	        String userInput = input.nextLine();

		while (!userInput.equalsIgnoreCase("A") && !userInput.equalsIgnoreCase("B")){
		System.out.println("I know this is an error pls retry again");
		System.out.println(words[count][innerCount] + " " + words[count + 1][innerCount]);
	        System.out.println("Enter either options A or B :  ");
	        userInput = input.nextLine();

		}
	      if(userInput.equalsIgnoreCase("A")){
		       result [counter] = userInput + " " + words[count] [innerCount];
		         counter++;
                }
	      if(userInput.equalsIgnoreCase("B")){
                    result [counter] = userInput + " " + words[count+1] [innerCount];
		     counter++;
               }
	   }
            
         }
         
        seperateResult(result);
       }
      public static void seperateResult(String[] result){
		int counter = 0;
		for(int count = 0; count < result.length; count +=4){
                     counter ++;
                   }
	String [] extrovertedIntrovert = new String[counter];
	int index = 0;
	for(int count = 0; count < result.length; count +=4){
             extrovertedIntrovert[index] = result[count];
          index ++;
         }
	System.out.println(Arrays.toString(extrovertedIntrovert));
	int s = 0;
	for(int p = 1; p < result.length; p +=4){
                 s++;
          }
	
	String [] sensingIntuitive = new String [s];
	int i = 0;
	for(int count = 1 ; count < result.length ; count+=4) {
	sensingIntuitive[i] = result[count];
		i++;
	}
	System.out.println(Arrays.toString(sensingIntuitive));
	
	int m = 0;
	for(int w =2; w < result.length; w +=4){
		m++;
	}
	String [] thinkingFeeling = new String[m];
	int k = 0;
	for(int d = 2 ; d < result.length ; d +=4 ) {
		thinkingFeeling[k] = result[d];
		k++;
	}
	System.out.println(Arrays.toString(thinkingFeeling));

	int b = 0;
	for(int l = 3 ; l < result.length ; l+=4) {
		b++;
	}
	String [] judgingPerspective = new String [b];
	int y = 0;
	for(int r = 3 ; r < result.length ; r+=4){
		judgingPerspective[y] = result[r];
		y++;
	}
	
	}
	
     }



















