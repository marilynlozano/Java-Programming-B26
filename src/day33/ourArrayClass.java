package day33;

import java.awt.font.FontRenderContext;

public class ourArrayClass {

    public static void firstElement(int [] nums){
        System.out.println("first element: "+ nums[0]);

    }

    public static void lastElement(int [] nums){
        System.out.println("last element: "+ nums[nums.length-1]);

    }

    public static void allElement(int [] nums){
        for (int i = 0; i< nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public static void middleElement(int [] nums){

        if ((nums.length)%2==0){
            System.out.println("middle element "+ nums[(nums.length-1)/2] + " and " + (nums[(nums.length-1)/2]+1) );
        }else{
            System.out.println("middle element "+ nums[(nums.length-1)/2]);
        }


    }

    public static void main(String[] args) {
        firstElement(new int[]{3, 4, 1, 90});
        lastElement(new int[]{3, 4, 1, 90});
        allElement(new int[]{3, 4, 1, 90});
        middleElement(new int[]{3, 4, 1, 90});
    }
}

