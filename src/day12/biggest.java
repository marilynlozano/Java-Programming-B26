package day12;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert first number");
        int num1 = input.nextInt();

        System.out.println("insert second number");
        int num2 = input.nextInt();

        System.out.println("insert third number");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is th biggest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is th biggest number");
        } else {
            System.out.println(num3 + " is th biggest number");
        }
    }
}