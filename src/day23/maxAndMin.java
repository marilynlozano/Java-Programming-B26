package day23;

import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        int n = 0;

        while (n<5){
            System.out.println("enter a number");
            int number = input.nextInt();
            n++;

            if (number>max){
                max = number;
            }

            if (number<min){
                min = number;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
