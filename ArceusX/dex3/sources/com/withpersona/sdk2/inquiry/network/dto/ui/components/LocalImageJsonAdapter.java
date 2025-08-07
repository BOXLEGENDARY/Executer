package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class LocalImageJsonAdapter extends h<LocalImage> {
    private volatile Constructor<LocalImage> constructorRef;

    @NotNull
    private final h<LocalImage.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<LocalImageComponentStyle> nullableLocalImageComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public LocalImageJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(LocalImage.Attributes.class, L.d(), "attributes");
        this.nullableLocalImageComponentStyleAdapter = wVar.f(LocalImageComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LocalImage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public LocalImage m286fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        LocalImage.Attributes attributes = null;
        LocalImageComponentStyle localImageComponentStyle = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (iP0 == 1) {
                attributes = (LocalImage.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                localImageComponentStyle = (LocalImageComponentStyle) this.nullableLocalImageComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new LocalImage(str, attributes, localImageComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<LocalImage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = LocalImage.class.getDeclaredConstructor(String.class, LocalImage.Attributes.class, LocalImageComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, localImageComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, LocalImage localImage) {
        if (localImage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, localImage.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, localImage.getAttributes());
        tVar.Z("styles");
        this.nullableLocalImageComponentStyleAdapter.toJson(tVar, localImage.getStyles());
        tVar.y();
    }
}
