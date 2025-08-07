package g8;

import com.roblox.client.personasdk.R;
import ka.C0572j;
import ka.q;
import ka.s;
import ka.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lg8/k;", "", "Lf8/s;", "identifier", "", "name", "<init>", "(Lf8/s;Ljava/lang/String;)V", "Lf8/q;", "workflow", "(Lf8/q;Ljava/lang/String;)V", "otherWorkflow", "otherName", "", "c", "(Lf8/q;Ljava/lang/String;)Z", "Lokio/h;", "d", "()Lokio/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lf8/s;", "()Lf8/s;", "b", "Ljava/lang/String;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class WorkflowNodeId {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final s identifier;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg8/k$a;", "", "<init>", "()V", "Lokio/h;", "bytes", "Lg8/k;", "a", "(Lokio/h;)Lg8/k;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WorkflowNodeId a(@NotNull okio.h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            okio.e eVar = new okio.e();
            eVar.k1(bytes);
            return new WorkflowNodeId(s.INSTANCE.a(C0572j.a(eVar)), C0572j.b(eVar));
        }

        private Companion() {
        }
    }

    public WorkflowNodeId(@NotNull s sVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(sVar, "identifier");
        Intrinsics.checkNotNullParameter(str, "name");
        this.identifier = sVar;
        this.name = str;
    }

    @NotNull
    public final s getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean c(@NotNull q<?, ?, ?> otherWorkflow, @NotNull String otherName) {
        Intrinsics.checkNotNullParameter(otherWorkflow, "otherWorkflow");
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.b(this.identifier, w.j(otherWorkflow)) && Intrinsics.b(this.name, otherName);
    }

    public final okio.h d() {
        okio.h hVarE = this.identifier.e();
        if (hVarE == null) {
            return null;
        }
        okio.e eVar = new okio.e();
        C0572j.c(eVar, hVarE);
        C0572j.d(eVar, getName());
        return eVar.C0();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowNodeId)) {
            return false;
        }
        WorkflowNodeId workflowNodeId = (WorkflowNodeId) other;
        return Intrinsics.b(this.identifier, workflowNodeId.identifier) && Intrinsics.b(this.name, workflowNodeId.name);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "WorkflowNodeId(identifier=" + this.identifier + ", name=" + this.name + ')';
    }

    public WorkflowNodeId(@NotNull q<?, ?, ?> qVar, @NotNull String str) {
        this(w.j(qVar), str);
        Intrinsics.checkNotNullParameter(qVar, "workflow");
        Intrinsics.checkNotNullParameter(str, "name");
    }
}
