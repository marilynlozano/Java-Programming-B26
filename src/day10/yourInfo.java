package day10;

import java.util.Scanner;

public class yourInfo {
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);

        System.out.println("enter your age");
        byte age = inout.nextByte();

        System.out.println("enter your favourite number");
        long favNumber = inout.nextLong();

        System.out.println("enter your favourite book");
        String book = inout.next();

        System.out.println(age);
        System.out.println(favNumber);
        System.out.println(book);
    }
}
