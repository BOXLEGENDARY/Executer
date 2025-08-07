package i8;

import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.ViewEnvironmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Li8/a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "a", "i", "v", "w", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class EnumC0589a {
    None,
    First,
    Other;


    @NotNull
    private static final EnumC0589a e = new EnumC0589a();

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li8/a$a;", "Lcom/squareup/workflow1/ui/z;", "Li8/a;", "<init>", "()V", "default", "Li8/a;", "b", "()Li8/a;", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion extends ViewEnvironmentKey<EnumC0589a> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public EnumC0589a a() {
            return EnumC0589a.e;
        }

        private Companion() {
            super(z.b(EnumC0589a.class));
        }
    }

    static {
    }

    private EnumC0589a() {
    }

    public static EnumC0589a valueOf(String str) {
        return (EnumC0589a) Enum.valueOf(EnumC0589a.class, str);
    }

    public static EnumC0589a[] values() {
        return (EnumC0589a[]) y.clone();
    }
}
