package day36;

import java.util.Arrays;

public class addElement {

    public static int [] addElement(int [] arr, int element){

        int [] newArray = new int [arr.length + 1];
        for (int i =0; i < newArray.length; i++){
            if (i < arr.length){
                newArray[i] = arr[i];
            } else
                newArray[i]= element;
            }
        return newArray;
    }

    public static int [] addElement(int [] arr, int ... elements) {

        int[] newArray = new int[arr.length + elements.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < arr.length) {
                newArray[i] = arr[i];
            }
            if (i >= arr.length) {
                for (int j = 0; j < elements.length; j++){
                    newArray [i++] = elements[j];
                }
            }
        }
        return newArray;
    }

    public static String [] addElement(String [] original, String element){

            String [] newString = new String [original.length + 1];
        for (int i =0; i < newString.length; i++){
            if (i < original.length){
                newString[i] = original[i];
            } else
                newString[i]= element;
        }
        return newString;
    }


    public static void main(String[] args) {
        int [] arr = {7,1,-2,5};
        String [] words = {"apple", "ana", "marta"};
        System.out.println(Arrays.toString(addElement(arr,18)));
        System.out.println(Arrays.toString(addElement(arr,5,8,4,3)));
        System.out.println(Arrays.toString(addElement(words,"melanie")));
    }
}
