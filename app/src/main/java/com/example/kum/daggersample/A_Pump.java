package com.example.kum.daggersample;

import android.util.Log;

public class A_Pump implements Pump{

    private String TAG  = A_Pump.class.getSimpleName();
    private Heater heater;

    public A_Pump(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void Pump() {
        if(heater.isHot()) Log.d(TAG , " 펌핑중 ");
    }
}


