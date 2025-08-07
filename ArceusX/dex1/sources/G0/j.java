package g0;

import com.github.luben.zstd.BuildConfig;
import h0.C2475b;
import h0.C2476c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w7.Jld.EZYiRMRTxKdo;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&¨\u00063"}, d2 = {"Lg0/j;", BuildConfig.FLAVOR, "K", "V", BuildConfig.FLAVOR, "maxSize", "<init>", "(I)V", "key", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)I", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "l", "g", BuildConfig.FLAVOR, "evicted", "oldValue", "newValue", "b", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "j", "c", "()V", "i", "()I", "e", BuildConfig.FLAVOR, "k", "()Ljava/util/Map;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "I", "Lh0/c;", "Lh0/c;", "map", "Lh0/b;", "Lh0/b;", "lock", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class j<K, V> {

    private int maxSize;

    private final C2476c<K, V> map;

    private final C2475b lock;

    private int size;

    private int putCount;

    private int createCount;

    private int evictionCount;

    private int hitCount;

    private int missCount;

    public j(int i7) {
        this.maxSize = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new C2476c<>(0, 0.75f);
        this.lock = new C2475b();
    }

    private final int h(K key, V value) {
        int iJ = j(key, value);
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    protected V a(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    protected void b(boolean evicted, K key, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final void c() {
        l(-1);
    }

    public final V d(K key) {
        V v7;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            V vA = this.map.a(key);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vA2 = a(key);
            if (vA2 == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v7 = (V) this.map.d(key, vA2);
                    if (v7 != null) {
                        this.map.d(key, v7);
                    } else {
                        this.size += h(key, vA2);
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v7 != null) {
                b(false, key, vA2, v7);
                return v7;
            }
            l(this.maxSize);
            return vA2;
        }
    }

    public final int e() {
        int i7;
        synchronized (this.lock) {
            i7 = this.maxSize;
        }
        return i7;
    }

    public final V f(K key, V value) {
        V vD;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, EZYiRMRTxKdo.YYvPOMVVgIDdzz);
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += h(key, value);
                vD = this.map.d(key, value);
                if (vD != null) {
                    this.size -= h(key, vD);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vD != null) {
            b(false, key, vD, value);
        }
        l(this.maxSize);
        return vD;
    }

    public final V g(K key) {
        V vE;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                vE = this.map.e(key);
                if (vE != null) {
                    this.size -= h(key, vE);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vE != null) {
            b(false, key, vE, null);
        }
        return vE;
    }

    public final int i() {
        int i7;
        synchronized (this.lock) {
            i7 = this.size;
        }
        return i7;
    }

    protected int j(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public final Map<K, V> k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.map.b().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public void l(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g0.j.l(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i7 = this.hitCount;
                int i8 = this.missCount + i7;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
