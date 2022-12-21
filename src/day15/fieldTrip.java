package day15;

import day57_exceptions.learn.FourthTry;

import java.util.Scanner;

public class fieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your grade");
        int grade = input.nextInt();
        String location, teacher;
        int numbGroups;

        if (grade >=1 && grade<=6){
            if (grade ==1){
                location = "apple orchad";
                numbGroups = 3;
                teacher = "Ms. Smith";

            }else if (grade ==2){
                location = "pear orchad";
                numbGroups = 1;
                teacher = "Ms. Stankovic";

            }else if (grade ==3){
                location = "watermelon";
                numbGroups = 5;
                teacher = "Ms. Saara";

            }else if (grade ==4){
                location = "oranges";
                numbGroups = 3;
                teacher = "Ms. lozano";

            }else if (grade ==5){
                location = "potatoe";
                numbGroups = 2;
                teacher = "Ms. Steve";

            }else{
                location = "gint";
                numbGroups = 6;
                teacher = "Ms. giann";

            }

            System.out.println("location = " + location);
            System.out.println("numbGroups = " + numbGroups);
            System.out.println("teacher = " + teacher);

        } else {
            System.out.println("grade must be between 1-6");
        }
    }
}
