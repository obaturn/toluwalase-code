import java.util.Scanner;
public class MbtiQuestions {
public static void main(String [] args){
Scanner input = new Scanner(System.in);
int counter = 0;
System.out.println("what is your name");
String name = input.nextLine();
String questionOne = null;
do {System.out.println("A tough minded , just  B tender-hearted,merciful");
questionOne = input.nextLine();
break;
}while(!questionOne.equalsIgnoreCase("A") || questionOne.equalsIgnoreCase("B"));
System.out.println("I know this is an error pls try again");


String questionTwo = "b";
do {System.out.println("A candid, straight forward,frank  B tactful, kind ,encouraging");
questionTwo = input.nextLine();
}while(questionTwo.equalsIgnoreCase("A") | questionTwo.equalsIgnoreCase("B"));
System.out.println("I know this is an error pls try again");


System.out.println("A focus on here-and-now  B look to the fulture, global prospective,big picture");
String questionThree = input.nextLine();
System.out.println("A expand energy, enjoy groups B conserve energy, enjoy one-on-one");
String questionFour = input.nextLine();
System.out.println("A interpreat literally B look for meaning and possiblities");
String questionFive = input.nextLine();
System.out.println("A logical thinking  questioning B emphatetic feeling accomodating");
String questionSix = input.nextLine();
System.out.println("A organised orderly B flexible adaptable");
String questionSeven = input.nextLine();
System.out.println("A plan schedule B unplanned spontanous");
String questionEight = input.nextLine();
System.out.println("A seek many task , public activities,iteraction with others B seek private solitary activities with quiet to concentrate");
String questionNine = input.nextLine();
System.out.println("A standard usual convertional B diffrent novel ,unique");
String questionTen = input.nextLine();
System.out.println("A firm tend to criticise,hold the line B gentle tend to appreciate conciliate");
String questtionEleven = input.nextLine();
System.out.println("A regulated structure B easy going live and let live");
String questionTwelve = input.nextLine();
System.out.println("A external communicative express to yourself B internal reticent , keep to yourself");
String questionThirTeen = input.nextLine();
System.out.println("A preparation plan as ahead, B go with the flow");
String questionFourTeen = input.nextLine();
}
}




