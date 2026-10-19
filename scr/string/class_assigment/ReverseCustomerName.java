package scr.string.class_assigment;

import java.util.Scanner;

public class ReverseCustomerName {

    // Method to reverse the customer name
    static String reverseCustomerName(String customerName) {

        String reversed = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversed = reversed + customerName.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        String reversedName = reverseCustomerName(name);

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversedName);

        sc.close();
    }
}