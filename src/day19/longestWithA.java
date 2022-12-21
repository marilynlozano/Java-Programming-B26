package day19;

import java.util.Scanner;

public class longestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter three strings");
        String num1 = input.nextLine().toLowerCase().trim();
        String num2 = input.nextLine().toLowerCase().trim();
        String num3 = input.nextLine().toLowerCase().trim();

        String containsA = "";

        if (num1.contains("a")) {
            containsA = num1;
        }

        if (num2.contains("a")) {
            containsA = num2;
        }

        if (num3.contains("a")) {
            containsA = num3;
        }

        System.out.println(containsA);



//
//
//                    if (num1.contains("a")) {
//            if ((num1.length() > num2.length()) && (num1.length() > num3.length())) {
//                System.out.println("bigger one that contains a");
//            }
//
//            if (num2.contains("a")) {
//                if ((num2.length() > num1.length()) && (num2.length() > num3.length())) {
//                    System.out.println("bigger one that contains a");
//                }
//
//                if (num3.contains("a")) {
//                    if ((num3.length() > num1.length()) && (num3.length() > num2.length())) {
//                        System.out.println("bigger one that contains a");
                     }


                }



