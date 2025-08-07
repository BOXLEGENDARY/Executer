package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import x0.C2986c;

public interface DateSelector<S> extends Parcelable {
    Collection<C2986c<Long, Long>> A();

    boolean I0();

    Collection<Long> L0();

    S P0();

    View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, l<S> lVar);

    void f1(long j7);

    String h0(Context context);

    int k0(Context context);

    String u(Context context);
}
