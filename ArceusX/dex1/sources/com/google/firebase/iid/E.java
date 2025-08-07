package com.google.firebase.iid;

import a4.InterfaceC1566c;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

final class E implements InterfaceC1566c<Bundle, String> {

    private final B f19003a;

    E(B b2) {
        this.f19003a = b2;
    }

    @Override
    public final String a(Task<Bundle> task) throws Exception {
        Bundle bundleL = task.l(IOException.class);
        B b2 = this.f19003a;
        return B.d(bundleL);
    }
}
