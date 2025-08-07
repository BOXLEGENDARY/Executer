package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;
import g.C2453g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    private g f9016d;

    private androidx.appcompat.app.c f9017e;

    e f9018i;

    private m.a f9019v;

    public h(g gVar) {
        this.f9016d = gVar;
    }

    @Override
    public void a(g gVar, boolean z7) {
        if (z7 || gVar == this.f9016d) {
            c();
        }
        m.a aVar = this.f9019v;
        if (aVar != null) {
            aVar.a(gVar, z7);
        }
    }

    @Override
    public boolean b(g gVar) {
        m.a aVar = this.f9019v;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f9017e;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f9016d;
        c.a aVar = new c.a(gVar.u());
        e eVar = new e(aVar.b(), C2453g.f20688l);
        this.f9018i = eVar;
        eVar.f(this);
        this.f9016d.b(this.f9018i);
        aVar.c(this.f9018i.i(), this);
        View viewY = gVar.y();
        if (viewY != null) {
            aVar.e(viewY);
        } else {
            aVar.f(gVar.w()).p(gVar.x());
        }
        aVar.l(this);
        androidx.appcompat.app.c cVarA = aVar.a();
        this.f9017e = cVarA;
        cVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f9017e.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f9017e.show();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i7) {
        this.f9016d.L((i) this.f9018i.i().getItem(i7), 0);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        this.f9018i.a(this.f9016d, true);
    }

    @Override
    public boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f9017e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f9017e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f9016d.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f9016d.performShortcut(i7, keyEvent, 0);
    }
}
