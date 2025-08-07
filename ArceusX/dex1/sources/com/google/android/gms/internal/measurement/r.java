package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;

public interface r {

    public static final r f15282g = new C2000w();

    public static final r f15283h = new C1945p();

    public static final r f15284j = new C1881h("continue");

    public static final r f15285k = new C1881h("break");

    public static final r f15286l = new C1881h("return");

    public static final r f15287m = new C1873g(Boolean.TRUE);

    public static final r f15288n = new C1873g(Boolean.FALSE);

    public static final r f15289o = new C1992v(BuildConfig.FLAVOR);

    r d();

    String e();

    Double f();

    Boolean g();

    Iterator<r> j();

    r l(String str, T1 t1, List<r> list);
}
