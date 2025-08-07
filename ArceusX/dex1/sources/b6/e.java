package b6;

import Y0.f;
import Y0.k;
import Y0.s;
import Y0.v;
import Y0.y;
import android.database.Cursor;
import b6.d;
import c6.NotificationId;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

public final class e implements b6.d {

    private final s f12638a;

    private final k<NotificationId> f12639b;

    private final y f12640c;

    class a extends k<NotificationId> {
        a(s sVar) {
            super(sVar);
        }

        @Override
        protected String e() {
            return "INSERT OR REPLACE INTO `notification_id` (`notification_id`,`last_received_timestamp_ms`) VALUES (?,?)";
        }

        @Override
        public void i(c1.k kVar, NotificationId notificationId) {
            if (notificationId.getNotificationId() == null) {
                kVar.N0(1);
            } else {
                kVar.B(1, notificationId.getNotificationId());
            }
            kVar.c0(2, notificationId.getLastReceivedTimestampMs());
        }
    }

    class b extends y {
        b(s sVar) {
            super(sVar);
        }

        @Override
        public String e() {
            return "\n        DELETE FROM notification_id\n        WHERE notification_id IN (\n            SELECT notification_id\n            FROM notification_id\n            ORDER BY last_received_timestamp_ms DESC\n            LIMIT -1 OFFSET ?\n        )\n    ";
        }
    }

    class c implements Callable<Unit> {

        final NotificationId[] f12643d;

        c(NotificationId[] notificationIdArr) {
            this.f12643d = notificationIdArr;
        }

        @Override
        public Unit call() throws Exception {
            e.this.f12638a.e();
            try {
                e.this.f12639b.k(this.f12643d);
                e.this.f12638a.B();
                return Unit.a;
            } finally {
                e.this.f12638a.i();
            }
        }
    }

    class d implements Callable<Integer> {

        final int f12645d;

        d(int i7) {
            this.f12645d = i7;
        }

        @Override
        public Integer call() throws Exception {
            c1.k kVarB = e.this.f12640c.b();
            kVarB.c0(1, this.f12645d);
            try {
                e.this.f12638a.e();
                try {
                    Integer numValueOf = Integer.valueOf(kVarB.I());
                    e.this.f12638a.B();
                    return numValueOf;
                } finally {
                    e.this.f12638a.i();
                }
            } finally {
                e.this.f12640c.h(kVarB);
            }
        }
    }

    class CallableC0137e implements Callable<Boolean> {

        final v f12647d;

        CallableC0137e(v vVar) {
            this.f12647d = vVar;
        }

        @Override
        public Boolean call() throws Exception {
            Boolean boolValueOf = null;
            Cursor cursorC = a1.b.c(e.this.f12638a, this.f12647d, false, null);
            try {
                if (cursorC.moveToFirst()) {
                    Integer numValueOf = cursorC.isNull(0) ? null : Integer.valueOf(cursorC.getInt(0));
                    if (numValueOf != null) {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                }
                return boolValueOf;
            } finally {
                cursorC.close();
                this.f12647d.u();
            }
        }
    }

    public e(s sVar) {
        this.f12638a = sVar;
        this.f12639b = new a(sVar);
        this.f12640c = new b(sVar);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override
    public Object a(NotificationId[] notificationIdArr, Continuation<? super Boolean> continuation) {
        return d.a.a(this, notificationIdArr, continuation);
    }

    @Override
    public Object b(int i7, Continuation<? super Integer> continuation) {
        return f.b(this.f12638a, true, new d(i7), continuation);
    }

    @Override
    public Object c(String str, Continuation<? super Boolean> continuation) {
        v vVarF = v.f("SELECT COUNT(*) > 0 FROM notification_id WHERE notification_id = ?", 1);
        if (str == null) {
            vVarF.N0(1);
        } else {
            vVarF.B(1, str);
        }
        return f.a(this.f12638a, false, a1.b.a(), new CallableC0137e(vVarF), continuation);
    }

    @Override
    public Object d(NotificationId[] notificationIdArr, Continuation<? super Unit> continuation) {
        return f.b(this.f12638a, true, new c(notificationIdArr), continuation);
    }
}
