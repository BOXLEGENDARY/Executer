package K3;

import java.io.IOException;

public final class N0 extends IOException {
    public N0(String str) {
        super(str);
    }

    public N0(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
