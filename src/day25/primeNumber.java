package day25;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");

        int number = input.nextInt();
        String result = "";

        for (int i = 2; i<number; i++){
            if (number % i == 0) {
                result = "not a prime number";
                break;
            } else {

                result = "it is a prime number";
            }
        }
        System.out.println(result);
    }
}
