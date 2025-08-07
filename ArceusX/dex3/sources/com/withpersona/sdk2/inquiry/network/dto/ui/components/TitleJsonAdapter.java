package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class TitleJsonAdapter extends h<Title> {
    private volatile Constructor<Title> constructorRef;

    @NotNull
    private final h<Title.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<TextBasedComponentStyle> nullableTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public TitleJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(Title.Attributes.class, L.d(), "attributes");
        this.nullableTextBasedComponentStyleAdapter = wVar.f(TextBasedComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Title");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Title m305fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        Title.Attributes attributes = null;
        TextBasedComponentStyle textBasedComponentStyle = null;
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
                attributes = (Title.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                textBasedComponentStyle = (TextBasedComponentStyle) this.nullableTextBasedComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new Title(str, attributes, textBasedComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<Title> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Title.class.getDeclaredConstructor(String.class, Title.Attributes.class, TextBasedComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, textBasedComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, Title title) {
        if (title == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, title.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, title.getAttributes());
        tVar.Z("styles");
        this.nullableTextBasedComponentStyleAdapter.toJson(tVar, title.getStyles());
        tVar.y();
    }
}
