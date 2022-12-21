package day15;

import java.util.Scanner;

public class sturbacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of your coffee");
        String size = input.next().toLowerCase();


        double price = 0;
        int calories = 0;
        String details = "";

        switch (size){
            case "tall":
                price =2.5;
                calories = 100;
                details  = "the price is " + price + ", and have calories" + calories;
                break;
            case "grande":
                price =4.0;
                calories = 150;
                details  = "the price is " + price + ", and have calories" + calories;
                break;
            case "venti":
                price =4.5;
                calories = 200;
                details  = "the price is " + price + ", and have calories" + calories;
                break;
            default:
                details = "is not a size";
        }
        System.out.println(details);
    }
}
