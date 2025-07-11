package array;

import java.util.*;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lists to store results
        List<String> errorList = new ArrayList<>();
        List<String> validTransactions = new ArrayList<>();

        // Get number of transactions
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        // Process each transaction
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item ID: ");
            int itemId = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            boolean isValid = true;

            // Check item ID range
            if (itemId < 5001 || itemId > 5005) {
                errorList.add("Invalid ID: " + itemId);
                isValid = false;
            }

            // Check for negative quantity
            if (quantity <= 0) {
                errorList.add("Negative quantity: (" + itemId + ", " + quantity + ")");
                isValid = false;
            }

            // If valid, add to valid list
            if (isValid) {
                validTransactions.add("(" + itemId + ", " + quantity + ")");
            }
        }

        // Display results
        System.out.println("\n Valid Transactions: " + validTransactions);
        System.out.println(" Errors Found: " + errorList);
    }
}
