package day42;

public class app {

    String name;
    double version;
    boolean isFree;

    public void run() {
        System.out.println(name + " is running");
    }

    public void update(){
        System.out.println(name + " is updating");
        version+= 1.1;
    }

}
