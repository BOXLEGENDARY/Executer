package androidx.camera.view;

import android.view.C1707u;
import android.view.InterfaceC1710x;
import android.view.LiveData;

final class C1603e<T> extends C1707u<T> {

    private LiveData<T> f9658m;

    C1603e() {
    }

    @Override
    public T f() {
        LiveData<T> liveData = this.f9658m;
        if (liveData == null) {
            return null;
        }
        return liveData.f();
    }

    void r(LiveData<T> liveData) {
        LiveData<T> liveData2 = this.f9658m;
        if (liveData2 != null) {
            super.q(liveData2);
        }
        this.f9658m = liveData;
        super.p(liveData, new InterfaceC1710x() {
            @Override
            public final void a(Object obj) {
                this.f9657a.o(obj);
            }
        });
    }
}
