package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.C1642t;
import g.C2447a;

public class p extends android.view.q implements e {

    private g f8711v;

    private final C1642t.a f8712w;

    public p(Context context, int i7) {
        super(context, f(context, i7));
        this.f8712w = new C1642t.a() {
            @Override
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f8710d.g(keyEvent);
            }
        };
        g gVarE = e();
        gVarE.N(f(context, i7));
        gVarE.y(null);
    }

    private static int f(Context context, int i7) {
        if (i7 != 0) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2447a.f20522C, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        e().z();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1642t.e(this.f8712w, getWindow().getDecorView(), this, keyEvent);
    }

    public g e() {
        if (this.f8711v == null) {
            this.f8711v = g.i(this, this);
        }
        return this.f8711v;
    }

    @Override
    public <T extends View> T findViewById(int i7) {
        return (T) e().j(i7);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i7) {
        return e().H(i7);
    }

    @Override
    public void invalidateOptionsMenu() {
        e().u();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        e().t();
        super.onCreate(bundle);
        e().y(bundle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        e().E();
    }

    @Override
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override
    public void setContentView(int i7) {
        e().I(i7);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().O(charSequence);
    }

    @Override
    public void setContentView(View view) {
        e().J(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().K(view, layoutParams);
    }

    @Override
    public void setTitle(int i7) {
        super.setTitle(i7);
        e().O(getContext().getString(i7));
    }
}
