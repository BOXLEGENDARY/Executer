package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_FontWeightContainerJsonAdapter extends h<StyleElements.FontWeightContainer> {

    @NotNull
    private final h<StyleElements.FontWeight> nullableFontWeightAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StyleElements_FontWeightContainerJsonAdapter(@NotNull w wVar) {
        this.nullableFontWeightAdapter = wVar.f(StyleElements.FontWeight.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.FontWeightContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.FontWeightContainer m512fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.FontWeight fontWeight = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                fontWeight = (StyleElements.FontWeight) this.nullableFontWeightAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.FontWeightContainer(fontWeight);
    }

    public void toJson(@NotNull t tVar, StyleElements.FontWeightContainer fontWeightContainer) {
        if (fontWeightContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableFontWeightAdapter.toJson(tVar, fontWeightContainer.getBase());
        tVar.y();
    }
}
