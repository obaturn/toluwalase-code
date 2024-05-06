import java.util.arrays;
mport java.util.Arrays;
public class ArrayKataFunctions {
     public static void main(String [] args){ 
      int[]nums = {1,2,3,4,5};
      System.out.println(sumOf(nums));  
     }
public static int maximumIn(int [] number) {
int maximumIn = number[0];
for(int count = 0; count < number.length; count++) {
     if (number[count] > maximumIn){
        maximumIn = number[count];
     }
  }
   return maximumIn;
}
   public static int minimumIn(int []number) {
    int minimumIn = number[0];
   for(int count = 0; count < number.length ; count++) {
        if (number[count] < minimumIn) {
          minimumIn = number [count];
        }
      }
     return minimumIn;
    }
   public static int sumOf(int [] addition) {
      int sumOf = 0;
      for(int count = 0 ; count < addition.length ; count++){
              sumOf+=count;
        }
       return sumOf;
    }
}
//public static int sumOfEven(int [] num){
//int sumOfEven
//for(int count = 0; count < arrayOfIntegers) {
//if(number[count]sum += number[count]; 
//return sumOfEven;
//	}
//    }
// }
//public static sumOfOdd (int [] arrayOfNumbers) {
//int sumOfOdd = number0;
//int count = 0;
//for(int count = 0; count < arrayOfNumbers) {
//if(number[count] %2 == 1) {
//sum += number[count];
//return sumOfOdd;
//      }
//    }
//  }
//public static maximumAndMinimumOf(int [] arrayOfNumbers) {
//int [] minimum1 = {1; 2; 3; 4; 5; 6;7;}
//int [] maximum2 = {1; 2; 3; 4; 5; 6; 7;}
//int minimum1 = number0;
//int count = 0;
//for(int count =0; count < minimum ; count++){
//if(number[count]  < minimum) {
//minimum = number;
//return mimimum;
//	}
//   }
//int maximum2=0;

//for(int count = 0; count < arrayOfNumbers.length ; count++) {
//if(number[count] > maximum){
//maximum =
//return maximum;
//	}
//     }
//  }
//public static noOfOddNumber(int [] arrayOfIntegers){
//int count = 0;
//int noOfOddNumber = 0;
//for(int count = 0; count < arrayOfIntegers) {
//if(number[count] %2 ==1) {
//noOfOddNumber number;
//return noOfOddNumber;
	//}
    //  }
  //  }
//}
















 