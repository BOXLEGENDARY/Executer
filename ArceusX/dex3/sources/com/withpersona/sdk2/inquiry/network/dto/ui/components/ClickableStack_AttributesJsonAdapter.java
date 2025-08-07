package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ClickableStack_AttributesJsonAdapter extends h<ClickableStack.Attributes> {
    private volatile Constructor<ClickableStack.Attributes> constructorRef;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"children", "hidden", "disabled"});

    public ClickableStack_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableListOfUiComponentConfigAdapter = wVar.f(A.j(List.class, new Type[]{UiComponentConfig.class}), L.d(), "children");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClickableStack.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ClickableStack.Attributes m221fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        List list = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                list = (List) this.nullableListOfUiComponentConfigAdapter.fromJson(mVar);
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
            return new ClickableStack.Attributes(list, jsonLogicBoolean, jsonLogicBoolean2);
        }
        Constructor<ClickableStack.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStack.Attributes.class.getDeclaredConstructor(List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(list, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, ClickableStack.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("children");
        this.nullableListOfUiComponentConfigAdapter.toJson(tVar, attributes.getChildren());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
