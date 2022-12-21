package day14;

import java.util.Scanner;

public class amazonPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number");
        double price = input.nextDouble();

        System.out.println("are you a prime member");
        boolean hasPrime = input.nextBoolean();
        String result;

        if (hasPrime) {
            result = "elegible for two days shipping";
        } else {
            if (!hasPrime && price >= 25) {
                result = "elegible for regular shipping";
            } else {
                result = "not elegible for free shipping. shipping fee $3.99";
            }
        }
        System.out.println(result);
    }
}
