import java.util.Arrays;
public class Dimensions2 {
public static void main(String [] args){
int [] [] number = new int [2][2];
number[0][0]=3;
number[0][1]=4;
number[1][0]=5;
number[1][1]=6; 
for(int count = 0; count < number.length; count++){
    for(int innerCount = 0 ; innerCount < number[count].length;innerCount++){
       System.out.print(number[count][innerCount]);
}
}
}
}