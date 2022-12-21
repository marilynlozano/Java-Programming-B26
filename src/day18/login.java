package day18;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your username");
        String username = input.next().toLowerCase();


        System.out.println("enter your password");
        String password = input.next();

        if ((password.length()>=8) && password.equals("jamesbond")){
            System.out.println("logged in with " + username);
        }else{
            System.out.println("wrong password");
        }

    }
}
