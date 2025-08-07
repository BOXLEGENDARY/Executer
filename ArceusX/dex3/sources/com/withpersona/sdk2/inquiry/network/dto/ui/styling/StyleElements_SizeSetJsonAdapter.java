package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_SizeSetJsonAdapter extends h<StyleElements.SizeSet> {

    @NotNull
    private final h<StyleElements.Size> nullableSizeAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"top", "bottom", "left", "right"});

    public StyleElements_SizeSetJsonAdapter(@NotNull w wVar) {
        this.nullableSizeAdapter = wVar.f(StyleElements.Size.class, L.d(), "top");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.SizeSet");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.SizeSet m518fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Size size = null;
        StyleElements.Size size2 = null;
        StyleElements.Size size3 = null;
        StyleElements.Size size4 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                size = (StyleElements.Size) this.nullableSizeAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                size2 = (StyleElements.Size) this.nullableSizeAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                size3 = (StyleElements.Size) this.nullableSizeAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                size4 = (StyleElements.Size) this.nullableSizeAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.SizeSet(size, size2, size3, size4);
    }

    public void toJson(@NotNull t tVar, StyleElements.SizeSet sizeSet) {
        if (sizeSet == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("top");
        this.nullableSizeAdapter.toJson(tVar, sizeSet.getTop());
        tVar.Z("bottom");
        this.nullableSizeAdapter.toJson(tVar, sizeSet.getBottom());
        tVar.Z("left");
        this.nullableSizeAdapter.toJson(tVar, sizeSet.getLeft());
        tVar.Z("right");
        this.nullableSizeAdapter.toJson(tVar, sizeSet.getRight());
        tVar.y();
    }
}
