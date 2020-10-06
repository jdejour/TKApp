package com.example.traditionkeeper.ui.alumni.alumni;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlumniViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlumniViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alumni fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}