package com.example.drms.ui.shelf;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShelfViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShelfViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is shelf fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}