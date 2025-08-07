package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_RemoteImageJustifyStyleJsonAdapter extends h<AttributeStyles.RemoteImageJustifyStyle> {

    @NotNull
    private final h<StyleElements.Position> nullablePositionAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_RemoteImageJustifyStyleJsonAdapter(@NotNull w wVar) {
        this.nullablePositionAdapter = wVar.f(StyleElements.Position.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.RemoteImageJustifyStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.RemoteImageJustifyStyle m425fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Position position = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                position = (StyleElements.Position) this.nullablePositionAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.RemoteImageJustifyStyle(position);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle) {
        if (remoteImageJustifyStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullablePositionAdapter.toJson(tVar, remoteImageJustifyStyle.getBase());
        tVar.y();
    }
}
