package g0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Lg0/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "minCapacity", "<init>", "(I)V", BuildConfig.FLAVOR, "c", "()V", "element", "a", "e", "()I", "b", BuildConfig.FLAVOR, "d", "()Z", BuildConfig.FLAVOR, "[I", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    private int[] elements;

    private int head;

    private int tail;

    private int capacityBitmask;

    public e() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i7 = this.head;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i9];
        kotlin.collections.i.e(iArr, iArr2, 0, i7, length);
        kotlin.collections.i.e(this.elements, iArr2, i8, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i9 - 1;
    }

    public final void a(int element) {
        int[] iArr = this.elements;
        int i7 = this.tail;
        iArr[i7] = element;
        int i8 = this.capacityBitmask & (i7 + 1);
        this.tail = i8;
        if (i8 == this.head) {
            c();
        }
    }

    public final void b() {
        this.tail = this.head;
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    public final int e() {
        int i7 = this.head;
        if (i7 == this.tail) {
            f fVar = f.f20922a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = this.elements[i7];
        this.head = (i7 + 1) & this.capacityBitmask;
        return i8;
    }

    public e(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.capacityBitmask = i7 - 1;
        this.elements = new int[i7];
    }

    public e(int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 8 : i7);
    }
}
