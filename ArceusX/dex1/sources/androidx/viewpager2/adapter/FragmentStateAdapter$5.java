package androidx.viewpager2.adapter;

import android.os.Handler;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;

class FragmentStateAdapter$5 implements InterfaceC1698l {

    final Handler f12528d;

    final Runnable f12529e;

    @Override
    public void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        if (aVar == AbstractC1694h.a.ON_DESTROY) {
            this.f12528d.removeCallbacks(this.f12529e);
            interfaceC1701o.getLifecycle().d(this);
        }
    }
}
