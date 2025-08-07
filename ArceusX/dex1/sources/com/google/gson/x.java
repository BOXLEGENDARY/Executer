package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

public abstract class x implements y {

    public static final x f19233d;

    public static final x f19234e;

    public static final x f19235i;

    public static final x f19236v;

    private static final x[] f19237w;

    enum a extends x {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override
        public Double c(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f19233d = aVar;
        x xVar = new x("LAZILY_PARSED_NUMBER", 1) {
            {
                a aVar2 = null;
            }

            @Override
            public Number c(JsonReader jsonReader) throws IOException {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
        };
        f19234e = xVar;
        x xVar2 = new x("LONG_OR_DOUBLE", 2) {
            {
                a aVar2 = null;
            }

            private Number e(String str, JsonReader jsonReader) throws NumberFormatException, IOException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e7) {
                    throw new p("Cannot parse " + str + "; at path " + jsonReader.getPreviousPath(), e7);
                }
            }

            @Override
            public Number c(JsonReader jsonReader) throws IOException, p {
                String strNextString = jsonReader.nextString();
                if (strNextString.indexOf(46) >= 0) {
                    return e(strNextString, jsonReader);
                }
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    return e(strNextString, jsonReader);
                }
            }
        };
        f19235i = xVar2;
        x xVar3 = new x("BIG_DECIMAL", 3) {
            {
                a aVar2 = null;
            }

            @Override
            public BigDecimal c(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return NumberLimits.parseBigDecimal(strNextString);
                } catch (NumberFormatException e7) {
                    throw new p("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e7);
                }
            }
        };
        f19236v = xVar3;
        f19237w = new x[]{aVar, xVar, xVar2, xVar3};
    }

    private x(String str, int i7) {
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f19237w.clone();
    }

    x(String str, int i7, a aVar) {
        this(str, i7);
    }
}
