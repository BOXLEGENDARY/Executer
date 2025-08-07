package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

public final class CollectionTypeAdapterFactory implements A {
    private final ConstructorConstructor constructorConstructor;

    private static final class Adapter<E> extends z<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final z<E> elementTypeAdapter;

        public Adapter(f fVar, Type type, z<E> zVar, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(fVar, zVar, type);
            this.constructor = objectConstructor;
        }

        @Override
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionConstruct = this.constructor.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionConstruct.add(this.elementTypeAdapter.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionConstruct;
        }

        @Override
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override
    public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
        return new Adapter(fVar, collectionElementType, fVar.m(TypeToken.get(collectionElementType)), this.constructorConstructor.get(typeToken));
    }
}
