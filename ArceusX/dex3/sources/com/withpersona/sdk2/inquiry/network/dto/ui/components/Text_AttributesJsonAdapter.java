package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class Text_AttributesJsonAdapter extends h<Text.Attributes> {
    private volatile Constructor<Text.Attributes> constructorRef;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Text.type, "hidden", "disabled"});

    @NotNull
    private final h<String> stringAdapter;

    public Text_AttributesJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Text.type);
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Text.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Text.Attributes m304fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x(Text.type, Text.type, mVar);
                }
            } else if (iP0 == 1) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                i &= -3;
            } else if (iP0 == 2) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                i &= -5;
            }
        }
        mVar.j();
        if (i == -7) {
            if (str != null) {
                return new Text.Attributes(str, jsonLogicBoolean, jsonLogicBoolean2);
            }
            throw c.o(Text.type, Text.type, mVar);
        }
        Constructor<Text.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Text.Attributes.class.getDeclaredConstructor(String.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i), null);
        }
        throw c.o(Text.type, Text.type, mVar);
    }

    public void toJson(@NotNull t tVar, Text.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, attributes.getText());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
