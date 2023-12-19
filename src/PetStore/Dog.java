package PetStore;

import javax.lang.model.element.Name;
import java.sql.SQLOutput;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    @Override
    public void getName() {
        System.out.println("The Name of the Dog is: " + name);


    }
}
