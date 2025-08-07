package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import z.V;

public interface n extends AutoCloseable {

    public interface a {
        ByteBuffer c();

        int d();

        int e();
    }

    void B0(Rect rect);

    V D0();

    @Override
    void close();

    int getHeight();

    int getWidth();

    int i();

    Image l();

    a[] s();
}
