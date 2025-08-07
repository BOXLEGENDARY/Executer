package com.google.gson.internal.bind;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.x;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;

public final class NumberTypeAdapter extends z<Number> {
    private static final A LAZILY_PARSED_NUMBER_FACTORY = newFactory(x.f19234e);
    private final y toNumberStrategy;

    static class AnonymousClass2 {
        static final int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(y yVar) {
        this.toNumberStrategy = yVar;
    }

    public static A getFactory(y yVar) {
        return yVar == x.f19234e ? LAZILY_PARSED_NUMBER_FACTORY : newFactory(yVar);
    }

    private static A newFactory(y yVar) {
        return new A() {
            @Override
            public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i7 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
        if (i7 == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i7 == 2 || i7 == 3) {
            return this.toNumberStrategy.c(jsonReader);
        }
        throw new t("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    @Override
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
