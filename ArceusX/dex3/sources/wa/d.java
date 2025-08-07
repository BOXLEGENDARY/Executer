package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ta.C0804a;
import wa.g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwa/d;", "Receiver", "Lwa/e;", "", "minLength", "maxLength", "Lwa/a;", "Lta/a;", "setter", "", "name", "<init>", "(IILwa/a;Ljava/lang/String;)V", "storage", "", "input", "start", "end", "Lwa/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lwa/g;", "c", "I", "d", "e", "Lwa/a;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d<Receiver> extends e<Receiver> {

    private final int minLength;

    private final int maxLength;

    @NotNull
    private final a<Receiver, C0804a> setter;

    public d(int i, int i2, @NotNull a<? super Receiver, C0804a> aVar, @NotNull String str) {
        super(i == i2 ? Integer.valueOf(i) : null, str, null);
        Intrinsics.checkNotNullParameter(aVar, "setter");
        Intrinsics.checkNotNullParameter(str, "name");
        this.minLength = i;
        this.maxLength = i2;
        this.setter = aVar;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i + " for field " + getWhatThisExpects() + ": expected 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("Invalid maximum length " + i2 + " for field " + getWhatThisExpects() + ": expected " + i + "..9").toString());
        }
    }

    @Override
    public g a(Receiver storage, @NotNull CharSequence input, int start, int end) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i = end - start;
        int i2 = this.minLength;
        if (i < i2) {
            return new g.c(i2);
        }
        int i3 = this.maxLength;
        return i > i3 ? new g.d(i3) : f.f(this.setter, storage, new C0804a(f.d(input, start, end), i));
    }
}
