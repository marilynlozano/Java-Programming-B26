package day10;

import java.util.Scanner;

public class divisibleby {
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);

        System.out.println("enter a number");
        int number = inout.nextInt();

        boolean divisible2 = number%2 ==0;
        System.out.println("divisible by 2 " + (divisible2 == true));
        boolean divisible3 = number%3 ==0;
        System.out.println("divisible by 3 " + (divisible3 == true));
        boolean divisible5 = number%5 ==0;
        System.out.println("divisible by 5 " + (divisible5 == true));


    }
}
