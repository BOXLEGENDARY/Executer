package Y1;

import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public interface d extends Closeable {
    boolean isSuccessful();

    String l0();

    String p0();

    @NonNull
    InputStream w0() throws IOException;
}
