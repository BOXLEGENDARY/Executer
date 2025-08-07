package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class QRCode_AttributesJsonAdapter extends h<QRCode.Attributes> {
    private volatile Constructor<QRCode.Attributes> constructorRef;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"value", "hidden"});

    public QRCode_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "value");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("QRCode.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public QRCode.Attributes m293fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                i = -3;
            }
        }
        mVar.j();
        if (i == -3) {
            return new QRCode.Attributes(str, jsonLogicBoolean);
        }
        Constructor<QRCode.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QRCode.Attributes.class.getDeclaredConstructor(String.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(str, jsonLogicBoolean, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, QRCode.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("value");
        this.nullableStringAdapter.toJson(tVar, attributes.getValue());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.y();
    }
}
