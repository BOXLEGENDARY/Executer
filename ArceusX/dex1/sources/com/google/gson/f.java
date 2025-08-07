package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class f {

    static final com.google.gson.e f19161A = com.google.gson.e.f19156d;

    static final String f19162B = null;

    static final com.google.gson.d f19163C = com.google.gson.c.f19149d;

    static final y f19164D = x.f19233d;

    static final y f19165E = x.f19234e;

    static final w f19166z = null;

    private final ThreadLocal<Map<TypeToken<?>, z<?>>> f19167a;

    private final ConcurrentMap<TypeToken<?>, z<?>> f19168b;

    private final ConstructorConstructor f19169c;

    private final JsonAdapterAnnotationTypeAdapterFactory f19170d;

    final List<A> f19171e;

    final Excluder f19172f;

    final com.google.gson.d f19173g;

    final Map<Type, h<?>> f19174h;

    final boolean f19175i;

    final boolean f19176j;

    final boolean f19177k;

    final boolean f19178l;

    final com.google.gson.e f19179m;

    final w f19180n;

    final boolean f19181o;

    final boolean f19182p;

    final String f19183q;

    final int f19184r;

    final int f19185s;

    final u f19186t;

    final List<A> f19187u;

    final List<A> f19188v;

    final y f19189w;

    final y f19190x;

    final List<v> f19191y;

    class a extends z<Number> {
        a() {
        }

        @Override
        public Double read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            jsonWriter.value(dDoubleValue);
        }
    }

    class b extends z<Number> {
        b() {
        }

        @Override
        public Float read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            jsonWriter.value(number);
        }
    }

    class c extends z<Number> {
        c() {
        }

        @Override
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    class d extends z<AtomicLong> {

        final z f19194a;

        d(z zVar) {
            this.f19194a = zVar;
        }

        @Override
        public AtomicLong read(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f19194a.read(jsonReader)).longValue());
        }

        @Override
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f19194a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends z<AtomicLongArray> {

        final z f19195a;

        e(z zVar) {
            this.f19195a = zVar;
        }

        @Override
        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f19195a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i7 = 0; i7 < size; i7++) {
                atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
            }
            return atomicLongArray;
        }

        @Override
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                this.f19195a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i7)));
            }
            jsonWriter.endArray();
        }
    }

    static class C0172f<T> extends SerializationDelegatingTypeAdapter<T> {

        private z<T> f19196a = null;

        C0172f() {
        }

        private z<T> delegate() {
            z<T> zVar = this.f19196a;
            if (zVar != null) {
                return zVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public void a(z<T> zVar) {
            if (this.f19196a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f19196a = zVar;
        }

        @Override
        public z<T> getSerializationDelegate() {
            return delegate();
        }

        @Override
        public T read(JsonReader jsonReader) throws IOException {
            return delegate().read(jsonReader);
        }

        @Override
        public void write(JsonWriter jsonWriter, T t7) throws IOException {
            delegate().write(jsonWriter, t7);
        }
    }

    public f() {
        this(Excluder.DEFAULT, f19163C, Collections.emptyMap(), false, false, false, true, f19161A, f19166z, false, true, u.f19221d, f19162B, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f19164D, f19165E, Collections.emptyList());
    }

    private static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new t("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e7) {
                throw new t(e7);
            } catch (IOException e8) {
                throw new m(e8);
            }
        }
    }

    private static z<AtomicLong> b(z<Number> zVar) {
        return new d(zVar).nullSafe();
    }

    private static z<AtomicLongArray> c(z<Number> zVar) {
        return new e(zVar).nullSafe();
    }

    static void d(double d7) {
        if (Double.isNaN(d7) || Double.isInfinite(d7)) {
            throw new IllegalArgumentException(d7 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private z<Number> e(boolean z7) {
        return z7 ? TypeAdapters.DOUBLE : new a();
    }

    private z<Number> f(boolean z7) {
        return z7 ? TypeAdapters.FLOAT : new b();
    }

    private static z<Number> p(u uVar) {
        return uVar == u.f19221d ? TypeAdapters.LONG : new c();
    }

    public l A(Object obj, Type type) throws m {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        x(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public <T> T g(l lVar, TypeToken<T> typeToken) throws t {
        if (lVar == null) {
            return null;
        }
        return (T) i(new JsonTreeReader(lVar), typeToken);
    }

    public <T> T h(l lVar, Type type) throws t {
        return (T) g(lVar, TypeToken.get(type));
    }

    public <T> T i(JsonReader jsonReader, TypeToken<T> typeToken) throws t, m {
        boolean z7;
        w strictness = jsonReader.getStrictness();
        w wVar = this.f19180n;
        if (wVar != null) {
            jsonReader.setStrictness(wVar);
        } else if (jsonReader.getStrictness() == w.LEGACY_STRICT) {
            jsonReader.setStrictness(w.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z7 = false;
                        try {
                            return m(typeToken).read(jsonReader);
                        } catch (EOFException e7) {
                            e = e7;
                            if (!z7) {
                                throw new t(e);
                            }
                            jsonReader.setStrictness(strictness);
                            return null;
                        }
                    } finally {
                        jsonReader.setStrictness(strictness);
                    }
                } catch (EOFException e8) {
                    e = e8;
                    z7 = true;
                }
            } catch (IOException e9) {
                throw new t(e9);
            }
        } catch (AssertionError e10) {
            throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
        } catch (IllegalStateException e11) {
            throw new t(e11);
        }
    }

    public <T> T j(Reader reader, TypeToken<T> typeToken) throws t, m {
        JsonReader jsonReaderQ = q(reader);
        T t7 = (T) i(jsonReaderQ, typeToken);
        a(t7, jsonReaderQ);
        return t7;
    }

    public <T> T k(String str, TypeToken<T> typeToken) throws t {
        if (str == null) {
            return null;
        }
        return (T) j(new StringReader(str), typeToken);
    }

    public <T> T l(String str, Class<T> cls) throws t {
        return (T) Primitives.wrap(cls).cast(k(str, TypeToken.get((Class) cls)));
    }

    public <T> com.google.gson.z<T> m(com.google.gson.reflect.TypeToken<T> r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.f.m(com.google.gson.reflect.TypeToken):com.google.gson.z");
    }

    public <T> z<T> n(Class<T> cls) {
        return m(TypeToken.get((Class) cls));
    }

    public <T> z<T> o(A a2, TypeToken<T> typeToken) {
        Objects.requireNonNull(a2, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f19170d.isClassJsonAdapterFactory(typeToken, a2)) {
            a2 = this.f19170d;
        }
        boolean z7 = false;
        for (A a3 : this.f19171e) {
            if (z7) {
                z<T> zVarCreate = a3.create(this, typeToken);
                if (zVarCreate != null) {
                    return zVarCreate;
                }
            } else if (a3 == a2) {
                z7 = true;
            }
        }
        if (!z7) {
            return m(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public JsonReader q(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        w wVar = this.f19180n;
        if (wVar == null) {
            wVar = w.LEGACY_STRICT;
        }
        jsonReader.setStrictness(wVar);
        return jsonReader;
    }

    public JsonWriter r(Writer writer) throws IOException {
        if (this.f19177k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f19179m);
        jsonWriter.setHtmlSafe(this.f19178l);
        w wVar = this.f19180n;
        if (wVar == null) {
            wVar = w.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(wVar);
        jsonWriter.setSerializeNulls(this.f19175i);
        return jsonWriter;
    }

    public String s(l lVar) throws m {
        StringWriter stringWriter = new StringWriter();
        w(lVar, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(n.f19218d) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f19175i + ",factories:" + this.f19171e + ",instanceCreators:" + this.f19169c + "}";
    }

    public String u(Object obj, Type type) throws m {
        StringWriter stringWriter = new StringWriter();
        y(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(l lVar, JsonWriter jsonWriter) throws m {
        w strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f19178l);
        jsonWriter.setSerializeNulls(this.f19175i);
        w wVar = this.f19180n;
        if (wVar != null) {
            jsonWriter.setStrictness(wVar);
        } else if (jsonWriter.getStrictness() == w.LEGACY_STRICT) {
            jsonWriter.setStrictness(w.LENIENT);
        }
        try {
            try {
                Streams.write(lVar, jsonWriter);
            } catch (IOException e7) {
                throw new m(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e8.getMessage(), e8);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void w(l lVar, Appendable appendable) throws m {
        try {
            v(lVar, r(Streams.writerForAppendable(appendable)));
        } catch (IOException e7) {
            throw new m(e7);
        }
    }

    public void x(Object obj, Type type, JsonWriter jsonWriter) throws m {
        z zVarM = m(TypeToken.get(type));
        w strictness = jsonWriter.getStrictness();
        w wVar = this.f19180n;
        if (wVar != null) {
            jsonWriter.setStrictness(wVar);
        } else if (jsonWriter.getStrictness() == w.LEGACY_STRICT) {
            jsonWriter.setStrictness(w.LENIENT);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f19178l);
        jsonWriter.setSerializeNulls(this.f19175i);
        try {
            try {
                try {
                    zVarM.write(jsonWriter, obj);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
                }
            } catch (IOException e8) {
                throw new m(e8);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void y(Object obj, Type type, Appendable appendable) throws m {
        try {
            x(obj, type, r(Streams.writerForAppendable(appendable)));
        } catch (IOException e7) {
            throw new m(e7);
        }
    }

    public l z(Object obj) {
        return obj == null ? n.f19218d : A(obj, obj.getClass());
    }

    f(Excluder excluder, com.google.gson.d dVar, Map<Type, h<?>> map, boolean z7, boolean z8, boolean z9, boolean z10, com.google.gson.e eVar, w wVar, boolean z11, boolean z12, u uVar, String str, int i7, int i8, List<A> list, List<A> list2, List<A> list3, y yVar, y yVar2, List<v> list4) {
        this.f19167a = new ThreadLocal<>();
        this.f19168b = new ConcurrentHashMap();
        this.f19172f = excluder;
        this.f19173g = dVar;
        this.f19174h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z12, list4);
        this.f19169c = constructorConstructor;
        this.f19175i = z7;
        this.f19176j = z8;
        this.f19177k = z9;
        this.f19178l = z10;
        this.f19179m = eVar;
        this.f19180n = wVar;
        this.f19181o = z11;
        this.f19182p = z12;
        this.f19186t = uVar;
        this.f19183q = str;
        this.f19184r = i7;
        this.f19185s = i8;
        this.f19187u = list;
        this.f19188v = list2;
        this.f19189w = yVar;
        this.f19190x = yVar2;
        this.f19191y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(yVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        z<Number> zVarP = p(uVar);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, zVarP));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, e(z11)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, f(z11)));
        arrayList.add(NumberTypeAdapter.getFactory(yVar2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, b(zVarP)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, c(zVarP)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList.add(SqlTypesSupport.TIME_FACTORY);
            arrayList.add(SqlTypesSupport.DATE_FACTORY);
            arrayList.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z8));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f19170d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f19171e = Collections.unmodifiableList(arrayList);
    }
}
