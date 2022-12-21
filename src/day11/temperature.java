package day11;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        System.out.println("please enter the temperature");
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();

        if (temperature>=70){
            System.out.println("its a nice day, go outside ");
        }else {
            System.out.println("its too cold");
        }
    }
}
