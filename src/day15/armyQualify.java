package day15;

import java.util.Scanner;

public class armyQualify {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("are you a citizen?");
        boolean isCitizen = input.nextBoolean();

        System.out.println("are you resident?");
        boolean isResident = input.nextBoolean();

        System.out.println("do you have diploma?");
        boolean hasDiploma = input.nextBoolean();

        System.out.println("enter your age");
        int age = input.nextInt();

        String result;

        if ((age >=18 && age <=35) && (isResident || isCitizen) && hasDiploma){
            System.out.println("you can join the army");

            }else {

            if (!isCitizen && !isResident) {
                System.out.println("you must be a citizen or resident");
            }

            if (!hasDiploma) {
                System.out.println("you must have a diploma");
            }

            if (age < 18 && age > 35) {
                System.out.println("your age need to be between 18 and 35");
            }
        }

    }
}
