package day13;

import java.util.Scanner;

public class diver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert the value of oxigen level");
        int oxigenLevel = input.nextInt();

        if (oxigenLevel >= 90) {
            System.out.println("your tank is full");
        } else if (oxigenLevel >= 80) {
            System.out.println("still ok");
        } else if (oxigenLevel >= 70) {
            System.out.println("dont go too far");
        } else if (oxigenLevel >= 60) {
            System.out.println("start to hed back");
        } else if (oxigenLevel >= 50) {
            System.out.println("be carefull now you are at 50%");
        }else{
            System.out.println("dangerous");
        }
    }
}
