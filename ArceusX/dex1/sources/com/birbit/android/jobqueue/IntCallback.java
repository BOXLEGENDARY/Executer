package com.birbit.android.jobqueue;

public interface IntCallback {

    public interface MessageWithCallback {
        void setCallback(IntCallback intCallback);
    }

    void onResult(int i7);
}
