package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.d;
import com.google.gson.f;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements A {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final d fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List<v> reflectionFilters;

    public static abstract class Adapter<T, A> extends z<T> {
        private final FieldsData fieldsData;

        Adapter(FieldsData fieldsData) {
            this.fieldsData = fieldsData;
        }

        abstract A createAccumulator();

        abstract T finalize(A a2);

        @Override
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A aCreateAccumulator = createAccumulator();
            Map<String, BoundField> map = this.fieldsData.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = map.get(jsonReader.nextName());
                    if (boundField == null) {
                        jsonReader.skipValue();
                    } else {
                        readField(aCreateAccumulator, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return finalize(aCreateAccumulator);
            } catch (IllegalAccessException e7) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e7);
            } catch (IllegalStateException e8) {
                throw new t(e8);
            }
        }

        abstract void readField(A a2, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException;

        @Override
        public void write(JsonWriter jsonWriter, T t7) throws IOException {
            if (t7 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.fieldsData.serializedFields.iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t7);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e7) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e7);
            }
        }
    }

    static abstract class BoundField {
        final Field field;
        final String fieldName;
        final String serializedName;

        protected BoundField(String str, Field field) {
            this.serializedName = str;
            this.field = field;
            this.fieldName = field.getName();
        }

        abstract void readIntoArray(JsonReader jsonReader, int i7, Object[] objArr) throws IOException, p;

        abstract void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        abstract void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final ObjectConstructor<T> constructor;

        FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.constructor = objectConstructor;
        }

        @Override
        T createAccumulator() {
            return this.constructor.construct();
        }

        @Override
        T finalize(T t7) {
            return t7;
        }

        @Override
        void readField(T t7, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException {
            boundField.readIntoField(jsonReader, t7);
        }
    }

    private static class FieldsData {
        public static final FieldsData EMPTY = new FieldsData(Collections.emptyMap(), Collections.emptyList());
        public final Map<String, BoundField> deserializedFields;
        public final List<BoundField> serializedFields;

        public FieldsData(Map<String, BoundField> map, List<BoundField> list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final Map<String, Integer> componentIndices;
        private final Constructor<T> constructor;
        private final Object[] constructorArgsDefaults;

        RecordAdapter(Class<T> cls, FieldsData fieldsData, boolean z7) throws m, SecurityException {
            super(fieldsData);
            this.componentIndices = new HashMap();
            Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z7) {
                ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i7 = 0; i7 < recordComponentNames.length; i7++) {
                this.componentIndices.put(recordComponentNames[i7], Integer.valueOf(i7));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i8 = 0; i8 < parameterTypes.length; i8++) {
                this.constructorArgsDefaults[i8] = PRIMITIVE_DEFAULTS.get(parameterTypes[i8]);
            }
        }

        private static Map<Class<?>, Object> primitiveDefaults() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override
        public Object[] createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override
        public T finalize(Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (IllegalAccessException e7) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e7);
            } catch (IllegalArgumentException e8) {
                e = e8;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e10.getCause());
            }
        }

        @Override
        public void readField(Object[] objArr, JsonReader jsonReader, BoundField boundField) throws IOException, p {
            Integer num = this.componentIndices.get(boundField.fieldName);
            if (num != null) {
                boundField.readIntoArray(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' for field with name '" + boundField.fieldName + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<v> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = dVar;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    public static <M extends AccessibleObject & Member> void checkAccessible(Object obj, M m7) {
        if (Modifier.isStatic(m7.getModifiers())) {
            obj = null;
        }
        if (ReflectionAccessFilterHelper.canAccess(m7, obj)) {
            return;
        }
        throw new m(ReflectionHelper.getAccessibleObjectDescription(m7, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private BoundField createBoundField(f fVar, Field field, final Method method, String str, TypeToken<?> typeToken, boolean z7, final boolean z8) {
        final z<?> typeAdapterRuntimeTypeWrapper;
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z9 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        z<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, fVar, typeToken, jsonAdapter, false) : null;
        boolean z10 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = fVar.m(typeToken);
        }
        final z<?> zVar = typeAdapter;
        if (z7) {
            typeAdapterRuntimeTypeWrapper = z10 ? zVar : new TypeAdapterRuntimeTypeWrapper<>(fVar, zVar, typeToken.getType());
        } else {
            typeAdapterRuntimeTypeWrapper = zVar;
        }
        final boolean z11 = z9;
        return new BoundField(str, field) {
            @Override
            void readIntoArray(JsonReader jsonReader, int i7, Object[] objArr) throws IOException, p {
                Object obj = zVar.read(jsonReader);
                if (obj != null || !zIsPrimitive) {
                    objArr[i7] = obj;
                    return;
                }
                throw new p("null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + jsonReader.getPath());
            }

            @Override
            void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
                Object obj2 = zVar.read(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z8) {
                    ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                } else if (z11) {
                    throw new m("Cannot set value of 'static final' " + ReflectionHelper.getAccessibleObjectDescription(this.field, false));
                }
                this.field.set(obj, obj2);
            }

            @Override
            void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                Object objInvoke;
                if (z8) {
                    Method method2 = method;
                    if (method2 == null) {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                    } else {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                    }
                }
                Method method3 = method;
                if (method3 != null) {
                    try {
                        objInvoke = method3.invoke(obj, null);
                    } catch (InvocationTargetException e7) {
                        throw new m("Accessor " + ReflectionHelper.getAccessibleObjectDescription(method, false) + " threw exception", e7.getCause());
                    }
                } else {
                    objInvoke = this.field.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                jsonWriter.name(this.serializedName);
                typeAdapterRuntimeTypeWrapper.write(jsonWriter, objInvoke);
            }
        };
    }

    private static IllegalArgumentException createDuplicateFieldException(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + TroubleshootingGuide.createUrl("duplicate-fields"));
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData getBoundFields(com.google.gson.f r24, com.google.gson.reflect.TypeToken<?> r25, java.lang.Class<?> r26, boolean r27, boolean r28) throws com.google.gson.m, java.lang.SecurityException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields(com.google.gson.f, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData");
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.c(field));
        }
        String strValue = serializedName.value();
        String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean includeField(Field field, boolean z7) {
        return !this.excluder.excludeField(field, z7);
    }

    @Override
    public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new z<T>() {
                @Override
                public T read(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override
                public void write(JsonWriter jsonWriter, T t7) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        v.a filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult != v.a.BLOCK_ALL) {
            boolean z7 = filterResult == v.a.BLOCK_INACCESSIBLE;
            return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, getBoundFields(fVar, typeToken, rawType, z7, true), z7) : new FieldReflectionAdapter(this.constructorConstructor.get(typeToken), getBoundFields(fVar, typeToken, rawType, z7, false));
        }
        throw new m("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
