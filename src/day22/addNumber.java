package day22;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int times = 1;
        int sum =0;

        while (times<=5){
            System.out.println("enter number " + times);
            int number = input.nextInt();
            sum += number;
            times++;

        }
        System.out.println(sum);




    }
}
