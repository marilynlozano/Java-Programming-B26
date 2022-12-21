package day28;

public class addElements {
    public static void main(String[] args) {

        int [] number = {3,6,10};

        int suma = 0;

        for (int i = 0; i<number.length ;i++){
            suma +=number[i];
        }
        System.out.println(suma);
    }
}
