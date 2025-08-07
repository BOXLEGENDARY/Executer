package com.roblox.client.flags;

import com.github.luben.zstd.BuildConfig;
import j6.C2505c;
import java.util.concurrent.atomic.AtomicBoolean;

public class a<T> {

    protected int f19991a;

    private T[] f19992b;

    private K4.d<String> f19993c;

    public static class C0176a extends a<Boolean> {
        public C0176a(String str, Boolean bool, boolean z7) {
            super(str, bool, z7);
        }

        public Boolean j() {
            return a() ? Boolean.valueOf(com.roblox.client.flags.c.c().b(b())) : (Boolean) super.h();
        }
    }

    public static class b extends a<Integer> {
        public b(String str, Integer num, boolean z7) {
            super(str, num, z7);
        }
    }

    public static class c extends a<Long> {
        public c(String str, Long l7, boolean z7) {
            super(str, l7, z7);
        }
    }

    public static class d extends e<Boolean> {
        public d(String str, Boolean bool, boolean z7) {
            super(str, bool, z7);
        }

        @Override
        protected void l(String str, int i7) {
            FlagJniInterface.nativeRegisterFFlag(str, i7);
        }

        @Override
        public Boolean j(String str, Boolean bool) {
            return Boolean.valueOf(FlagJniInterface.nativeGetFFlag(str, bool.booleanValue()));
        }
    }

    public static abstract class e<T> extends a<T> {

        protected final String f19994d;

        private final AtomicBoolean f19995e;

        public e(String str, T t7, boolean z7) {
            super(str, t7, z7);
            this.f19995e = new AtomicBoolean(true);
            this.f19994d = str;
        }

        @Override
        public T h() {
            if (!C2505c.c()) {
                throw new IllegalStateException("Native flag accessed before flags are loaded.");
            }
            if (k()) {
                l(this.f19994d, C2505c.a());
            }
            return j(this.f19994d, d());
        }

        protected abstract T j(String str, T t7);

        protected boolean k() {
            return this.f19995e.getAndSet(false);
        }

        protected abstract void l(String str, int i7);
    }

    public static class f extends e<Integer> {
        public f(String str, Integer num, boolean z7) {
            super(str, num, z7);
        }

        @Override
        protected void l(String str, int i7) {
            FlagJniInterface.nativeRegisterFInt(str, i7);
        }

        @Override
        public Integer j(String str, Integer num) {
            return Integer.valueOf(FlagJniInterface.nativeGetFInt(str, num.intValue()));
        }
    }

    public static class g extends e<String> {
        public g(String str, String str2, boolean z7) {
            super(str, str2, z7);
        }

        @Override
        protected void l(String str, int i7) {
            FlagJniInterface.nativeRegisterFString(str, i7);
        }

        @Override
        public String j(String str, String str2) {
            return FlagJniInterface.nativeGetFString(str, str2);
        }
    }

    public static class h {
        public static int a() {
            return 4;
        }
    }

    public static class i extends a<String> {
        public i(String str, String str2, boolean z7) {
            super(str, str2, z7);
        }
    }

    private void g(int i7) {
        while (i7 >= 0) {
            if (this.f19992b[i7] != null) {
                this.f19991a = i7;
                return;
            }
            i7--;
        }
    }

    public boolean a() {
        return this.f19993c.c();
    }

    public String b() {
        return this.f19993c.e(BuildConfig.FLAVOR);
    }

    public void c(int i7) {
        f(null, i7);
    }

    public T d() {
        return i(0);
    }

    public int e() {
        return this.f19991a;
    }

    public void f(T t7, int i7) {
        if (i7 == 0) {
            return;
        }
        this.f19992b[i7] = t7;
        int i8 = this.f19991a;
        if (i7 >= i8) {
            if (t7 == null) {
                g(i8);
            } else {
                this.f19991a = i7;
            }
        }
    }

    public T h() {
        return this.f19992b[this.f19991a];
    }

    public T i(int i7) {
        return this.f19992b[i7];
    }

    private a(String str, T t7, boolean z7) {
        T[] tArr = (T[]) new Object[h.a()];
        this.f19992b = tArr;
        tArr[0] = t7;
        this.f19991a = 0;
        if (z7) {
            this.f19993c = K4.d.d(str);
        } else {
            this.f19993c = K4.d.a();
        }
    }
}
