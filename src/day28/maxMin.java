package day28;

public class maxMin {
    public static void main(String[] args) {

        int[] num= {100, 120, -80, 90, 250, -10};
        int max = num[0];
        int min = num[0];


        for (int i = 0; i<num.length; i++){

            int number = num[i];

            if(number > max ){
                max = number;
            }
            if (number < min ){
                min = number;
            }
        }
        System.out.println("biggest = " + max);
        System.out.println("min = " + min);
    }
}
