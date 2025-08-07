package u5;

import P9.o;
import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.a;
import java.io.File;
import ka.K;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000e\u0010\rJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Ll8/g;", "", "", "f", "()V", "", "enable", "a", "(Z)V", "h", "LP9/o;", "Ljava/io/File;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "j", "enableAnalyzer", "i", "Lka/K;", "Lcom/withpersona/sdk2/camera/a;", "b", "()Lka/K;", "cameraState", "Landroid/view/View;", "g", "()Landroid/view/View;", "previewView", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0620g {
    void a(boolean enable);

    @NotNull
    K<a> b();

    @NotNull
    CameraProperties c();

    Object d(@NotNull Continuation<? super Boolean> continuation);

    Object e(@NotNull Continuation<? super o<? extends File>> continuation);

    void f();

    @NotNull
    View g();

    void h();

    void i(boolean enableAnalyzer);

    Object j(@NotNull Continuation<? super o<? extends File>> continuation);
}
