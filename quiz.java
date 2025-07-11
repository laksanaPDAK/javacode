package array;
import java.util.*;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List to store invalid item IDs
        List<Integer> invalidItems = new ArrayList<>();

        // Total quantity of valid items
        int totalQuantity = 0;

        // Get number of transactions
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        // Read each transaction
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item ID: ");
            int itemId = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            // Check if item ID is valid (between 5001 and 5005)
            if (itemId >= 5001 && itemId <= 5005) {
                totalQuantity += quantity;  // Only add if valid
            } else {
                invalidItems.add(itemId);   // Collect invalid item ID
            }
        }

        // Output the result
        System.out.println("\nInvalid item IDs: " + invalidItems);
        System.out.println("Total quantity of valid items: " + totalQuantity);
    }
}

