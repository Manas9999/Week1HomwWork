package com.week1Assignment.AliceBakery.week1Assignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.frosting.type",havingValue = "Strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry frosting added";
    }
}
