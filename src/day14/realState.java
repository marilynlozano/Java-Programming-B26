package day14;

import java.util.Scanner;

public class realState {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("can you tell us your budget");
        int budget = input.nextInt();
        String result;

        if (budget<=0){
            System.out.println("your budget can not 0 or be less than 0 ");
        } else if (budget>=300000) {
            System.out.println("your budget is too high for our agency ");
        } else {

            if (budget >= 55000 && budget <= 75000) {
                result = "name-oaks\naverage price 55000-75000\nrating-3.5\ngated-no\nallow pets-yes";
            } else if (budget >= 80000 && budget <= 100000) {
                result = "name-hills\naverage price 80000-100000\nrating-4.0\ngated-no\nallow pets-yes";
            } else if(budget >= 120000 && budget <= 150000) {
                result = "name-Highland\naverage price 12000-150000\nrating-4.5\ngated-yes\nallow pets-no";
            } else if (budget >= 160000 && budget <= 201000) {
                result = "name-canyon\naverage price 160000-201000\nrating-4.8\ngated-yes\nallow pets-yes";
            } else {
                result = "we dont have available houses with your budget";
            }
            System.out.println(result);

        }

    }

}
