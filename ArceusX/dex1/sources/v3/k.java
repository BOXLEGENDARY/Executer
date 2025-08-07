package v3;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public final class k {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return c(inputStream, outputStream, false, 1024);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z7, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        long j7 = 0;
        while (true) {
            try {
                int i8 = inputStream.read(bArr, 0, i7);
                if (i8 == -1) {
                    break;
                }
                j7 += i8;
                outputStream.write(bArr, 0, i8);
            } catch (Throwable th) {
                if (z7) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z7) {
            a(inputStream);
            a(outputStream);
        }
        return j7;
    }

    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z7) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z7, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
