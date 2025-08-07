package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wa.g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwa/b;", "Receiver", "Lwa/e;", "", "expected", "<init>", "(Ljava/lang/String;)V", "storage", "", "input", "", "start", "end", "Lwa/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lwa/g;", "c", "Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b<Receiver> extends e<Receiver> {

    @NotNull
    private final String expected;

    public b(@NotNull String str) {
        super(Integer.valueOf(str.length()), "the predefined string " + str, null);
        Intrinsics.checkNotNullParameter(str, "expected");
        this.expected = str;
    }

    @Override
    public g a(Receiver storage, @NotNull CharSequence input, int start, int end) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.b(input.subSequence(start, end).toString(), this.expected)) {
            return null;
        }
        return new g.e(this.expected);
    }
}
