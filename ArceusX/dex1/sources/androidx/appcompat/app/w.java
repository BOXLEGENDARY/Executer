package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.Z;
import java.util.ArrayList;

class w extends androidx.appcompat.app.a {

    final DecorToolbar f8732a;

    final Window.Callback f8733b;

    final h.g f8734c;

    boolean f8735d;

    private boolean f8736e;

    private boolean f8737f;

    private ArrayList<a.b> f8738g = new ArrayList<>();

    private final Runnable f8739h = new a();

    private final Toolbar.OnMenuItemClickListener f8740i;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            w.this.r();
        }
    }

    class b implements Toolbar.OnMenuItemClickListener {
        b() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            return w.this.f8733b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        private boolean f8743d;

        c() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
            if (this.f8743d) {
                return;
            }
            this.f8743d = true;
            w.this.f8732a.dismissPopupMenus();
            w.this.f8733b.onPanelClosed(108, gVar);
            this.f8743d = false;
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            w.this.f8733b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (w.this.f8732a.isOverflowMenuShowing()) {
                w.this.f8733b.onPanelClosed(108, gVar);
            } else if (w.this.f8733b.onPreparePanel(0, null, gVar)) {
                w.this.f8733b.onMenuOpened(108, gVar);
            }
        }
    }

    private class e implements h.g {
        e() {
        }

        @Override
        public boolean a(int i7) {
            if (i7 != 0) {
                return false;
            }
            w wVar = w.this;
            if (wVar.f8735d) {
                return false;
            }
            wVar.f8732a.setMenuPrepared();
            w.this.f8735d = true;
            return false;
        }

        @Override
        public View onCreatePanelView(int i7) {
            if (i7 == 0) {
                return new View(w.this.f8732a.getContext());
            }
            return null;
        }
    }

    w(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f8740i = bVar;
        x0.g.g(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f8732a = toolbarWidgetWrapper;
        this.f8733b = (Window.Callback) x0.g.g(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f8734c = new e();
    }

    private Menu q() {
        if (!this.f8736e) {
            this.f8732a.setMenuCallbacks(new c(), new d());
            this.f8736e = true;
        }
        return this.f8732a.getMenu();
    }

    @Override
    public boolean a() {
        return this.f8732a.hideOverflowMenu();
    }

    @Override
    public boolean b() {
        if (!this.f8732a.hasExpandedActionView()) {
            return false;
        }
        this.f8732a.collapseActionView();
        return true;
    }

    @Override
    public void c(boolean z7) {
        if (z7 == this.f8737f) {
            return;
        }
        this.f8737f = z7;
        int size = this.f8738g.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f8738g.get(i7).a(z7);
        }
    }

    @Override
    public int d() {
        return this.f8732a.getDisplayOptions();
    }

    @Override
    public Context e() {
        return this.f8732a.getContext();
    }

    @Override
    public void f() {
        this.f8732a.setVisibility(8);
    }

    @Override
    public boolean g() {
        this.f8732a.getViewGroup().removeCallbacks(this.f8739h);
        Z.f0(this.f8732a.getViewGroup(), this.f8739h);
        return true;
    }

    @Override
    public void h(Configuration configuration) {
        super.h(configuration);
    }

    @Override
    void i() {
        this.f8732a.getViewGroup().removeCallbacks(this.f8739h);
    }

    @Override
    public boolean j(int i7, KeyEvent keyEvent) {
        Menu menuQ = q();
        if (menuQ == null) {
            return false;
        }
        menuQ.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuQ.performShortcut(i7, keyEvent, 0);
    }

    @Override
    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override
    public boolean l() {
        return this.f8732a.showOverflowMenu();
    }

    @Override
    public void m(boolean z7) {
    }

    @Override
    public void n(boolean z7) {
    }

    @Override
    public void o(CharSequence charSequence) {
        this.f8732a.setWindowTitle(charSequence);
    }

    void r() {
        Menu menuQ = q();
        androidx.appcompat.view.menu.g gVar = menuQ instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuQ : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            menuQ.clear();
            if (!this.f8733b.onCreatePanelMenu(0, menuQ) || !this.f8733b.onPreparePanel(0, null, menuQ)) {
                menuQ.clear();
            }
            if (gVar != null) {
                gVar.c0();
            }
        } catch (Throwable th) {
            if (gVar != null) {
                gVar.c0();
            }
            throw th;
        }
    }
}
