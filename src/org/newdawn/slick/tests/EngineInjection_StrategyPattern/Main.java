package org.newdawn.slick.tests.EngineInjection_StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();

        InjectionStrategy highAlpinStrategy = new HighAlpin();
        engine.setStrategy(highAlpinStrategy);
        engine.executeStrategy();

        InjectionStrategy africanStrategy = new African();
        engine.setStrategy(africanStrategy);
        engine.executeStrategy();
    }
}
