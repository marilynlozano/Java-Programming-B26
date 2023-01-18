package day37;

import java.util.Arrays;

public class googleSearch {
    public static void main(String[] args) {
        String result = "About 2,550,000,000 results (1.00 seconds)";
        String [] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));

        String resultStr = arr[1].replace(";", "");
        String timeStr = arr[3]. substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

    }
}
