package day21;

public class factoial {
    public static void main(String[] args) {
        int num =5;
        int result = 1;

        while (num>0){
            System.out.print(num + " * ");
            result *=num;
            num--;
        }
        System.out.println(result);
    }
}
