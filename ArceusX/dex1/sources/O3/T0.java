package O3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class T0 {

    private final Map f3288a;

    private final Map f3289b;

    private final U4.d f3290c;

    T0(Map map, Map map2, U4.d dVar) {
        this.f3288a = map;
        this.f3289b = map2;
        this.f3290c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new Q0(byteArrayOutputStream, this.f3288a, this.f3289b, this.f3290c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
