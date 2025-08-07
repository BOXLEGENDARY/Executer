package ka;

import P9.h;
import P9.i;
import com.roblox.client.personasdk.R;
import g8.WorkflowNodeId;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okio.e;
import okio.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0014B-\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf8/m;", "", "Lf8/i;", "workflowSnapshot", "Lkotlin/Function0;", "", "Lg8/k;", "childTreeSnapshots", "<init>", "(Lf8/i;Lkotlin/jvm/functions/Function0;)V", "Lokio/h;", "c", "()Lokio/h;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LP9/h;", "b", "()Lf8/i;", "()Ljava/util/Map;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0573m {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final h workflowSnapshot;

    @NotNull
    private final h childTreeSnapshots;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf8/m$a;", "", "<init>", "()V", "Lokio/h;", "bytes", "Lf8/m;", "a", "(Lokio/h;)Lf8/m;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lg8/k;", "Lf8/m;", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0226a extends l implements Function0<Map<WorkflowNodeId, ? extends C0573m>> {
            final g d;

            C0226a(g gVar) {
                super(0);
                this.d = gVar;
            }

            @NotNull
            public final Map<WorkflowNodeId, C0573m> invoke() {
                int i = this.d.readInt();
                g gVar = this.d;
                Map mapD = F.d(i);
                int i2 = 0;
                while (i2 < i) {
                    i2++;
                    mapD.put(WorkflowNodeId.INSTANCE.a(C0572j.a(gVar)), C0573m.INSTANCE.a(C0572j.a(gVar)));
                }
                return F.b(mapD);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C0573m a(@NotNull okio.h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            e eVarK1 = new e().k1(bytes);
            return new C0573m(Snapshot.INSTANCE.b(C0572j.a(eVarK1)), new C0226a(eVarK1));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf8/i;", "a", "()Lf8/i;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class b extends l implements Function0<Snapshot> {
        final Snapshot d;

        b(Snapshot snapshot) {
            super(0);
            this.d = snapshot;
        }

        public final Snapshot invoke() {
            Snapshot snapshot = this.d;
            if (snapshot == null || snapshot.b().E() == 0) {
                return null;
            }
            return snapshot;
        }
    }

    public C0573m(Snapshot snapshot, @NotNull Function0<? extends Map<WorkflowNodeId, C0573m>> function0) {
        Intrinsics.checkNotNullParameter(function0, "childTreeSnapshots");
        P9.l lVar = P9.l.i;
        this.workflowSnapshot = i.a(lVar, new b(snapshot));
        this.childTreeSnapshots = i.a(lVar, function0);
    }

    @NotNull
    public final Map<WorkflowNodeId, C0573m> a() {
        return (Map) this.childTreeSnapshots.getValue();
    }

    public final Snapshot b() {
        return (Snapshot) this.workflowSnapshot.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final okio.h c() {
        throw new UnsupportedOperationException("Method not decompiled: ka.C0573m.c():okio.h");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof C0573m) {
            C0573m c0573m = (C0573m) other;
            if (Intrinsics.b(c0573m.b(), b()) && Intrinsics.b(c0573m.a(), a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Snapshot snapshotB = b();
        return ((snapshotB == null ? 0 : snapshotB.hashCode()) * 31) + a().hashCode();
    }
}
