package PetStore;

public class Cat implements Animal{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void getName() {
        System.out.println("The name of the cat is: " + name);

    }
}
