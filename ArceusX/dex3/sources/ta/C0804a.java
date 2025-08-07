package ta;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lta/a;", "", "", "fractionalPart", "digits", "<init>", "(II)V", "newDigits", "e", "(I)I", "other", "c", "(Lta/a;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "d", "I", "getFractionalPart", "getDigits", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0804a implements Comparable<C0804a> {

    private final int fractionalPart;

    private final int digits;

    public C0804a(int i, int i2) {
        this.fractionalPart = i;
        this.digits = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Digits must be non-negative, but was " + i2).toString());
    }

    @Override
    public int compareTo(@NotNull C0804a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iMax = Math.max(this.digits, other.digits);
        return Intrinsics.g(e(iMax), other.e(iMax));
    }

    public final int e(int newDigits) {
        int i = this.digits;
        if (newDigits == i) {
            return this.fractionalPart;
        }
        if (newDigits <= i) {
            return this.fractionalPart / C0806c.b()[this.digits - newDigits];
        }
        return C0806c.b()[newDigits - this.digits] * this.fractionalPart;
    }

    public boolean equals(Object other) {
        return (other instanceof C0804a) && compareTo((C0804a) other) == 0;
    }

    public int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = C0806c.b()[this.digits];
        sb.append(this.fractionalPart / i);
        sb.append('.');
        sb.append(StringsKt.n0(String.valueOf(i + (this.fractionalPart % i)), "1"));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
