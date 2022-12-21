package day28;

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        String[] items = {"shoes", "jacket", "gloves", "airpods", "ipad"};

        Scanner input = new Scanner(System.in);

        System.out.println("introduce the item that you are looking for");
        String item = input.next().toLowerCase();
        int counter =0;

        for (int i =0; i<items.length; i++){

            String eachItem = items[i].toLowerCase();
            if (eachItem.equals(item)){
               counter++;
            }

        }
        if (counter != 0){
            System.out.println("available item");
        }else {
            System.out.println("unavailable item");
        }
        }
    }
