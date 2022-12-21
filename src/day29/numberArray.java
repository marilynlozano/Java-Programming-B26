package day29;

import java.util.Arrays;

public class numberArray {
    public static void main(String[] args) {

        int [] numbers = new int[100];

        for (int i = 0; i<100 ; i++){
            numbers[i] = i+1;
        }

        System.out.println(Arrays.toString(numbers));


    }
}
