package day08;

public class giftCard {
    public static void main(String[] args) {
        /*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

     */

        double giftCard = 200;
        int item = 0;
        double price1 = 100;
        double price2 = 40;

        System.out.println("i have a giftCard = " + giftCard);
        System.out.println("buy " + ++item + "for " + price1);
        System.out.println("new value of gift card " + (giftCard-=price1));

        System.out.println("buy other item " + ++item + "for " + price2);
        System.out.println("new value of gift card " + (giftCard-=price2));

        System.out.println(giftCard);







    }
}
