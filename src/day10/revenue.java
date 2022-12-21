package day10;

import java.util.Scanner;

public class revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the price");
        double price = input.nextDouble();

        System.out.println("enter quantity");
        int quantity = input.nextInt();

        System.out.println("the revenue is " + (price * quantity));
    }
}
