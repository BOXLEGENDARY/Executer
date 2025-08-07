package com.google.gson.internal;

import com.google.gson.A;
import com.google.gson.InterfaceC2352a;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.b;
import com.google.gson.f;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Excluder implements A, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<InterfaceC2352a> serializationStrategies = Collections.emptyList();
    private List<InterfaceC2352a> deserializationStrategies = Collections.emptyList();

    private static boolean isInnerClass(Class<?> cls) {
        return cls.isMemberClass() && !ReflectionHelper.isStatic(cls);
    }

    private boolean isValidSince(Since since) {
        if (since != null) {
            return this.version >= since.value();
        }
        return true;
    }

    private boolean isValidUntil(Until until) {
        if (until != null) {
            return this.version < until.value();
        }
        return true;
    }

    private boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    @Override
    public <T> z<T> create(final f fVar, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean zExcludeClass = excludeClass(rawType, true);
        final boolean zExcludeClass2 = excludeClass(rawType, false);
        if (zExcludeClass || zExcludeClass2) {
            return new z<T>() {
                private volatile z<T> delegate;

                private z<T> delegate() {
                    z<T> zVar = this.delegate;
                    if (zVar != null) {
                        return zVar;
                    }
                    z<T> zVarO = fVar.o(Excluder.this, typeToken);
                    this.delegate = zVarO;
                    return zVarO;
                }

                @Override
                public T read(JsonReader jsonReader) throws IOException {
                    if (!zExcludeClass2) {
                        return delegate().read(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override
                public void write(JsonWriter jsonWriter, T t7) throws IOException {
                    if (zExcludeClass) {
                        jsonWriter.nullValue();
                    } else {
                        delegate().write(jsonWriter, t7);
                    }
                }
            };
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM46clone = m46clone();
        excluderM46clone.serializeInnerClasses = false;
        return excluderM46clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z7) {
        if (this.version != IGNORE_VERSIONS && !isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (!this.serializeInnerClasses && isInnerClass(cls)) {
            return true;
        }
        if (!z7 && !Enum.class.isAssignableFrom(cls) && ReflectionHelper.isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        Iterator<InterfaceC2352a> it = (z7 ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean excludeField(Field field, boolean z7) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z7 ? expose.deserialize() : expose.serialize()))) || excludeClass(field.getType(), z7)) {
            return true;
        }
        List<InterfaceC2352a> list = z7 ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        Iterator<InterfaceC2352a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM46clone = m46clone();
        excluderM46clone.requireExpose = true;
        return excluderM46clone;
    }

    public Excluder withExclusionStrategy(InterfaceC2352a interfaceC2352a, boolean z7, boolean z8) {
        Excluder excluderM46clone = m46clone();
        if (z7) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM46clone.serializationStrategies = arrayList;
            arrayList.add(interfaceC2352a);
        }
        if (z8) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM46clone.deserializationStrategies = arrayList2;
            arrayList2.add(interfaceC2352a);
        }
        return excluderM46clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM46clone = m46clone();
        excluderM46clone.modifiers = 0;
        for (int i7 : iArr) {
            excluderM46clone.modifiers = i7 | excluderM46clone.modifiers;
        }
        return excluderM46clone;
    }

    public Excluder withVersion(double d7) {
        Excluder excluderM46clone = m46clone();
        excluderM46clone.version = d7;
        return excluderM46clone;
    }

    public Excluder m46clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }
}
