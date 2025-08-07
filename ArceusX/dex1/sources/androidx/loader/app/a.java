package androidx.loader.app;

import android.os.Bundle;
import android.view.InterfaceC1684S;
import android.view.InterfaceC1701o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {

    public interface InterfaceC0107a<D> {
        void a(S0.b<D> bVar);

        S0.b<D> b(int i7, Bundle bundle);

        void c(S0.b<D> bVar, D d7);
    }

    public static <T extends InterfaceC1701o & InterfaceC1684S> a b(T t7) {
        return new b(t7, t7.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> S0.b<D> c(int i7, Bundle bundle, InterfaceC0107a<D> interfaceC0107a);

    public abstract void d();
}
