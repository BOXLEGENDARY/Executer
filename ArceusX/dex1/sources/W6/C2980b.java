package w6;

import android.graphics.Rect;
import android.view.InterfaceC1701o;
import android.view.InterfaceC1710x;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.V;
import com.roblox.client.startup.MainGameActivity;
import f6.ck.ZJZXBWla;
import h7.l;
import m6.EnumC2597N;
import ya.HnSi.PLHvHoayk;

public class C2980b {

    private ViewGroup f24305a;

    private View f24306b;

    private View f24307c;

    private View f24308d;

    private EnumC2597N f24309e = EnumC2597N.APP;

    class a implements InterfaceC1710x<Rect> {
        a() {
        }

        @Override
        public void a(Rect rect) {
            if (rect != null) {
                if (C2980b.this.f24309e == EnumC2597N.EXPERIENCE) {
                    C2980b.this.b(0, 0, 0, 0);
                } else {
                    C2980b.this.b(rect.top, rect.left, rect.right, rect.bottom);
                }
            }
        }
    }

    private View d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(K.f19571q, (ViewGroup) null);
        this.f24305a = (ViewGroup) viewInflate.findViewById(J.f19496I);
        this.f24306b = viewInflate.findViewById(J.f19498K);
        this.f24307c = viewInflate.findViewById(J.f19497J);
        this.f24308d = viewInflate.findViewById(J.f19495H);
        return viewInflate;
    }

    private void h(InterfaceC1701o interfaceC1701o, C2979a c2979a) {
        c2979a.b().i(interfaceC1701o, new a());
    }

    public void b(int i7, int i8, int i9, int i10) {
        if (this.f24305a == null) {
            return;
        }
        l.a("AppInsetViewAdapter", PLHvHoayk.jPeYqpbEdl + i7 + ", " + i8 + ", " + i9 + ", " + i10 + ZJZXBWla.eDxrmpCx + this.f24309e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24305a.getLayoutParams();
        boolean z7 = layoutParams.topMargin != i7;
        boolean z8 = layoutParams.rightMargin != i9;
        boolean z9 = layoutParams.bottomMargin != i10;
        if (z7 || z8 || z9) {
            layoutParams.topMargin = i7;
            layoutParams.rightMargin = i9;
            layoutParams.bottomMargin = i10;
            this.f24305a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f24306b.getLayoutParams();
        if (z7) {
            layoutParams2.height = i7;
            this.f24306b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f24307c.getLayoutParams();
        if (z8) {
            layoutParams3.width = i9;
            this.f24307c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f24308d.getLayoutParams();
        if (z9) {
            layoutParams4.height = i10;
            this.f24308d.setLayoutParams(layoutParams4);
        }
    }

    public ViewGroup c() {
        return this.f24305a;
    }

    public View e(LayoutInflater layoutInflater, Fragment fragment) {
        l.a("AppInsetViewAdapter", "inflate: Fragment = " + fragment);
        View viewD = d(layoutInflater);
        if (fragment != null) {
            InterfaceC1701o activity = fragment.getActivity();
            if (activity instanceof V) {
                V v7 = (V) activity;
                h(v7, v7.f0());
            } else if (activity instanceof MainGameActivity) {
                InterfaceC1701o interfaceC1701o = (MainGameActivity) activity;
                h(interfaceC1701o, interfaceC1701o.A0());
            }
        }
        return viewD;
    }

    public View f(LayoutInflater layoutInflater, V v7) {
        l.a("AppInsetViewAdapter", "inflate: Activity = " + v7);
        View viewD = d(layoutInflater);
        if (v7 != null) {
            h(v7, v7.f0());
        }
        return viewD;
    }

    public void g(int i7) {
        View view = this.f24306b;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
    }

    public void i(EnumC2597N enumC2597N) {
        this.f24309e = enumC2597N;
    }
}
