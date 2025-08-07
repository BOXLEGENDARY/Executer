package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import org.jetbrains.annotations.NotNull;

public final class JsonAdapterBinding<T> {

    @NotNull
    private final Class<T> clazz;

    @NotNull
    private final h<T> jsonAdapter;

    public JsonAdapterBinding(@NotNull Class<T> cls, @NotNull h<T> hVar) {
        this.clazz = cls;
        this.jsonAdapter = hVar;
    }

    @NotNull
    public final Class<T> getClazz() {
        return this.clazz;
    }

    @NotNull
    public final h<T> getJsonAdapter() {
        return this.jsonAdapter;
    }
}
