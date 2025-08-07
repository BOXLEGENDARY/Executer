package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b#\u0010-\"\u0004\b.\u0010/R&\u00105\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b2\u0010(\u0012\u0004\b3\u00104\u001a\u0004\b+\u0010*R\u0016\u00109\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "config", "", "children", "", "isActive", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;Ljava/util/List;Z)V", "newChildren", "Z0", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;Ljava/util/List;Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "c", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "e", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "i", "Z", "()Z", "f", "(Z)V", "", "Lu9/a;", "v", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ClickableStackComponent implements UiComponent, UiComponentGroup, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<ClickableStackComponent> CREATOR = new a();

    @NotNull
    private final ClickableStack config;

    @NotNull
    private final List<UiComponent> children;

    private boolean isActive;

    @NotNull
    private final List<u9.a> associatedViews;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickableStackComponent> {
        @Override
        @NotNull
        public final ClickableStackComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ClickableStack clickableStack = (ClickableStack) parcel.readParcelable(ClickableStackComponent.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ClickableStackComponent.class.getClassLoader()));
            }
            return new ClickableStackComponent(clickableStack, arrayList, parcel.readInt() != 0);
        }

        @Override
        @NotNull
        public final ClickableStackComponent[] newArray(int i) {
            return new ClickableStackComponent[i];
        }
    }

    public ClickableStackComponent(@NotNull ClickableStack clickableStack, @NotNull List<? extends UiComponent> list, boolean z) {
        Intrinsics.checkNotNullParameter(clickableStack, "config");
        Intrinsics.checkNotNullParameter(list, "children");
        this.config = clickableStack;
        this.children = list;
        this.isActive = z;
        this.associatedViews = new ArrayList();
    }

    public static ClickableStackComponent b(ClickableStackComponent clickableStackComponent, ClickableStack clickableStack, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            clickableStack = clickableStackComponent.config;
        }
        if ((i & 2) != 0) {
            list = clickableStackComponent.children;
        }
        if ((i & 4) != 0) {
            z = clickableStackComponent.isActive;
        }
        return clickableStackComponent.a(clickableStack, list, z);
    }

    @Override
    @NotNull
    public UiComponentGroup Z0(@NotNull List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return b(this, null, newChildren, false, 5, null);
    }

    @NotNull
    public final ClickableStackComponent a(@NotNull ClickableStack config, @NotNull List<? extends UiComponent> children, boolean isActive) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(children, "children");
        return new ClickableStackComponent(config, children, isActive);
    }

    @Override
    @NotNull
    public ClickableStack e() {
        return this.config;
    }

    public final boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableStackComponent)) {
            return false;
        }
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) other;
        return Intrinsics.b(this.config, clickableStackComponent.config) && Intrinsics.b(this.children, clickableStackComponent.children) && this.isActive == clickableStackComponent.isActive;
    }

    public final void f(boolean z) {
        this.isActive = z;
    }

    @Override
    @NotNull
    public List<UiComponent> getChildren() {
        return this.children;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        ClickableStack.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        ClickableStack.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override
    @NotNull
    public String getName() {
        return UiComponent.a.a(this);
    }

    public int hashCode() {
        return (((this.config.hashCode() * 31) + this.children.hashCode()) * 31) + Boolean.hashCode(this.isActive);
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "ClickableStackComponent(config=" + this.config + ", children=" + this.children + ", isActive=" + this.isActive + ")";
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
        parcel.writeInt(this.isActive ? 1 : 0);
    }

    public ClickableStackComponent(ClickableStack clickableStack, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            List<UiComponentConfig> children = clickableStack.getChildren();
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
        this(clickableStack, list, (i & 4) != 0 ? false : z);
    }
}
