package com.roblox.client;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1658c;
import e7.e;
import w6.C2980b;
import y0.xyyu.hkVlaTTCDY;

public class X extends DialogInterfaceOnCancelListenerC1658c implements e.b {

    protected e7.e f19868D;

    public final String f19870d = "dialogHeight";

    public final String f19871e = "dialogWidth";

    public final String f19872i = "dialogGravity";

    public final String f19873v = "dialogOffsetY";

    public final String f19874w = "dialogOffsetX";

    protected int f19875y = 0;

    protected int f19876z = 0;

    protected int f19865A = 0;

    protected int f19866B = 0;

    protected int f19867C = 0;

    protected C2980b f19869E = t();

    static class a {

        static final int[] f19877a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f19877a = iArr;
            try {
                iArr[e7.f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19877a[e7.f.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19877a[e7.f.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void R(e7.f fVar) {
        h7.l.a("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + fVar);
        if (this.f19869E != null) {
            int i7 = a.f19877a[fVar.ordinal()];
            this.f19869E.g(i7 != 1 ? i7 != 2 ? getResources().getColor(G.f19441h) : getResources().getColor(G.f19434a) : getResources().getColor(G.f19448o));
        }
    }

    public void o(int i7) {
        ActivityC1663h activity = getActivity();
        if (activity instanceof V) {
            ((V) activity).o(i7);
        }
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                int i7 = this.f19875y;
                if (i7 != 0) {
                    int i8 = this.f19876z;
                    if (i8 == 0) {
                        i8 = -2;
                    }
                    window.setLayout(i8, i7);
                }
                window.setGravity(this.f19865A);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = this.f19866B;
                attributes.x = this.f19867C;
                window.setAttributes(attributes);
            }
            dialog.setCanceledOnTouchOutside(true);
        }
        e7.e eVar = new e7.e(this);
        this.f19868D = eVar;
        eVar.b(this);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f19875y = arguments.getInt("dialogHeight", 0);
            this.f19876z = arguments.getInt(hkVlaTTCDY.aydrnvRfaRSVr, 0);
            this.f19865A = arguments.getInt("dialogGravity", 0);
            this.f19866B = arguments.getInt("dialogOffsetY", 0);
            this.f19867C = arguments.getInt("dialogOffsetX", 0);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public boolean q() {
        ActivityC1663h activity = getActivity();
        if (activity instanceof S) {
            return ((S) activity).m0();
        }
        h7.l.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
        return false;
    }

    public void r(String str) {
        ActivityC1663h activity = getActivity();
        if (activity instanceof V) {
            ((V) activity).r(str);
        }
    }

    public synchronized void s(CharSequence charSequence) {
        ActivityC1663h activity = getActivity();
        if (activity == null) {
            return;
        }
        androidx.appcompat.app.c cVarA = new c.a(activity).a();
        TextView textView = new TextView(activity);
        String string = activity.getString(M.f19643e0);
        int iIndexOf = charSequence.toString().indexOf(string);
        i7.b.b(textView, charSequence.toString(), new i7.a[]{new i7.c(activity, (String) null, string, iIndexOf, iIndexOf + string.length())});
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        cVarA.n(textView, 150, 100, 150, 100);
        cVarA.setCanceledOnTouchOutside(true);
        try {
            cVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    protected C2980b t() {
        return null;
    }

    protected View u(LayoutInflater layoutInflater, View view) {
        C2980b c2980b = this.f19869E;
        if (c2980b == null) {
            return view;
        }
        View viewE = c2980b.e(layoutInflater, this);
        this.f19869E.c().addView(view);
        return viewE;
    }

    public void v(int i7, int i8) {
        ActivityC1663h activity = getActivity();
        if (activity instanceof V) {
            ((V) activity).j0(i7, i8);
        }
    }

    public void w(String str, int i7) {
        ActivityC1663h activity = getActivity();
        if (activity instanceof V) {
            ((V) activity).k0(str, i7);
        }
    }
}
