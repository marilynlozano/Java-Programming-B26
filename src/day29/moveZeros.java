package day29;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int [] numbers = {10, 0, 5, 0, 1, 0};
        int [] reorganize = new int [numbers.length];
        int j = 0;

        for (int i  = 0 ; i< numbers.length; i++){
            if (numbers[i] != 0){
                reorganize[j++] = numbers[i];
            }

        }
        System.out.println(Arrays.toString(reorganize));
    }
}
