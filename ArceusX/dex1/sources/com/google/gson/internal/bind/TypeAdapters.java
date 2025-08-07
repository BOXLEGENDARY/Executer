package com.google.gson.internal.bind;

import Y3.qE.KpBmp;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.gson.A;
import com.google.gson.annotations.SerializedName;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.z;
import e2.vb.oyfFwvPUKctyaG;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final z<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final A ATOMIC_BOOLEAN_FACTORY;
    public static final z<AtomicInteger> ATOMIC_INTEGER;
    public static final z<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final A ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final A ATOMIC_INTEGER_FACTORY;
    public static final z<BigDecimal> BIG_DECIMAL;
    public static final z<BigInteger> BIG_INTEGER;
    public static final z<BitSet> BIT_SET;
    public static final A BIT_SET_FACTORY;
    public static final z<Boolean> BOOLEAN;
    public static final z<Boolean> BOOLEAN_AS_STRING;
    public static final A BOOLEAN_FACTORY;
    public static final z<Number> BYTE;
    public static final A BYTE_FACTORY;
    public static final z<Calendar> CALENDAR;
    public static final A CALENDAR_FACTORY;
    public static final z<Character> CHARACTER;
    public static final A CHARACTER_FACTORY;
    public static final z<Class> CLASS;
    public static final A CLASS_FACTORY;
    public static final z<Currency> CURRENCY;
    public static final A CURRENCY_FACTORY;
    public static final z<Number> DOUBLE;
    public static final A ENUM_FACTORY;
    public static final z<Number> FLOAT;
    public static final z<InetAddress> INET_ADDRESS;
    public static final A INET_ADDRESS_FACTORY;
    public static final z<Number> INTEGER;
    public static final A INTEGER_FACTORY;
    public static final z<l> JSON_ELEMENT;
    public static final A JSON_ELEMENT_FACTORY;
    public static final z<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final z<Locale> LOCALE;
    public static final A LOCALE_FACTORY;
    public static final z<Number> LONG;
    public static final z<Number> SHORT;
    public static final A SHORT_FACTORY;
    public static final z<String> STRING;
    public static final z<StringBuffer> STRING_BUFFER;
    public static final A STRING_BUFFER_FACTORY;
    public static final z<StringBuilder> STRING_BUILDER;
    public static final A STRING_BUILDER_FACTORY;
    public static final A STRING_FACTORY;
    public static final z<URI> URI;
    public static final A URI_FACTORY;
    public static final z<URL> URL;
    public static final A URL_FACTORY;
    public static final z<UUID> UUID;
    public static final A UUID_FACTORY;

    static class AnonymousClass42 {
        static final int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class EnumTypeAdapter<T extends Enum<T>> extends z<T> {
        private final Map<String, T> nameToConstant = new HashMap();
        private final Map<String, T> stringToConstant = new HashMap();
        private final Map<T, String> constantToName = new HashMap();

        public EnumTypeAdapter(final Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() {
                    @Override
                    public Field[] run() throws SecurityException {
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.nameToConstant.put(str, r42);
                        }
                    }
                    this.nameToConstant.put(strName, r42);
                    this.stringToConstant.put(string, r42);
                    this.constantToName.put(r42, strName);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            }
        }

        @Override
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            T t7 = this.nameToConstant.get(strNextString);
            return t7 == null ? this.stringToConstant.get(strNextString) : t7;
        }

        @Override
        public void write(JsonWriter jsonWriter, T t7) throws IOException {
            jsonWriter.value(t7 == null ? null : this.constantToName.get(t7));
        }
    }

    static {
        z<Class> zVarNullSafe = new z<Class>() {
            @Override
            public Class read(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + TroubleshootingGuide.createUrl("java-lang-class-unsupported"));
            }

            @Override
            public void write(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + TroubleshootingGuide.createUrl("java-lang-class-unsupported"));
            }
        }.nullSafe();
        CLASS = zVarNullSafe;
        CLASS_FACTORY = newFactory(Class.class, zVarNullSafe);
        z<BitSet> zVarNullSafe2 = new z<BitSet>() {
            @Override
            public BitSet read(JsonReader jsonReader) throws IOException, NumberFormatException {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i7 = 0;
                while (jsonTokenPeek != JsonToken.END_ARRAY) {
                    int i8 = AnonymousClass42.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
                    boolean zNextBoolean = true;
                    if (i8 == 1 || i8 == 2) {
                        int iNextInt = jsonReader.nextInt();
                        if (iNextInt == 0) {
                            zNextBoolean = false;
                        } else if (iNextInt != 1) {
                            throw new t("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                        }
                    } else {
                        if (i8 != 3) {
                            throw new t("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                        }
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                    if (zNextBoolean) {
                        bitSet.set(i7);
                    }
                    i7++;
                    jsonTokenPeek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override
            public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i7 = 0; i7 < length; i7++) {
                    jsonWriter.value(bitSet.get(i7) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = zVarNullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, zVarNullSafe2);
        z<Boolean> zVar = new z<Boolean>() {
            @Override
            public Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != JsonToken.NULL) {
                    return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = zVar;
        BOOLEAN_AS_STRING = new z<Boolean>() {
            @Override
            public Boolean read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, zVar);
        z<Number> zVar2 = new z<Number>() {
            @Override
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 255 && iNextInt >= -128) {
                        return Byte.valueOf((byte) iNextInt);
                    }
                    throw new t("Lossy conversion from " + iNextInt + " to byte; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e7) {
                    throw new t(e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.byteValue());
                }
            }
        };
        BYTE = zVar2;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, zVar2);
        z<Number> zVar3 = new z<Number>() {
            @Override
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 65535 && iNextInt >= -32768) {
                        return Short.valueOf((short) iNextInt);
                    }
                    throw new t("Lossy conversion from " + iNextInt + " to short; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e7) {
                    throw new t(e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.shortValue());
                }
            }
        };
        SHORT = zVar3;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, zVar3);
        z<Number> zVar4 = new z<Number>() {
            @Override
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e7) {
                    throw new t(e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.intValue());
                }
            }
        };
        INTEGER = zVar4;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, zVar4);
        z<AtomicInteger> zVarNullSafe3 = new z<AtomicInteger>() {
            @Override
            public AtomicInteger read(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e7) {
                    throw new t(e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = zVarNullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, zVarNullSafe3);
        z<AtomicBoolean> zVarNullSafe4 = new z<AtomicBoolean>() {
            @Override
            public AtomicBoolean read(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = zVarNullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, zVarNullSafe4);
        z<AtomicIntegerArray> zVarNullSafe5 = new z<AtomicIntegerArray>() {
            @Override
            public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e7) {
                        throw new t(e7);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    jsonWriter.value(atomicIntegerArray.get(i7));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = zVarNullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, zVarNullSafe5);
        LONG = new z<Number>() {
            @Override
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e7) {
                    throw new t(e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }
        };
        FLOAT = new z<Number>() {
            @Override
            public Number read(JsonReader jsonReader) throws IOException {
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
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                jsonWriter.value(number);
            }
        };
        DOUBLE = new z<Number>() {
            @Override
            public Number read(JsonReader jsonReader) throws IOException {
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
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }
        };
        z<Character> zVar5 = new z<Character>() {
            @Override
            public Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new t("Expecting character, got: " + strNextString + oyfFwvPUKctyaG.FJLjDhhiQlgFj + jsonReader.getPreviousPath());
            }

            @Override
            public void write(JsonWriter jsonWriter, Character ch) throws IOException {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = zVar5;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, zVar5);
        z<String> zVar6 = new z<String>() {
            @Override
            public String read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != JsonToken.NULL) {
                    return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        STRING = zVar6;
        BIG_DECIMAL = new z<BigDecimal>() {
            @Override
            public BigDecimal read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return NumberLimits.parseBigDecimal(strNextString);
                } catch (NumberFormatException e7) {
                    throw new t(KpBmp.xckvQAsu + strNextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new z<BigInteger>() {
            @Override
            public BigInteger read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return NumberLimits.parseBigInteger(strNextString);
                } catch (NumberFormatException e7) {
                    throw new t("Failed parsing '" + strNextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        LAZILY_PARSED_NUMBER = new z<LazilyParsedNumber>() {
            @Override
            public LazilyParsedNumber read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
                jsonWriter.value(lazilyParsedNumber);
            }
        };
        STRING_FACTORY = newFactory(String.class, zVar6);
        z<StringBuilder> zVar7 = new z<StringBuilder>() {
            @Override
            public StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = zVar7;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, zVar7);
        z<StringBuffer> zVar8 = new z<StringBuffer>() {
            @Override
            public StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = zVar8;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, zVar8);
        z<URL> zVar9 = new z<URL>() {
            @Override
            public URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.equals("null")) {
                    return null;
                }
                return new URL(strNextString);
            }

            @Override
            public void write(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = zVar9;
        URL_FACTORY = newFactory(URL.class, zVar9);
        z<URI> zVar10 = new z<URI>() {
            @Override
            public URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString = jsonReader.nextString();
                    if (strNextString.equals("null")) {
                        return null;
                    }
                    return new URI(strNextString);
                } catch (URISyntaxException e7) {
                    throw new m(e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = zVar10;
        URI_FACTORY = newFactory(URI.class, zVar10);
        z<InetAddress> zVar11 = new z<InetAddress>() {
            @Override
            public InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = zVar11;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, zVar11);
        z<UUID> zVar12 = new z<UUID>() {
            @Override
            public UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return UUID.fromString(strNextString);
                } catch (IllegalArgumentException e7) {
                    throw new t("Failed parsing '" + strNextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = zVar12;
        UUID_FACTORY = newFactory(UUID.class, zVar12);
        z<Currency> zVarNullSafe6 = new z<Currency>() {
            @Override
            public Currency read(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(strNextString);
                } catch (IllegalArgumentException e7) {
                    throw new t("Failed parsing '" + strNextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e7);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = zVarNullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, zVarNullSafe6);
        z<Calendar> zVar13 = new z<Calendar>() {
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            @Override
            public Calendar read(JsonReader jsonReader) throws IOException, NumberFormatException {
                int iNextInt;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    iNextInt = jsonReader.nextInt();
                    strNextName.hashCode();
                    switch (strNextName) {
                        case "dayOfMonth":
                            i9 = iNextInt;
                            break;
                        case "minute":
                            i11 = iNextInt;
                            break;
                        case "second":
                            i12 = iNextInt;
                            break;
                        case "year":
                            i7 = iNextInt;
                            break;
                        case "month":
                            i8 = iNextInt;
                            break;
                        case "hourOfDay":
                            i10 = iNextInt;
                            break;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
            }

            @Override
            public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name(YEAR);
                jsonWriter.value(calendar.get(1));
                jsonWriter.name(MONTH);
                jsonWriter.value(calendar.get(2));
                jsonWriter.name(DAY_OF_MONTH);
                jsonWriter.value(calendar.get(5));
                jsonWriter.name(HOUR_OF_DAY);
                jsonWriter.value(calendar.get(11));
                jsonWriter.name(MINUTE);
                jsonWriter.value(calendar.get(12));
                jsonWriter.name(SECOND);
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = zVar13;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, zVar13);
        z<Locale> zVar14 = new z<Locale>() {
            @Override
            public Locale read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override
            public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = zVar14;
        LOCALE_FACTORY = newFactory(Locale.class, zVar14);
        z<l> zVar15 = new z<l>() {
            private l readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i7 = AnonymousClass42.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
                if (i7 == 1) {
                    return new q(new LazilyParsedNumber(jsonReader.nextString()));
                }
                if (i7 == 2) {
                    return new q(jsonReader.nextString());
                }
                if (i7 == 3) {
                    return new q(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                if (i7 == 6) {
                    jsonReader.nextNull();
                    return n.f19218d;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            private l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i7 = AnonymousClass42.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
                if (i7 == 4) {
                    jsonReader.beginArray();
                    return new i();
                }
                if (i7 != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new o();
            }

            @Override
            public l read(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    return ((JsonTreeReader) jsonReader).nextJsonElement();
                }
                JsonToken jsonTokenPeek = jsonReader.peek();
                l lVarTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
                if (lVarTryBeginNesting == null) {
                    return readTerminal(jsonReader, jsonTokenPeek);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String strNextName = lVarTryBeginNesting instanceof o ? jsonReader.nextName() : null;
                        JsonToken jsonTokenPeek2 = jsonReader.peek();
                        l lVarTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                        boolean z7 = lVarTryBeginNesting2 != null;
                        if (lVarTryBeginNesting2 == null) {
                            lVarTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                        }
                        if (lVarTryBeginNesting instanceof i) {
                            ((i) lVarTryBeginNesting).n(lVarTryBeginNesting2);
                        } else {
                            ((o) lVarTryBeginNesting).n(strNextName, lVarTryBeginNesting2);
                        }
                        if (z7) {
                            arrayDeque.addLast(lVarTryBeginNesting);
                            lVarTryBeginNesting = lVarTryBeginNesting2;
                        }
                    } else {
                        if (lVarTryBeginNesting instanceof i) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return lVarTryBeginNesting;
                        }
                        lVarTryBeginNesting = (l) arrayDeque.removeLast();
                    }
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, l lVar) throws IOException {
                if (lVar == null || lVar.k()) {
                    jsonWriter.nullValue();
                    return;
                }
                if (lVar.m()) {
                    q qVarG = lVar.g();
                    if (qVarG.x()) {
                        jsonWriter.value(qVarG.t());
                        return;
                    } else if (qVarG.v()) {
                        jsonWriter.value(qVarG.p());
                        return;
                    } else {
                        jsonWriter.value(qVarG.u());
                        return;
                    }
                }
                if (lVar.j()) {
                    jsonWriter.beginArray();
                    Iterator<l> it = lVar.d().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (!lVar.l()) {
                    throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
                jsonWriter.beginObject();
                for (Map.Entry<String, l> entry : lVar.e().o()) {
                    jsonWriter.name(entry.getKey());
                    write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            }
        };
        JSON_ELEMENT = zVar15;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(l.class, zVar15);
        ENUM_FACTORY = new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> A newFactory(final TypeToken<TT> typeToken, final z<TT> zVar) {
        return new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return zVar;
                }
                return null;
            }
        };
    }

    public static <TT> A newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final z<? super TT> zVar) {
        return new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return zVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + JmBUOGMwkkxg.iFxnfqxxsv + cls2.getName() + ",adapter=" + zVar + "]";
            }
        };
    }

    public static <T1> A newTypeHierarchyFactory(final Class<T1> cls, final z<T1> zVar) {
        return new A() {
            @Override
            public <T2> z<T2> create(f fVar, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (z<T2>) new z<T1>() {
                        @Override
                        public T1 read(JsonReader jsonReader) throws IOException {
                            T1 t1 = (T1) zVar.read(jsonReader);
                            if (t1 == null || rawType.isInstance(t1)) {
                                return t1;
                            }
                            throw new t("Expected a " + rawType.getName() + " but was " + t1.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                        }

                        @Override
                        public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
                            zVar.write(jsonWriter, t1);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + zVar + "]";
            }
        };
    }

    public static <TT> A newFactory(final Class<TT> cls, final z<TT> zVar) {
        return new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return zVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + zVar + "]";
            }
        };
    }

    public static <TT> A newFactory(final Class<TT> cls, final Class<TT> cls2, final z<? super TT> zVar) {
        return new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return zVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + zVar + "]";
            }
        };
    }
}
