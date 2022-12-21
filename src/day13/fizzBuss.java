package day13;

import java.util.Scanner;

public class fizzBuss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a  number");

        int number = input.nextInt();
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            System.out.println("FizzBuzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
