package day23;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int number = input.nextInt();

        for (int i = 1;i<=10;i++){

            System.out.println(number + "*" + i + " = " + (number*i));
        }

    }
}
