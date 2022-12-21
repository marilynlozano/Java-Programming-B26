package day15;

import java.util.Scanner;

public class schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the day");
        String day = input.next().toLowerCase();

        String schedule= " ";

        switch (day) {
            case "monday": case "mon":
                schedule = "java";
                break;
            case "tuesday": case "tues":
                schedule = "java";
                break;
            case "wednesday" : case "wedn":
                schedule = "java";
                break;
            case "thursday" : case "thur":
                schedule = "soft skills";
                break;
            case "friday" :case "fri":
                schedule = "off";
                break;
            case "saturday" : case "sat":
                schedule = "double java";
                break;
            case "sunday" : case "sun":
                schedule = "double java";
                break;
            default:
                schedule ="incorrect day";
        }
        System.out.println(schedule);


    }
}
