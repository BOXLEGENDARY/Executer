package R3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class C0 {

    private final Map f5129a;

    private final Map f5130b;

    private final U4.d f5131c;

    C0(Map map, Map map2, U4.d dVar) {
        this.f5129a = map;
        this.f5130b = map2;
        this.f5131c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1213z0(byteArrayOutputStream, this.f5129a, this.f5130b, this.f5131c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
