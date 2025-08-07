package com.google.firebase.iid;

import a4.InterfaceC1566c;
import a5.InterfaceC1578a;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import g0.C2457a;
import java.util.Map;
import java.util.concurrent.Executor;

final class C2347e {

    private final Executor f19032a;

    private final Map<Pair<String, String>, Task<InterfaceC1578a>> f19033b = new C2457a();

    C2347e(Executor executor) {
        this.f19032a = executor;
    }

    final Task a(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.f19033b.remove(pair);
        }
        return task;
    }

    final synchronized Task<InterfaceC1578a> b(String str, String str2, InterfaceC2349g interfaceC2349g) {
        final Pair pair = new Pair(str, str2);
        Task<InterfaceC1578a> task = this.f19033b.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        Task taskI = interfaceC2349g.zza().i(this.f19032a, new InterfaceC1566c(this, pair) {

            private final C2347e f19030a;

            private final Pair f19031b;

            {
                this.f19030a = this;
                this.f19031b = pair;
            }

            @Override
            public final Object a(Task task2) {
                return this.f19030a.a(this.f19031b, task2);
            }
        });
        this.f19033b.put(pair, taskI);
        return taskI;
    }
}
