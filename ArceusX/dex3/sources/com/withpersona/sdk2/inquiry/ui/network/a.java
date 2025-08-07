package com.withpersona.sdk2.inquiry.ui.network;

import P9.m;
import P9.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "a", "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {
    @NotNull
    public static final Object a(@NotNull ComponentParam componentParam) throws m {
        Intrinsics.checkNotNullParameter(componentParam, "<this>");
        if (componentParam instanceof ComponentParam.Address) {
            ComponentParam.Address address = (ComponentParam.Address) componentParam;
            return F.k(new Pair[]{t.a("street_1", address.getStreet1()), t.a("street_2", address.getStreet2()), t.a("city", address.getCity()), t.a("subdivision", address.getSubdivision()), t.a("postal_code", address.getPostalCode())});
        }
        if (componentParam instanceof ComponentParam.ComponentString) {
            return ((ComponentParam.ComponentString) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ComponentStringList) {
            return ((ComponentParam.ComponentStringList) componentParam).a();
        }
        if (componentParam instanceof ComponentParam.ComponentBoolean) {
            return Boolean.valueOf(((ComponentParam.ComponentBoolean) componentParam).getValue());
        }
        if (componentParam instanceof ComponentParam.ComponentNumber) {
            return ((ComponentParam.ComponentNumber) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ESignature) {
            String signatureImageString = ((ComponentParam.ESignature) componentParam).getSignatureImageString();
            return signatureImageString == null ? "" : signatureImageString;
        }
        if (componentParam instanceof ComponentParam.GovernmentIdNfcScan) {
            ComponentParam.GovernmentIdNfcScan governmentIdNfcScan = (ComponentParam.GovernmentIdNfcScan) componentParam;
            return F.k(new Pair[]{t.a("caFlag", governmentIdNfcScan.getChipAuthenticationStatus()), t.a("dg1", governmentIdNfcScan.getDg1()), t.a("dg2", governmentIdNfcScan.getDg2()), t.a("sod", governmentIdNfcScan.getSod())});
        }
        if (!(componentParam instanceof ComponentParam.InternationalDbParams)) {
            throw new m();
        }
        ComponentParam.InternationalDbParams internationalDbParams = (ComponentParam.InternationalDbParams) componentParam;
        return F.k(new Pair[]{t.a("idb_country", internationalDbParams.getCountry()), t.a("idb_type", internationalDbParams.getType()), t.a("idb_value", internationalDbParams.getValue())});
    }
}
