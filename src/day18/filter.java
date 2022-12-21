package day18;

import java.util.Scanner;

public class filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a message");

        String message = input.nextLine().toLowerCase().trim();


        if (message.contains("bad")){
            System.out.println("message failed to send");

        }else {
            System.out.println("$message sent");
        }
    }
}
