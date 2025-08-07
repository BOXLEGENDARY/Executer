package a5;

import a4.C1574k;
import android.os.Bundle;
import android.util.Log;

abstract class i<T> {

    final int f8355a;

    final C1574k<T> f8356b = new C1574k<>();

    final int f8357c;

    final Bundle f8358d;

    i(int i7, int i8, Bundle bundle) {
        this.f8355a = i7;
        this.f8357c = i8;
        this.f8358d = bundle;
    }

    final void a(h hVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(hVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f8356b.b(hVar);
    }

    abstract void b(Bundle bundle);

    final void c(T t7) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f8356b.c(t7);
    }

    abstract boolean d();

    public String toString() {
        int i7 = this.f8357c;
        int i8 = this.f8355a;
        boolean zD = d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i7);
        sb.append(" id=");
        sb.append(i8);
        sb.append(" oneWay=");
        sb.append(zD);
        sb.append("}");
        return sb.toString();
    }
}
