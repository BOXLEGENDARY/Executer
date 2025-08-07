package bb;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "newFrame", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;Lcom/withpersona/sdk2/camera/ImageIdMetadata;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;)Z", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {
    public static final boolean a(@NotNull AutocaptureState autocaptureState) {
        Intrinsics.checkNotNullParameter(autocaptureState, "<this>");
        if (autocaptureState.b().size() < 3) {
            return false;
        }
        Iterator<T> it = autocaptureState.b().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((ImageIdMetadata) it.next()).getTextOnImage().length();
        }
        double size = length / autocaptureState.b().size();
        double length2 = 0.0d;
        for (ImageIdMetadata imageIdMetadata : autocaptureState.b()) {
            length2 += (imageIdMetadata.getTextOnImage().length() - size) * (imageIdMetadata.getTextOnImage().length() - size);
        }
        return Math.sqrt(length2 / ((double) autocaptureState.b().size())) / size < 0.05d;
    }

    @NotNull
    public static final AutocaptureState b(@NotNull AutocaptureState autocaptureState, @NotNull ImageIdMetadata imageIdMetadata) {
        Intrinsics.checkNotNullParameter(autocaptureState, "<this>");
        Intrinsics.checkNotNullParameter(imageIdMetadata, "newFrame");
        return autocaptureState.a(CollectionsKt.f0(CollectionsKt.o0(autocaptureState.b(), 2), imageIdMetadata));
    }
}
