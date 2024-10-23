package Rehersal;



public class StringMultiplication {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(multiplyAlphabet(str1));

    }
    public static String multiplyAlphabet(String  alphabet) {
        StringBuilder result = new StringBuilder();
        for(char ch : alphabet.toCharArray()) {
            result.append(ch) .append(ch);
        }
        return result.toString();
    }

    }


