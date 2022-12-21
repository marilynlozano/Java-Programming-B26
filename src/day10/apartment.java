package day10;

import java.util.Scanner;

public class apartment {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);

        System.out.println("enter address");
        String adress = inout.nextLine();

        System.out.println("enter owner name");
        String owner = inout.nextLine();

        System.out.println("number of units");
        int units = inout.nextInt();

        System.out.println("average size");
        float size = inout.nextFloat();

        System.out.println("mountly rent");
        double rent = inout.nextDouble();

        System.out.println("washer and dryers");
        int washer = inout.nextInt();

        System.out.println("allow pets");
        boolean allowpets = inout.nextBoolean();

        System.out.println("pool");
        boolean pool = inout.nextBoolean();

        System.out.println("lenght lease");
        int lease = inout.nextInt();

        System.out.println("number of residets");
        int residents = inout.nextInt();

        System.out.println("phone number owner");
        long phoneowner = inout.nextLong();

        System.out.println("near gas station");
        boolean gasstation = inout.nextBoolean();

        System.out.println("number of floors");
        int floors = inout.nextInt();

        System.out.println("has basement");
        boolean baasement = inout.nextBoolean();

        System.out.println("has available units");
        boolean availableunits = inout.nextBoolean();

        System.out.println("has air condition");
        boolean aircondition = inout.nextBoolean();

        System.out.println("number of parking");
        int numberparking = inout.nextInt();

        System.out.println("has wheel chair");
        boolean wheelchair = inout.nextBoolean();

        System.out.println("rate");
        double rate = inout.nextDouble();

        System.out.println("mountly rate after 3 years " + (rent-=10%(rent)));
        System.out.println("mountly rate after 6 years " + (rent-=20%(rent)));
        System.out.println("average number residents " + (residents/units));
        System.out.println("parking per unit "+ (numberparking/units));
        System.out.println("uits per floor " + (units/floors));

    }
}
