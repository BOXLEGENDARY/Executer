package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class HorizontalStack_AttributesJsonAdapter extends h<HorizontalStack.Attributes> {
    private volatile Constructor<HorizontalStack.Attributes> constructorRef;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"children", "hidden"});

    public HorizontalStack_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableListOfUiComponentConfigAdapter = wVar.f(A.j(List.class, new Type[]{UiComponentConfig.class}), L.d(), "children");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HorizontalStack.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public HorizontalStack.Attributes m245fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        List list = null;
        JsonLogicBoolean jsonLogicBoolean = null;
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
                i = -3;
            }
        }
        mVar.j();
        if (i == -3) {
            return new HorizontalStack.Attributes(list, jsonLogicBoolean);
        }
        Constructor<HorizontalStack.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = HorizontalStack.Attributes.class.getDeclaredConstructor(List.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(list, jsonLogicBoolean, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, HorizontalStack.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("children");
        this.nullableListOfUiComponentConfigAdapter.toJson(tVar, attributes.getChildren());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.y();
    }
}
