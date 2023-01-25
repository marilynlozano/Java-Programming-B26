package day42;

public class usingItem {
    public static void main(String[] args) {
        item item1 = new item();

        item1.name = "Apples";
        item1.price = 3.99;


        System.out.println(item1);

        item item2 = new item();
        item2.name = "Pears";
        item2.price = 2.99;
        System.out.println(item2);

    }
}
