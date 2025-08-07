package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ta.C0807d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lwa/r;", "Output", "Lwa/o;", "", "string", "<init>", "(Ljava/lang/String;)V", "storage", "", "input", "", "startIndex", "Lwa/k;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "b", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class r<Output> implements o<Output> {

    @NotNull
    private final String string;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<String> {
        final r<Output> d;

        a(r<Output> rVar) {
            super(0);
            this.d = rVar;
        }

        @NotNull
        public final String invoke() {
            return "Unexpected end of input: yet to parse '" + this.d.getString() + '\'';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function0<String> {
        final r<Output> d;
        final CharSequence e;
        final int i;
        final int v;

        b(r<Output> rVar, CharSequence charSequence, int i, int i2) {
            super(0);
            this.d = rVar;
            this.e = charSequence;
            this.i = i;
            this.v = i2;
        }

        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(this.d.getString());
            sb.append(" but got ");
            CharSequence charSequence = this.e;
            int i = this.i;
            sb.append(charSequence.subSequence(i, this.v + i + 1).toString());
            return sb.toString();
        }
    }

    public r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        this.string = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (C0807d.b(str.charAt(0))) {
            throw new IllegalArgumentException(("String '" + str + "' starts with a digit").toString());
        }
        if (C0807d.b(str.charAt(str.length() - 1))) {
            throw new IllegalArgumentException(("String '" + str + "' ends with a digit").toString());
        }
    }

    @Override
    @NotNull
    public Object a(Output storage, @NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.string.length() + startIndex > input.length()) {
            return k.INSTANCE.a(startIndex, new a(this));
        }
        int length = this.string.length();
        for (int i = 0; i < length; i++) {
            if (input.charAt(startIndex + i) != this.string.charAt(i)) {
                return k.INSTANCE.a(startIndex, new b(this, input, startIndex, i));
            }
        }
        return k.INSTANCE.b(startIndex + this.string.length());
    }

    @NotNull
    public final String getString() {
        return this.string;
    }

    @NotNull
    public String toString() {
        return '\'' + this.string + '\'';
    }
}
