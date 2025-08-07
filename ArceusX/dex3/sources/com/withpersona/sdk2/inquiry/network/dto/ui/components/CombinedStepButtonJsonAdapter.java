package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCombinedStepComponentStyle;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CombinedStepButtonJsonAdapter extends h<CombinedStepButton> {
    private volatile Constructor<CombinedStepButton> constructorRef;

    @NotNull
    private final h<BasicButtonAttributes> nullableBasicButtonAttributesAdapter;

    @NotNull
    private final h<ButtonCombinedStepComponentStyle> nullableButtonCombinedStepComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public CombinedStepButtonJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableBasicButtonAttributesAdapter = wVar.f(BasicButtonAttributes.class, L.d(), "attributes");
        this.nullableButtonCombinedStepComponentStyleAdapter = wVar.f(ButtonCombinedStepComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CombinedStepButton");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CombinedStepButton m223fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        BasicButtonAttributes basicButtonAttributes = null;
        ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle = null;
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
                buttonCombinedStepComponentStyle = (ButtonCombinedStepComponentStyle) this.nullableButtonCombinedStepComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new CombinedStepButton(str, basicButtonAttributes, buttonCombinedStepComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<CombinedStepButton> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CombinedStepButton.class.getDeclaredConstructor(String.class, BasicButtonAttributes.class, ButtonCombinedStepComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, basicButtonAttributes, buttonCombinedStepComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, CombinedStepButton combinedStepButton) {
        if (combinedStepButton == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, combinedStepButton.getName());
        tVar.Z("attributes");
        this.nullableBasicButtonAttributesAdapter.toJson(tVar, combinedStepButton.getAttributes());
        tVar.Z("styles");
        this.nullableButtonCombinedStepComponentStyleAdapter.toJson(tVar, combinedStepButton.getStyles());
        tVar.y();
    }
}
