package day09;

public class elegibleToVote {
    public static void main(String[] args) {
        String name = "Melanie";
        boolean isCitzen = true;
        boolean haveCriminal = true;
        int age = 25;

        System.out.println("can vote " + ((isCitzen == true) && (haveCriminal == false) && (age>=18)));

    }
}
