package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a;", "Lf/a;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a extends f.a<PassportNfcReaderConfig, PassportNfcReaderOutput> {
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull PassportNfcReaderConfig input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, P8.c.a.a());
        intent.putExtra("EXTRA_NFC_READER_CONFIG", input);
        return intent;
    }

    @NotNull
    public PassportNfcReaderOutput parseResult(int resultCode, Intent intent) {
        Bundle extras;
        PassportNfcReaderOutput passportNfcReaderOutput;
        return (intent == null || (extras = intent.getExtras()) == null || (passportNfcReaderOutput = (PassportNfcReaderOutput) u0.c.a(extras, "EXTRA_RESULT", PassportNfcReaderOutput.class)) == null) ? new PassportNfcReaderOutput.Error("Unable to extract output from result intent.", PassportNfcReaderOutput.a.e) : passportNfcReaderOutput;
    }
}
