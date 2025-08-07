package com.withpersona.sdk2.inquiry.steps.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.f;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/NumberAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/m;", "reader", "", "fromJson", "(Lcom/squareup/moshi/m;)Ljava/lang/Number;", "Lcom/squareup/moshi/t;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/t;Ljava/lang/Number;)V", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class NumberAdapter {

    @NotNull
    public static final NumberAdapter a = new NumberAdapter();

    private NumberAdapter() {
    }

    @f
    public final Number fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object objM0 = reader.M0();
        Number numberValueOf = objM0 instanceof Number ? (Number) objM0 : null;
        if (numberValueOf instanceof Double) {
            Double d = (Double) numberValueOf;
            if (Double.compare(numberValueOf.doubleValue(), d.intValue()) == 0) {
                numberValueOf = Integer.valueOf(d.intValue());
            }
        } else if (!(numberValueOf instanceof Integer)) {
            return null;
        }
        return numberValueOf;
    }

    @z
    public final void toJson(@NotNull t writer, Number value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }
}
