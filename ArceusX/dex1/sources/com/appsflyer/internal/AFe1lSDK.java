package com.appsflyer.internal;

import java.util.TimerTask;

public final class AFe1lSDK extends TimerTask {
    private final Thread getMonetizationNetwork;

    public AFe1lSDK(Thread thread) {
        this.getMonetizationNetwork = thread;
    }

    @Override
    public final void run() {
        this.getMonetizationNetwork.interrupt();
    }
}
