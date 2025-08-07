package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class SubmitButtonJsonAdapter extends h<SubmitButton> {
    private volatile Constructor<SubmitButton> constructorRef;

    @NotNull
    private final h<BasicButtonAttributes> nullableBasicButtonAttributesAdapter;

    @NotNull
    private final h<ButtonSubmitComponentStyle> nullableButtonSubmitComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public SubmitButtonJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableBasicButtonAttributesAdapter = wVar.f(BasicButtonAttributes.class, L.d(), "attributes");
        this.nullableButtonSubmitComponentStyleAdapter = wVar.f(ButtonSubmitComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SubmitButton");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public SubmitButton m302fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        BasicButtonAttributes basicButtonAttributes = null;
        ButtonSubmitComponentStyle buttonSubmitComponentStyle = null;
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
                basicButtonAttributes = (BasicButtonAttributes) this.nullableBasicButtonAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                buttonSubmitComponentStyle = (ButtonSubmitComponentStyle) this.nullableButtonSubmitComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new SubmitButton(str, basicButtonAttributes, buttonSubmitComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<SubmitButton> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SubmitButton.class.getDeclaredConstructor(String.class, BasicButtonAttributes.class, ButtonSubmitComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, basicButtonAttributes, buttonSubmitComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, SubmitButton submitButton) {
        if (submitButton == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, submitButton.getName());
        tVar.Z("attributes");
        this.nullableBasicButtonAttributesAdapter.toJson(tVar, submitButton.getAttributes());
        tVar.Z("styles");
        this.nullableButtonSubmitComponentStyleAdapter.toJson(tVar, submitButton.getStyles());
        tVar.y();
    }
}
