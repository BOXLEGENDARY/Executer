package fb;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfb/r;", "", "", Text.type, "", "char", "Lfb/s;", "mode", "<init>", "(Ljava/lang/String;CLfb/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "C", "()C", "Lfb/s;", "()Lfb/s;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
final class TrimArguments {

    @NotNull
    private final String text;

    private final char char;

    @NotNull
    private final s mode;

    public TrimArguments(@NotNull String str, char c, @NotNull s sVar) {
        Intrinsics.checkNotNullParameter(str, Text.type);
        Intrinsics.checkNotNullParameter(sVar, "mode");
        this.text = str;
        this.char = c;
        this.mode = sVar;
    }

    public final char getChar() {
        return this.char;
    }

    @NotNull
    public final s getMode() {
        return this.mode;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrimArguments)) {
            return false;
        }
        TrimArguments trimArguments = (TrimArguments) other;
        return Intrinsics.b(this.text, trimArguments.text) && this.char == trimArguments.char && Intrinsics.b(this.mode, trimArguments.mode);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Character.hashCode(this.char)) * 31) + this.mode.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrimArguments(text=" + this.text + ", char=" + this.char + ", mode=" + this.mode + ")";
    }
}
