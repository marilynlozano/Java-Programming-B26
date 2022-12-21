package day11;

import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {

        System.out.println("welcome, how much money do you want to take today?");
        Scanner input = new Scanner(System.in);

        double accountBalance=100.00;
        double withdraw = input.nextDouble();
        double overdraft = 50.00;

        if (withdraw<=accountBalance){
            System.out.println("processing your transaccion");
            System.out.println("your new balance is "+ (accountBalance- withdraw));
        } else{
            System.out.println("there is not enought money in your account, we will charge you an overdraft fee of $" + overdraft);
            System.out.println("your new balance is "+ (accountBalance - withdraw - overdraft));
        }
    }
}
