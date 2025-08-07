package g0;

import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import h0.C2474a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0016\u0010)\u001a\u00020'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0016\u00100\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lg0/h;", "E", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "initialCapacity", "<init>", "(I)V", "b", "()Lg0/h;", BuildConfig.FLAVOR, "key", "d", "(J)Ljava/lang/Object;", BuildConfig.FLAVOR, "i", "(J)V", "index", "j", "value", "h", "(JLjava/lang/Object;)V", "k", "()I", "g", "(I)J", "l", "(I)Ljava/lang/Object;", "e", "(J)I", BuildConfig.FLAVOR, "c", "(J)Z", "a", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Z", "garbage", BuildConfig.FLAVOR, "[J", "keys", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "[Ljava/lang/Object;", "values", "v", "I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class h<E> implements Cloneable {

    public boolean garbage;

    public long[] keys;

    public Object[] values;

    public int size;

    public h() {
        this(0, 1, null);
    }

    public void a() {
        int i7 = this.size;
        Object[] objArr = this.values;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public h<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h<E> hVar = (h) objClone;
        hVar.keys = (long[]) this.keys.clone();
        hVar.values = (Object[]) this.values.clone();
        return hVar;
    }

    public boolean c(long key) {
        return e(key) >= 0;
    }

    public E d(long key) {
        int iB = C2474a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == i.f20930a) {
            return null;
        }
        return (E) this.values[iB];
    }

    public int e(long key) {
        if (this.garbage) {
            int i7 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != i.f20930a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.garbage = false;
            this.size = i8;
        }
        return C2474a.b(this.keys, this.size, key);
    }

    public long g(int index) {
        int i7;
        if (index < 0 || index >= (i7 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != i.f20930a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.garbage = false;
            this.size = i8;
        }
        return this.keys[index];
    }

    public void h(long key, E value) {
        int iB = C2474a.b(this.keys, this.size, key);
        if (iB >= 0) {
            this.values[iB] = value;
            return;
        }
        int i7 = ~iB;
        if (i7 < this.size && this.values[i7] == i.f20930a) {
            this.keys[i7] = key;
            this.values[i7] = value;
            return;
        }
        if (this.garbage) {
            int i8 = this.size;
            long[] jArr = this.keys;
            if (i8 >= jArr.length) {
                Object[] objArr = this.values;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != i.f20930a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.garbage = false;
                this.size = i9;
                i7 = ~C2474a.b(this.keys, i9, key);
            }
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iF = C2474a.f(i11 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i12 = this.size;
        if (i12 - i7 != 0) {
            long[] jArr2 = this.keys;
            int i13 = i7 + 1;
            kotlin.collections.i.f(jArr2, jArr2, i13, i7, i12);
            Object[] objArr2 = this.values;
            kotlin.collections.i.g(objArr2, objArr2, i13, i7, this.size);
        }
        this.keys[i7] = key;
        this.values[i7] = value;
        this.size++;
    }

    public void i(long key) {
        int iB = C2474a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == i.f20930a) {
            return;
        }
        this.values[iB] = i.f20930a;
        this.garbage = true;
    }

    public void j(int index) {
        if (this.values[index] != i.f20930a) {
            this.values[index] = i.f20930a;
            this.garbage = true;
        }
    }

    public int k() {
        if (this.garbage) {
            int i7 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != i.f20930a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.garbage = false;
            this.size = i8;
        }
        return this.size;
    }

    public E l(int index) {
        int i7;
        if (index < 0 || index >= (i7 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != i.f20930a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.garbage = false;
            this.size = i8;
        }
        return (E) this.values[index];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i7 = this.size;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(g(i8));
            sb.append('=');
            E eL = l(i8);
            if (eL != sb) {
                sb.append(eL);
            } else {
                sb.append(sMlEMqrxoGI.FCPGlOEbtTDvlL);
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public h(int i7) {
        if (i7 == 0) {
            this.keys = C2474a.f21014b;
            this.values = C2474a.f21015c;
        } else {
            int iF = C2474a.f(i7);
            this.keys = new long[iF];
            this.values = new Object[iF];
        }
    }

    public h(int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 10 : i7);
    }
}
