package b6;

import P9.p;
import c6.NotificationId;
import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lb6/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lc6/b;", "notificationIds", BuildConfig.FLAVOR, "d", "([Lc6/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", BuildConfig.FLAVOR, "maxRowsCount", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        @f(c = "com.roblox.client.db.dao.NotificationIdDao$safeInsertNotificationIds$2", f = "NotificationIdDao.kt", l = {23}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0136a extends k implements Function1<Continuation<? super Unit>, Object> {

            int f12635d;

            final d f12636e;

            final NotificationId[] f12637i;

            C0136a(d dVar, NotificationId[] notificationIdArr, Continuation<? super C0136a> continuation) {
                super(1, continuation);
                this.f12636e = dVar;
                this.f12637i = notificationIdArr;
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C0136a(this.f12636e, this.f12637i, continuation);
            }

            public final Object invokeSuspend(Object obj) {
                Object objC = S9.b.c();
                int i7 = this.f12635d;
                if (i7 == 0) {
                    p.b(obj);
                    d dVar = this.f12636e;
                    NotificationId[] notificationIdArr = this.f12637i;
                    NotificationId[] notificationIdArr2 = (NotificationId[]) Arrays.copyOf(notificationIdArr, notificationIdArr.length);
                    this.f12635d = 1;
                    if (dVar.d(notificationIdArr2, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.a;
            }
        }

        public static Object a(d dVar, NotificationId[] notificationIdArr, Continuation<? super Boolean> continuation) {
            return c.b("NotificationIdDao", new C0136a(dVar, notificationIdArr, null), continuation);
        }
    }

    Object a(NotificationId[] notificationIdArr, Continuation<? super Boolean> continuation);

    Object b(int i7, Continuation<? super Integer> continuation);

    Object c(String str, Continuation<? super Boolean> continuation);

    Object d(NotificationId[] notificationIdArr, Continuation<? super Unit> continuation);
}
