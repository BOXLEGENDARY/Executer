package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlTypesSupport;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g {

    private Excluder f19197a = Excluder.DEFAULT;

    private u f19198b = u.f19221d;

    private d f19199c = c.f19149d;

    private final Map<Type, h<?>> f19200d = new HashMap();

    private final List<A> f19201e = new ArrayList();

    private final List<A> f19202f = new ArrayList();

    private boolean f19203g = false;

    private String f19204h = f.f19162B;

    private int f19205i = 2;

    private int f19206j = 2;

    private boolean f19207k = false;

    private boolean f19208l = false;

    private boolean f19209m = true;

    private e f19210n = f.f19161A;

    private boolean f19211o = false;

    private w f19212p = f.f19166z;

    private boolean f19213q = true;

    private y f19214r = f.f19164D;

    private y f19215s = f.f19165E;

    private final ArrayDeque<v> f19216t = new ArrayDeque<>();

    private static void a(String str, int i7, int i8, List<A> list) {
        A aCreateAdapterFactory;
        A aCreateAdapterFactory2;
        boolean z7 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        A aCreateAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            aCreateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z7) {
                aCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                aCreateAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            } else {
                aCreateAdapterFactory2 = null;
            }
        } else {
            if (i7 == 2 && i8 == 2) {
                return;
            }
            A aCreateAdapterFactory4 = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i7, i8);
            if (z7) {
                aCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i7, i8);
                A aCreateAdapterFactory5 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i7, i8);
                aCreateAdapterFactory = aCreateAdapterFactory4;
                aCreateAdapterFactory2 = aCreateAdapterFactory5;
            } else {
                aCreateAdapterFactory = aCreateAdapterFactory4;
                aCreateAdapterFactory2 = null;
            }
        }
        list.add(aCreateAdapterFactory);
        if (z7) {
            list.add(aCreateAdapterFactory3);
            list.add(aCreateAdapterFactory2);
        }
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f19201e.size() + this.f19202f.size() + 3);
        arrayList.addAll(this.f19201e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f19202f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f19204h, this.f19205i, this.f19206j, arrayList);
        return new f(this.f19197a, this.f19199c, new HashMap(this.f19200d), this.f19203g, this.f19207k, this.f19211o, this.f19209m, this.f19210n, this.f19212p, this.f19208l, this.f19213q, this.f19198b, this.f19204h, this.f19205i, this.f19206j, new ArrayList(this.f19201e), new ArrayList(this.f19202f), arrayList, this.f19214r, this.f19215s, new ArrayList(this.f19216t));
    }

    public g c(c cVar) {
        return d(cVar);
    }

    public g d(d dVar) {
        Objects.requireNonNull(dVar);
        this.f19199c = dVar;
        return this;
    }
}
