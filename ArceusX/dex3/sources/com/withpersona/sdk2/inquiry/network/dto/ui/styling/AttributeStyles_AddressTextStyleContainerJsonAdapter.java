package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_AddressTextStyleContainerJsonAdapter extends h<AttributeStyles.AddressTextStyleContainer> {

    @NotNull
    private final h<TextBasedComponentStyle> nullableTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_AddressTextStyleContainerJsonAdapter(@NotNull w wVar) {
        this.nullableTextBasedComponentStyleAdapter = wVar.f(TextBasedComponentStyle.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.AddressTextStyleContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.AddressTextStyleContainer m309fromJson(@NotNull m mVar) {
        mVar.e();
        TextBasedComponentStyle textBasedComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                textBasedComponentStyle = (TextBasedComponentStyle) this.nullableTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.AddressTextStyleContainer(textBasedComponentStyle);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.AddressTextStyleContainer addressTextStyleContainer) {
        if (addressTextStyleContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableTextBasedComponentStyleAdapter.toJson(tVar, addressTextStyleContainer.getBase());
        tVar.y();
    }
}
