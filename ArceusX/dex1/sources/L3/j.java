package L3;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class j {

    private static final Logger f2046a = Logger.getLogger(j.class.getName());

    private j() {
    }

    public static void a(@NullableDecl InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                try {
                    f2046a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e7);
                } catch (IOException e8) {
                    throw new AssertionError(e8);
                }
            }
        }
    }
}
