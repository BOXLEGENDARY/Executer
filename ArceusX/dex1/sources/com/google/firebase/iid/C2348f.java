package com.google.firebase.iid;

import a4.C1574k;
import a4.C1576m;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzf;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class C2348f {

    private static int f19034g;

    private static PendingIntent f19035h;

    private final Context f19037b;

    private final a5.j f19038c;

    private Messenger f19040e;

    private zzf f19041f;

    private final g0.k<String, C1574k<Bundle>> f19036a = new g0.k<>();

    private Messenger f19039d = new Messenger(new HandlerC2351i(this, Looper.getMainLooper()));

    public C2348f(Context context, a5.j jVar) {
        this.f19037b = context;
        this.f19038c = jVar;
    }

    private static synchronized String b() {
        int i7;
        i7 = f19034g;
        f19034g = i7 + 1;
        return Integer.toString(i7);
    }

    private static synchronized void c(Context context, Intent intent) {
        try {
            if (f19035h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f19035h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f19035h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzf.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzf) {
                        this.f19041f = (zzf) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f19040e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str = wtzgsqRsIZB.nlK;
                        String strValueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    } else {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        f(strGroup, extras);
                        return;
                    }
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(strValueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf2);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.f19036a) {
                        for (int i7 = 0; i7 < this.f19036a.getSize(); i7++) {
                            try {
                                f(this.f19036a.g(i7), intent2.getExtras());
                            } finally {
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str2 = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                f(str2, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private final void f(String str, Bundle bundle) {
        synchronized (this.f19036a) {
            try {
                C1574k<Bundle> c1574kRemove = this.f19036a.remove(str);
                if (c1574kRemove != null) {
                    c1574kRemove.c(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Bundle g(Bundle bundle) throws RemoteException, IOException {
        Bundle bundleH = h(bundle);
        if (bundleH == null || !bundleH.containsKey("google.messenger")) {
            return bundleH;
        }
        Bundle bundleH2 = h(bundle);
        if (bundleH2 == null || !bundleH2.containsKey("google.messenger")) {
            return bundleH2;
        }
        return null;
    }

    private final android.os.Bundle h(android.os.Bundle r9) throws android.os.RemoteException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2348f.h(android.os.Bundle):android.os.Bundle");
    }

    final Bundle a(Bundle bundle) throws IOException {
        if (this.f19038c.g() < 12000000) {
            return g(bundle);
        }
        try {
            return (Bundle) C1576m.a(a5.o.b(this.f19037b).f(1, bundle));
        } catch (InterruptedException | ExecutionException e7) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ((e7.getCause() instanceof a5.h) && ((a5.h) e7.getCause()).a() == 4) {
                return g(bundle);
            }
            return null;
        }
    }
}
