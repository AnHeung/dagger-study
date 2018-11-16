package com.example.kum.daggersample;

public class Injection {


    public static Heater provideHeater(){
        return new A_Heater();
    }

    public static Pump providePump(){
        return new A_Pump(provideHeater());
    }

//    public static CoffeeMaker provideCoffeMaker(){
//        return new CoffeeMaker(provideHeater(), providePump());
//    }
}

