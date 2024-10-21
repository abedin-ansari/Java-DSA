import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ATM {
    private static ATMPinGenerator pinGenerator;
    private static Scanner scanner;

    public static void main(String[] args) {
        pinGenerator = new ATMPinGenerator();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM PIN Generator");
            System.out.println("1. Generate a new PIN");
            System.out.println("2. Display all generated PINs");
            System.out.println("3. Verify a PIN");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    generateNewPin();
                    break;
                case 2:
                    displayAllPins();
                    break;
                case 3:
                    verifyPin();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner to avoid resource leaks
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }

    private static void generateNewPin() {
        String pin = pinGenerator.generatePin();
        System.out.println("New PIN Generated: " + pin);
    }

    private static void displayAllPins() {
        pinGenerator.displayAllPins();
    }

    private static void verifyPin() {
        System.out.print("Enter PIN to verify: ");
        String pin = scanner.next();
        if (pinGenerator.verifyPin(pin)) {
            System.out.println("PIN is valid.");
        } else {
            System.out.println("PIN is not valid.");
        }
    }
}

class ATMPinGenerator {
    private Set<String> pinSet;
    private Random random;

    public ATMPinGenerator() {
        pinSet = new HashSet<>();
        random = new Random();
    }

    public String generatePin() {
        String pin;
        do {
            pin = String.format("%04d", random.nextInt(10000));
        } while (pinSet.contains(pin));
        pinSet.add(pin);
        return pin;
    }

    public void displayAllPins() {
        System.out.println("All Generated PINs:");
        for (String pin : pinSet) {
            System.out.println(pin);
        }
    }

    public int getTotalUniquePins() {
        return pinSet.size();
    }

    public boolean verifyPin(String pin) {
        return pinSet.contains(pin);
    }
}
