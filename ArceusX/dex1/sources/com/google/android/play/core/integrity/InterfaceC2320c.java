package com.google.android.play.core.integrity;

import H4.AbstractC0446t;
import com.google.android.gms.tasks.Task;
import java.util.Set;

public interface InterfaceC2320c {

    public static abstract class a {

        public static abstract class AbstractC0164a {
            public abstract a a();

            public abstract AbstractC0164a b(long j7);
        }

        public static AbstractC0164a c() {
            S s7 = new S();
            s7.c(0);
            return s7;
        }

        abstract int a();

        public abstract long b();
    }

    public static abstract class b {
        public abstract String a();
    }

    public interface InterfaceC0165c {
        Task<b> a(d dVar);
    }

    public static abstract class d {

        public static abstract class a {
            public abstract d a();

            public abstract a b(String str);
        }

        public static a a() {
            U u7 = new U();
            u7.c(AbstractC0446t.n());
            return u7;
        }

        public abstract String b();

        public abstract Set<Integer> c();
    }

    Task<InterfaceC0165c> a(a aVar);
}
