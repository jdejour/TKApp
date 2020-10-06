package com.example.traditionkeeper.ui.donors.donors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DonorsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DonorsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is donors fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}