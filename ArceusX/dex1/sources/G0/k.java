package g0;

import com.github.luben.zstd.BuildConfig;
import h0.C2474a;
import j0.tkB.pkcpMQSgx;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010<R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010B¨\u0006C"}, d2 = {"Lg0/k;", "K", "V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "capacity", "<init>", "(I)V", "map", "(Lg0/k;)V", BuildConfig.FLAVOR, "clear", "()V", "minimumCapacity", "b", "key", BuildConfig.FLAVOR, "containsKey", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "value", "a", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", "k", "j", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "h", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "i", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hash", "c", "(Ljava/lang/Object;I)I", "f", BuildConfig.FLAVOR, "[I", "hashes", BuildConfig.FLAVOR, "e", "[Ljava/lang/Object;", "array", "I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class k<K, V> {

    private int[] hashes;

    private Object[] array;

    private int size;

    public k() {
        this(0, 1, null);
    }

    private final int c(K key, int hash) {
        int i7 = this.size;
        if (i7 == 0) {
            return -1;
        }
        int iA = C2474a.a(this.hashes, i7, hash);
        if (iA < 0 || Intrinsics.b(key, this.array[iA << 1])) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.hashes[i8] == hash) {
            if (Intrinsics.b(key, this.array[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.hashes[i9] == hash; i9--) {
            if (Intrinsics.b(key, this.array[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    private final int f() {
        int i7 = this.size;
        if (i7 == 0) {
            return -1;
        }
        int iA = C2474a.a(this.hashes, i7, 0);
        if (iA < 0 || this.array[iA << 1] == null) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.hashes[i8] == 0) {
            if (this.array[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.hashes[i9] == 0; i9--) {
            if (this.array[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final int a(V value) {
        int i7 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (Intrinsics.b(value, objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public void b(int minimumCapacity) {
        int i7 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
        }
        if (this.size != i7) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = C2474a.f21013a;
            this.array = C2474a.f21015c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return d(key) >= 0;
    }

    public boolean containsValue(V value) {
        return a(value) >= 0;
    }

    public int d(K key) {
        return key == null ? f() : c(key, key.hashCode());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof k) {
                if (getSize() != ((k) other).getSize()) {
                    return false;
                }
                k kVar = (k) other;
                int i7 = this.size;
                for (int i8 = 0; i8 < i7; i8++) {
                    K kG = g(i8);
                    V vK = k(i8);
                    Object obj = kVar.get(kG);
                    if (vK == null) {
                        if (obj != null || !kVar.containsKey(kG)) {
                            return false;
                        }
                    } else if (!Intrinsics.b(vK, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i9 = this.size;
            for (int i10 = 0; i10 < i9; i10++) {
                K kG2 = g(i10);
                V vK2 = k(i10);
                Object obj2 = ((Map) other).get(kG2);
                if (vK2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kG2)) {
                        return false;
                    }
                } else if (!Intrinsics.b(vK2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K g(int index) {
        if (index >= 0 && index < this.size) {
            return (K) this.array[index << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public V get(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return (V) this.array[(iD << 1) + 1];
        }
        return null;
    }

    public V getOrDefault(Object key, V defaultValue) {
        int iD = d(key);
        return iD >= 0 ? (V) this.array[(iD << 1) + 1] : defaultValue;
    }

    public void h(k<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i7 = map.size;
        b(this.size + i7);
        if (this.size != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(map.g(i8), map.k(i8));
            }
        } else if (i7 > 0) {
            kotlin.collections.i.e(map.hashes, this.hashes, 0, 0, i7);
            kotlin.collections.i.g(map.array, this.array, 0, 0, i7 << 1);
            this.size = i7;
        }
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i7 = this.size;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    public V i(int index) {
        int i7;
        if (index < 0 || index >= (i7 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
        }
        Object[] objArr = this.array;
        int i8 = index << 1;
        V v7 = (V) objArr[i8 + 1];
        if (i7 <= 1) {
            clear();
        } else {
            int i9 = i7 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (index < i9) {
                    int i10 = index + 1;
                    kotlin.collections.i.e(iArr, iArr, index, i10, i7);
                    Object[] objArr2 = this.array;
                    kotlin.collections.i.g(objArr2, objArr2, i8, i10 << 1, i7 << 1);
                }
                Object[] objArr3 = this.array;
                int i11 = i9 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                int i12 = i7 > 8 ? i7 + (i7 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                this.hashes = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.array, i12 << 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                this.array = objArrCopyOf;
                if (i7 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (index > 0) {
                    kotlin.collections.i.e(iArr, this.hashes, 0, 0, index);
                    kotlin.collections.i.g(objArr, this.array, 0, 0, i8);
                }
                if (index < i9) {
                    int i13 = index + 1;
                    kotlin.collections.i.e(iArr, this.hashes, index, i13, i7);
                    kotlin.collections.i.g(objArr, this.array, i8, i13 << 1, i7 << 1);
                }
            }
            if (i7 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i9;
        }
        return v7;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V j(int index, V value) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException((pkcpMQSgx.yuKUAULzf + index).toString());
        }
        int i7 = (index << 1) + 1;
        Object[] objArr = this.array;
        V v7 = (V) objArr[i7];
        objArr[i7] = value;
        return v7;
    }

    public V k(int index) {
        if (index >= 0 && index < this.size) {
            return (V) this.array[(index << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public V put(K key, V value) {
        int i7 = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iC = key != null ? c(key, iHashCode) : f();
        if (iC >= 0) {
            int i8 = (iC << 1) + 1;
            Object[] objArr = this.array;
            V v7 = (V) objArr[i8];
            objArr[i8] = value;
            return v7;
        }
        int i9 = ~iC;
        int[] iArr = this.hashes;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i10 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i7 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.hashes;
            int i11 = i9 + 1;
            kotlin.collections.i.e(iArr2, iArr2, i11, i9, i7);
            Object[] objArr2 = this.array;
            kotlin.collections.i.g(objArr2, objArr2, i11 << 1, i9 << 1, this.size << 1);
        }
        int i12 = this.size;
        if (i7 == i12) {
            int[] iArr3 = this.hashes;
            if (i9 < iArr3.length) {
                iArr3[i9] = iHashCode;
                Object[] objArr3 = this.array;
                int i13 = i9 << 1;
                objArr3[i13] = key;
                objArr3[i13 + 1] = value;
                this.size = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K key, V value) {
        V v7 = get(key);
        return v7 == null ? put(key, value) : v7;
    }

    public V remove(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return i(iD);
        }
        return null;
    }

    public V replace(K key, V value) {
        int iD = d(key);
        if (iD >= 0) {
            return j(iD, value);
        }
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i7 = this.size;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            K kG = g(i8);
            if (kG != sb) {
                sb.append(kG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vK = k(i8);
            if (vK != sb) {
                sb.append(vK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public k(int i7) {
        this.hashes = i7 == 0 ? C2474a.f21013a : new int[i7];
        this.array = i7 == 0 ? C2474a.f21015c : new Object[i7 << 1];
    }

    public boolean remove(K key, V value) {
        int iD = d(key);
        if (iD < 0 || !Intrinsics.b(value, k(iD))) {
            return false;
        }
        i(iD);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iD = d(key);
        if (iD < 0 || !Intrinsics.b(oldValue, k(iD))) {
            return false;
        }
        j(iD, newValue);
        return true;
    }

    public k(int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7);
    }

    public k(k<? extends K, ? extends V> kVar) {
        this(0, 1, null);
        if (kVar != null) {
            h(kVar);
        }
    }
}
