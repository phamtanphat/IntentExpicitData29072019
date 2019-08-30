package com.example.intentdata29072019;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.Observable;

public class MainViewModel extends ViewModel implements LifecycleObserver {

    private MutableLiveData<String> mButtonText = new MutableLiveData<>();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public LiveData<String> getButtonText(){
        return mButtonText;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onResumeMainmodel(){
        Log.d("BBB","Resume");
    }

    public void changText(String chuoi){
        mButtonText.setValue(chuoi);
    }

}
