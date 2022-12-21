package day10;

import java.util.Scanner;

public class angleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        float number1 = input.nextFloat();

        System.out.println("enter number 2");
        float num2 = input.nextFloat();

        System.out.println("enter number 3");
        float num3 = input.nextFloat();

        System.out.println("is a triangle " + ((number1 + num2 + num3) == 180));
        System.out.println("is a circle " + ((number1 + num2 + num3) == 360));
    }
}
