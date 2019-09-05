package com.example.drms.ui.storeroom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StoreroomViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StoreroomViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is storeroom fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}