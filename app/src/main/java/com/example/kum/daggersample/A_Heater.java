package com.example.kum.daggersample;

import android.util.Log;

public class A_Heater implements Heater{

    private String TAG = A_Heater.class.getSimpleName();
    private boolean Heating = false;

    @Override
    public void on() {
        Log.d(TAG , "히터온");
        this.Heating = true;
    }

    @Override
    public void off() {
        Log.d(TAG , "히터오프");
        this.Heating = false;
    }

    @Override
    public boolean isHot() {
        return Heating;
    }
}

