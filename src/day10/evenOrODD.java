package day10;

import java.util.Scanner;

public class evenOrODD {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("enter a number");
        int number = inout.nextInt();

        System.out.println("is even " + (number%2 ==0)) ;
        System.out.println("is odd " + (number%2 !=0));
    }
}
