package com.example.kum.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DaggerCoffeeComponent.create().inject(coffeeMaker);
        coffeeMaker.brew();
//        DaggerCoffeeComponent.create().inject().brew();





//        CoffeeMaker coffeeMaker = Injection.provideCoffeMaker();
//        coffeeMaker.brew();
//        DaggerCoffeeComponent.create().make().brew();

        //        Heater heater = new A_Heater();
//        CoffeeMaker coffeeMaker = new CoffeeMaker(heater , new A_Pump(heater));
//        coffeeMaker.brew();

//        coffeeMaker.brew();

    }
}
