package day16;

import java.util.Scanner;

public class retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert the grade");
        int grade = input.nextInt();

        System.out.println("insert the attemp number");
        int number = input.nextInt();

        int newgrade = 0;

        if (number == 1) {
            newgrade = (int) (grade * 0.90);
        }
        else if (number ==2){
            newgrade = (int) (grade * 0.80);
        }else if (number ==3){
            newgrade = (int) (grade * 0.65);
        }else{
            System.out.println("not valid attemp number");
        }
        System.out.println(newgrade);


    }
}
