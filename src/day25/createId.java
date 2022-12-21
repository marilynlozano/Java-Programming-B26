package day25;

import java.util.Scanner;

public class createId {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine().trim().toLowerCase();

        System.out.println("enter your last name");
        String lastName = input.nextLine().trim().toLowerCase();

        String id = "";

        id = name.substring(0,1) + lastName.substring(0,1).toUpperCase() + lastName.substring(1,3) + ((int)(name.length()*2));

        System.out.println(id);
        System.out.println(name.indexOf('j'));
        System.out.println(name.indexOf(1));
        System.out.println(name.charAt(0));
    }
}
