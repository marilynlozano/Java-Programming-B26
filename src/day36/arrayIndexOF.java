package day36;

public class arrayIndexOF {
    public static int indexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] arr, String element) {

        for (int i = 0; i < arr.length; i++) {
            if (element.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] num = {13,5,1,5,2,6,5};
        System.out.println(indexOf(num,2));
        System.out.println(indexOf(num,20));
        System.out.println(indexOf(num,5));



        String [] arr = {"java", "apple", "water", "hello"};

        System.out.println(indexOf(arr,"hello"));
    }
}
