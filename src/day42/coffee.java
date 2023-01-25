package day42;

public class coffee {

    String brand;
    double price;
    double size;
    String type;

    public void drink(){
        System.out.println("trying " + type + " of coffee");
        size-=1.5;
    }

    public void refill( int oz){
        size+=oz;

        System.out.println("refilling " + oz + " of coffee = " + size);
    }


    @Override
    public String toString() {
        return "coffee{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
