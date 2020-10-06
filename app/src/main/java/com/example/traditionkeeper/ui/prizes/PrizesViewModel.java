package com.example.traditionkeeper.ui.prizes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrizesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrizesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}