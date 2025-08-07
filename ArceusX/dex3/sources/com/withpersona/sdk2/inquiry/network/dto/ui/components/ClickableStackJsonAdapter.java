package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ClickableStackJsonAdapter extends h<ClickableStack> {
    private volatile Constructor<ClickableStack> constructorRef;

    @NotNull
    private final h<ClickableStack.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<ClickableStack.ClickableStackComponentStyle> nullableClickableStackComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public ClickableStackJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(ClickableStack.Attributes.class, L.d(), "attributes");
        this.nullableClickableStackComponentStyleAdapter = wVar.f(ClickableStack.ClickableStackComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClickableStack");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ClickableStack m220fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        ClickableStack.Attributes attributes = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = null;
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
                attributes = (ClickableStack.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                clickableStackComponentStyle = (ClickableStack.ClickableStackComponentStyle) this.nullableClickableStackComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new ClickableStack(str, attributes, clickableStackComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<ClickableStack> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStack.class.getDeclaredConstructor(String.class, ClickableStack.Attributes.class, ClickableStack.ClickableStackComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, clickableStackComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, ClickableStack clickableStack) {
        if (clickableStack == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, clickableStack.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, clickableStack.getAttributes());
        tVar.Z("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(tVar, clickableStack.getStyles());
        tVar.y();
    }
}
