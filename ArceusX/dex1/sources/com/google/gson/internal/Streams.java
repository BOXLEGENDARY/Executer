package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

public final class Streams {
    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static l parse(JsonReader jsonReader) throws p {
        boolean z7;
        try {
            try {
                jsonReader.peek();
                z7 = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                } catch (EOFException e7) {
                    e = e7;
                    if (z7) {
                        return n.f19218d;
                    }
                    throw new t(e);
                }
            } catch (EOFException e8) {
                e = e8;
                z7 = true;
            }
        } catch (MalformedJsonException e9) {
            throw new t(e9);
        } catch (IOException e10) {
            throw new m(e10);
        } catch (NumberFormatException e11) {
            throw new t(e11);
        }
    }

    public static void write(l lVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, lVar);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    private static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite = new CurrentWrite();

        private static class CurrentWrite implements CharSequence {
            private String cachedString;
            private char[] chars;

            private CurrentWrite() {
            }

            @Override
            public char charAt(int i7) {
                return this.chars[i7];
            }

            @Override
            public int length() {
                return this.chars.length;
            }

            void setChars(char[] cArr) {
                this.chars = cArr;
                this.cachedString = null;
            }

            @Override
            public CharSequence subSequence(int i7, int i8) {
                return new String(this.chars, i7, i8 - i7);
            }

            @Override
            public String toString() {
                if (this.cachedString == null) {
                    this.cachedString = new String(this.chars);
                }
                return this.cachedString;
            }
        }

        AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
        }

        @Override
        public void write(char[] cArr, int i7, int i8) throws IOException {
            this.currentWrite.setChars(cArr);
            this.appendable.append(this.currentWrite, i7, i8 + i7);
        }

        @Override
        public Writer append(CharSequence charSequence) throws IOException {
            this.appendable.append(charSequence);
            return this;
        }

        @Override
        public void write(int i7) throws IOException {
            this.appendable.append((char) i7);
        }

        @Override
        public Writer append(CharSequence charSequence, int i7, int i8) throws IOException {
            this.appendable.append(charSequence, i7, i8);
            return this;
        }

        @Override
        public void write(String str, int i7, int i8) throws IOException {
            Objects.requireNonNull(str);
            this.appendable.append(str, i7, i8 + i7);
        }
    }
}
