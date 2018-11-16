package com.example.kum.daggersample;

import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {

    CoffeeMaker make();

    void inject(CoffeeMaker coffeeMaker);
}


