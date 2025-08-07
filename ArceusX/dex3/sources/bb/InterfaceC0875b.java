package bb;

import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeResponse;
import eb.a;
import eb.f;
import eb.i;
import eb.o;
import eb.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Ly9/b;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "request", "Lbb/t;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressId", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "c", "d", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0875b {
    @o("/api/internal/verify/v1/address/autocomplete")
    Object a(@i("Authorization") @NotNull String str, @a @NotNull AddressAutocompleteRequest addressAutocompleteRequest, @NotNull Continuation<? super t<AddressAutocompleteResponse>> continuation);

    @f("/api/internal/verify/v1/address/{addressId}")
    Object b(@i("Authorization") @NotNull String str, @s("addressId") @NotNull String str2, @NotNull Continuation<? super t<AddressDetailsResponse>> continuation);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-verify-popup-one-time-link-code")
    Object c(@s("inquiryId") @NotNull String str, @i("Authorization") @NotNull String str2, @NotNull Continuation<? super t<OneTimeLinkCodeResponse>> continuation);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-create-popup-one-time-link-code")
    Object d(@s("inquiryId") @NotNull String str, @i("Authorization") @NotNull String str2, @NotNull Continuation<? super t<OneTimeLinkCodeResponse>> continuation);
}
