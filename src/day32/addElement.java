package day32;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {

//        int[] num = {2, 6, 1, -1};
//
//        int[] numBig = Arrays.copyOf(num, (num.length) + 1);
//        numBig[(numBig.length) - 1] = 10;
//
//        System.out.println(Arrays.toString(numBig));

        Scanner input = new Scanner(System.in);

        System.out.println("enter  the number of your array");
        int[] arr = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the number");
            arr[i] = input.nextInt();
        }

        System.out.println("do you want to add more elements?");
        boolean answer = input.nextBoolean();
        if (answer == true) {
            System.out.println("how many elements do you want to add?");
            int[] arrBig = Arrays.copyOf(arr,arr.length + input.nextInt());
            for (int j =arr.length; j <arrBig.length; j++){
                System.out.println("insert number");
                arrBig[j] = input.nextInt();
            }
            System.out.println(Arrays.toString(arrBig));

        } else{
            System.out.println(Arrays.toString(arr));
        }

    }
}
