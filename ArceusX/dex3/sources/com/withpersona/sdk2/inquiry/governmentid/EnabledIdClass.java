package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v8.EnumC0820A;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000b¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "Landroid/os/Parcelable;", "Lv8/A;", "icon", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "", "name", "<init>", "(Lv8/A;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lv8/A;", "a", "()Lv8/A;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "b", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "i", "Ljava/lang/String;", "getName", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnabledIdClass implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EnabledIdClass> CREATOR = new a();

    @NotNull
    private final EnumC0820A icon;

    @NotNull
    private final IdConfig idConfig;

    @NotNull
    private final String name;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EnabledIdClass> {
        @Override
        @NotNull
        public final EnabledIdClass createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EnabledIdClass(EnumC0820A.valueOf(parcel.readString()), IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override
        @NotNull
        public final EnabledIdClass[] newArray(int i) {
            return new EnabledIdClass[i];
        }
    }

    public EnabledIdClass(@NotNull EnumC0820A enumC0820A, @NotNull IdConfig idConfig, @NotNull String str) {
        Intrinsics.checkNotNullParameter(enumC0820A, "icon");
        Intrinsics.checkNotNullParameter(idConfig, "idConfig");
        Intrinsics.checkNotNullParameter(str, "name");
        this.icon = enumC0820A;
        this.idConfig = idConfig;
        this.name = str;
    }

    @NotNull
    public final EnumC0820A getIcon() {
        return this.icon;
    }

    @NotNull
    public final IdConfig getIdConfig() {
        return this.idConfig;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnabledIdClass)) {
            return false;
        }
        EnabledIdClass enabledIdClass = (EnabledIdClass) other;
        return this.icon == enabledIdClass.icon && Intrinsics.b(this.idConfig, enabledIdClass.idConfig) && Intrinsics.b(this.name, enabledIdClass.name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.idConfig.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "EnabledIdClass(icon=" + this.icon + ", idConfig=" + this.idConfig + ", name=" + this.name + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.icon.name());
        this.idConfig.writeToParcel(parcel, flags);
        parcel.writeString(this.name);
    }
}
