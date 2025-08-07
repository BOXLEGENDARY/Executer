package androidx.loader.app;

import S0.b;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.AbstractC1678L;
import android.view.C1681O;
import android.view.C1683Q;
import android.view.C1709w;
import android.view.InterfaceC1701o;
import android.view.InterfaceC1710x;
import androidx.loader.app.a;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import g0.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class b extends androidx.loader.app.a {

    static boolean f11426c;

    private final InterfaceC1701o f11427a;

    private final c f11428b;

    public static class a<D> extends C1709w<D> implements b.a<D> {

        private final int f11429l;

        private final Bundle f11430m;

        private final S0.b<D> f11431n;

        private InterfaceC1701o f11432o;

        private C0108b<D> f11433p;

        private S0.b<D> f11434q;

        a(int i7, Bundle bundle, S0.b<D> bVar, S0.b<D> bVar2) {
            this.f11429l = i7;
            this.f11430m = bundle;
            this.f11431n = bVar;
            this.f11434q = bVar2;
            bVar.r(i7, this);
        }

        @Override
        public void a(S0.b<D> bVar, D d7) {
            if (b.f11426c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d7);
                return;
            }
            if (b.f11426c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d7);
        }

        @Override
        protected void k() {
            if (b.f11426c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f11431n.u();
        }

        @Override
        protected void l() {
            if (b.f11426c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f11431n.v();
        }

        @Override
        public void n(InterfaceC1710x<? super D> interfaceC1710x) {
            super.n(interfaceC1710x);
            this.f11432o = null;
            this.f11433p = null;
        }

        @Override
        public void o(D d7) {
            super.o(d7);
            S0.b<D> bVar = this.f11434q;
            if (bVar != null) {
                bVar.s();
                this.f11434q = null;
            }
        }

        S0.b<D> p(boolean z7) {
            if (b.f11426c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f11431n.b();
            this.f11431n.a();
            C0108b<D> c0108b = this.f11433p;
            if (c0108b != null) {
                n(c0108b);
                if (z7) {
                    c0108b.d();
                }
            }
            this.f11431n.w(this);
            if ((c0108b == null || c0108b.c()) && !z7) {
                return this.f11431n;
            }
            this.f11431n.s();
            return this.f11434q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f11429l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f11430m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f11431n);
            this.f11431n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f11433p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f11433p);
                this.f11433p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        S0.b<D> r() {
            return this.f11431n;
        }

        void s() {
            InterfaceC1701o interfaceC1701o = this.f11432o;
            C0108b<D> c0108b = this.f11433p;
            if (interfaceC1701o == null || c0108b == null) {
                return;
            }
            super.n(c0108b);
            i(interfaceC1701o, c0108b);
        }

        S0.b<D> t(InterfaceC1701o interfaceC1701o, a.InterfaceC0107a<D> interfaceC0107a) {
            C0108b<D> c0108b = new C0108b<>(this.f11431n, interfaceC0107a);
            i(interfaceC1701o, c0108b);
            C0108b<D> c0108b2 = this.f11433p;
            if (c0108b2 != null) {
                n(c0108b2);
            }
            this.f11432o = interfaceC1701o;
            this.f11433p = c0108b;
            return this.f11431n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f11429l);
            sb.append(" : ");
            Class<?> cls = this.f11431n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    static class C0108b<D> implements InterfaceC1710x<D> {

        private final S0.b<D> f11435a;

        private final a.InterfaceC0107a<D> f11436b;

        private boolean f11437c = false;

        C0108b(S0.b<D> bVar, a.InterfaceC0107a<D> interfaceC0107a) {
            this.f11435a = bVar;
            this.f11436b = interfaceC0107a;
        }

        @Override
        public void a(D d7) {
            if (b.f11426c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f11435a + ": " + this.f11435a.d(d7));
            }
            this.f11437c = true;
            this.f11436b.c(this.f11435a, d7);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f11437c);
        }

        boolean c() {
            return this.f11437c;
        }

        void d() {
            if (this.f11437c) {
                if (b.f11426c) {
                    Log.v(wtzgsqRsIZB.ZpuMfRXyCej, "  Resetting: " + this.f11435a);
                }
                this.f11436b.a(this.f11435a);
            }
        }

        public String toString() {
            return this.f11436b.toString();
        }
    }

    static class c extends AbstractC1678L {

        private static final C1681O.b f11438f = new a();

        private l<a> f11439d = new l<>();

        private boolean f11440e = false;

        static class a implements C1681O.b {
            a() {
            }

            @Override
            public <T extends AbstractC1678L> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c h(C1683Q c1683q) {
            return (c) new C1681O(c1683q, f11438f).a(c.class);
        }

        @Override
        protected void d() {
            super.d();
            int i7 = this.f11439d.i();
            for (int i8 = 0; i8 < i7; i8++) {
                this.f11439d.j(i8).p(true);
            }
            this.f11439d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f11439d.i() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i7 = 0; i7 < this.f11439d.i(); i7++) {
                    a aVarJ = this.f11439d.j(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f11439d.g(i7));
                    printWriter.print(": ");
                    printWriter.println(aVarJ.toString());
                    aVarJ.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.f11440e = false;
        }

        <D> a<D> i(int i7) {
            return this.f11439d.d(i7);
        }

        boolean j() {
            return this.f11440e;
        }

        void k() {
            int i7 = this.f11439d.i();
            for (int i8 = 0; i8 < i7; i8++) {
                this.f11439d.j(i8).s();
            }
        }

        void l(int i7, a aVar) {
            this.f11439d.h(i7, aVar);
        }

        void m() {
            this.f11440e = true;
        }
    }

    b(InterfaceC1701o interfaceC1701o, C1683Q c1683q) {
        this.f11427a = interfaceC1701o;
        this.f11428b = c.h(c1683q);
    }

    private <D> S0.b<D> e(int i7, Bundle bundle, a.InterfaceC0107a<D> interfaceC0107a, S0.b<D> bVar) {
        try {
            this.f11428b.m();
            S0.b<D> bVarB = interfaceC0107a.b(i7, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i7, bundle, bVarB, bVar);
            if (f11426c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f11428b.l(i7, aVar);
            this.f11428b.g();
            return aVar.t(this.f11427a, interfaceC0107a);
        } catch (Throwable th) {
            this.f11428b.g();
            throw th;
        }
    }

    @Override
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f11428b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override
    public <D> S0.b<D> c(int i7, Bundle bundle, a.InterfaceC0107a<D> interfaceC0107a) {
        if (this.f11428b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarI = this.f11428b.i(i7);
        if (f11426c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return e(i7, bundle, interfaceC0107a, null);
        }
        if (f11426c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarI);
        }
        return aVarI.t(this.f11427a, interfaceC0107a);
    }

    @Override
    public void d() {
        this.f11428b.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f11427a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
