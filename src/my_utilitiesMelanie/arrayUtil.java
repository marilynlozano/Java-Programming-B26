package my_utilitiesMelanie;

public class arrayUtil {

     /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */

    public static int minNumber(int [] nums){

        int min = nums[0];

        for (int i = 1;i<nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }

     /*
    Max Number

    create a method that will accept an int array and return the biggest number from the array

     */

    public static int maxNumber(int [] nums){

        int max = nums[0];

        for (int i = 1;i<nums.length;i++){
            if (nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

     /*
        Contains

    create a method that will accept an int array and an int number. Check and return if the given number is in the array.
         */

    public static boolean containArray(int [] nums, int num){

        for (int i =0; i<nums.length;i++){

            if (nums[i]==num){
                return true;
            }
        }
        return false;
    }
}
