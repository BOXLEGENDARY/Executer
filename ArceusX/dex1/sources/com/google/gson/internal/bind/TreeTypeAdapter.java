package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile z<T> delegate;
    private final k<T> deserializer;
    final f gson;
    private final boolean nullSafe;
    private final s<T> serializer;
    private final A skipPastForGetDelegateAdapter;
    private final TypeToken<T> typeToken;

    private final class GsonContextImpl implements r, j {
        private GsonContextImpl() {
        }

        public <R> R deserialize(l lVar, Type type) throws p {
            return (R) TreeTypeAdapter.this.gson.h(lVar, type);
        }

        public l serialize(Object obj) {
            return TreeTypeAdapter.this.gson.z(obj);
        }

        public l serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.gson.A(obj, type);
        }
    }

    private static final class SingleTypeFactory implements A {
        private final k<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final s<?> serializer;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z7, Class<?> cls) {
            s<?> sVar = obj instanceof s ? (s) obj : null;
            this.serializer = sVar;
            k<?> kVar = obj instanceof k ? (k) obj : null;
            this.deserializer = kVar;
            C$Gson$Preconditions.checkArgument((sVar == null && kVar == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z7;
            this.hierarchyType = cls;
        }

        @Override
        public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType()) : this.hierarchyType.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, fVar, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(s<T> sVar, k<T> kVar, f fVar, TypeToken<T> typeToken, A a2, boolean z7) {
        this.context = new GsonContextImpl();
        this.serializer = sVar;
        this.deserializer = kVar;
        this.gson = fVar;
        this.typeToken = typeToken;
        this.skipPastForGetDelegateAdapter = a2;
        this.nullSafe = z7;
    }

    private z<T> delegate() {
        z<T> zVar = this.delegate;
        if (zVar != null) {
            return zVar;
        }
        z<T> zVarO = this.gson.o(this.skipPastForGetDelegateAdapter, this.typeToken);
        this.delegate = zVarO;
        return zVarO;
    }

    public static A newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static A newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static A newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override
    public z<T> getSerializationDelegate() {
        return this.serializer != null ? this : delegate();
    }

    @Override
    public T read(JsonReader jsonReader) throws IOException, p {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        l lVar = Streams.parse(jsonReader);
        if (this.nullSafe && lVar.k()) {
            return null;
        }
        return this.deserializer.a(lVar, this.typeToken.getType(), this.context);
    }

    @Override
    public void write(JsonWriter jsonWriter, T t7) throws IOException {
        s<T> sVar = this.serializer;
        if (sVar == null) {
            delegate().write(jsonWriter, t7);
        } else if (this.nullSafe && t7 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(sVar.a(t7, this.typeToken.getType(), this.context), jsonWriter);
        }
    }

    public TreeTypeAdapter(s<T> sVar, k<T> kVar, f fVar, TypeToken<T> typeToken, A a2) {
        this(sVar, kVar, fVar, typeToken, a2, true);
    }
}
