package day33;

public class countNumbers {
    public static void countUp(int number){
        for (int i = 0; i<=number; i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        countUp(12);
    }
}
