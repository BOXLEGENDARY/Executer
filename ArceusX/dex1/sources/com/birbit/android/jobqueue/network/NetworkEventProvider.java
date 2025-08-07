package com.birbit.android.jobqueue.network;

public interface NetworkEventProvider {

    public interface Listener {
        void onNetworkChange(int i7);
    }

    void setListener(Listener listener);
}
