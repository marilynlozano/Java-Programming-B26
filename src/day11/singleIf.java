package day11;

public class singleIf {
    public static void main(String[] args) {
        int year = 2019;
        boolean lockdown = year ==2020 || year ==2021;
        if (lockdown){
            System.out.println("be home");
        }

        if (!lockdown){
            System.out.println("be outside");
        }

    }
}
