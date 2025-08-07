package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {

    private int f8922A;

    protected n f8923B;

    private int f8924C;

    protected Context f8925d;

    protected Context f8926e;

    protected g f8927i;

    protected LayoutInflater f8928v;

    protected LayoutInflater f8929w;

    private m.a f8930y;

    private int f8931z;

    public b(Context context, int i7, int i8) {
        this.f8925d = context;
        this.f8928v = LayoutInflater.from(context);
        this.f8931z = i7;
        this.f8922A = i8;
    }

    @Override
    public void a(g gVar, boolean z7) {
        m.a aVar = this.f8930y;
        if (aVar != null) {
            aVar.a(gVar, z7);
        }
    }

    @Override
    public void b(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) this.f8923B;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f8927i;
        int i7 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> arrayListE = this.f8927i.E();
            int size = arrayListE.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                i iVar = arrayListE.get(i9);
                if (r(i8, iVar)) {
                    View childAt = viewGroup.getChildAt(i8);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewO = o(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewO.setPressed(false);
                        viewO.jumpDrawablesToCurrentState();
                    }
                    if (viewO != childAt) {
                        j(viewO, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!m(viewGroup, i7)) {
                i7++;
            }
        }
    }

    @Override
    public boolean d(g gVar, i iVar) {
        return false;
    }

    @Override
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override
    public void f(m.a aVar) {
        this.f8930y = aVar;
    }

    @Override
    public void g(Context context, g gVar) {
        this.f8926e = context;
        this.f8929w = LayoutInflater.from(context);
        this.f8927i = gVar;
    }

    @Override
    public boolean h(r rVar) {
        m.a aVar = this.f8930y;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f8927i;
        }
        return aVar.b(rVar2);
    }

    protected void j(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f8923B).addView(view, i7);
    }

    public abstract void k(i iVar, n.a aVar);

    public n.a l(ViewGroup viewGroup) {
        return (n.a) this.f8928v.inflate(this.f8922A, viewGroup, false);
    }

    protected boolean m(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    public m.a n() {
        return this.f8930y;
    }

    public View o(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarL = view instanceof n.a ? (n.a) view : l(viewGroup);
        k(iVar, aVarL);
        return (View) aVarL;
    }

    public n p(ViewGroup viewGroup) {
        if (this.f8923B == null) {
            n nVar = (n) this.f8928v.inflate(this.f8931z, viewGroup, false);
            this.f8923B = nVar;
            nVar.initialize(this.f8927i);
            b(true);
        }
        return this.f8923B;
    }

    public void q(int i7) {
        this.f8924C = i7;
    }

    public abstract boolean r(int i7, i iVar);
}
