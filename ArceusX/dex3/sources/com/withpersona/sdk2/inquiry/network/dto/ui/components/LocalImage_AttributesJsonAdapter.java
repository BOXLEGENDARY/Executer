package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class LocalImage_AttributesJsonAdapter extends h<LocalImage.Attributes> {
    private volatile Constructor<LocalImage.Attributes> constructorRef;

    @NotNull
    private final h<LocalImage.Image> nullableImageAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"imageKey", "hidden"});

    public LocalImage_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableImageAdapter = wVar.f(LocalImage.Image.class, L.d(), "imageKey");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LocalImage.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public LocalImage.Attributes m287fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        LocalImage.Image image = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                image = (LocalImage.Image) this.nullableImageAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                i = -3;
            }
        }
        mVar.j();
        if (i == -3) {
            return new LocalImage.Attributes(image, jsonLogicBoolean);
        }
        Constructor<LocalImage.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = LocalImage.Attributes.class.getDeclaredConstructor(LocalImage.Image.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(image, jsonLogicBoolean, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, LocalImage.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("imageKey");
        this.nullableImageAdapter.toJson(tVar, attributes.getImageKey());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.y();
    }
}
