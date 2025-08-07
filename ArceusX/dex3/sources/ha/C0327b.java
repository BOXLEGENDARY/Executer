package ha;

import A9.a;
import A9.b;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LC8/b;", "", "LA9/a;", "webRtcManager", "<init>", "(LA9/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;)Z", "c", "Lp8/a;", "e", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;)Lp8/a;", "", "a", "()V", "LA9/a;", "b", "()LA9/a;", "setWebRtcManager", "d", "()Z", "isWebRtcConnected", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0327b {

    private a webRtcManager;

    public C0327b(a aVar) {
        this.webRtcManager = aVar;
    }

    public final void a() {
        a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final a getWebRtcManager() {
        return this.webRtcManager;
    }

    public final boolean c(@NotNull o.C0520a renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        EnumC0732a enumC0732aE = e(renderProps);
        return enumC0732aE == EnumC0732a.d || enumC0732aE == EnumC0732a.e;
    }

    public final boolean d() {
        a aVar = this.webRtcManager;
        return aVar != null && aVar.a();
    }

    @NotNull
    public final EnumC0732a e(@NotNull o.C0520a renderProps) {
        EnumC0732a enumC0732a;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfigV = renderProps.v();
        List<EnumC0732a> listC = videoCaptureConfigV.c();
        if (!videoCaptureConfigV.e()) {
            return EnumC0732a.i;
        }
        a aVar = this.webRtcManager;
        boolean zJ = aVar != null ? aVar.j() : false;
        a aVar2 = this.webRtcManager;
        boolean zD = aVar2 != null ? aVar2.d() : true;
        if (CollectionsKt.firstOrNull(videoCaptureConfigV.c()) == EnumC0732a.d && !b.d()) {
            List<EnumC0732a> listC2 = videoCaptureConfigV.c();
            EnumC0732a enumC0732a2 = EnumC0732a.e;
            return listC2.contains(enumC0732a2) ? enumC0732a2 : EnumC0732a.i;
        }
        if (zD) {
            EnumC0732a enumC0732a3 = EnumC0732a.e;
            if (listC.contains(enumC0732a3)) {
                return enumC0732a3;
            }
        }
        return (zJ || (enumC0732a = (EnumC0732a) CollectionsKt.firstOrNull(listC)) == null) ? EnumC0732a.i : enumC0732a;
    }

    public final boolean f(@NotNull o.C0520a renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        return (renderProps.v().e() && CollectionsKt.firstOrNull(renderProps.v().c()) == EnumC0732a.d && !b.d()) ? false : true;
    }

    public C0327b(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.b() : aVar);
    }
}
