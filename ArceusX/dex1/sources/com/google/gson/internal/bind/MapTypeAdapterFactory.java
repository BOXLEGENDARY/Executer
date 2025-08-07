package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.l;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements A {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    private final class Adapter<K, V> extends z<Map<K, V>> {
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final z<K> keyTypeAdapter;
        private final z<V> valueTypeAdapter;

        public Adapter(f fVar, Type type, z<K> zVar, Type type2, z<V> zVar2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper(fVar, zVar, type);
            this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper(fVar, zVar2, type2);
            this.constructor = objectConstructor;
        }

        private String keyToString(l lVar) {
            if (!lVar.m()) {
                if (lVar.k()) {
                    return "null";
                }
                throw new AssertionError();
            }
            q qVarG = lVar.g();
            if (qVarG.x()) {
                return String.valueOf(qVarG.t());
            }
            if (qVarG.v()) {
                return Boolean.toString(qVarG.p());
            }
            if (qVarG.A()) {
                return qVarG.u();
            }
            throw new AssertionError();
        }

        @Override
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapConstruct = this.constructor.construct();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K k7 = this.keyTypeAdapter.read(jsonReader);
                    if (mapConstruct.put(k7, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new t("duplicate key: " + k7);
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K k8 = this.keyTypeAdapter.read(jsonReader);
                    if (mapConstruct.put(k8, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new t("duplicate key: " + k8);
                    }
                }
                jsonReader.endObject();
            }
            return mapConstruct;
        }

        @Override
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i7 = 0;
            boolean z7 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                l jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z7 |= jsonTree.j() || jsonTree.l();
            }
            if (!z7) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i7 < size) {
                    jsonWriter.name(keyToString((l) arrayList.get(i7)));
                    this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i7));
                    i7++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i7 < size2) {
                jsonWriter.beginArray();
                Streams.write((l) arrayList.get(i7), jsonWriter);
                this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i7));
                jsonWriter.endArray();
                i7++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z7) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z7;
    }

    private z<?> getKeyAdapter(f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : fVar.m(TypeToken.get(type));
    }

    @Override
    public <T> z<T> create(f fVar, TypeToken<T> typeToken) throws NoSuchMethodException, SecurityException {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, rawType);
        return new Adapter(fVar, mapKeyAndValueTypes[0], getKeyAdapter(fVar, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], fVar.m(TypeToken.get(mapKeyAndValueTypes[1])), this.constructorConstructor.get(typeToken));
    }
}
