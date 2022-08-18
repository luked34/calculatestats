package org.example;

import java.util.Collection;

public class CalculateStats {

    public String getHelloWorld() {
        return "Hello, Wojciech!";
    }


    public String result (Collection<Integer> dataset, StrategyInf strategyInf){
        dataset.forEach(item -> strategyInf.apply(item));
        return strategyInf.result();
    }
}
