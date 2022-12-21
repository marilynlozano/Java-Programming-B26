package day09;

public class discount {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isTeacher = false;
        boolean isPolice = false;
        boolean isFirefigther = false;

        System.out.println("get a discount " + ((isWeekend== true) && (isTeacher ==true || isPolice==true || isFirefigther
        ==true)));
    }
}
