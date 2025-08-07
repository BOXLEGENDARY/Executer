package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.x;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter extends z<Object> {
    private static final A DOUBLE_FACTORY = newFactory(x.f19233d);
    private final f gson;
    private final y toNumberStrategy;

    static class AnonymousClass2 {
        static final int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static A getFactory(y yVar) {
        return yVar == x.f19233d ? DOUBLE_FACTORY : newFactory(yVar);
    }

    private static A newFactory(final y yVar) {
        return new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(fVar, yVar);
                }
                return null;
            }
        };
    }

    private Object readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i7 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i7 == 3) {
            return jsonReader.nextString();
        }
        if (i7 == 4) {
            return this.toNumberStrategy.c(jsonReader);
        }
        if (i7 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i7 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private Object tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i7 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i7 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i7 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new LinkedTreeMap();
    }

    @Override
    public Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
        if (objTryBeginNesting == null) {
            return readTerminal(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objTryBeginNesting instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Object objTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                boolean z7 = objTryBeginNesting2 != null;
                if (objTryBeginNesting2 == null) {
                    objTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                }
                if (objTryBeginNesting instanceof List) {
                    ((List) objTryBeginNesting).add(objTryBeginNesting2);
                } else {
                    ((Map) objTryBeginNesting).put(strNextName, objTryBeginNesting2);
                }
                if (z7) {
                    arrayDeque.addLast(objTryBeginNesting);
                    objTryBeginNesting = objTryBeginNesting2;
                }
            } else {
                if (objTryBeginNesting instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objTryBeginNesting;
                }
                objTryBeginNesting = arrayDeque.removeLast();
            }
        }
    }

    @Override
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        z zVarN = this.gson.n(obj.getClass());
        if (!(zVarN instanceof ObjectTypeAdapter)) {
            zVarN.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(f fVar, y yVar) {
        this.gson = fVar;
        this.toNumberStrategy = yVar;
    }
}
