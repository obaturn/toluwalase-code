import java.util.Scanner;

 import java.util.Date;

  import java.util.ArrayList;

   public class SemicolonStore {

        public static void main(String [] args) {

	   Scanner input = new Scanner(System.in);

	int counter = 0;

	int total = 0;
	
	String userBuy = null;
	
	int howMany = 0;

	int unit = 0;

	ArrayList<String>itemsList = new ArrayList<>();

	ArrayList<Integer>pieciesList = new ArrayList<>();

	ArrayList<Integer> perUnitList = new ArrayList<>();

	ArrayList<Integer> totalList = new ArrayList<>();

	System.out.println("what is the customer's name");

	String customerName = input.next(); 
	String moreItems = " ";
	Date date = new Date();

	do{

	   System.out.println("what did the user buy");

	    userBuy = input.next();

	   System.out.println("how many piecies ? ");

	     howMany = input.nextInt();

	   System.out.println("how much per unit?");

	     unit  = input.nextInt();

	   System.out.println("add more items");

	    moreItems = input.next();
		
		 total = howMany * unit;

		 itemsList.add(userBuy);

		 pieciesList.add(howMany);

		 perUnitList.add(unit);
	 	
		totalList.add(total);
      
	    if(moreItems.equalsIgnoreCase("NO")){

		break ; }

      } while(moreItems.equalsIgnoreCase("YES")); 
	
	System.out.println("what is  your name: (cashierName)");

	String cashierName = input.next();

	System.out.println("how much discount will he get");

	int discount = input.nextInt();

	String prompt ="""
		SEMICOLON STORE

		MAIN BRANCH

		LOCATION: 312 HERBERT MARCULAY WAY SABO YABA, LAGOS.

		TEL: 03293828343

		""";

	System.out.println(prompt);

	System.out.println("Date" + date);

	System.out.println("CashierName: " + cashierName);

	System.out.println("CustomnerName: " + customerName);
	
	String obaturn = """
	===============================================
		ITEMS	QTY	PRICE	TOTAL(NGN)
	-----------------------------------------------
	 """;
	System.out.println(obaturn);
	int sum = 0;
	for(counter = 0; counter < itemsList.size (); counter ++){
	System.out.println("\t" + itemsList.get(counter) + "\t" + pieciesList.get(counter)+
	 "\t" + perUnitList.get(counter) + "\t" + totalList.get(counter) );  
	sum +=totalList.get(counter); 
	}
   	
	double discountPercentage = (sum * (discount)) / 100;
 
	double vat = (sum * 17.50 /100);

	double billTotal =(sum - discountPercentage ) + vat;
	
 	System.out.println("-----------------------------------------------------------------------\n");
	
	System.out.println("the total sum is " + sum);
	
	 System.out.println("the discountPercentage is " + discountPercentage);

	System.out.printf(" vat @ 17.50 %.2f%n ",vat);
	
	System.out.print("=======================================================================\n");

   	System.out.printf("\t\t billTotal\t%.2f%n",billTotal);
	
	System.out.print("========================================================================\n");
	
	System.out.println("THIS IS NOT A RECEIPT PAYMENT KINDLY PAY 5803.50");
	System.out.print("========================================================================\n");

    }
 }	









































	

    
		