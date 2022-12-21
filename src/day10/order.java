package day10;

import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);

        System.out.println("enter product name");
        String product = inout.nextLine();

        System.out.println("enter the price");
        double price = inout.nextDouble();

        System.out.println("enter quantity");
        int quantity = inout.nextInt();

        System.out.println("enter your full name");
        String fullName = inout.nextLine();

        System.out.println(fullName + " your order for " + quantity + " of " + product + " has been placed.");
        System.out.println("your total is $"+(price*quantity) + " .");




    }
}
