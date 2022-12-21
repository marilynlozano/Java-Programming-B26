package day10;

import java.util.Scanner;

public class rateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a salary");
        double salary = input.nextDouble();

        System.out.println("how many hours do you work in a week");
        int hours = input.nextInt();

        double hourlyrate = (salary/ (hours*52));

        System.out.println("your hourly rate is " + hourlyrate);
    }
}
