package com.withpersona.sdk2.inquiry.network.dto.ui;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class BasicButtonAttributesJsonAdapter extends h<BasicButtonAttributes> {
    private volatile Constructor<BasicButtonAttributes> constructorRef;

    @NotNull
    private final h<Button.ButtonType> nullableButtonTypeAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Text.type, "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled"});

    @NotNull
    private final h<String> stringAdapter;

    public BasicButtonAttributesJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Text.type);
        this.nullableButtonTypeAdapter = wVar.f(Button.ButtonType.class, L.d(), "buttonType");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "autoSubmitCountdownText");
        this.nullableIntAdapter = wVar.f(Integer.class, L.d(), "autoSubmitIntervalSeconds");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BasicButtonAttributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public BasicButtonAttributes m214fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        int i = -1;
        Button.ButtonType buttonType = null;
        String str2 = null;
        Integer num = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x(Text.type, Text.type, mVar);
                    }
                    break;
                case 1:
                    buttonType = (Button.ButtonType) this.nullableButtonTypeAdapter.fromJson(mVar);
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -5;
                    break;
                case 3:
                    num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                    i &= -9;
                    break;
                case 4:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -17;
                    break;
                case 5:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -33;
                    break;
            }
        }
        mVar.j();
        if (i == -61) {
            if (str != null) {
                return new BasicButtonAttributes(str, buttonType, str2, num, jsonLogicBoolean, jsonLogicBoolean2);
            }
            throw c.o(Text.type, Text.type, mVar);
        }
        Constructor<BasicButtonAttributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        Constructor<BasicButtonAttributes> constructor = declaredConstructor;
        if (str == null) {
            throw c.o(Text.type, Text.type, mVar);
        }
        return constructor.newInstance(str, buttonType, str2, num, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, BasicButtonAttributes basicButtonAttributes) {
        if (basicButtonAttributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, basicButtonAttributes.getText());
        tVar.Z("buttonType");
        this.nullableButtonTypeAdapter.toJson(tVar, basicButtonAttributes.getButtonType());
        tVar.Z("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(tVar, basicButtonAttributes.getAutoSubmitCountdownText());
        tVar.Z("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(tVar, basicButtonAttributes.getAutoSubmitIntervalSeconds());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, basicButtonAttributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, basicButtonAttributes.getDisabled());
        tVar.y();
    }
}
