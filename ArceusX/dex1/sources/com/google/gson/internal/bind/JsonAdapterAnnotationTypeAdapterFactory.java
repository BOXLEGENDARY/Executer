package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.f;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.z;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class JsonAdapterAnnotationTypeAdapterFactory implements A {
    private static final A TREE_TYPE_CLASS_DUMMY_FACTORY;
    private static final A TREE_TYPE_FIELD_DUMMY_FACTORY;
    private final ConcurrentMap<Class<?>, A> adapterFactoryMap = new ConcurrentHashMap();
    private final ConstructorConstructor constructorConstructor;

    private static class DummyTypeAdapterFactory implements A {
        private DummyTypeAdapterFactory() {
        }

        @Override
        public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        TREE_TYPE_CLASS_DUMMY_FACTORY = new DummyTypeAdapterFactory();
        TREE_TYPE_FIELD_DUMMY_FACTORY = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    private static Object createAdapter(ConstructorConstructor constructorConstructor, Class<?> cls) {
        return constructorConstructor.get(TypeToken.get((Class) cls)).construct();
    }

    private static JsonAdapter getAnnotation(Class<?> cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    private A putFactoryAndGetCurrent(Class<?> cls, A a2) {
        A aPutIfAbsent = this.adapterFactoryMap.putIfAbsent(cls, a2);
        return aPutIfAbsent != null ? aPutIfAbsent : a2;
    }

    @Override
    public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
        JsonAdapter annotation = getAnnotation(typeToken.getRawType());
        if (annotation == null) {
            return null;
        }
        return (z<T>) getTypeAdapter(this.constructorConstructor, fVar, typeToken, annotation, true);
    }

    z<?> getTypeAdapter(ConstructorConstructor constructorConstructor, f fVar, TypeToken<?> typeToken, JsonAdapter jsonAdapter, boolean z7) {
        z<?> treeTypeAdapter;
        Object objCreateAdapter = createAdapter(constructorConstructor, jsonAdapter.value());
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objCreateAdapter instanceof z) {
            treeTypeAdapter = (z) objCreateAdapter;
        } else if (objCreateAdapter instanceof A) {
            A aPutFactoryAndGetCurrent = (A) objCreateAdapter;
            if (z7) {
                aPutFactoryAndGetCurrent = putFactoryAndGetCurrent(typeToken.getRawType(), aPutFactoryAndGetCurrent);
            }
            treeTypeAdapter = aPutFactoryAndGetCurrent.create(fVar, typeToken);
        } else {
            boolean z8 = objCreateAdapter instanceof s;
            if (!z8 && !(objCreateAdapter instanceof k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objCreateAdapter.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z8 ? (s) objCreateAdapter : null, objCreateAdapter instanceof k ? (k) objCreateAdapter : null, fVar, typeToken, z7 ? TREE_TYPE_CLASS_DUMMY_FACTORY : TREE_TYPE_FIELD_DUMMY_FACTORY, zNullSafe);
            zNullSafe = false;
        }
        return (treeTypeAdapter == null || !zNullSafe) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, A a2) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(a2);
        if (a2 == TREE_TYPE_CLASS_DUMMY_FACTORY) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        A a3 = this.adapterFactoryMap.get(rawType);
        if (a3 != null) {
            return a3 == a2;
        }
        JsonAdapter annotation = getAnnotation(rawType);
        if (annotation == null) {
            return false;
        }
        Class<?> clsValue = annotation.value();
        return A.class.isAssignableFrom(clsValue) && putFactoryAndGetCurrent(rawType, (A) createAdapter(this.constructorConstructor, clsValue)) == a2;
    }
}
