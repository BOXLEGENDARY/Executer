package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0689q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u0010&\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010(R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "config", "", "children", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;Ljava/util/List;)V", "newChildren", "Z0", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "c", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "e", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "", "Lu9/a;", "i", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class HorizontalStackComponent implements UiComponent, UiComponentGroup, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<HorizontalStackComponent> CREATOR = new a();

    @NotNull
    private final HorizontalStack config;

    @NotNull
    private final List<UiComponent> children;

    @NotNull
    private final List<u9.a> associatedViews;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalStackComponent> {
        @Override
        @NotNull
        public final HorizontalStackComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HorizontalStack horizontalStack = (HorizontalStack) parcel.readParcelable(HorizontalStackComponent.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(HorizontalStackComponent.class.getClassLoader()));
            }
            return new HorizontalStackComponent(horizontalStack, arrayList);
        }

        @Override
        @NotNull
        public final HorizontalStackComponent[] newArray(int i) {
            return new HorizontalStackComponent[i];
        }
    }

    public HorizontalStackComponent(@NotNull HorizontalStack horizontalStack, @NotNull List<? extends UiComponent> list) {
        Intrinsics.checkNotNullParameter(horizontalStack, "config");
        Intrinsics.checkNotNullParameter(list, "children");
        this.config = horizontalStack;
        this.children = list;
        this.associatedViews = new ArrayList();
    }

    public static HorizontalStackComponent b(HorizontalStackComponent horizontalStackComponent, HorizontalStack horizontalStack, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontalStack = horizontalStackComponent.config;
        }
        if ((i & 2) != 0) {
            list = horizontalStackComponent.children;
        }
        return horizontalStackComponent.a(horizontalStack, list);
    }

    @Override
    @NotNull
    public UiComponentGroup Z0(@NotNull List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return b(this, null, newChildren, 1, null);
    }

    @NotNull
    public final HorizontalStackComponent a(@NotNull HorizontalStack config, @NotNull List<? extends UiComponent> children) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(children, "children");
        return new HorizontalStackComponent(config, children);
    }

    @Override
    @NotNull
    public HorizontalStack e() {
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
        if (!(other instanceof HorizontalStackComponent)) {
            return false;
        }
        HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) other;
        return Intrinsics.b(this.config, horizontalStackComponent.config) && Intrinsics.b(this.children, horizontalStackComponent.children);
    }

    @Override
    @NotNull
    public List<UiComponent> getChildren() {
        return this.children;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        HorizontalStack.Attributes attributes = e().getAttributes();
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
        return (this.config.hashCode() * 31) + this.children.hashCode();
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "HorizontalStackComponent(config=" + this.config + ", children=" + this.children + ")";
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

    public HorizontalStackComponent(HorizontalStack horizontalStack, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            List<UiComponentConfig> children = horizontalStack.getChildren();
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
        this(horizontalStack, list);
    }
}
