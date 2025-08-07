package Q3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class C0938o {

    private final Map f4519a;

    private final Map f4520b;

    private final U4.d f4521c;

    C0938o(Map map, Map map2, U4.d dVar) {
        this.f4519a = map;
        this.f4520b = map2;
        this.f4521c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C0917l(byteArrayOutputStream, this.f4519a, this.f4520b, this.f4521c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
