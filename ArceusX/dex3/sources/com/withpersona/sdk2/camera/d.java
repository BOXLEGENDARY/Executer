package com.withpersona.sdk2.camera;

import P9.o;
import P9.p;
import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.a;
import java.io.File;
import ka.K;
import ka.M;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.C;
import u5.InterfaceC0620g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "Ll8/g;", "Landroid/view/View;", "previewView", "<init>", "(Landroid/view/View;)V", "", "f", "()V", "", "enable", "a", "(Z)V", "h", "LP9/o;", "Ljava/io/File;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "j", "enableAnalyzer", "i", "Landroid/view/View;", "g", "()Landroid/view/View;", "Lka/K;", "Lcom/withpersona/sdk2/camera/a;", "b", "()Lka/K;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d implements InterfaceC0620g {

    @NotNull
    private final View previewView;

    public d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "previewView");
        this.previewView = view;
    }

    @Override
    public void a(boolean enable) {
    }

    @Override
    @NotNull
    public K<a> b() {
        return M.a(a.c.a);
    }

    @Override
    @NotNull
    public CameraProperties c() {
        return new CameraProperties(null, null, null, 0, 15, null);
    }

    @Override
    public Object d(@NotNull Continuation<? super Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @Override
    public Object e(@NotNull Continuation<? super o<? extends File>> continuation) {
        o.a aVar = o.e;
        return o.b(p.a(new C()));
    }

    @Override
    public void f() {
    }

    @Override
    @NotNull
    public View getPreviewView() {
        return this.previewView;
    }

    @Override
    public void h() {
    }

    @Override
    public void i(boolean enableAnalyzer) {
    }

    @Override
    public Object j(@NotNull Continuation<? super o<? extends File>> continuation) {
        o.a aVar = o.e;
        return o.b(p.a(new C()));
    }
}
