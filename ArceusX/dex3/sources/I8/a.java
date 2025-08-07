package I8;

import J8.InquiryAttributes;
import P9.o;
import bb.t;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000f\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"LI8/a;", "", "LJ8/c;", "attributes", "LP9/o;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(LJ8/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Lbb/t;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface a {
    Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super t<?>> continuation);

    Object b(@NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super t<?>> continuation);

    Object c(@NotNull InquiryAttributes inquiryAttributes, @NotNull Continuation<? super o<com.withpersona.sdk2.inquiry.internal.fallbackmode.i>> continuation);
}
