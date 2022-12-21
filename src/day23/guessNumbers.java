package day23;

import java.util.Scanner;

public class guessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 4578;
        int number;
        boolean keeptrying = true;


            do {
                System.out.println("enter the secret number (4 digits)");
                number = input.nextInt();
                boolean has4digits = ((number >= 1000) && (number <= 9999));

                if (has4digits) {

                    if (number < secretNumber) {
                        System.out.println("too low");
                        System.out.println("do you want to keep trying? true/false");
                        keeptrying = input.nextBoolean();
                        if (!keeptrying) {
                            break;
                        }
                    }

                    if (number > secretNumber) {
                        System.out.println("too high");
                        System.out.println("do you want to keep trying?");
                        keeptrying = input.nextBoolean();
                        if (!keeptrying) {
                            break;
                        }
                    }

                    if (number == secretNumber) {
                        System.out.println("you guessed corrected");
                        break;
                    }

                } else {
                    System.out.println("the secret number should have  4 digits");
                }


            }

            while ((number != secretNumber) && keeptrying);
            {

            }

    }
}