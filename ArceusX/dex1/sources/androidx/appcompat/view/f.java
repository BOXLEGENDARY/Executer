package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import g0.k;
import java.util.ArrayList;
import r0.InterfaceMenuC2740a;
import r0.InterfaceMenuItemC2741b;

public class f extends ActionMode {

    final Context f8813a;

    final b f8814b;

    public static class a implements b.a {

        final ActionMode.Callback f8815a;

        final Context f8816b;

        final ArrayList<f> f8817c = new ArrayList<>();

        final k<Menu, Menu> f8818d = new k<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f8816b = context;
            this.f8815a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f8818d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f8816b, (InterfaceMenuC2740a) menu);
            this.f8818d.put(menu, oVar);
            return oVar;
        }

        @Override
        public void a(b bVar) {
            this.f8815a.onDestroyActionMode(e(bVar));
        }

        @Override
        public boolean b(b bVar, Menu menu) {
            return this.f8815a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override
        public boolean c(b bVar, Menu menu) {
            return this.f8815a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f8815a.onActionItemClicked(e(bVar), new j(this.f8816b, (InterfaceMenuItemC2741b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f8817c.size();
            for (int i7 = 0; i7 < size; i7++) {
                f fVar = this.f8817c.get(i7);
                if (fVar != null && fVar.f8814b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f8816b, bVar);
            this.f8817c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f8813a = context;
        this.f8814b = bVar;
    }

    @Override
    public void finish() {
        this.f8814b.c();
    }

    @Override
    public View getCustomView() {
        return this.f8814b.d();
    }

    @Override
    public Menu getMenu() {
        return new o(this.f8813a, (InterfaceMenuC2740a) this.f8814b.e());
    }

    @Override
    public MenuInflater getMenuInflater() {
        return this.f8814b.f();
    }

    @Override
    public CharSequence getSubtitle() {
        return this.f8814b.g();
    }

    @Override
    public Object getTag() {
        return this.f8814b.h();
    }

    @Override
    public CharSequence getTitle() {
        return this.f8814b.i();
    }

    @Override
    public boolean getTitleOptionalHint() {
        return this.f8814b.j();
    }

    @Override
    public void invalidate() {
        this.f8814b.k();
    }

    @Override
    public boolean isTitleOptional() {
        return this.f8814b.l();
    }

    @Override
    public void setCustomView(View view) {
        this.f8814b.m(view);
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
        this.f8814b.o(charSequence);
    }

    @Override
    public void setTag(Object obj) {
        this.f8814b.p(obj);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.f8814b.r(charSequence);
    }

    @Override
    public void setTitleOptionalHint(boolean z7) {
        this.f8814b.s(z7);
    }

    @Override
    public void setSubtitle(int i7) {
        this.f8814b.n(i7);
    }

    @Override
    public void setTitle(int i7) {
        this.f8814b.q(i7);
    }
}
