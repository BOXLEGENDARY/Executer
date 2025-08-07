package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputCheckboxGroupJsonAdapter extends h<InputCheckboxGroup> {
    private volatile Constructor<InputCheckboxGroup> constructorRef;

    @NotNull
    private final h<InputCheckboxGroup.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputCheckbox.InputCheckboxComponentStyle> nullableInputCheckboxComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputCheckboxGroupJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputCheckboxGroup.Attributes.class, L.d(), "attributes");
        this.nullableInputCheckboxComponentStyleAdapter = wVar.f(InputCheckbox.InputCheckboxComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputCheckboxGroup");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputCheckboxGroup m250fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        InputCheckboxGroup.Attributes attributes = null;
        InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle = null;
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
                attributes = (InputCheckboxGroup.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputCheckboxComponentStyle = (InputCheckbox.InputCheckboxComponentStyle) this.nullableInputCheckboxComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new InputCheckboxGroup(str, attributes, inputCheckboxComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<InputCheckboxGroup> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InputCheckboxGroup.class.getDeclaredConstructor(String.class, InputCheckboxGroup.Attributes.class, InputCheckbox.InputCheckboxComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, inputCheckboxComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputCheckboxGroup inputCheckboxGroup) {
        if (inputCheckboxGroup == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputCheckboxGroup.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputCheckboxGroup.getAttributes());
        tVar.Z("styles");
        this.nullableInputCheckboxComponentStyleAdapter.toJson(tVar, inputCheckboxGroup.getStyles());
        tVar.y();
    }
}
