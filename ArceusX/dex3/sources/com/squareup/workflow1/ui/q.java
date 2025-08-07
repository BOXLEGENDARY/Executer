package com.squareup.workflow1.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import ka.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/os/Parcelable;", "Lf8/i;", "a", "(Landroid/os/Parcelable;)Lf8/i;", "wf1-core-android"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokio/f;", "bufferedSink", "", "a", "(Lokio/f;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<okio.f, Unit> {
        final Parcelable d;

        a(Parcelable parcelable) {
            super(1);
            this.d = parcelable;
        }

        public final void a(@NotNull okio.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "bufferedSink");
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            parcelObtain.writeParcelable(this.d, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            Intrinsics.checkNotNullExpressionValue(bArrMarshall, "byteArray");
            fVar.Y0(bArrMarshall);
            parcelObtain.recycle();
        }

        public Object invoke(Object obj) {
            a((okio.f) obj);
            return Unit.a;
        }
    }

    @NotNull
    public static final Snapshot a(@NotNull Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "<this>");
        return Snapshot.INSTANCE.c(new a(parcelable));
    }
}
