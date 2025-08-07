package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lwa/s;", "Output", "Lwa/o;", "Lkotlin/Function2;", "", "", "isNegativeSetter", "withPlusSign", "", "whatThisExpects", "<init>", "(Lkotlin/jvm/functions/Function2;ZLjava/lang/String;)V", "storage", "", "input", "", "startIndex", "Lwa/k;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "b", "Z", "c", "Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class s<Output> implements o<Output> {

    @NotNull
    private final Function2<Output, Boolean, Unit> isNegativeSetter;

    private final boolean withPlusSign;

    @NotNull
    private final String whatThisExpects;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<String> {
        final s<Output> d;
        final char e;

        a(s<Output> sVar, char c) {
            super(0);
            this.d = sVar;
            this.e = c;
        }

        @NotNull
        public final String invoke() {
            return "Expected " + ((s) this.d).whatThisExpects + " but got " + this.e;
        }
    }

    public s(@NotNull Function2<? super Output, ? super Boolean, Unit> function2, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(function2, "isNegativeSetter");
        Intrinsics.checkNotNullParameter(str, "whatThisExpects");
        this.isNegativeSetter = function2;
        this.withPlusSign = z;
        this.whatThisExpects = str;
    }

    @Override
    @NotNull
    public Object a(Output storage, @NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (startIndex >= input.length()) {
            return k.INSTANCE.b(startIndex);
        }
        char cCharAt = input.charAt(startIndex);
        if (cCharAt == '-') {
            this.isNegativeSetter.invoke(storage, Boolean.TRUE);
            return k.INSTANCE.b(startIndex + 1);
        }
        if (cCharAt != '+' || !this.withPlusSign) {
            return k.INSTANCE.a(startIndex, new a(this, cCharAt));
        }
        this.isNegativeSetter.invoke(storage, Boolean.FALSE);
        return k.INSTANCE.b(startIndex + 1);
    }

    @NotNull
    public String getWhatThisExpects() {
        return this.whatThisExpects;
    }
}
