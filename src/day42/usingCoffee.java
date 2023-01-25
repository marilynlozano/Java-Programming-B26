package day42;

import java.util.Scanner;

public class usingCoffee {

    public static void main(String[] args) {
        coffee coffee1 = new coffee();

        coffee1.brand = "Colombia";
        coffee1.price = 12.65;
        coffee1.size = 25.0;
        coffee1.type = "dark roast";

        Scanner input = new Scanner(System.in);
        int addSize= input.nextInt();


        coffee1.drink();
       ) System.out.println(coffee1.size;
        coffee1.refill(addSize);

        System.out.println();
        System.out.println(coffee1);
    }
}
