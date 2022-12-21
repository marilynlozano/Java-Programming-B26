package day11;

public class ifElse {
    public static void main(String[] args) {
        int year = 2000;
        boolean lockdown = year ==2020||year ==2021;

        if (lockdown){
            System.out.println("be at home");
        } else {
            System.out.println("be outside");
        }
    }
}
