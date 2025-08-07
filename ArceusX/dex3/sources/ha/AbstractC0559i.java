package ha;

import P9.m;
import com.roblox.client.personasdk.R;
import ha.InterfaceC0552b;
import ha.InterfaceC0558h;
import ha.InterfaceC0560j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0007\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Le9/i;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "stepName", "b", "c", "d", "e", "f", "g", "Le9/i$a;", "Le9/i$b;", "Le9/i$c;", "Le9/i$d;", "Le9/i$e;", "Le9/i$f;", "Le9/i$g;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class AbstractC0559i {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Le9/i$a;", "Le9/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a extends AbstractC0559i {

        @NotNull
        private final String stepName;

        public a(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            this.stepName = str;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.b(this.stepName, ((a) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-registration";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le9/i$b;", "Le9/i;", "", "stepName", "Le9/b;", "subPage", "<init>", "(Ljava/lang/String;Le9/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Le9/b;", "getSubPage", "()Le9/b;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b extends AbstractC0559i {

        @NotNull
        private final String stepName;

        @NotNull
        private final InterfaceC0552b subPage;

        public b(@NotNull String str, @NotNull InterfaceC0552b interfaceC0552b) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            Intrinsics.checkNotNullParameter(interfaceC0552b, "subPage");
            this.stepName = str;
            this.subPage = interfaceC0552b;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.b(this.stepName, bVar.stepName) && Intrinsics.b(this.subPage, bVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override
        @NotNull
        public String toString() throws m {
            String str;
            InterfaceC0552b interfaceC0552b = this.subPage;
            if (Intrinsics.b(interfaceC0552b, InterfaceC0552b.a.a)) {
                str = "pending";
            } else if (Intrinsics.b(interfaceC0552b, InterfaceC0552b.C0221b.a)) {
                str = "prompt";
            } else if (Intrinsics.b(interfaceC0552b, InterfaceC0552b.c.a)) {
                str = "review";
            } else {
                if (!Intrinsics.b(interfaceC0552b, InterfaceC0552b.d.a)) {
                    throw new m();
                }
                str = "capture";
            }
            return super.toString() + "/documents/" + str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le9/i$c;", "Le9/i;", "", "stepName", "Le9/h;", "subPage", "<init>", "(Ljava/lang/String;Le9/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Le9/h;", "getSubPage", "()Le9/h;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c extends AbstractC0559i {

        @NotNull
        private final String stepName;

        @NotNull
        private final InterfaceC0558h subPage;

        public c(@NotNull String str, @NotNull InterfaceC0558h interfaceC0558h) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            Intrinsics.checkNotNullParameter(interfaceC0558h, "subPage");
            this.stepName = str;
            this.subPage = interfaceC0558h;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.b(this.stepName, cVar.stepName) && Intrinsics.b(this.subPage, cVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override
        @NotNull
        public String toString() throws m {
            String str;
            InterfaceC0558h interfaceC0558h = this.subPage;
            if (Intrinsics.b(interfaceC0558h, InterfaceC0558h.a.a)) {
                str = "autoclassification-failure";
            } else if (Intrinsics.b(interfaceC0558h, InterfaceC0558h.b.a)) {
                str = "autoclassification-select";
            } else if (Intrinsics.b(interfaceC0558h, InterfaceC0558h.g.a)) {
                str = "select";
            } else if (Intrinsics.b(interfaceC0558h, InterfaceC0558h.e.a)) {
                str = "pending";
            } else if (interfaceC0558h instanceof InterfaceC0558h.Check) {
                str = ((InterfaceC0558h.Check) this.subPage).getPageIndex() + "/check";
            } else if (interfaceC0558h instanceof InterfaceC0558h.CheckUpload) {
                str = ((InterfaceC0558h.CheckUpload) this.subPage).getPageIndex() + "/check-upload";
            } else if (interfaceC0558h instanceof InterfaceC0558h.Prompt) {
                str = ((InterfaceC0558h.Prompt) this.subPage).getPageIndex() + "/prompt";
            } else {
                if (!(interfaceC0558h instanceof InterfaceC0558h.TakePhoto)) {
                    throw new m();
                }
                str = ((InterfaceC0558h.TakePhoto) this.subPage).getPageIndex() + "/capture";
            }
            return super.toString() + "/government-id/" + str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Le9/i$d;", "Le9/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d extends AbstractC0559i {

        @NotNull
        private final String stepName;

        public d(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            this.stepName = str;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.b(this.stepName, ((d) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return super.toString() + "/scan-nfc";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le9/i$e;", "Le9/i;", "", "stepName", "Le9/j;", "subPage", "<init>", "(Ljava/lang/String;Le9/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Le9/j;", "getSubPage", "()Le9/j;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class e extends AbstractC0559i {

        @NotNull
        private final String stepName;

        @NotNull
        private final InterfaceC0560j subPage;

        public e(@NotNull String str, @NotNull InterfaceC0560j interfaceC0560j) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            Intrinsics.checkNotNullParameter(interfaceC0560j, "subPage");
            this.stepName = str;
            this.subPage = interfaceC0560j;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return Intrinsics.b(this.stepName, eVar.stepName) && Intrinsics.b(this.subPage, eVar.subPage);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.subPage.hashCode();
        }

        @Override
        @NotNull
        public String toString() throws m {
            String str;
            InterfaceC0560j interfaceC0560j = this.subPage;
            if (Intrinsics.b(interfaceC0560j, InterfaceC0560j.b.a)) {
                str = "finalize-video";
            } else if (Intrinsics.b(interfaceC0560j, InterfaceC0560j.d.a)) {
                str = "pending";
            } else if (Intrinsics.b(interfaceC0560j, InterfaceC0560j.e.a)) {
                str = "prompt";
            } else if (interfaceC0560j instanceof InterfaceC0560j.LeadInAnimation) {
                str = ((InterfaceC0560j.LeadInAnimation) this.subPage).getPose() + "/capture-lead-in-animation";
            } else if (interfaceC0560j instanceof InterfaceC0560j.TakePhoto) {
                str = ((InterfaceC0560j.TakePhoto) this.subPage).getPose() + "/capture";
            } else {
                if (!Intrinsics.b(interfaceC0560j, InterfaceC0560j.a.a)) {
                    throw new m();
                }
                str = "check-upload";
            }
            return super.toString() + "/selfie/" + str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Le9/i$f;", "Le9/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class f extends AbstractC0559i {

        @NotNull
        private final String stepName;

        public f(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            this.stepName = str;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && Intrinsics.b(this.stepName, ((f) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return super.toString() + "/ui";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Le9/i$g;", "Le9/i;", "", "stepName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class g extends AbstractC0559i {

        @NotNull
        private final String stepName;

        public g(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "stepName");
            this.stepName = str;
        }

        @Override
        @NotNull
        public String getStepName() {
            return this.stepName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && Intrinsics.b(this.stepName, ((g) other).stepName);
        }

        public int hashCode() {
            return this.stepName.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return super.toString() + "/verify-with-persona/passkey-authentication";
        }
    }

    public AbstractC0559i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getStepName();

    @NotNull
    public String toString() {
        return "/inquiry";
    }

    private AbstractC0559i() {
    }
}
