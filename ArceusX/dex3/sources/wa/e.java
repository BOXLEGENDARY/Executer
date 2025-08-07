package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u001b\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lwa/e;", "Receiver", "", "", "length", "", "whatThisExpects", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "storage", "", "input", "start", "end", "Lwa/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lwa/g;", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lwa/b;", "Lwa/d;", "Lwa/v;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class e<Receiver> {

    private final Integer length;

    @NotNull
    private final String whatThisExpects;

    public e(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str);
    }

    public abstract g a(Receiver storage, @NotNull CharSequence input, int start, int end);

    public Integer getLength() {
        return this.length;
    }

    @NotNull
    public final String getWhatThisExpects() {
        return this.whatThisExpects;
    }

    private e(Integer num, String str) {
        this.length = num;
        this.whatThisExpects = str;
    }
}
