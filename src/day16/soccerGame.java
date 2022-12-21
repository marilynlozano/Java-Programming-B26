package day16;

import java.util.Scanner;

public class soccerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the minutes");
        int minutes = input.nextInt();
        String result = " ";

        if (minutes > 0 && minutes <= 90) {
            if (minutes>0 && minutes<=29){
                result = "the end of the same is aproaching";
            }else if (minutes>=30 && minutes<=59){
                result = "middle of the game is going great";
            }else if (minutes>=60 && minutes<=74){
                result = "players are doing their best";
            }else{
                result = "just getting started";
            }


        } else {

            if (minutes < 0) {
                result ="minutes can not be negative number";
            }
            if (minutes > 90) {
                result = "games can not be longer than 90 minutes";
            }

        }
        System.out.println(result);
    }
}
