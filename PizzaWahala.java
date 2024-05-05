import java.util.Scanner;

	public class PizzaWahala {
	public static void main(string [] args) {

	Scanner input = new Scanner(System.in);

		System.out.println("enter how many people you are expecting");
		int userInput  = input.nextInt();

		System.out.println("enter the type of pizza you will love to buy");
		String pizzaType = input.nextLine();

int numberOfSlicesSapa = 4;

int numberOfSlicesSmallMoney = 6;

int numberOfSliceBigBoys = 8;

int numberOfSliceOdogwu = 12;

int priceSapa = 2000;

int priceSmallMoney = 2400;

int priceBigBoys = 3000;

int priceOdogwu = 4200;

int total = 0;

if(userInput.equalsIgnoreCase("sapa")){

	if (userInput % numberOfSlicesSapa != 0);

	total = userInput / numberOfSlicesSapa +1;

}
	else{
		total = userInput / numberOfSlicesSapa;
}else
 if(userInput.equalsIgnoreCase("small money")){

	if(userInput % numberOfSlicesSmallMoney != 0);

	total = userInput / numberOfSlicesSmallMoney +1;
}

else {
	total = userInput /  numberOfSlicesSmallMoney;

	}else

    if(userInput.equalsIgnoreCase("big boys")) {

	if(userInput %  numberOfSliceBigBoys != 0);

	total = userInput / numberOfSliceBigBoys +1;

}
else {
	total = userInput / numberOfSliceBigBoys;
}else

 if(userInput.equalsIgnoreCase("odogwu")) {

	if(userInput %  numberOfSliceOdogwu != 0);

	total = userInput / numberOfSliceOdogwu +1;
}
else {
	total = userInput / numberOfSliceOdogwu;
    }
  }
 } 








