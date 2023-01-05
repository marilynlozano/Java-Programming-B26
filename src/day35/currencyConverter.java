package day35;

public class currencyConverter {

    public static double converter(String type, double amount){
        switch (type){
            case "euro":
                return amount*(0.91);
            case "yen":
                return amount*(121.03);
            case "lira":
                return amount*(14.85);
            case "won":
                return amount*(1217.52);
            case "rupee":
                return amount*(181.45);
            default:
                return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(converter("euro",100));
    }

}
