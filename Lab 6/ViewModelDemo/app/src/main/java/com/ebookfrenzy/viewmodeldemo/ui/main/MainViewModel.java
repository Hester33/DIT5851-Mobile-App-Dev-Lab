package com.ebookfrenzy.viewmodeldemo.ui.main;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private static final Float usd_to_rm_rate = 4.01F;
    private String dollarText = "";
    private Float result = 0F;
    public void setAmount(String value) {
        this.dollarText = value;
        result = Float.parseFloat(dollarText)*usd_to_rm_rate;
    }
    public Float getResult()
    {
        return result;
    }

}