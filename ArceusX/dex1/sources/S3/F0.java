package S3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class F0 {

    private final Map f6461a;

    private final Map f6462b;

    private final U4.d f6463c;

    F0(Map map, Map map2, U4.d dVar) {
        this.f6461a = map;
        this.f6462b = map2;
        this.f6463c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C0(byteArrayOutputStream, this.f6461a, this.f6462b, this.f6463c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
