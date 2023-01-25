package day42;

import day42_custom_classes.Animal;

public class usingAnimal {
    public static void main(String[] args) {
        animal bird = new animal();
        bird.population = 10000000;
        bird.species= "bird";

        System.out.println(bird);
        System.out.println(bird.toString());

    }
}
