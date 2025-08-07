package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() {
        @Override
        public void close() {
            throw new AssertionError();
        }

        @Override
        public int read(char[] cArr, int i7, int i8) {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    static class AnonymousClass2 {
        static final int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(l lVar) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(lVar);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private String getPath(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i7 = 0;
        while (true) {
            int i8 = this.stackSize;
            if (i7 >= i8) {
                return sb.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i7];
            if (obj instanceof i) {
                i7++;
                if (i7 < i8 && (objArr[i7] instanceof Iterator)) {
                    int i9 = this.pathIndices[i7];
                    if (z7 && i9 > 0 && (i7 == i8 - 1 || i7 == i8 - 2)) {
                        i9--;
                    }
                    sb.append('[');
                    sb.append(i9);
                    sb.append(']');
                }
            } else if ((obj instanceof o) && (i7 = i7 + 1) < i8 && (objArr[i7] instanceof Iterator)) {
                sb.append('.');
                String str = this.pathNames[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
            i7++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private String nextName(boolean z7) throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = z7 ? "<skipped>" : str;
        push(entry.getValue());
        return str;
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i7 = this.stackSize - 1;
        this.stackSize = i7;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    private void push(Object obj) {
        int i7 = this.stackSize;
        Object[] objArr = this.stack;
        if (i7 == objArr.length) {
            int i8 = i7 * 2;
            this.stack = Arrays.copyOf(objArr, i8);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i8);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i8);
        }
        Object[] objArr2 = this.stack;
        int i9 = this.stackSize;
        this.stackSize = i9 + 1;
        objArr2[i9] = obj;
    }

    @Override
    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((i) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override
    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((o) peekStack()).o().iterator());
    }

    @Override
    public void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override
    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override
    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        popStack();
        popStack();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override
    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean zP = ((q) popStack()).p();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return zP;
    }

    @Override
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double dQ = ((q) peekStack()).q();
        if (!isLenient() && (Double.isNaN(dQ) || Double.isInfinite(dQ))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dQ);
        }
        popStack();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return dQ;
    }

    @Override
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int iR = ((q) peekStack()).r();
        popStack();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return iR;
    }

    l nextJsonElement() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            l lVar = (l) peekStack();
            skipValue();
            return lVar;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long jS = ((q) peekStack()).s();
        popStack();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return jS;
    }

    @Override
    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        int i7 = this.stackSize;
        if (i7 > 0) {
            int[] iArr = this.pathIndices;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek == jsonToken || jsonTokenPeek == JsonToken.NUMBER) {
            String strU = ((q) popStack()).u();
            int i7 = this.stackSize;
            if (i7 > 0) {
                int[] iArr = this.pathIndices;
                int i8 = i7 - 1;
                iArr[i8] = iArr[i8] + 1;
            }
            return strU;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
    }

    @Override
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objPeekStack = peekStack();
        if (objPeekStack instanceof Iterator) {
            boolean z7 = this.stack[this.stackSize - 2] instanceof o;
            Iterator it = (Iterator) objPeekStack;
            if (!it.hasNext()) {
                return z7 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z7) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (objPeekStack instanceof o) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objPeekStack instanceof i) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objPeekStack instanceof q) {
            q qVar = (q) objPeekStack;
            if (qVar.A()) {
                return JsonToken.STRING;
            }
            if (qVar.v()) {
                return JsonToken.BOOLEAN;
            }
            if (qVar.x()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objPeekStack instanceof n) {
            return JsonToken.NULL;
        }
        if (objPeekStack == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objPeekStack.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new q((String) entry.getKey()));
    }

    @Override
    public void skipValue() throws IOException {
        int i7 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
        if (i7 == 1) {
            nextName(true);
            return;
        }
        if (i7 == 2) {
            endArray();
            return;
        }
        if (i7 == 3) {
            endObject();
            return;
        }
        if (i7 != 4) {
            popStack();
            int i8 = this.stackSize;
            if (i8 > 0) {
                int[] iArr = this.pathIndices;
                int i9 = i8 - 1;
                iArr[i9] = iArr[i9] + 1;
            }
        }
    }

    @Override
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + locationString();
    }

    @Override
    public String nextName() throws IOException {
        return nextName(false);
    }

    @Override
    public String getPath() {
        return getPath(false);
    }
}
