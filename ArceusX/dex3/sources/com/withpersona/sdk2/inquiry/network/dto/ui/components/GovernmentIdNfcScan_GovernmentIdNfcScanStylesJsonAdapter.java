package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GovernmentIdNfcScan_GovernmentIdNfcScanStylesJsonAdapter extends h<GovernmentIdNfcScan.GovernmentIdNfcScanStyles> {

    @NotNull
    private final h<AttributeStyles.GovernmentIdNfcScanInputDateStyles> nullableGovernmentIdNfcScanInputDateStylesAdapter;

    @NotNull
    private final h<AttributeStyles.GovernmentIdNfcScanInputTextStyles> nullableGovernmentIdNfcScanInputTextStylesAdapter;

    @NotNull
    private final h<AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles> nullableGovernmentIdNfcScanPrimaryButtonStylesAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"buttonPrimaryStyle", "inputTextStyle", "inputDateStyle"});

    public GovernmentIdNfcScan_GovernmentIdNfcScanStylesJsonAdapter(@NotNull w wVar) {
        this.nullableGovernmentIdNfcScanPrimaryButtonStylesAdapter = wVar.f(AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles.class, L.d(), "buttonPrimaryStyle");
        this.nullableGovernmentIdNfcScanInputTextStylesAdapter = wVar.f(AttributeStyles.GovernmentIdNfcScanInputTextStyles.class, L.d(), "inputTextStyle");
        this.nullableGovernmentIdNfcScanInputDateStylesAdapter = wVar.f(AttributeStyles.GovernmentIdNfcScanInputDateStyles.class, L.d(), "inputDateStyle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GovernmentIdNfcScan.GovernmentIdNfcScanStyles");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GovernmentIdNfcScan.GovernmentIdNfcScanStyles m243fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = null;
        AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = null;
        AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                governmentIdNfcScanPrimaryButtonStyles = (AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles) this.nullableGovernmentIdNfcScanPrimaryButtonStylesAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                governmentIdNfcScanInputTextStyles = (AttributeStyles.GovernmentIdNfcScanInputTextStyles) this.nullableGovernmentIdNfcScanInputTextStylesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                governmentIdNfcScanInputDateStyles = (AttributeStyles.GovernmentIdNfcScanInputDateStyles) this.nullableGovernmentIdNfcScanInputDateStylesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new GovernmentIdNfcScan.GovernmentIdNfcScanStyles(governmentIdNfcScanPrimaryButtonStyles, governmentIdNfcScanInputTextStyles, governmentIdNfcScanInputDateStyles);
    }

    public void toJson(@NotNull t tVar, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        if (governmentIdNfcScanStyles == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("buttonPrimaryStyle");
        this.nullableGovernmentIdNfcScanPrimaryButtonStylesAdapter.toJson(tVar, governmentIdNfcScanStyles.getButtonPrimaryStyle());
        tVar.Z("inputTextStyle");
        this.nullableGovernmentIdNfcScanInputTextStylesAdapter.toJson(tVar, governmentIdNfcScanStyles.getInputTextStyle());
        tVar.Z("inputDateStyle");
        this.nullableGovernmentIdNfcScanInputDateStylesAdapter.toJson(tVar, governmentIdNfcScanStyles.getInputDateStyle());
        tVar.y();
    }
}
