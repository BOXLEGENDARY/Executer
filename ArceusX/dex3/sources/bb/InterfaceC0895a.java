package bb;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import eb.f;
import eb.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz9/a;", "", "", "jwt", "Lbb/t;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0895a {
    @f("/server-config")
    Object a(@t("jwt") String str, @NotNull Continuation<? super t<AuthorizeWebRtcResponse>> continuation);
}
