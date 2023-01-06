
package day35;

import java.util.Arrays;

public class minNumberArray {

    public static int minNumber(int [] nums){

        int min = nums[0];

        for (int i = 1;i<nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
