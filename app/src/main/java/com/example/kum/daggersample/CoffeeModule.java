package com.example.kum.daggersample;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    Heater provideHeater(){
        return new A_Heater();
    }

    @Provides
    Pump providePump(){
        return new A_Pump(provideHeater());
    }
}


