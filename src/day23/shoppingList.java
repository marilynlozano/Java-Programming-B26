package day23;

import java.sql.SQLOutput;
import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item = "";
        String shoppingList = "";
        String add = "";


        do {
            System.out.println("Enter item in the shopping list");
           item = input.next();

            System.out.println("do you want to add more items?");
            add  = input.next().toLowerCase();
            if (shoppingList.contains("item")) {

                shoppingList = shoppingList;
            } else{
                shoppingList = shoppingList + " \n" + item;
            }

        } while (add.contains("y"));{

        }

        System.out.println(shoppingList);
    }

}
