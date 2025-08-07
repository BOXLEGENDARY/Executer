package u5;

import P9.p;
import S9.b;
import aa.n;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.a;
import ka.K;
import ka.g;
import ka.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lka/K;", "Lcom/withpersona/sdk2/camera/a;", "Lka/g;", "a", "(Lka/K;)Lka/g;", "camera_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0621h {

    @f(c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", f = "CameraController.kt", l = {89}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/camera/a;", "state", "", "<anonymous>", "(Lka/h;Lcom/withpersona/sdk2/camera/a;)Z"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements n<ka.h<? super a>, a, Continuation<? super Boolean>, Object> {
        int d;
        private Object e;
        Object i;

        h(Continuation<? super h> continuation) {
            super(3, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super a> hVar, @NotNull a aVar, Continuation<? super Boolean> continuation) {
            h hVar2 = new h(continuation);
            hVar2.e = hVar;
            hVar2.i = aVar;
            return hVar2.invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar;
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                a aVar2 = (a) this.i;
                this.e = aVar2;
                this.d = 1;
                if (hVar.c(aVar2, this) == objC) {
                    return objC;
                }
                aVar = aVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.e;
                p.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!(aVar instanceof a.Closed));
        }
    }

    @NotNull
    public static final g<a> a(@NotNull K<? extends a> k) {
        Intrinsics.checkNotNullParameter(k, "<this>");
        return i.L(k, new h(null));
    }
}
