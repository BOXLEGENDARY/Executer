package com.google.gson.stream;

import com.google.gson.e;
import com.google.gson.w;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private String formattedColon;
    private String formattedComma;
    private e formattingStyle;
    private boolean htmlSafe;
    private final Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private w strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            REPLACEMENT_CHARS[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.strictness = w.LEGACY_STRICT;
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
        setFormattingStyle(e.f19156d);
    }

    private void beforeName() throws IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.out.write(this.formattedComma);
        } else if (iPeek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (iPeek == 2) {
            this.out.append((CharSequence) this.formattedComma);
            newline();
        } else {
            if (iPeek == 4) {
                this.out.append((CharSequence) this.formattedColon);
                replaceTop(5);
                return;
            }
            if (iPeek != 6) {
                if (iPeek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.strictness != w.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter closeScope(int i7, int i8, char c2) throws IOException {
        int iPeek = peek();
        if (iPeek != i8 && iPeek != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (iPeek == i8) {
            newline();
        }
        this.out.write(c2);
        return this;
    }

    private static boolean isTrustedNumberType(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void newline() throws IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.b());
        int i7 = this.stackSize;
        for (int i8 = 1; i8 < i7; i8++) {
            this.out.write(this.formattingStyle.a());
        }
    }

    private JsonWriter openScope(int i7, char c2) throws IOException {
        beforeValue();
        push(i7);
        this.out.write(c2);
        return this;
    }

    private int peek() {
        int i7 = this.stackSize;
        if (i7 != 0) {
            return this.stack[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i7) {
        int i8 = this.stackSize;
        int[] iArr = this.stack;
        if (i8 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i8 * 2);
        }
        int[] iArr2 = this.stack;
        int i9 = this.stackSize;
        this.stackSize = i9 + 1;
        iArr2[i9] = i7;
    }

    private void replaceTop(int i7) {
        this.stack[this.stackSize - 1] = i7;
    }

    private void string(java.lang.String r9) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.string(java.lang.String):void");
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return openScope(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return openScope(3, '{');
    }

    @Override
    public void close() throws IOException {
        this.out.close();
        int i7 = this.stackSize;
        if (i7 > 1 || (i7 == 1 && this.stack[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    public JsonWriter endArray() throws IOException {
        return closeScope(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return closeScope(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    public final e getFormattingStyle() {
        return this.formattingStyle;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final w getStrictness() {
        return this.strictness;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.strictness == w.LENIENT;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iPeek = peek();
        if (iPeek != 3 && iPeek != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setFormattingStyle(e eVar) {
        Objects.requireNonNull(eVar);
        this.formattingStyle = eVar;
        this.formattedComma = ",";
        if (eVar.c()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.b().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ":";
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.b().isEmpty() && this.formattingStyle.a().isEmpty();
    }

    public final void setHtmlSafe(boolean z7) {
        this.htmlSafe = z7;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(e.f19156d);
        } else {
            setFormattingStyle(e.f19157e.d(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z7) {
        setStrictness(z7 ? w.LENIENT : w.LEGACY_STRICT);
    }

    public final void setSerializeNulls(boolean z7) {
        this.serializeNulls = z7;
    }

    public final void setStrictness(w wVar) {
        Objects.requireNonNull(wVar);
        this.strictness = wVar;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z7) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z7 ? "true" : "false");
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(float f7) throws IOException {
        writeDeferredName();
        if (this.strictness != w.LENIENT && (Float.isNaN(f7) || Float.isInfinite(f7))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f7);
        }
        beforeValue();
        this.out.append((CharSequence) Float.toString(f7));
        return this;
    }

    public JsonWriter value(double d7) throws IOException {
        writeDeferredName();
        if (this.strictness != w.LENIENT && (Double.isNaN(d7) || Double.isInfinite(d7))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d7);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d7));
        return this;
    }

    public JsonWriter value(long j7) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j7));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!isTrustedNumberType(cls) && !VALID_JSON_NUMBER_PATTERN.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.strictness != w.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        beforeValue();
        this.out.append((CharSequence) string);
        return this;
    }
}
