package Regex;

public class RegexEmail {
    public static void main(String[] args) {

        System.out.println(validateEmail("test@example.com"));
        System.out.println(validatePhoneNumber("+2347012345678"));
        System.out.println(validatePhoneNumber("08123456789"));
    }

    public static boolean validateEmail(String email) {

        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {

        String regex = "^(\\+234|0)(70[0-9]|71[0-9]|81[0-9]|90[0-9]|91[0-9])[0-9]{7}$";
        if (phoneNumber.startsWith("+234")) {
            phoneNumber = phoneNumber.replaceFirst("\\+2340", "+234");
        }
        return phoneNumber.matches(regex);
    }
}
