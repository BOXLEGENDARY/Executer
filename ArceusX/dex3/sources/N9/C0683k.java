package n9;

import android.text.InputFilter;
import android.text.Spanned;
import com.roblox.client.personasdk.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln9/k;", "Landroid/text/InputFilter;", "", "precision", "<init>", "(I)V", "", "source", "start", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;", "a", "I", "Ljava/util/regex/Pattern;", "b", "LP9/h;", "()Ljava/util/regex/Pattern;", "pattern", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0683k implements InputFilter {

    private final int precision;

    @NotNull
    private final P9.h pattern = P9.i.b(new a());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<Pattern> {
        a() {
            super(0);
        }

        public final Pattern invoke() {
            return Pattern.compile("-?[0-9]*+((\\.[0-9]{0," + C0683k.this.precision + "})?)||(\\.)?");
        }
    }

    public C0683k(int i) {
        this.precision = i;
    }

    private final Pattern b() {
        Object value = this.pattern.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Pattern) value;
    }

    @Override
    public CharSequence filter(@NotNull CharSequence source, int start, int end, @NotNull Spanned dest, int dstart, int dend) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        CharSequence charSequenceSubSequence = source.subSequence(start, end);
        CharSequence charSequenceSubSequence2 = dest.subSequence(0, dstart);
        CharSequence charSequenceSubSequence3 = dest.subSequence(dend, dest.length());
        StringBuilder sb = new StringBuilder();
        sb.append((Object) charSequenceSubSequence2);
        sb.append((Object) charSequenceSubSequence);
        sb.append((Object) charSequenceSubSequence3);
        Matcher matcher = b().matcher(StringsKt.y(sb.toString(), ',', '.', false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return null;
        }
        return source.length() == 0 ? dest.subSequence(dstart, dend) : "";
    }
}
