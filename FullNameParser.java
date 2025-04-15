package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name(first last or first middle last): ");
        String input = scanner.nextLine().trim();
        String[] parts = input.split("\\s+");
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        }else {
            System.out.println("Invalid Input. Please enter: First Last OR First Middle Last.");
            return;
        }
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("lastName: " + lastName);
    }
}
