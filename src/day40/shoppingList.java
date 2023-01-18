package day40;

import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> shoppingList= new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "shopping List is empy" : "You have some items");
        String keepAsking="";
        do {
            System.out.println("enter the item");
            shoppingList.add(input.nextLine());

            System.out.println("do you ant to continue y/n");
            keepAsking = input.nextLine();
        } while (keepAsking.equals("yes") || keepAsking.equals("y"));


        System.out.println("Shopping List" + shoppingList.size() + " items:");


        for (String item :  shoppingList){
            System.out.println("*\t" + item);
        }

        System.out.println("_____________________________________");


        System.out.println("does the shopping list have water");
        System.out.println(shoppingList.contains("water") ? "water on list" : "no water on list");

        System.out.println("do you want to remove any items");

        if (input.nextLine().equals("yes")){
            System.out.println("wich item do you want to remove");
            String itemToRemove = input.nextLine();

            if (Character.isDigit(itemToRemove.charAt(0))) {
                int number =  Integer.parseInt(itemToRemove);
                shoppingList.remove(number - 1);
            } else
                shoppingList.remove(itemToRemove);
        }

        System.out.println("Final list: " + shoppingList);

    }
}
