package A9;

import android.content.Context;
import android.media.Image;
import bb.InterfaceC0895a;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001Jk\u0010\u0010\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH&¢\u0006\u0004\b \u0010\u001fR\u001e\u0010&\u001a\u0004\u0018\u00010!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010,\u001a\u0004\u0018\u00010'8&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001f¨\u0006/"}, d2 = {"LA9/a;", "", "", "userName", "credential", "serverUrl", "jwt", "", "width", "height", "", "isAudioRequired", "Lkotlin/Function0;", "", "completion", "onConnectionError", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/media/Image;", "image", "rotation", "i", "(Landroid/media/Image;I)V", "Lkotlin/Function1;", "webRtcObjectIdReceived", "h", "(Lkotlin/jvm/functions/Function1;)V", "b", "()V", "c", "j", "()Z", "d", "Lz9/a;", "getService", "()Lz9/a;", "f", "(Lz9/a;)V", "service", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "g", "(Landroid/content/Context;)V", "context", "a", "isConnected", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface a {
    boolean a();

    void b();

    void c();

    boolean d();

    void e(String userName, String credential, String serverUrl, String jwt, int width, int height, boolean isAudioRequired, @NotNull Function0<Unit> completion, @NotNull Function0<Unit> onConnectionError);

    void f(InterfaceC0895a interfaceC0895a);

    void g(Context context);

    void h(@NotNull Function1<? super String, Unit> webRtcObjectIdReceived);

    void i(Image image, int rotation);

    boolean j();
}
