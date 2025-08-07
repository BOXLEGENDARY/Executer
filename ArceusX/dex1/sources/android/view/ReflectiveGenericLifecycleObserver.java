package android.view;

import android.view.AbstractC1694h;
import android.view.C1688b;
import java.lang.reflect.InvocationTargetException;

@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1698l {

    private final Object f11342d;

    private final C1688b.a f11343e;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f11342d = obj;
        this.f11343e = C1688b.f11386c.c(obj.getClass());
    }

    @Override
    public void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f11343e.a(interfaceC1701o, aVar, this.f11342d);
    }
}
