package com.withpersona.sdk2.inquiry.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Landroid/os/Parcelable;", "", "showBackButton", "showCancelButton", "showNavBar", "isNavigationEnabled", "<init>", "(ZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "a", "()Z", "e", "b", "i", "c", "v", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class NavigationState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavigationState> CREATOR = new a();

    private final boolean showBackButton;

    private final boolean showCancelButton;

    private final boolean showNavBar;

    private final boolean isNavigationEnabled;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationState> {
        @Override
        @NotNull
        public final NavigationState createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NavigationState(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override
        @NotNull
        public final NavigationState[] newArray(int i) {
            return new NavigationState[i];
        }
    }

    public NavigationState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.showBackButton = z;
        this.showCancelButton = z2;
        this.showNavBar = z3;
        this.isNavigationEnabled = z4;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    public final boolean getShowNavBar() {
        return this.showNavBar;
    }

    public final boolean getIsNavigationEnabled() {
        return this.isNavigationEnabled;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.showBackButton ? 1 : 0);
        parcel.writeInt(this.showCancelButton ? 1 : 0);
        parcel.writeInt(this.showNavBar ? 1 : 0);
        parcel.writeInt(this.isNavigationEnabled ? 1 : 0);
    }
}
