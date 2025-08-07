package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

public abstract class l {
    @Deprecated
    public l() {
    }

    public i d() {
        if (j()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o e() {
        if (l()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public q g() {
        if (m()) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean j() {
        return this instanceof i;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return this instanceof o;
    }

    public boolean m() {
        return this instanceof q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setStrictness(w.LENIENT);
            Streams.write(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
