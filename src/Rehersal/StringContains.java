package Rehersal;



public class StringContains {
    public static void main(String[] args) {
        String str = "result";
        System.out.println(containsAllLetters(str));
    }

    public static boolean containsAllLetters(String input) {
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c =  input.charAt(i) ;
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        return true;
    }
}

