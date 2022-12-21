package day11;

import java.util.Scanner;

public class checkHunger {
    public static void main(String[] args) {

        System.out.println("are you hungry?");

        Scanner input = new Scanner(System.in);
        boolean isHungry = input.nextBoolean();

        if (isHungry){
            System.out.println("you are hungry");
        } else{
            System.out.println("great lets do other thing");
        }
    }
}
