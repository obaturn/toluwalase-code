import java.util.Arrays;
pubic class NumberOfArray {
public static void main(String [] args) {
int [] digit = {4,5,8,8,8,2,9};

EvenAndOdd(digit);

System.out.print(Arrays.toString(EvenAndOdd(digit)));

}



public static int [] EvenAndOdd(int [] numbers) {

for(int index = 0 ; index < numbers.length; index++) {

if(numbers[index] % 2 == 0) {  

numbers[index] = 0;

}

else {

numbers[index] = 1;

}

}

return numbers;

}
}