package com.appsflyer;

import kotlin.jvm.functions.Function1;

public final class a implements Runnable {

    public final Function1 f13580d;

    public a(Function1 function1) {
        this.f13580d = function1;
    }

    @Override
    public final void run() {
        AFLogger.getCurrencyIso4217Code(this.f13580d);
    }
}
