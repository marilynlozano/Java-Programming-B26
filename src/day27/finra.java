package day27;

public class finra {
    public static void main(String[] args) {

        int number = 5;
        String word = "";

        for (int j = 1; j <= number ;  j++) {


            if ((j % 3 == 0) && (j % 5 == 0)) {
                System.out.println("Finra");
            } else if (j % 3 == 0) {
                System.out.println("Fin");
            } else if (j % 5 == 0) {
                System.out.println("ra");
            } else {
                System.out.println(j);
            }
        }
    }

}