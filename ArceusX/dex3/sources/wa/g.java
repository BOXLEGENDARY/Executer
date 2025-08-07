package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0005\u0003\u0005\u0006\u0007\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lwa/g;", "", "", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwa/g$a;", "Lwa/g;", "", "conflicting", "<init>", "(Ljava/lang/Object;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Object;", "getConflicting", "()Ljava/lang/Object;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements g {

        @NotNull
        private final Object conflicting;

        public a(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "conflicting");
            this.conflicting = obj;
        }

        @Override
        @NotNull
        public String a() {
            return "attempted to overwrite the existing value '" + this.conflicting + '\'';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwa/g$b;", "Lwa/g;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements g {

        @NotNull
        public static final b a = new b();

        private b() {
        }

        @Override
        @NotNull
        public String a() {
            return "expected an Int value";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwa/g$c;", "Lwa/g;", "", "minDigits", "<init>", "(I)V", "", "a", "()Ljava/lang/String;", "I", "getMinDigits", "()I", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements g {

        private final int minDigits;

        public c(int i) {
            this.minDigits = i;
        }

        @Override
        @NotNull
        public String a() {
            return "expected at least " + this.minDigits + " digits";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwa/g$d;", "Lwa/g;", "", "maxDigits", "<init>", "(I)V", "", "a", "()Ljava/lang/String;", "I", "getMaxDigits", "()I", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d implements g {

        private final int maxDigits;

        public d(int i) {
            this.maxDigits = i;
        }

        @Override
        @NotNull
        public String a() {
            return "expected at most " + this.maxDigits + " digits";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lwa/g$e;", "Lwa/g;", "", "expected", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Ljava/lang/String;", "getExpected", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class e implements g {

        @NotNull
        private final String expected;

        public e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "expected");
            this.expected = str;
        }

        @Override
        @NotNull
        public String a() {
            return "expected '" + this.expected + '\'';
        }
    }

    @NotNull
    String a();
}
