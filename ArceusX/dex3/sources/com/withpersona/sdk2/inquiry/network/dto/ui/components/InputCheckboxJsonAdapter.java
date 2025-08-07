package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputCheckboxJsonAdapter extends h<InputCheckbox> {
    private volatile Constructor<InputCheckbox> constructorRef;

    @NotNull
    private final h<InputCheckbox.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputCheckbox.InputCheckboxComponentStyle> nullableInputCheckboxComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputCheckboxJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputCheckbox.Attributes.class, L.d(), "attributes");
        this.nullableInputCheckboxComponentStyleAdapter = wVar.f(InputCheckbox.InputCheckboxComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputCheckbox");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputCheckbox m253fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        InputCheckbox.Attributes attributes = null;
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
                attributes = (InputCheckbox.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputCheckboxComponentStyle = (InputCheckbox.InputCheckboxComponentStyle) this.nullableInputCheckboxComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new InputCheckbox(str, attributes, inputCheckboxComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<InputCheckbox> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InputCheckbox.class.getDeclaredConstructor(String.class, InputCheckbox.Attributes.class, InputCheckbox.InputCheckboxComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, inputCheckboxComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputCheckbox inputCheckbox) {
        if (inputCheckbox == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputCheckbox.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputCheckbox.getAttributes());
        tVar.Z("styles");
        this.nullableInputCheckboxComponentStyleAdapter.toJson(tVar, inputCheckbox.getStyles());
        tVar.y();
    }
}
