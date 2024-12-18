package com.week1Assignment.AliceBakery.week1Assignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.syrup.type",havingValue =  "Chocolate")
public class ChcolateSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "chocolate syrup added";
    }
}
