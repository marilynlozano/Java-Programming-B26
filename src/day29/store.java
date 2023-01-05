package day29;

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        double[] prices = {89.99, 150.0, 399.99, 250.0, 439.5, 39.99};
        int[] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};
        String result = "";

        Scanner input = new Scanner(System.in);
        System.out.println("enter the item that you want to find");
        String word = input.next();


        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase(word)) {
                result = "" + i;
            }
        }

        if (result.isEmpty()) {
            System.out.println("we dont have the item");
        } else {
            System.out.println(result);
        }

        for (int i = 0; i < items.length; i++) {
            String catalog = "";
            catalog = items[i] + " " + prices[i] + " " + itemIds[i];
            System.out.println(catalog);
        }

        double expensive = prices[0];
        double cheap = prices[0];
        String expensiveItem = "";
        String cheapItm = ";";

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > expensive) {
                expensive = prices[1];
                expensiveItem = items[i];
            }
            if (prices[i] < cheap) {
                cheap = prices[1];
                cheapItm = items[i];
            }
        }
        System.out.println("expensiveItem = " + expensiveItem);
        System.out.println("cheapItm = " + cheapItm);
    }
}
