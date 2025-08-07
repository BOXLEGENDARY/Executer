package t;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import z.C3043d0;

public class U {

    private final a f23727a;

    private final w.m f23728b;

    private final Map<Integer, Size[]> f23729c = new HashMap();

    private final Map<Integer, Size[]> f23730d = new HashMap();

    private final Map<Class<?>, Size[]> f23731e = new HashMap();

    interface a {
        StreamConfigurationMap a();

        Size[] b(int i7);

        Size[] c(int i7);

        int[] d();
    }

    private U(StreamConfigurationMap streamConfigurationMap, w.m mVar) {
        this.f23727a = new V(streamConfigurationMap);
        this.f23728b = mVar;
    }

    static U e(StreamConfigurationMap streamConfigurationMap, w.m mVar) {
        return new U(streamConfigurationMap, mVar);
    }

    public Size[] a(int i7) {
        if (this.f23730d.containsKey(Integer.valueOf(i7))) {
            if (this.f23730d.get(Integer.valueOf(i7)) == null) {
                return null;
            }
            return (Size[]) this.f23730d.get(Integer.valueOf(i7)).clone();
        }
        Size[] sizeArrB = this.f23727a.b(i7);
        if (sizeArrB != null && sizeArrB.length > 0) {
            sizeArrB = this.f23728b.b(sizeArrB, i7);
        }
        this.f23730d.put(Integer.valueOf(i7), sizeArrB);
        if (sizeArrB != null) {
            return (Size[]) sizeArrB.clone();
        }
        return null;
    }

    public int[] b() {
        int[] iArrD = this.f23727a.d();
        if (iArrD == null) {
            return null;
        }
        return (int[]) iArrD.clone();
    }

    public Size[] c(int i7) {
        if (this.f23729c.containsKey(Integer.valueOf(i7))) {
            if (this.f23729c.get(Integer.valueOf(i7)) == null) {
                return null;
            }
            return (Size[]) this.f23729c.get(Integer.valueOf(i7)).clone();
        }
        Size[] sizeArrC = this.f23727a.c(i7);
        if (sizeArrC != null && sizeArrC.length != 0) {
            Size[] sizeArrB = this.f23728b.b(sizeArrC, i7);
            this.f23729c.put(Integer.valueOf(i7), sizeArrB);
            return (Size[]) sizeArrB.clone();
        }
        C3043d0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i7);
        return sizeArrC;
    }

    public StreamConfigurationMap d() {
        return this.f23727a.a();
    }
}
