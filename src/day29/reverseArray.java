package day29;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] num  = {1,6,5,34,78};
        int [] reverse = new int[num.length];
        int j =0;

        for (int i = (num.length -1); i>=0 ; i--){

           reverse[j++] = num[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
