package com.google.android.gms.measurement;

import W3.h;
import W3.i;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;

public final class AppMeasurementReceiver extends P0.a implements h {

    private i f16238i;

    @Override
    public void a(Context context, Intent intent) {
        P0.a.c(context, intent);
    }

    @Override
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f16238i == null) {
            this.f16238i = new i(this);
        }
        this.f16238i.a(context, intent);
    }
}
