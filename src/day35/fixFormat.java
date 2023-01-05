package day35;

public class fixFormat {


    /*
   Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
   Input:
       jamES

   Output:
       James

    */
    public static String fixer(String name){
        String fixer="";
        name = name.toLowerCase().trim();
        fixer= name.toUpperCase().charAt(0) + name.substring(1,name.length());
        return fixer;

    }

    public static void main(String[] args) {
        System.out.println(fixer("melANIE"));
    }
}
