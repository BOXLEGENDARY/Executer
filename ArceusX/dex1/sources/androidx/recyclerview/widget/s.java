package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class s {
    static int a(RecyclerView.A a2, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z7) {
        if (pVar2.O() == 0 || a2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return Math.abs(pVar2.l0(view) - pVar2.l0(view2)) + 1;
        }
        return Math.min(pVar.n(), pVar.d(view2) - pVar.g(view));
    }

    static int b(RecyclerView.A a2, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z7, boolean z8) {
        if (pVar2.O() == 0 || a2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z8 ? Math.max(0, (a2.b() - Math.max(pVar2.l0(view), pVar2.l0(view2))) - 1) : Math.max(0, Math.min(pVar2.l0(view), pVar2.l0(view2)));
        if (z7) {
            return Math.round((iMax * (Math.abs(pVar.d(view2) - pVar.g(view)) / (Math.abs(pVar2.l0(view) - pVar2.l0(view2)) + 1))) + (pVar.m() - pVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.A a2, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z7) {
        if (pVar2.O() == 0 || a2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return a2.b();
        }
        return (int) (((pVar.d(view2) - pVar.g(view)) / (Math.abs(pVar2.l0(view) - pVar2.l0(view2)) + 1)) * a2.b());
    }
}
