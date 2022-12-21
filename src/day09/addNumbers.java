package day09;

import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int num1 = input.nextInt();

        System.out.println("enter second number");
        int num2 = input.nextInt();

        System.out.println("enter third number");
        int num3 = input.nextInt();

        System.out.println("the sum of the three numbers is " + (num1+num2+num3));
    }
}
