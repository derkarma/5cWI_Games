package PetStore;

import org.newdawn.slick.tests.SoundTest;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals;


        Person person = new Person("Hans", "Peter");
        person.printName();

        Dog dog = new Dog("Loo");
        dog.getName();
        dog.run();

        Cat cat = new Cat("Lucy");
        cat.getName();
        cat.run();

    }
}
