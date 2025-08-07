package J8;

import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import eb.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"LJ8/q;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "", "fallbackMode", "Lbb/t;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "g", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "c", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionToken", "inquiryId", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface q {
    @eb.n("/api/internal/verify/v1/current-inquiry-session")
    Object a(@eb.i("Authorization") @NotNull String str, @eb.a @NotNull UpdateInquirySessionRequest updateInquirySessionRequest, @NotNull Continuation<? super t<ResponseBody>> continuation);

    @eb.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    Object b(@eb.i("Authorization") @NotNull String str, @eb.i("Persona-Device-Id") String str2, @s("inquiryId") @NotNull String str3, @NotNull Continuation<? super t<CheckInquiryResponse>> continuation);

    @eb.o("/api/internal/verify/v1/inquiry-sessions")
    Object c(@eb.a @NotNull CreateInquirySessionRequest createInquirySessionRequest, @eb.i("Persona-Device-Id") String str, @NotNull Continuation<? super t<CreateInquirySessionResponse>> continuation);

    @eb.o("/api/internal/verify/v1/current-inquiry-session/cancel")
    Object d(@eb.i("Authorization") @NotNull String str, @NotNull Continuation<? super t<ResponseBody>> continuation);

    @eb.o("/api/internal/verify/v1/current-inquiry-session/error")
    Object e(@eb.i("Authorization") @NotNull String str, @eb.a @NotNull ErrorRequest errorRequest, @NotNull Continuation<? super t<ResponseBody>> continuation);

    @eb.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    Object f(@eb.i("Authorization") @NotNull String str, @s("inquiryId") @NotNull String str2, @eb.a @NotNull TransitionBackRequest transitionBackRequest, @NotNull Continuation<? super t<CheckInquiryResponse>> continuation);

    @eb.o("/api/internal/verify/v1/inquiries")
    Object g(@eb.a @NotNull CreateInquiryRequest createInquiryRequest, @eb.i("Persona-Fallback-Mode") String str, @NotNull Continuation<? super t<CheckInquiryResponse>> continuation);

    @eb.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object h(@eb.i("Authorization") @NotNull String str, @s("inquiryId") @NotNull String str2, @eb.a @NotNull TransitionInquiryRequest transitionInquiryRequest, @NotNull Continuation<? super t<CheckInquiryResponse>> continuation);
}
