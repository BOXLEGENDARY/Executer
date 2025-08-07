package g8;

import com.roblox.client.personasdk.R;
import g8.e;
import g8.f;
import java.util.LinkedHashMap;
import java.util.Map;
import ka.C0573m;
import ka.WorkflowOutput;
import ka.q;
import ka.r;
import ka.t;
import ka.w;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004Bo\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012&\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u008f\u0001\u0010!\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 \"\u0004\b\u0003\u0010\u0017\"\u0004\b\u0004\u0010\u0018\"\u0004\b\u0005\u0010\u00192\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001a2\u0006\u0010\u001c\u001a\u00028\u00032\u0006\u0010\u001e\u001a\u00020\u001d2$\u0010\u001f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%Jq\u0010'\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0017\"\u0004\b\u0004\u0010\u0018\"\u0004\b\u0005\u0010\u00192\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001a2\u0006\u0010&\u001a\u00028\u00032\u0006\u0010\u001e\u001a\u00020\u001d2$\u0010\u001f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0016¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020#\"\u0004\b\u0003\u0010)2\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010+0*¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b/\u00100R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R4\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00108R0\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030 098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010:¨\u0006<"}, d2 = {"Lg8/h;", "PropsT", "StateT", "OutputT", "Lg8/f$a;", "", "Lg8/k;", "Lf8/m;", "snapshotCache", "Lkotlin/coroutines/CoroutineContext;", "contextForChildren", "Lkotlin/Function1;", "Lf8/r;", "", "emitActionToParent", "Lf8/t$c;", "workflowSession", "Lf8/t;", "interceptor", "Lg8/d;", "idCounter", "<init>", "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lf8/t$c;Lf8/t;Lg8/d;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lf8/q;", "child", "initialProps", "", "key", "handler", "Lg8/i;", "d", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lg8/i;", "", "c", "()V", "props", "a", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "T", "Lpa/c;", "Lf8/v;", "selector", "g", "(Lpa/c;)V", "f", "()Ljava/util/Map;", "Ljava/util/Map;", "b", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/jvm/functions/Function1;", "Lf8/t$c;", "e", "Lf8/t;", "Lg8/d;", "Lg8/a;", "Lg8/a;", "children", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class h<PropsT, StateT, OutputT> implements f.a<PropsT, StateT, OutputT> {

    private Map<WorkflowNodeId, C0573m> snapshotCache;

    @NotNull
    private final CoroutineContext contextForChildren;

    @NotNull
    private final Function1<r<? super PropsT, StateT, ? extends OutputT>, Object> emitActionToParent;

    private final t.c workflowSession;

    @NotNull
    private final t interceptor;

    private final d idCounter;

    @NotNull
    private C0576a<i<?, ?, ?, ?, ?>> children;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    class a<ChildOutputT> extends kotlin.jvm.internal.j implements Function1<ChildOutputT, Object> {
        final y<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> d;
        final h<PropsT, StateT, OutputT> e;

        a(y<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> yVar, h<PropsT, StateT, OutputT> hVar) {
            super(1, Intrinsics.a.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            this.d = yVar;
            this.e = hVar;
        }

        public final Object invoke(ChildOutputT childoutputt) {
            return h.e(this.d, this.e, childoutputt);
        }
    }

    public h(Map<WorkflowNodeId, C0573m> map, @NotNull CoroutineContext coroutineContext, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>, ? extends Object> function1, t.c cVar, @NotNull t tVar, d dVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, "contextForChildren");
        Intrinsics.checkNotNullParameter(function1, "emitActionToParent");
        Intrinsics.checkNotNullParameter(tVar, "interceptor");
        this.snapshotCache = map;
        this.contextForChildren = coroutineContext;
        this.emitActionToParent = function1;
        this.workflowSession = cVar;
        this.interceptor = tVar;
        this.idCounter = dVar;
        this.children = new C0576a<>();
    }

    private final <ChildPropsT, ChildOutputT, ChildRenderingT> i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT initialProps, String key, Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        WorkflowNodeId workflowNodeIdA = l.a(child, key);
        y yVar = new y();
        Map<WorkflowNodeId, C0573m> map = this.snapshotCache;
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar = new i<>(child, handler, new j(workflowNodeIdA, child.a(), initialProps, map == null ? null : map.get(workflowNodeIdA), this.contextForChildren, new a(yVar, this), this.workflowSession, this.interceptor, this.idCounter));
        yVar.d = iVar;
        return iVar;
    }

    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object e(y<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> yVar, h<PropsT, StateT, OutputT> hVar, ChildOutputT childoutputt) {
        i iVar;
        Object obj = yVar.d;
        if (obj == null) {
            Intrinsics.v("node");
            iVar = null;
        } else {
            iVar = (i) obj;
        }
        return ((h) hVar).emitActionToParent.invoke(iVar.c(childoutputt));
    }

    @Override
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter((Object) handler, "handler");
        for (e.a aVarB = ((C0576a) this.children).staging.b(); aVarB != null; aVarB = aVarB.a()) {
            if (((i) aVarB).h(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + w.j(child) + ": key=\"" + key + '\"').toString());
            }
        }
        C0576a<i<?, ?, ?, ?, ?>> c0576a = this.children;
        e eVar = ((C0576a) c0576a).active;
        i iVarD = null;
        i iVar = null;
        i iVarA = eVar.b();
        while (true) {
            if (iVarA == null) {
                break;
            }
            if (iVarA.h(child, key)) {
                if (iVar == null) {
                    eVar.e(iVarA.a());
                } else {
                    iVar.b(iVarA.a());
                }
                if (Intrinsics.b(eVar.c(), iVarA)) {
                    eVar.f(iVar);
                }
                iVarA.b(null);
                iVarD = iVarA;
            } else {
                iVar = iVarA;
                iVarA = iVarA.a();
            }
        }
        if (iVarD == null) {
            iVarD = d(child, props, key, handler);
        }
        ((C0576a) c0576a).staging.d(iVarD);
        i iVar2 = iVarD;
        iVar2.j(handler);
        return (ChildRenderingT) iVar2.i(child.a(), props);
    }

    public final void c() {
        C0576a<i<?, ?, ?, ?, ?>> c0576a = this.children;
        for (e.a aVarB = ((C0576a) c0576a).active.b(); aVarB != null; aVarB = aVarB.a()) {
            j.e(((i) aVarB).g(), null, 1, null);
        }
        e eVar = ((C0576a) c0576a).active;
        ((C0576a) c0576a).active = ((C0576a) c0576a).staging;
        ((C0576a) c0576a).staging = eVar;
        ((C0576a) c0576a).staging.a();
        this.snapshotCache = null;
    }

    @NotNull
    public final Map<WorkflowNodeId, C0573m> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e.a aVarB = ((C0576a) this.children).active.b(); aVarB != null; aVarB = aVarB.a()) {
            i iVar = (i) aVarB;
            linkedHashMap.put(iVar.d(), iVar.g().n(iVar.f().a()));
        }
        return linkedHashMap;
    }

    public final <T> void g(@NotNull pa.c<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        for (e.a aVarB = ((C0576a) this.children).active.b(); aVarB != null; aVarB = aVarB.a()) {
            ((i) aVarB).g().o(selector);
        }
    }
}
