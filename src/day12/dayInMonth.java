package day12;

import javax.swing.*;
import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert the month 1-12");
        int month = input.nextInt();
        boolean has31days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28days = month ==2;

        if (has31days) {
            System.out.println("this month have 31 days");
        } else if (has30days) {
            System.out.println("this month have 30 days");
        } else if (has28days){
            System.out.println("this month have 28 days");
        } else{
            System.out.println("wong number");
        }
    }
}
