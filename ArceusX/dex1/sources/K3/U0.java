package K3;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

final class U0 {
    static final T0 a(InputStream inputStream, W0 w02) throws N0 {
        try {
            return b(inputStream, w02);
        } finally {
            try {
                w02.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final T0 b(InputStream inputStream, W0 w02) throws N0, J0 {
        try {
            V0 v0E = w02.e();
            if (v0E == null) {
                throw new N0("Parser being asked to parse an empty input stream");
            }
            try {
                byte bA = v0E.a();
                byte b2 = v0E.b();
                int i7 = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long jB = w02.b();
                    if (jB > 1000) {
                        throw new N0("Parser being asked to read a large CBOR array");
                    }
                    c(bA, jB, inputStream, w02);
                    T0[] t0Arr = new T0[(int) jB];
                    while (i7 < jB) {
                        t0Arr[i7] = b(inputStream, w02);
                        i7++;
                    }
                    return new K0(A.o(t0Arr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new N0("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new L0(w02.j());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long jZzb = w02.zzb();
                        c(bA, jZzb > 0 ? jZzb : ~jZzb, inputStream, w02);
                        return new O0(jZzb);
                    }
                    if (b2 == 64) {
                        byte[] bArrM = w02.m();
                        int length = bArrM.length;
                        c(bA, length, inputStream, w02);
                        return new M0(B0.q(bArrM, 0, length));
                    }
                    if (b2 == 96) {
                        String strF = w02.f();
                        c(bA, strF.length(), inputStream, w02);
                        return new R0(strF);
                    }
                    throw new N0("Unidentifiable major type: " + v0E.c());
                }
                long jA = w02.a();
                if (jA > 1000) {
                    throw new N0("Parser being asked to read a large CBOR map");
                }
                c(bA, jA, inputStream, w02);
                int i8 = (int) jA;
                P0[] p0Arr = new P0[i8];
                T0 t02 = null;
                int i9 = 0;
                while (i9 < jA) {
                    T0 t0B = b(inputStream, w02);
                    if (t02 != null && t0B.compareTo(t02) <= 0) {
                        throw new J0(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", t02.toString(), t0B.toString()));
                    }
                    p0Arr[i9] = new P0(t0B, b(inputStream, w02));
                    i9++;
                    t02 = t0B;
                }
                TreeMap treeMap = new TreeMap();
                while (i7 < i8) {
                    P0 p02 = p0Arr[i7];
                    if (treeMap.containsKey(p02.a())) {
                        throw new J0("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(p02.a(), p02.b());
                    i7++;
                }
                return new Q0(I.f(treeMap));
            } catch (IOException e7) {
                e = e7;
                throw new N0("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e8) {
                e = e8;
                throw new N0("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e9) {
            throw new N0("Error in decoding CborValue from bytes", e9);
        }
    }

    private static final void c(byte b2, long j7, InputStream inputStream, W0 w02) throws IOException {
        switch (b2) {
            case 24:
                if (j7 >= 24) {
                    return;
                }
                throw new J0("Integer value " + j7 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j7 >= 256) {
                    return;
                }
                throw new J0("Integer value " + j7 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j7 >= 65536) {
                    return;
                }
                throw new J0("Integer value " + j7 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j7 >= 4294967296L) {
                    return;
                }
                throw new J0("Integer value " + j7 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
