package day14;

import java.util.Scanner;

public class loginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your pin code");
        int pinCodeuser = input.nextInt();
        System.out.println("enter your 4 last digit of you SSN");
        int ssnuser = input.nextInt();

        int pinCodebase = 1552;
        int ssnbase = 1234;
        String result;

        if (pinCodebase == pinCodeuser && ssnbase == ssnuser){
            result = "Authentication  successfull";

        }else{
            result = "authentcation failed";
            System.out.println(result);

            if (pinCodebase != pinCodeuser && ssnbase == ssnuser){
                result = "incorrect pin code";
            }else if(pinCodebase == pinCodeuser && ssnbase != ssnuser){
                result = "incorrect ssn";
            }
        }
        System.out.println(result);

    }
}
