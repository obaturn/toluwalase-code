package Rehersal;






import java.util.Scanner;

public class RehearsingSomeCode {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String menu = """
                          1. Add Contact
                          2. Remove Contact
                          """;
            System.out.println(menu);
            System.out.print("Select an option: ");
            String num = sc.nextLine();

            switch (num) {
                case "1":
                    addContact();
                    break;
                case "2":
                    removeContact();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter the phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Contact added: " + firstName + " " + lastName + ", " + phoneNumber);
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String name = sc.nextLine();
        System.out.println("Contact removed: " + name);
    }
}

