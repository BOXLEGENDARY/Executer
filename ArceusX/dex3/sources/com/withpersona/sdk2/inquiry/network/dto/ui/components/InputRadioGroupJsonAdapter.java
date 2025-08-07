package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputRadioGroupJsonAdapter extends h<InputRadioGroup> {
    private volatile Constructor<InputRadioGroup> constructorRef;

    @NotNull
    private final h<InputRadioGroup.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputRadioGroup.InputRadioGroupComponentStyle> nullableInputRadioGroupComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputRadioGroupJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputRadioGroup.Attributes.class, L.d(), "attributes");
        this.nullableInputRadioGroupComponentStyleAdapter = wVar.f(InputRadioGroup.InputRadioGroupComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputRadioGroup");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputRadioGroup m275fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        InputRadioGroup.Attributes attributes = null;
        InputRadioGroup.InputRadioGroupComponentStyle inputRadioGroupComponentStyle = null;
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
                attributes = (InputRadioGroup.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputRadioGroupComponentStyle = (InputRadioGroup.InputRadioGroupComponentStyle) this.nullableInputRadioGroupComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new InputRadioGroup(str, attributes, inputRadioGroupComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<InputRadioGroup> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InputRadioGroup.class.getDeclaredConstructor(String.class, InputRadioGroup.Attributes.class, InputRadioGroup.InputRadioGroupComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, inputRadioGroupComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputRadioGroup inputRadioGroup) {
        if (inputRadioGroup == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputRadioGroup.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputRadioGroup.getAttributes());
        tVar.Z("styles");
        this.nullableInputRadioGroupComponentStyleAdapter.toJson(tVar, inputRadioGroup.getStyles());
        tVar.y();
    }
}
