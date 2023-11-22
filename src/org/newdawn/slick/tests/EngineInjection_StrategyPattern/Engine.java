package org.newdawn.slick.tests.EngineInjection_StrategyPattern;

import java.util.List;

public class Engine{

    private InjectionStrategy strategy;

    public void setStrategy(InjectionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy != null){
            strategy.applyInjection();
        }else{
            System.out.println("No strategy set");
        }
    }
}
