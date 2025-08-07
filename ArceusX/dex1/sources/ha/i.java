package ha;

import a6.c;
import android.content.Context;
import b6.d;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.db.RobloxDatabase;
import ha.M;
import ha.N;
import ha.c0;
import ha.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LL5/i;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", "Lb6/d;", "b", "()Lb6/d;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    public static final i f2136a = new i();

    @f(c = "com.roblox.client.analytics.NotificationMonitoring$checkDuplicateNotificationId$1$1", f = "NotificationMonitoring.kt", l = {25, 31, 33}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {

        long f2137d;

        int f2138e;

        final d f2139i;

        final String f2140v;

        L(d dVar, String str, Continuation<? super L> continuation) {
            super(2, continuation);
            this.f2139i = dVar;
            this.f2140v = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new L(this.f2139i, this.f2140v, continuation);
        }

        public final Object invoke(ha.L l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            throw new UnsupportedOperationException("Method not decompiled: ha.i.L.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private i() {
    }

    public static final void a(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        d dVarB = f2136a.b();
        if (dVarB != null) {
            g.d(M.a(c0.b()), (CoroutineContext) null, (N) null, new L(dVarB, notificationId, null), 3, (Object) null);
        }
    }

    private final d b() {
        c cVar = c.f8380a;
        Context contextA = RobloxApplication.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext(...)");
        RobloxDatabase robloxDatabaseB = cVar.b(contextA);
        if (robloxDatabaseB != null) {
            return robloxDatabaseB.E();
        }
        return null;
    }
}
