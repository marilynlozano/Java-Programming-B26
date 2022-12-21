package day29;

public class averageNumber {
    public static void main(String[] args) {
        int [] numbers = {10,15,5,6};

        int sum = 0;

        //for (int i =0; i<numbers.length; i++){
        //    sum +=numbers[i];
        //}
        //System.out.println(sum/numbers.length);

        for (int each : numbers){
            sum +=each;
        }
        System.out.println(sum/numbers.length);
    }
}
