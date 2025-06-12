package Binary;

import java.util.Scanner;

public class Binary {
	 
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        if (decimal == 1) return "1";
        return decimalToBinary(decimal / 2) + (decimal % 2);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        String continueChoice = null;

	        System.out.println("=== Decimal to Binary Converter ===\n");

	        do {
	            System.out.print("Enter a decimal number: ");
	            try {
	            	double input = scanner.nextDouble();
	            	int decimal = (int) input;
	                if (decimal < 0) {
	                    System.out.println("Please enter a non-negative integer.");
	                    continue;
	                }

	                String binary = decimalToBinary(decimal);
	                System.out.println("Binary of " + decimal + " is: " + binary);

	            } catch (Exception e) {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.nextLine(); // clear invalid input
	                continue;
	            }

	            System.out.print("\nDo you want to convert another number? (yes/no): ");
	            continueChoice = scanner.next().toLowerCase();
	            System.out.println();

	        } while (continueChoice != null && (continueChoice.equals("yes") || continueChoice.equals("y")));

	        System.out.println("=== Time Complexity: O(log n) ===");
	        System.out.println("Program ended. Thank you!");

	        scanner.close();
	    }
	}

	


