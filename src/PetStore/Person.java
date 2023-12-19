package PetStore;

public class Person {

    private String firstName;
    private String lastName;

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public void printName(){
        System.out.println("Name:" + firstName + " " + lastName);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
