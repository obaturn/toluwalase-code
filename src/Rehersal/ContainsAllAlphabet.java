package Rehersal;

public class ContainsAllAlphabet {
    public static void main(String[] args) {
        String testString = "The quick brown fox jumps over the lazy dog";
        boolean result = containsAllLetters(testString);
        System.out.println("Does the string contain all letters of the alphabet? " + result);
    }

    public static boolean containsAllLetters(String input) {
        input = input.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (input.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}


