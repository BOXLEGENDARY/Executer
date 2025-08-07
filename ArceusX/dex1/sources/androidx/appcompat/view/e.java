package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {

    private boolean f8806A;

    private androidx.appcompat.view.menu.g f8807B;

    private Context f8808i;

    private ActionBarContextView f8809v;

    private b.a f8810w;

    private WeakReference<View> f8811y;

    private boolean f8812z;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z7) {
        this.f8808i = context;
        this.f8809v = actionBarContextView;
        this.f8810w = aVar;
        androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f8807B = gVarS;
        gVarS.R(this);
        this.f8806A = z7;
    }

    @Override
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f8810w.d(this, menuItem);
    }

    @Override
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f8809v.showOverflowMenu();
    }

    @Override
    public void c() {
        if (this.f8812z) {
            return;
        }
        this.f8812z = true;
        this.f8810w.a(this);
    }

    @Override
    public View d() {
        WeakReference<View> weakReference = this.f8811y;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override
    public Menu e() {
        return this.f8807B;
    }

    @Override
    public MenuInflater f() {
        return new g(this.f8809v.getContext());
    }

    @Override
    public CharSequence g() {
        return this.f8809v.getSubtitle();
    }

    @Override
    public CharSequence i() {
        return this.f8809v.getTitle();
    }

    @Override
    public void k() {
        this.f8810w.c(this, this.f8807B);
    }

    @Override
    public boolean l() {
        return this.f8809v.isTitleOptional();
    }

    @Override
    public void m(View view) {
        this.f8809v.setCustomView(view);
        this.f8811y = view != null ? new WeakReference<>(view) : null;
    }

    @Override
    public void n(int i7) {
        o(this.f8808i.getString(i7));
    }

    @Override
    public void o(CharSequence charSequence) {
        this.f8809v.setSubtitle(charSequence);
    }

    @Override
    public void q(int i7) {
        r(this.f8808i.getString(i7));
    }

    @Override
    public void r(CharSequence charSequence) {
        this.f8809v.setTitle(charSequence);
    }

    @Override
    public void s(boolean z7) {
        super.s(z7);
        this.f8809v.setTitleOptional(z7);
    }
}
