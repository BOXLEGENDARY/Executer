package s2;

import A2.InterfaceC0247d;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

abstract class u implements Closeable {

    interface a {
        u a();

        a b(Context context);
    }

    u() {
    }

    abstract InterfaceC0247d b();

    @Override
    public void close() throws IOException {
        b().close();
    }

    abstract t e();
}
