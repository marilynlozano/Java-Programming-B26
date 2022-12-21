package day13;

import java.util.Scanner;

public class chooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inser the number based on the language that you want to use:");
        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. Turkish");
        System.out.println("4. Russian");
        System.out.println("5. French");

        int language = input.nextInt();

        if (language==1){
            System.out.println("hello, thank for your call");
        }else if (language==2){
            System.out.println("hola, gracias por llamar");
        }else if (language==3){
            System.out.println("merhaba, aradiginiz icin teses");
        } else if (language==4) {
            System.out.println("privet, spasivo");
        } else if (language==5){
            System.out.println("merci, pour votre");
        } else{
            System.out.println("hello, thank you");
        }
    }
}
