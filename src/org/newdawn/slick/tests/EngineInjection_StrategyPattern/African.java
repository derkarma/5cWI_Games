package org.newdawn.slick.tests.EngineInjection_StrategyPattern;

public class African implements InjectionStrategy {

    @Override
    public void applyInjection() {
        System.out.println("Inject African injection strategy");
    }
}
