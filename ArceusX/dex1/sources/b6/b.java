package b6;

import Y0.j;
import Y0.k;
import Y0.s;
import Y0.v;
import android.database.Cursor;
import b6.InterfaceC1742a;
import c6.AnalyticEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import w7.Jld.EZYiRMRTxKdo;

public final class b implements InterfaceC1742a {

    private final s f12609a;

    private final k<AnalyticEvent> f12610b;

    private final j<AnalyticEvent> f12611c;

    private final j<AnalyticEvent> f12612d;

    class a extends k<AnalyticEvent> {
        a(s sVar) {
            super(sVar);
        }

        @Override
        protected String e() {
            return "INSERT OR ABORT INTO `analytic_event` (`id`,`serialized_event`,`event_name`,`event_context`,`serialized_params`,`retry_attempt_count`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override
        public void i(c1.k kVar, AnalyticEvent analyticEvent) {
            kVar.c0(1, analyticEvent.getId());
            if (analyticEvent.getSerializedEvent() == null) {
                kVar.N0(2);
            } else {
                kVar.B(2, analyticEvent.getSerializedEvent());
            }
            if (analyticEvent.getEventName() == null) {
                kVar.N0(3);
            } else {
                kVar.B(3, analyticEvent.getEventName());
            }
            if (analyticEvent.getEventContext() == null) {
                kVar.N0(4);
            } else {
                kVar.B(4, analyticEvent.getEventContext());
            }
            if (analyticEvent.getSerializedParams() == null) {
                kVar.N0(5);
            } else {
                kVar.B(5, analyticEvent.getSerializedParams());
            }
            if (analyticEvent.getRetryAttemptCount() == null) {
                kVar.N0(6);
            } else {
                kVar.c0(6, analyticEvent.getRetryAttemptCount().intValue());
            }
        }
    }

    class C0134b extends j<AnalyticEvent> {
        C0134b(s sVar) {
            super(sVar);
        }

        @Override
        protected String e() {
            return "DELETE FROM `analytic_event` WHERE `id` = ?";
        }

        @Override
        public void i(c1.k kVar, AnalyticEvent analyticEvent) {
            kVar.c0(1, analyticEvent.getId());
        }
    }

    class c extends j<AnalyticEvent> {
        c(s sVar) {
            super(sVar);
        }

        @Override
        protected String e() {
            return "UPDATE OR ABORT `analytic_event` SET `id` = ?,`serialized_event` = ?,`event_name` = ?,`event_context` = ?,`serialized_params` = ?,`retry_attempt_count` = ? WHERE `id` = ?";
        }

        @Override
        public void i(c1.k kVar, AnalyticEvent analyticEvent) {
            kVar.c0(1, analyticEvent.getId());
            if (analyticEvent.getSerializedEvent() == null) {
                kVar.N0(2);
            } else {
                kVar.B(2, analyticEvent.getSerializedEvent());
            }
            if (analyticEvent.getEventName() == null) {
                kVar.N0(3);
            } else {
                kVar.B(3, analyticEvent.getEventName());
            }
            if (analyticEvent.getEventContext() == null) {
                kVar.N0(4);
            } else {
                kVar.B(4, analyticEvent.getEventContext());
            }
            if (analyticEvent.getSerializedParams() == null) {
                kVar.N0(5);
            } else {
                kVar.B(5, analyticEvent.getSerializedParams());
            }
            if (analyticEvent.getRetryAttemptCount() == null) {
                kVar.N0(6);
            } else {
                kVar.c0(6, analyticEvent.getRetryAttemptCount().intValue());
            }
            kVar.c0(7, analyticEvent.getId());
        }
    }

    class d implements Callable<Unit> {

        final AnalyticEvent[] f12616d;

        d(AnalyticEvent[] analyticEventArr) {
            this.f12616d = analyticEventArr;
        }

        @Override
        public Unit call() throws Exception {
            b.this.f12609a.e();
            try {
                b.this.f12610b.k(this.f12616d);
                b.this.f12609a.B();
                return Unit.a;
            } finally {
                b.this.f12609a.i();
            }
        }
    }

    class e implements Callable<Unit> {

        final AnalyticEvent f12618d;

        e(AnalyticEvent analyticEvent) {
            this.f12618d = analyticEvent;
        }

        @Override
        public Unit call() throws Exception {
            b.this.f12609a.e();
            try {
                b.this.f12611c.j(this.f12618d);
                b.this.f12609a.B();
                return Unit.a;
            } finally {
                b.this.f12609a.i();
            }
        }
    }

