package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class RemoteImage_AttributesJsonAdapter extends h<RemoteImage.Attributes> {
    private volatile Constructor<RemoteImage.Attributes> constructorRef;

    @NotNull
    private final h<RemoteImage.ContentType> contentTypeAdapter;

    @NotNull
    private final h<RemoteImage.ContentType> nullableContentTypeAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"localAssetName", "localAssetContentType", "url", "width", "height", "contentType", "hidden"});

    @NotNull
    private final h<String> stringAdapter;

    public RemoteImage_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "localAssetName");
        this.nullableContentTypeAdapter = wVar.f(RemoteImage.ContentType.class, L.d(), "localAssetContentType");
        this.stringAdapter = wVar.f(String.class, L.d(), "url");
        this.contentTypeAdapter = wVar.f(RemoteImage.ContentType.class, L.d(), "contentType");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteImage.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public RemoteImage.Attributes m297fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        int i = -1;
        String str2 = null;
        RemoteImage.ContentType contentType = null;
        String str3 = null;
        String str4 = null;
        RemoteImage.ContentType contentType2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    i &= -2;
                    break;
                case 1:
                    contentType = (RemoteImage.ContentType) this.nullableContentTypeAdapter.fromJson(mVar);
                    i &= -3;
                    break;
                case 2:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x("url", "url", mVar);
                    }
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    contentType2 = (RemoteImage.ContentType) this.contentTypeAdapter.fromJson(mVar);
                    if (contentType2 == null) {
                        throw c.x("contentType", "contentType", mVar);
                    }
                    i &= -33;
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -65;
                    break;
            }
        }
        mVar.j();
        if (i == -100) {
            if (str != null) {
                return new RemoteImage.Attributes(str2, contentType, str, str3, str4, contentType2, jsonLogicBoolean);
            }
            throw c.o("url", "url", mVar);
        }
        Constructor<RemoteImage.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = RemoteImage.Attributes.class.getDeclaredConstructor(String.class, RemoteImage.ContentType.class, String.class, String.class, String.class, RemoteImage.ContentType.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        Constructor<RemoteImage.Attributes> constructor = declaredConstructor;
        if (str == null) {
            throw c.o("url", "url", mVar);
        }
        return constructor.newInstance(str2, contentType, str, str3, str4, contentType2, jsonLogicBoolean, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, RemoteImage.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("localAssetName");
        this.nullableStringAdapter.toJson(tVar, attributes.getLocalAssetName());
        tVar.Z("localAssetContentType");
        this.nullableContentTypeAdapter.toJson(tVar, attributes.getLocalAssetContentType());
        tVar.Z("url");
        this.stringAdapter.toJson(tVar, attributes.getUrl());
        tVar.Z("width");
        this.nullableStringAdapter.toJson(tVar, attributes.getWidth());
        tVar.Z("height");
        this.nullableStringAdapter.toJson(tVar, attributes.getHeight());
        tVar.Z("contentType");
        this.contentTypeAdapter.toJson(tVar, attributes.getContentType());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.y();
    }
}
