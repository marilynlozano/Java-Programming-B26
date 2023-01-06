package day35;

public class containsArray {

    public static boolean containArray(int [] nums, int num){

        for (int i =0; i<nums.length;i++){

            if (nums[i]==num){
                return true;
            }
        }
        return false;
    }


}
