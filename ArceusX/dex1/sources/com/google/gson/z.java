package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class z<T> {

    class a extends z<T> {
        a() {
        }

        @Override
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) z.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        @Override
        public void write(JsonWriter jsonWriter, T t7) throws IOException {
            if (t7 == null) {
                jsonWriter.nullValue();
            } else {
                z.this.write(jsonWriter, t7);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(l lVar) {
        try {
            return read(new JsonTreeReader(lVar));
        } catch (IOException e7) {
            throw new m(e7);
        }
    }

    public final z<T> nullSafe() {
        return new a();
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t7) throws IOException {
        write(new JsonWriter(writer), t7);
    }

    public final l toJsonTree(T t7) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t7);
            return jsonTreeWriter.get();
        } catch (IOException e7) {
            throw new m(e7);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t7) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t7) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t7);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new m(e7);
        }
    }
}
