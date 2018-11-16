package com.example.kum.daggersample;

import android.util.Log;

import javax.inject.Inject;

public class CoffeeMaker {

     @Inject Heater heater;
     @Inject Pump pump;
//
    @Inject
    public CoffeeMaker() {}

//    @Inject
//    public CoffeeMaker(Heater heater, Pump pump) {
//        this.heater = heater;
//        this.pump = pump;
//    }

    public void brew() {
        heater.on();
        pump.Pump();
        Log.d("커피메이커", "증류중    ");
        heater.off();
    }

}
