package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class JsonTreeWriter extends JsonWriter {
    private String pendingName;
    private l product;
    private final List<l> stack;
    private static final Writer UNWRITABLE_WRITER = new Writer() {
        @Override
        public void close() {
            throw new AssertionError();
        }

        @Override
        public void flush() {
            throw new AssertionError();
        }

        @Override
        public void write(char[] cArr, int i7, int i8) {
            throw new AssertionError();
        }
    };
    private static final q SENTINEL_CLOSED = new q("closed");

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
        this.stack = new ArrayList();
        this.product = n.f19218d;
    }

    private l peek() {
        return this.stack.get(r0.size() - 1);
    }

    private void put(l lVar) {
        if (this.pendingName != null) {
            if (!lVar.k() || getSerializeNulls()) {
                ((o) peek()).n(this.pendingName, lVar);
            }
            this.pendingName = null;
            return;
        }
        if (this.stack.isEmpty()) {
            this.product = lVar;
            return;
        }
        l lVarPeek = peek();
        if (!(lVarPeek instanceof i)) {
            throw new IllegalStateException();
        }
        ((i) lVarPeek).n(lVar);
    }

    @Override
    public JsonWriter beginArray() throws IOException {
        i iVar = new i();
        put(iVar);
        this.stack.add(iVar);
        return this;
    }

    @Override
    public JsonWriter beginObject() throws IOException {
        o oVar = new o();
        put(oVar);
        this.stack.add(oVar);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (!this.stack.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.stack.add(SENTINEL_CLOSED);
    }

    @Override
    public JsonWriter endArray() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof i)) {
            throw new IllegalStateException();
        }
        this.stack.remove(r0.size() - 1);
        return this;
    }

    @Override
    public JsonWriter endObject() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof o)) {
            throw new IllegalStateException();
        }
        this.stack.remove(r0.size() - 1);
        return this;
    }

    @Override
    public void flush() throws IOException {
    }

    public l get() {
        if (this.stack.isEmpty()) {
            return this.product;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.stack);
    }

    @Override
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(peek() instanceof o)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.pendingName = str;
        return this;
    }

    @Override
    public JsonWriter nullValue() throws IOException {
        put(n.f19218d);
        return this;
    }

    @Override
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        put(new q(str));
        return this;
    }

    @Override
    public JsonWriter value(boolean z7) throws IOException {
        put(new q(Boolean.valueOf(z7)));
        return this;
    }

    @Override
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        put(new q(bool));
        return this;
    }

    @Override
    public JsonWriter value(float f7) throws IOException {
        if (!isLenient() && (Float.isNaN(f7) || Float.isInfinite(f7))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f7);
        }
        put(new q(Float.valueOf(f7)));
        return this;
    }

    @Override
    public JsonWriter value(double d7) throws IOException {
        if (!isLenient() && (Double.isNaN(d7) || Double.isInfinite(d7))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d7);
        }
        put(new q(Double.valueOf(d7)));
        return this;
    }

    @Override
    public JsonWriter value(long j7) throws IOException {
        put(new q(Long.valueOf(j7)));
        return this;
    }

    @Override
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        put(new q(number));
        return this;
    }
}
