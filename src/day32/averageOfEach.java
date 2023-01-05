package day32;

public class averageOfEach {
    public static void main(String[] args) {

        int [] [] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30},
        };

        double sumTotal = 0;
        int totalLength = 0;
        for (int [] eachInner : nums){
            double sumEach = 0;

            for (int i = 0; i<eachInner.length; i++){
                sumEach+=eachInner[i];
            }

            double averageEach = sumEach/(eachInner.length);
            System.out.println("average of index "+ averageEach);
            sumTotal+= sumEach;
            totalLength += eachInner.length;

        }

        System.out.println("averageTotal = " + (sumTotal/ totalLength));




    }
}
