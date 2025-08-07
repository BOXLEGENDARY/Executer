package androidx.transition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class C1730n {

    private Context f12331a;

    private int f12332b = -1;

    private ViewGroup f12333c;

    private View f12334d;

    private Runnable f12335e;

    private Runnable f12336f;

    public C1730n(ViewGroup viewGroup, View view) {
        this.f12333c = viewGroup;
        this.f12334d = view;
    }

    public static C1730n c(ViewGroup viewGroup) {
        return (C1730n) viewGroup.getTag(C1728l.f12326c);
    }

    static void f(ViewGroup viewGroup, C1730n c1730n) {
        viewGroup.setTag(C1728l.f12326c, c1730n);
    }

    public void a() {
        if (this.f12332b > 0 || this.f12334d != null) {
            d().removeAllViews();
            if (this.f12332b > 0) {
                LayoutInflater.from(this.f12331a).inflate(this.f12332b, this.f12333c);
            } else {
                this.f12333c.addView(this.f12334d);
            }
        }
        Runnable runnable = this.f12335e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f12333c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f12333c) != this || (runnable = this.f12336f) == null) {
            return;
        }
        runnable.run();
    }

    public ViewGroup d() {
        return this.f12333c;
    }

    boolean e() {
        return this.f12332b > 0;
    }
}
