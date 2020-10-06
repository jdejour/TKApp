package com.example.traditionkeeper.ui.traditions.traditions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TraditionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TraditionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is traditions fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}