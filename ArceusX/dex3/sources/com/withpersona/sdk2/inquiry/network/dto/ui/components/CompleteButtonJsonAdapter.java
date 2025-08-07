package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCompleteComponentStyle;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CompleteButtonJsonAdapter extends h<CompleteButton> {
    private volatile Constructor<CompleteButton> constructorRef;

    @NotNull
    private final h<BasicButtonAttributes> nullableBasicButtonAttributesAdapter;

    @NotNull
    private final h<ButtonCompleteComponentStyle> nullableButtonCompleteComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public CompleteButtonJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableBasicButtonAttributesAdapter = wVar.f(BasicButtonAttributes.class, L.d(), "attributes");
        this.nullableButtonCompleteComponentStyleAdapter = wVar.f(ButtonCompleteComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CompleteButton");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CompleteButton m227fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        BasicButtonAttributes basicButtonAttributes = null;
        ButtonCompleteComponentStyle buttonCompleteComponentStyle = null;
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
                buttonCompleteComponentStyle = (ButtonCompleteComponentStyle) this.nullableButtonCompleteComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new CompleteButton(str, basicButtonAttributes, buttonCompleteComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<CompleteButton> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CompleteButton.class.getDeclaredConstructor(String.class, BasicButtonAttributes.class, ButtonCompleteComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, basicButtonAttributes, buttonCompleteComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, CompleteButton completeButton) {
        if (completeButton == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, completeButton.getName());
        tVar.Z("attributes");
        this.nullableBasicButtonAttributesAdapter.toJson(tVar, completeButton.getAttributes());
        tVar.Z("styles");
        this.nullableButtonCompleteComponentStyleAdapter.toJson(tVar, completeButton.getStyles());
        tVar.y();
    }
}
