package day09;

import java.util.Scanner;

public class compareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = input.nextInt();


        System.out.println("enter second number");
        int number2 = input.nextInt();


        System.out.println("Are the numbers equals " + (number1 == number2));

    }
}
