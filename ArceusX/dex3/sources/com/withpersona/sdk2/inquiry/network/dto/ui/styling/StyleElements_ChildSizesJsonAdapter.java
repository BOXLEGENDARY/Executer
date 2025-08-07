package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_ChildSizesJsonAdapter extends h<StyleElements.ChildSizes> {

    @NotNull
    private final h<int[]> nullableIntArrayAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StyleElements_ChildSizesJsonAdapter(@NotNull w wVar) {
        this.nullableIntArrayAdapter = wVar.f(int[].class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.ChildSizes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.ChildSizes m510fromJson(@NotNull m mVar) {
        mVar.e();
        int[] iArr = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                iArr = (int[]) this.nullableIntArrayAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.ChildSizes(iArr);
    }

    public void toJson(@NotNull t tVar, StyleElements.ChildSizes childSizes) {
        if (childSizes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableIntArrayAdapter.toJson(tVar, childSizes.getBase());
        tVar.y();
    }
}
