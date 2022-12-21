package day07;

public class pizza {
    public static void main(String[] args) {
        String typePizza;
        int numOfSlices;
        int numPeople;

        numOfSlices = 20;
        numPeople = 5;

        double eashPerPerson = numOfSlices / numPeople;
        double leftLover = numOfSlices % numPeople;

        System.out.println(eashPerPerson  + " " + leftLover);
    }
}
