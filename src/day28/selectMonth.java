package day28;

import day26.month;

import java.util.Scanner;

public class selectMonth {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("insert a number 1 -12");
        int number = input.nextInt();

        String [] month = {"January", "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" ,  "December"};

        //for (int i = 1 ; i<=month.length;i++ ){
        //    if (number == i){
                System.out.println(month[number-1]);
    }
}
