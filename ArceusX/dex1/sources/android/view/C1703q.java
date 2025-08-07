package android.view;

import android.view.AbstractC1694h;
import androidx.room.kU.HguUe;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.C2522c;
import m.C2555a;
import m.C2556b;
import t2.Dbl.hgESaf;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000  2\u00020\u0001:\u0002\"%B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R&\u00108\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0014\u0010;\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R$\u0010>\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010<\"\u0004\b=\u0010\r¨\u0006?"}, d2 = {"Landroidx/lifecycle/q;", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/o;", "provider", BuildConfig.FLAVOR, "enforceMainThread", "<init>", "(Landroidx/lifecycle/o;Z)V", "(Landroidx/lifecycle/o;)V", "Landroidx/lifecycle/h$b;", "next", BuildConfig.FLAVOR, "l", "(Landroidx/lifecycle/h$b;)V", "Landroidx/lifecycle/n;", "observer", "f", "(Landroidx/lifecycle/n;)Landroidx/lifecycle/h$b;", "m", "()V", "state", "n", "lifecycleOwner", "i", "e", "p", BuildConfig.FLAVOR, "methodName", "h", "(Ljava/lang/String;)V", "Landroidx/lifecycle/h$a;", "event", "j", "(Landroidx/lifecycle/h$a;)V", "a", "(Landroidx/lifecycle/n;)V", "d", "b", "Z", "Lm/a;", "Landroidx/lifecycle/q$b;", "c", "Lm/a;", "observerMap", "Landroidx/lifecycle/h$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", BuildConfig.FLAVOR, "I", "addingObserverCounter", "g", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "k", "()Z", "isSynced", "()Landroidx/lifecycle/h$b;", "o", "currentState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class C1703q extends AbstractC1694h {

    public static final Companion INSTANCE = new Companion(null);

    private final boolean enforceMainThread;

    private C2555a<InterfaceC1700n, b> observerMap;

    private AbstractC1694h.b state;

    private final WeakReference<InterfaceC1701o> lifecycleOwner;

    private int addingObserverCounter;

    private boolean handlingEvent;

    private boolean newEventOccurred;

    private ArrayList<AbstractC1694h.b> parentStates;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/q$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/o;", "owner", "Landroidx/lifecycle/q;", "a", "(Landroidx/lifecycle/o;)Landroidx/lifecycle/q;", "Landroidx/lifecycle/h$b;", "state1", "state2", "b", "(Landroidx/lifecycle/h$b;Landroidx/lifecycle/h$b;)Landroidx/lifecycle/h$b;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1703q a(InterfaceC1701o owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C1703q(owner, false, null);
        }

        public final AbstractC1694h.b b(AbstractC1694h.b state1, AbstractC1694h.b state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/q$b;", BuildConfig.FLAVOR, "Landroidx/lifecycle/n;", "observer", "Landroidx/lifecycle/h$b;", "initialState", "<init>", "(Landroidx/lifecycle/n;Landroidx/lifecycle/h$b;)V", "Landroidx/lifecycle/o;", "owner", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "a", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "Landroidx/lifecycle/h$b;", "b", "()Landroidx/lifecycle/h$b;", "setState", "(Landroidx/lifecycle/h$b;)V", "state", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/l;", "getLifecycleObserver", "()Landroidx/lifecycle/l;", "setLifecycleObserver", "(Landroidx/lifecycle/l;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        private AbstractC1694h.b state;

        private InterfaceC1698l lifecycleObserver;

        public b(InterfaceC1700n interfaceC1700n, AbstractC1694h.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "initialState");
            Intrinsics.d(interfaceC1700n);
            this.lifecycleObserver = C1706t.f(interfaceC1700n);
            this.state = bVar;
        }

        public final void a(InterfaceC1701o owner, AbstractC1694h.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1694h.b bVarF = event.f();
            this.state = C1703q.INSTANCE.b(this.state, bVarF);
            InterfaceC1698l interfaceC1698l = this.lifecycleObserver;
            Intrinsics.d(owner);
            interfaceC1698l.j(owner, event);
            this.state = bVarF;
        }

        public final AbstractC1694h.b getState() {
            return this.state;
        }
    }

    public C1703q(InterfaceC1701o interfaceC1701o, boolean z7, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1701o, z7);
    }

    private final void e(InterfaceC1701o lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC1700n, b>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<InterfaceC1700n, b> next = itDescendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            InterfaceC1700n key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                AbstractC1694h.a aVarA = AbstractC1694h.a.INSTANCE.a(value.getState());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                n(aVarA.f());
                value.a(lifecycleOwner, aVarA);
                m();
            }
        }
    }

    private final AbstractC1694h.b f(InterfaceC1700n observer) {
        b value;
        Map.Entry<InterfaceC1700n, b> entryN = this.observerMap.n(observer);
        AbstractC1694h.b bVar = null;
        AbstractC1694h.b state = (entryN == null || (value = entryN.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            bVar = this.parentStates.get(r0.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.b(companion.b(this.state, state), bVar);
    }

    public static final C1703q g(InterfaceC1701o interfaceC1701o) {
        return INSTANCE.a(interfaceC1701o);
    }

    private final void h(String methodName) {
        if (!this.enforceMainThread || C2522c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void i(InterfaceC1701o lifecycleOwner) {
        C2556b<InterfaceC1700n, b>.d dVarG = this.observerMap.g();
        Intrinsics.checkNotNullExpressionValue(dVarG, "observerMap.iteratorWithAdditions()");
        while (dVarG.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarG.next();
            InterfaceC1700n interfaceC1700n = (InterfaceC1700n) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(interfaceC1700n)) {
                n(bVar.getState());
                AbstractC1694h.a aVarB = AbstractC1694h.a.INSTANCE.b(bVar.getState());
                if (aVarB == null) {
                    throw new IllegalStateException(hgESaf.EFleRUpUoJ + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarB);
                m();
            }
        }
    }

    private final boolean k() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC1700n, b> entryD = this.observerMap.d();
        Intrinsics.d(entryD);
        AbstractC1694h.b state = entryD.getValue().getState();
        Map.Entry<InterfaceC1700n, b> entryJ = this.observerMap.j();
        Intrinsics.d(entryJ);
        AbstractC1694h.b state2 = entryJ.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void l(AbstractC1694h.b next) {
        AbstractC1694h.b bVar = this.state;
        if (bVar == next) {
            return;
        }
        if (bVar == AbstractC1694h.b.INITIALIZED && next == AbstractC1694h.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        p();
        this.handlingEvent = false;
        if (this.state == AbstractC1694h.b.DESTROYED) {
            this.observerMap = new C2555a<>();
        }
    }

    private final void m() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void n(AbstractC1694h.b state) {
        this.parentStates.add(state);
    }

    private final void p() {
        InterfaceC1701o interfaceC1701o = this.lifecycleOwner.get();
        if (interfaceC1701o == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!k()) {
            this.newEventOccurred = false;
            AbstractC1694h.b bVar = this.state;
            Map.Entry<InterfaceC1700n, b> entryD = this.observerMap.d();
            Intrinsics.d(entryD);
            if (bVar.compareTo(entryD.getValue().getState()) < 0) {
                e(interfaceC1701o);
            }
            Map.Entry<InterfaceC1700n, b> entryJ = this.observerMap.j();
            if (!this.newEventOccurred && entryJ != null && this.state.compareTo(entryJ.getValue().getState()) > 0) {
                i(interfaceC1701o);
            }
        }
        this.newEventOccurred = false;
    }

    @Override
    public void a(InterfaceC1700n observer) {
        InterfaceC1701o interfaceC1701o;
        Intrinsics.checkNotNullParameter(observer, "observer");
        h("addObserver");
        AbstractC1694h.b bVar = this.state;
        AbstractC1694h.b bVar2 = AbstractC1694h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1694h.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.l(observer, bVar3) == null && (interfaceC1701o = this.lifecycleOwner.get()) != null) {
            boolean z7 = this.addingObserverCounter != 0 || this.handlingEvent;
            AbstractC1694h.b bVarF = f(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(bVarF) < 0 && this.observerMap.contains(observer)) {
                n(bVar3.getState());
                AbstractC1694h.a aVarB = AbstractC1694h.a.INSTANCE.b(bVar3.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.a(interfaceC1701o, aVarB);
                m();
                bVarF = f(observer);
            }
            if (!z7) {
                p();
            }
            this.addingObserverCounter--;
        }
    }

    @Override
    public AbstractC1694h.b getState() {
        return this.state;
    }

    @Override
    public void d(InterfaceC1700n observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        h("removeObserver");
        this.observerMap.m(observer);
    }

    public void j(AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h(HguUe.zKCR);
        l(event.f());
    }

    public void o(AbstractC1694h.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "state");
        h(GObvYfBKohxpYX.bsTVsAbdY);
        l(bVar);
    }

    private C1703q(InterfaceC1701o interfaceC1701o, boolean z7) {
        this.enforceMainThread = z7;
        this.observerMap = new C2555a<>();
        this.state = AbstractC1694h.b.INITIALIZED;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(interfaceC1701o);
    }

    public C1703q(InterfaceC1701o interfaceC1701o) {
        this(interfaceC1701o, true);
        Intrinsics.checkNotNullParameter(interfaceC1701o, "provider");
    }
}
