package day06;

public class basicCalculator {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 =4;

        double addition = num1+num2;
        double substraccion = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double reminder = num1 % num2;

        System.out.println("addition = " + addition);
        System.out.println("substraccion = " + substraccion);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
        System.out.println("reminder = " + reminder);
        System.out.println("" + num1 + num2);
    }
}
