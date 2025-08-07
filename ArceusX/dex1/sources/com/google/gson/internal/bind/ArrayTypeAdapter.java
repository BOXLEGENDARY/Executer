package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends z<Object> {
    public static final A FACTORY = new A() {
        @Override
        public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = C$Gson$Types.getArrayComponentType(type);
            return new ArrayTypeAdapter(fVar, fVar.m(TypeToken.get(arrayComponentType)), C$Gson$Types.getRawType(arrayComponentType));
        }
    };
    private final Class<E> componentType;
    private final z<E> componentTypeAdapter;

    public ArrayTypeAdapter(f fVar, z<E> zVar, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(fVar, zVar, cls);
        this.componentType = cls;
    }

    @Override
    public Object read(JsonReader jsonReader) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.componentTypeAdapter.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (!this.componentType.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.componentType, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.componentType, size);
        for (int i7 = 0; i7 < size; i7++) {
            Array.set(objNewInstance, i7, arrayList.get(i7));
        }
        return objNewInstance;
    }

    @Override
    public void write(JsonWriter jsonWriter, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i7 = 0; i7 < length; i7++) {
            this.componentTypeAdapter.write(jsonWriter, Array.get(obj, i7));
        }
        jsonWriter.endArray();
    }
}
