package com.week1Assignment.AliceBakery.week1Assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
@Service
public class CakeBaker {
    private final  Frosting frosting;
     private final Syrup syrup;

    public CakeBaker( Frosting frosting, Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }

    String bakeCake(){
      return  frosting.getFrostingType()+"  "+syrup.getSyrupType();
    }
}
