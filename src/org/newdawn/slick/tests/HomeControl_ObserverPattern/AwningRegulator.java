package org.newdawn.slick.tests.HomeControl_ObserverPattern;

public class AwningRegulator implements Observer{

    public AwningRegulator(){

    }

    @Override
    public void inform() {
        System.out.println("Info for AwningRegulator");

    }
}


