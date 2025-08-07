package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

class d {
    static int a(int i7) {
        return ((i7 + 7) & (-8)) / 8;
    }

    static byte[] b(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    static byte[] d(InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = inputStream.read(bArr, i8, i7 - i8);
            if (i9 < 0) {
                throw c("Not enough bytes to read: " + i7);
            }
            i8 += i9;
        }
        return bArr;
    }

    static byte[] e(InputStream inputStream, int i7, int i8) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int i10 = inputStream.read(bArr2);
                if (i10 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i10);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i8 - iInflate);
                    i9 += i10;
                } catch (DataFormatException e7) {
                    throw c(e7.getMessage());
                }
            }
            if (i9 == i7) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw c("Inflater did not finish");
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    static String f(InputStream inputStream, int i7) throws IOException {
        return new String(d(inputStream, i7), StandardCharsets.UTF_8);
    }

    static long g(InputStream inputStream, int i7) throws IOException {
        byte[] bArrD = d(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += (bArrD[i8] & 255) << (i8 * 8);
        }
        return j7;
    }

    static int h(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    static long i(InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    static int j(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i7);
            }
        }
    }

    static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream, long j7, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void p(OutputStream outputStream, int i7) throws IOException {
        o(outputStream, i7, 2);
    }

    static void q(OutputStream outputStream, long j7) throws IOException {
        o(outputStream, j7, 4);
    }

    static void r(OutputStream outputStream, int i7) throws IOException {
        o(outputStream, i7, 1);
    }
}
