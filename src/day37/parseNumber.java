package day37;

public class parseNumber {

    public static void main(String[] args) {

        String year = "2022";

        System.out.println("this year is " + year);
        System.out.println("next year will be "  + (year +1));

        int numYear = Integer.parseInt(year);
        System.out.println("next year will be "  + (numYear +1));

    }
}
