package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class p extends Binder {

    private final a5.n f19065d;

    public p(a5.n nVar) {
        this.f19065d = nVar;
    }

    final void a(final s sVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.f19065d.f(sVar.f19074a).b(C2343a.b(), new OnCompleteListener(sVar) {

            private final s f19064a;

            {
                this.f19064a = sVar;
            }

            @Override
            public final void onComplete(Task task) {
                this.f19064a.a();
            }
        });
    }
}
