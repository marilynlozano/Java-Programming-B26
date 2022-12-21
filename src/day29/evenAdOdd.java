package day29;

public class evenAdOdd {
    public static void main(String[] args) {
        int [] number = {4, 1,3 ,12, 5};
        int odd = 0;
        int even = 0;

        for (int each  : number){
            if (each % 2 == 0 ) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

    }
}
