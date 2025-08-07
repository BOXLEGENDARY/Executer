package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "", "children", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;Ljava/util/List;)V", "newChildren", "Z0", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "c", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "e", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class FooterComponent implements UiComponent, UiComponentGroup {

    @NotNull
    public static final Parcelable.Creator<FooterComponent> CREATOR = new a();

    @NotNull
    private final Footer config;

    @NotNull
    private final List<UiComponent> children;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FooterComponent> {
        @Override
        @NotNull
        public final FooterComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Footer footer = (Footer) parcel.readParcelable(FooterComponent.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(FooterComponent.class.getClassLoader()));
            }
            return new FooterComponent(footer, arrayList);
        }

        @Override
        @NotNull
        public final FooterComponent[] newArray(int i) {
            return new FooterComponent[i];
        }
    }

    public FooterComponent(@NotNull Footer footer, @NotNull List<? extends UiComponent> list) {
        Intrinsics.checkNotNullParameter(footer, "config");
        Intrinsics.checkNotNullParameter(list, "children");
        this.config = footer;
        this.children = list;
    }

    public static FooterComponent b(FooterComponent footerComponent, Footer footer, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            footer = footerComponent.config;
        }
        if ((i & 2) != 0) {
            list = footerComponent.children;
        }
        return footerComponent.a(footer, list);
    }

    @Override
    @NotNull
    public UiComponentGroup Z0(@NotNull List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return b(this, null, newChildren, 1, null);
    }

    @NotNull
    public final FooterComponent a(@NotNull Footer config, @NotNull List<? extends UiComponent> children) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(children, "children");
        return new FooterComponent(config, children);
    }

    @Override
    @NotNull
    public Footer e() {
        return this.config;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterComponent)) {
            return false;
        }
        FooterComponent footerComponent = (FooterComponent) other;
        return Intrinsics.b(this.config, footerComponent.config) && Intrinsics.b(this.children, footerComponent.children);
    }

    @Override
    @NotNull
    public List<UiComponent> getChildren() {
        return this.children;
    }

    @Override
    @NotNull
    public String getName() {
        return UiComponent.a.a(this);
    }

    public int hashCode() {
        return (this.config.hashCode() * 31) + this.children.hashCode();
    }

    @NotNull
    public String toString() {
        return "FooterComponent(config=" + this.config + ", children=" + this.children + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        List<UiComponent> list = this.children;
        parcel.writeInt(list.size());
        Iterator<UiComponent> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public FooterComponent(Footer footer, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            List<UiComponentConfig> children = footer.getChildren();
            if (children != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    UiComponent uiComponentG = b.g((UiComponentConfig) it.next());
                    if (uiComponentG != null) {
                        arrayList.add(uiComponentG);
                    }
                }
                list = arrayList;
            } else {
                list = CollectionsKt.j();
            }
        }
        this(footer, list);
    }
}
