package day39;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class addAddRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        System.out.println(list);
        String item = list.remove(0);

        System.out.println(item);

        System.out.println(list);

        boolean bool = list.remove("mouse");
        System.out.println(bool);
        System.out.println(list);

    }
}
