package day28;

import java.util.Arrays;
import java.util.Scanner;

public class friendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many friend do you have?");

        String[] friends = new String[input.nextInt()];

        for (int i = 0; i<friends.length ; i++){
            friends[i] = input.next();
        }

        System.out.println(Arrays.toString(friends));

    }
}
