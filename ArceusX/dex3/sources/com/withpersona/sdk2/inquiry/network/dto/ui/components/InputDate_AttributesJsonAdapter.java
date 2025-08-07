package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputDate_AttributesJsonAdapter extends h<InputDate.Attributes> {
    private volatile Constructor<InputDate.Attributes> constructorRef;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "placeholderMonth", "placeholderDay", "placeholderYear", "textMonths", "hidden", "disabled"});

    public InputDate_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "prefill");
        this.nullableListOfStringAdapter = wVar.f(A.j(List.class, new Type[]{String.class}), L.d(), "textMonths");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputDate.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputDate.Attributes m261fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -17;
                    break;
                case 5:
                    list = (List) this.nullableListOfStringAdapter.fromJson(mVar);
                    i &= -33;
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -65;
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -129;
                    break;
            }
        }
        mVar.j();
        if (i == -256) {
            return new InputDate.Attributes(str, str2, str3, str4, str5, list, jsonLogicBoolean, jsonLogicBoolean2);
        }
        Constructor<InputDate.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InputDate.Attributes.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(str, str2, str3, str4, str5, list, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, InputDate.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("placeholderMonth");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderMonth());
        tVar.Z("placeholderDay");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderDay());
        tVar.Z("placeholderYear");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderYear());
        tVar.Z("textMonths");
        this.nullableListOfStringAdapter.toJson(tVar, attributes.getTextMonths());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
