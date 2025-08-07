package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends z<T> {
    private final f context;
    private final z<T> delegate;
    private final Type type;

    TypeAdapterRuntimeTypeWrapper(f fVar, z<T> zVar, Type type) {
        this.context = fVar;
        this.delegate = zVar;
        this.type = type;
    }

    private static Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean isReflective(z<?> zVar) {
        z<?> serializationDelegate;
        while ((zVar instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) zVar).getSerializationDelegate()) != zVar) {
            zVar = serializationDelegate;
        }
        return zVar instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override
    public T read(JsonReader jsonReader) throws IOException {
        return this.delegate.read(jsonReader);
    }

    @Override
    public void write(JsonWriter jsonWriter, T t7) throws IOException {
        z<T> zVarM = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t7);
        if (runtimeTypeIfMoreSpecific != this.type) {
            zVarM = this.context.m(TypeToken.get(runtimeTypeIfMoreSpecific));
            if ((zVarM instanceof ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
                zVarM = this.delegate;
            }
        }
        zVarM.write(jsonWriter, t7);
    }
}
