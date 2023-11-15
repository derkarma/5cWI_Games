package org.newdawn.slick.tests.HomeControl;

public class HeatingController implements Observer{

    public HeatingController(){

    }

    @Override
    public void inform() {
        System.out.println("Info for HeatingController");
    }
}
