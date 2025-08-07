package com.google.android.gms.common;

import a4.C1576m;
import a4.InterfaceC1573j;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.l;
import androidx.fragment.app.ActivityC1663h;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C1803c;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import k3.C2515a;
import k3.C2516b;
import l3.InterfaceC2533h;
import m3.InterfaceC2575f;
import n3.AbstractDialogInterfaceOnClickListenerC2665w;
import n3.C2651i;
import n3.C2662t;
import x3.C2987a;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {I3.d.class, I3.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class C1818c extends C1819d {

    private String f14212c;

    private static final Object f14210e = new Object();

    private static final C1818c f14211f = new C1818c();

    public static final int f14209d = C1819d.f14213a;

    public static C1818c n() {
        return f14211f;
    }

    public static final Task y(InterfaceC2533h interfaceC2533h, InterfaceC2533h... interfaceC2533hArr) {
        C2651i.m(interfaceC2533h, "Requested API must not be null.");
        for (InterfaceC2533h interfaceC2533h2 : interfaceC2533hArr) {
            C2651i.m(interfaceC2533h2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC2533hArr.length + 1);
        arrayList.add(interfaceC2533h);
        arrayList.addAll(Arrays.asList(interfaceC2533hArr));
        return C1803c.u().x(arrayList);
    }

    @Override
    public Intent b(Context context, int i7, String str) {
        return super.b(context, i7, str);
    }

    @Override
    public PendingIntent c(Context context, int i7, int i8) {
        return super.c(context, i7, i8);
    }

    @Override
    public final String e(int i7) {
        return super.e(i7);
    }

    @Override
    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    @Override
    public int h(Context context, int i7) {
        return super.h(context, i7);
    }

    @Override
    public final boolean j(int i7) {
        return super.j(i7);
    }

    public Task<Void> k(InterfaceC2533h<?> interfaceC2533h, InterfaceC2533h<?>... interfaceC2533hArr) {
        return y(interfaceC2533h, interfaceC2533hArr).p(new InterfaceC1573j() {
            @Override
            public final Task a(Object obj) {
                int i7 = C1818c.f14209d;
                return C1576m.f(null);
            }
        });
    }

    public Dialog l(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i7, AbstractDialogInterfaceOnClickListenerC2665w.b(activity, b(activity, i7, "d"), i8), onCancelListener, null);
    }

    public PendingIntent m(Context context, ConnectionResult connectionResult) {
        return connectionResult.p() ? connectionResult.o() : c(context, connectionResult.l(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean o(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogL = l(activity, i7, i8, onCancelListener);
        if (dialogL == null) {
            return false;
        }
        t(activity, dialogL, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i7) throws Resources.NotFoundException {
        u(context, i7, null, d(context, i7, 0, "n"));
    }

    final Dialog q(Context context, int i7, AbstractDialogInterfaceOnClickListenerC2665w abstractDialogInterfaceOnClickListenerC2665w, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2662t.c(context, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = C2662t.b(context, i7);
        if (strB != null) {
            if (abstractDialogInterfaceOnClickListenerC2665w == null) {
                abstractDialogInterfaceOnClickListenerC2665w = onClickListener;
            }
            builder.setPositiveButton(strB, abstractDialogInterfaceOnClickListenerC2665w);
        }
        String strF = C2662t.f(context, i7);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C2662t.c(activity, 18));
        builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        t(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final m3.s s(Context context, m3.r rVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        m3.s sVar = new m3.s(rVar);
        I3.h.n(context, sVar, intentFilter);
        sVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return sVar;
        }
        rVar.a();
        sVar.b();
        return null;
    }

    final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC1663h) {
                k.q(dialog, onCancelListener).show(((ActivityC1663h) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1817b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void u(Context context, int i7, String str, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i8;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = C2662t.e(context, i7);
        String strD = C2662t.d(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C2651i.l(context.getSystemService("notification"));
        l.e eVarZ = new l.e(context).t(true).f(true).m(strE).z(new l.c().h(strD));
        if (v3.i.f(context)) {
            C2651i.p(v3.m.e());
            eVarZ.x(context.getApplicationInfo().icon).w(2);
            if (v3.i.g(context)) {
                eVarZ.a(C2515a.f21296a, resources.getString(C2516b.f21311o), pendingIntent);
            } else {
                eVarZ.k(pendingIntent);
            }
        } else {
            eVarZ.x(R.drawable.stat_sys_warning).A(resources.getString(C2516b.f21304h)).D(System.currentTimeMillis()).k(pendingIntent).l(strD);
        }
        if (v3.m.i()) {
            C2651i.p(v3.m.i());
            synchronized (f14210e) {
                str2 = this.f14212c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C2516b.f21303g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarZ.h(str2);
        }
        Notification notificationC = eVarZ.c();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            C1823h.f14218b.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, notificationC);
    }

    final void v(Context context) {
        new n(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean w(Activity activity, InterfaceC2575f interfaceC2575f, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogQ = q(activity, i7, AbstractDialogInterfaceOnClickListenerC2665w.c(interfaceC2575f, b(activity, i7, "d"), 2), onCancelListener, null);
        if (dialogQ == null) {
            return false;
        }
        t(activity, dialogQ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, ConnectionResult connectionResult, int i7) throws Resources.NotFoundException {
        PendingIntent pendingIntentM;
        if (C2987a.a(context) || (pendingIntentM = m(context, connectionResult)) == null) {
            return false;
        }
        u(context, connectionResult.l(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentM, i7, true), I3.i.f1691a | 134217728));
        return true;
    }
}
