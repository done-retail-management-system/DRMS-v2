package com.example.drms.ui.warehouse;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WarehouseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WarehouseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is warehouse fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}