import java.util.arrays;

public class Answer {

public static void main(String [] args) {

int [] result = {4,5,8,8,8,2,9};

boolean [] numbersResults = TrueOrFalse(result);

System.out.print(Arrays.toString(numbersResults));


}


public static boolean [] TrueOrFalse(int [] digit) {

boolean [] numbers = new boolean [digit.length];

for(int index = 0; index < digit.length ; index++) {

   numbers[i] = digit[i] % 2 == 1;

  
}

return numbers;

}

}



