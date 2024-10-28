// import java.util.HashSet;
// import java.util.Random;
// import java.util.Scanner;
// import java.util.Set;

// public class ATM {
//     private static ATMPinGenerator pinGenerator;
//     private static Scanner scanner;

//     public static void main(String[] args) {
//         pinGenerator = new ATMPinGenerator();
//         scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("ATM PIN Generator");
//             System.out.println("1. Generate a new PIN");
//             System.out.println("2. Display all generated PINs");
//             System.out.println("3. Verify a PIN");
//             System.out.println("4. Exit");
//             System.out.print("Select an option (1-4): ");

//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     generateNewPin();
//                     break;
//                 case 2:
//                     displayAllPins();
//                     break;
//                 case 3:
//                     verifyPin();
//                     break;
//                 case 4:
//                     System.out.println("Exiting...");
//                     scanner.close(); // Close the scanner to avoid resource leaks
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("Invalid option. Please select again.");
//             }
//         }
//     }

//     private static void generateNewPin() {
//         String pin = pinGenerator.generatePin();
//         System.out.println("New PIN Generated: " + pin);
//     }

//     private static void displayAllPins() {
//         pinGenerator.displayAllPins();
//     }

//     private static void verifyPin() {
//         System.out.print("Enter PIN to verify: ");
//         String pin = scanner.next();
//         if (pinGenerator.verifyPin(pin)) {
//             System.out.println("PIN is valid.");
//         } else {
//             System.out.println("PIN is not valid.");
//         }
//     }
// }

// class ATMPinGenerator {
//     private Set<String> pinSet;
//     private Random random;

//     public ATMPinGenerator() {
//         pinSet = new HashSet<>();
//         random = new Random();
//     }

//     public String generatePin() {
//         String pin;
//         do {
//             pin = String.format("%04d", random.nextInt(10000));
//         } while (pinSet.contains(pin));
//         pinSet.add(pin);
//         return pin;
//     }

//     public void displayAllPins() {
//         System.out.println("All Generated PINs:");
//         for (String pin : pinSet) {
//             System.out.println(pin);
//         }
//     }

//     public int getTotalUniquePins() {
//         return pinSet.size();
//     }

//     public boolean verifyPin(String pin) {
//         return pinSet.contains(pin);
//     }
// }

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ATM {
    private static ATMPinGenerator pinGenerator;
    private static Scanner scanner;
    private static int balance = 100000;

    public static void main(String[] args) {
        pinGenerator = new ATMPinGenerator();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Welcome to ATM ---");
            System.out.println("1. Generate a new PIN");
            System.out.println("2. Display all generated PINs");
            System.out.println("3. Verify a PIN");
            System.out.println("4. Withdraw");
            System.out.println("5. Deposit");
            System.out.println("6. Check Balance");
            System.out.println("7. Exit");
            System.out.print("Select an option (1-7): ");

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
                    withdraw();
                    break;
                case 5:
                    deposit();
                    break;
                case 6:
                    checkBalance();
                    break;
                case 7:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
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
            System.out.println("PIN verification successful.");
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter your PIN for verification: ");
        String pin = scanner.next();
        if (!pinGenerator.verifyPin(pin)) {
            System.out.println("Incorrect PIN. Withdrawal canceled.");
            return;
        }

        System.out.print("Enter amount to be withdrawn: ");
        int amount = scanner.nextInt();
        if (validateInputAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("Please collect your money. New balance: " + balance);
        } else if (!validateInputAmount(amount)) {
            System.out.println("Enter an amount greater than zero.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        if (validateInputAmount(amount)) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Enter an amount greater than zero.");
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static boolean validateInputAmount(int amount) {
        return amount > 0;
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
        System.out.println("Generated PINs:");
        for (String pin : pinSet) {
            System.out.println(pin);
        }
    }

    public boolean verifyPin(String pin) {
        return pinSet.contains(pin);
    }
}