    class f implements Callable<Unit> {

        final List f12620d;

        f(List list) {
            this.f12620d = list;
        }

        @Override
        public Unit call() throws Exception {
            b.this.f12609a.e();
            try {
                b.this.f12612d.k(this.f12620d);
                b.this.f12609a.B();
                return Unit.a;
            } finally {
                b.this.f12609a.i();
            }
        }
    }

    class g implements Callable<Integer> {

        final v f12622d;

        g(v vVar) {
            this.f12622d = vVar;
        }

        @Override
        public Integer call() throws Exception {
            Integer numValueOf = null;
            Cursor cursorC = a1.b.c(b.this.f12609a, this.f12622d, false, null);
            try {
                if (cursorC.moveToFirst() && !cursorC.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorC.getInt(0));
                }
                return numValueOf;
            } finally {
                cursorC.close();
                this.f12622d.u();
            }
        }
    }

    class h implements Callable<List<AnalyticEvent>> {

        final v f12624d;

        h(v vVar) {
            this.f12624d = vVar;
        }

        @Override
        public List<AnalyticEvent> call() throws Exception {
            Cursor cursorC = a1.b.c(b.this.f12609a, this.f12624d, false, null);
            try {
                int iD = a1.a.d(cursorC, "id");
                int iD2 = a1.a.d(cursorC, EZYiRMRTxKdo.hHrvbb);
                int iD3 = a1.a.d(cursorC, "event_name");
                int iD4 = a1.a.d(cursorC, "event_context");
                int iD5 = a1.a.d(cursorC, "serialized_params");
                int iD6 = a1.a.d(cursorC, "retry_attempt_count");
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    arrayList.add(new AnalyticEvent(cursorC.getInt(iD), cursorC.isNull(iD2) ? null : cursorC.getString(iD2), cursorC.isNull(iD3) ? null : cursorC.getString(iD3), cursorC.isNull(iD4) ? null : cursorC.getString(iD4), cursorC.isNull(iD5) ? null : cursorC.getString(iD5), cursorC.isNull(iD6) ? null : Integer.valueOf(cursorC.getInt(iD6))));
                }
                return arrayList;
            } finally {
                cursorC.close();
                this.f12624d.u();
            }
        }
    }

    public b(s sVar) {
        this.f12609a = sVar;
        this.f12610b = new a(sVar);
        this.f12611c = new C0134b(sVar);
        this.f12612d = new c(sVar);
    }

    public static List<Class<?>> n() {
        return Collections.emptyList();
    }

    @Override
    public Object a(List<AnalyticEvent> list, Continuation<? super Unit> continuation) {
        return Y0.f.b(this.f12609a, true, new f(list), continuation);
    }

    @Override
    public Object b(Continuation<? super Integer> continuation) {
        v vVarF = v.f("SELECT COUNT(*) FROM analytic_event", 0);
        return Y0.f.a(this.f12609a, false, a1.b.a(), new g(vVarF), continuation);
    }

    @Override
    public Object c(AnalyticEvent analyticEvent, Continuation<? super Unit> continuation) {
        return InterfaceC1742a.C0132a.a(this, analyticEvent, continuation);
    }

    @Override
    public Object d(int i7, Continuation<? super List<AnalyticEvent>> continuation) {
        v vVarF = v.f("SELECT * FROM analytic_event LIMIT ?", 1);
        vVarF.c0(1, i7);
        return Y0.f.a(this.f12609a, false, a1.b.a(), new h(vVarF), continuation);
    }

    @Override
    public Object e(AnalyticEvent[] analyticEventArr, Continuation<? super Unit> continuation) {
        return Y0.f.b(this.f12609a, true, new d(analyticEventArr), continuation);
    }

    @Override
    public Object f(AnalyticEvent analyticEvent, Continuation<? super Unit> continuation) {
        return Y0.f.b(this.f12609a, true, new e(analyticEvent), continuation);
    }

    @Override
    public Object g(AnalyticEvent[] analyticEventArr, Continuation<? super Boolean> continuation) {
        return InterfaceC1742a.C0132a.c(this, analyticEventArr, continuation);
    }

    @Override
    public Object h(int i7, Continuation<? super List<AnalyticEvent>> continuation) {
        return InterfaceC1742a.C0132a.b(this, i7, continuation);
    }

    @Override
    public Object i(List<AnalyticEvent> list, Continuation<? super Unit> continuation) {
        return InterfaceC1742a.C0132a.d(this, list, continuation);
    }
}
