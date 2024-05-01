package com.PracticeExersices;
import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To Dhabha");
        System.out.println("Pls select the items number wise");
        System.out.println("1. Dahi Tikhari --------------- 80 rs \n 2. Vaghareli Rotli --------------- 50 rs \n 3. Chaas Vare Rotli --------------- 70 rs \n 4. Khichdi Kadhi --------------- 130 rs \n 5. Masala Khichdi Kadhi --------------- 150rs \n 6. Masala Chaas --------------- 30 rs \n 7. MohanThar --------------- 100 rs \n 8. Shrikhand --------------- 80 rs \n 9. Bisleri Water --------------- 20rs \n 10. Rotla |Jowar/Bajri| --------------- 40 rs");

        int order;
        boolean validOrder = false;

        do {
            System.out.print("Enter your order number: ");
            order = sc.nextInt();

            // Check for valid order number within the menu range
            if (order >= 1 && order <= 10) {
                validOrder = true;
            } else {
                System.out.println("Invalid item number. Please select a number between 1 and 10.");
            }
        } while (!validOrder);

        System.out.println("Order added: " + order);
    }
}
