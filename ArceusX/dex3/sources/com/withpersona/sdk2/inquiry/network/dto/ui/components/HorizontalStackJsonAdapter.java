package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class HorizontalStackJsonAdapter extends h<HorizontalStack> {
    private volatile Constructor<HorizontalStack> constructorRef;

    @NotNull
    private final h<HorizontalStack.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<HorizontalStack.HorizontalStackComponentStyle> nullableHorizontalStackComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public HorizontalStackJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(HorizontalStack.Attributes.class, L.d(), "attributes");
        this.nullableHorizontalStackComponentStyleAdapter = wVar.f(HorizontalStack.HorizontalStackComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HorizontalStack");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public HorizontalStack m244fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        HorizontalStack.Attributes attributes = null;
        HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle = null;
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
                attributes = (HorizontalStack.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                horizontalStackComponentStyle = (HorizontalStack.HorizontalStackComponentStyle) this.nullableHorizontalStackComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new HorizontalStack(str, attributes, horizontalStackComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<HorizontalStack> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = HorizontalStack.class.getDeclaredConstructor(String.class, HorizontalStack.Attributes.class, HorizontalStack.HorizontalStackComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, horizontalStackComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, HorizontalStack horizontalStack) {
        if (horizontalStack == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, horizontalStack.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, horizontalStack.getAttributes());
        tVar.Z("styles");
        this.nullableHorizontalStackComponentStyleAdapter.toJson(tVar, horizontalStack.getStyles());
        tVar.y();
    }
}
