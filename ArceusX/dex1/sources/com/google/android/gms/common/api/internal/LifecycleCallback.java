package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m3.C2574e;
import m3.FragmentC2569J;
import m3.InterfaceC2575f;
import n3.C2651i;

public class LifecycleCallback {

    protected final InterfaceC2575f f14095d;

    protected LifecycleCallback(InterfaceC2575f interfaceC2575f) {
        this.f14095d = interfaceC2575f;
    }

    public static InterfaceC2575f c(Activity activity) {
        return d(new C2574e(activity));
    }

    protected static InterfaceC2575f d(C2574e c2574e) {
        if (c2574e.d()) {
            return m3.L.t(c2574e.b());
        }
        if (c2574e.c()) {
            return FragmentC2569J.e(c2574e.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    private static InterfaceC2575f getChimeraLifecycleFragmentImpl(C2574e c2574e) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityG = this.f14095d.g();
        C2651i.l(activityG);
        return activityG;
    }

    public void e(int i7, int i8, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
