package k8;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u001bBO\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Lk8/d;", "", "", "Lk8/d$a;", "", "buttons", "message", Title.type, "", "cancelable", "Lkotlin/Function1;", "Lk8/d$b;", "", "onEvent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "e", "d", "Z", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class AlertScreen {

    @NotNull
    private final Map<a, String> buttons;

    @NotNull
    private final String message;

    @NotNull
    private final String title;

    private final boolean cancelable;

    @NotNull
    private final Function1<b, Unit> onEvent;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lk8/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public enum a {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lk8/d$b;", "", "<init>", "()V", "a", "b", "Lk8/d$b$a;", "Lk8/d$b$b;", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk8/d$b$a;", "Lk8/d$b;", "Lk8/d$a;", "button", "<init>", "(Lk8/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk8/d$a;", "getButton", "()Lk8/d$a;", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        public static final class ButtonClicked extends b {

            @NotNull
            private final a button;

            public ButtonClicked(@NotNull a aVar) {
                super(null);
                Intrinsics.checkNotNullParameter(aVar, "button");
                this.button = aVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonClicked) && this.button == ((ButtonClicked) other).button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return "ButtonClicked(button=" + this.button + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk8/d$b$b;", "Lk8/d$b;", "<init>", "()V", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        public static final class C0237b extends b {

            @NotNull
            public static final C0237b a = new C0237b();

            private C0237b() {
                super(null);
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public AlertScreen(@NotNull Map<a, String> map, @NotNull String str, @NotNull String str2, boolean z, @NotNull Function1<? super b, Unit> function1) {
        Intrinsics.checkNotNullParameter(map, "buttons");
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, Title.type);
        Intrinsics.checkNotNullParameter(function1, "onEvent");
        this.buttons = map;
        this.message = str;
        this.title = str2;
        this.cancelable = z;
        this.onEvent = function1;
    }

    @NotNull
    public final Map<a, String> a() {
        return this.buttons;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Function1<b, Unit> d() {
        return this.onEvent;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.b(AlertScreen.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
        }
        AlertScreen alertScreen = (AlertScreen) other;
        return Intrinsics.b(this.buttons, alertScreen.buttons) && Intrinsics.b(this.message, alertScreen.message) && Intrinsics.b(this.title, alertScreen.title) && this.cancelable == alertScreen.cancelable;
    }

    public int hashCode() {
        return (((((this.buttons.hashCode() * 31) + this.message.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.cancelable);
    }

    @NotNull
    public String toString() {
        return "AlertScreen(buttons=" + this.buttons + ", message=" + this.message + ", title=" + this.title + ", cancelable=" + this.cancelable + ", onEvent=" + this.onEvent + ')';
    }

    public AlertScreen(Map map, String str, String str2, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? F.h() : map, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? true : z, function1);
    }
}
