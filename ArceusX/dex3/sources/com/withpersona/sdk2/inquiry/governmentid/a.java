package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "LB8/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;LB8/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {
    public static final RemoteImage a(@NotNull NextStep.GovernmentId.AssetConfig.CapturePage capturePage, @NotNull bb.b bVar, @NotNull IdConfig.b bVar2) {
        Intrinsics.checkNotNullParameter(capturePage, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "idClass");
        Intrinsics.checkNotNullParameter(bVar2, "side");
        if (bVar == bb.b.C && bVar2 == IdConfig.b.v) {
            RemoteImage passportFrontPictograph = capturePage.getPassportFrontPictograph();
            return passportFrontPictograph == null ? capturePage.getIdFrontPictograph() : passportFrontPictograph;
        }
        if (bVar2 == IdConfig.b.v) {
            return capturePage.getIdFrontPictograph();
        }
        if (bVar2 == IdConfig.b.w) {
            return capturePage.getIdBackPictograph();
        }
        if (bVar2 == IdConfig.b.A) {
            return capturePage.getPassportSignaturePictograph();
        }
        if (bVar2 == IdConfig.b.z) {
            return capturePage.getBarcodePdf417Pictograph();
        }
        return null;
    }
}
