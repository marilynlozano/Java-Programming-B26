package day12;

import java.util.Scanner;

public class overtime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("enter the hours that you worked");
        double hoursWorked = input.nextDouble();


        if (hoursWorked>40) {
            System.out.println("your pay is " + ((40*hourlyRate) + (((hoursWorked-40) * hourlyRate)* (1.5))));
        }


    }
}
