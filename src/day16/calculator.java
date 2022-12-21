package day16;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter two numbes");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("pick operator +,-,* or /");
       String operator1 = input.next();
       String result = "";

        switch (operator1){

            case "+":
                result = "" + (num1 + num2);
                break;
            case "-":
                result = "" + (num1 - num2);
                break;
            case "*":
                result = "" + (num1 * num2);
                break;
            case "/":
                 result = "" + (double)(num1 / num2);
                 break;
            case "%":
                result = "" + (num1 % num2);
        }
        System.out.println(result);
    }

}
