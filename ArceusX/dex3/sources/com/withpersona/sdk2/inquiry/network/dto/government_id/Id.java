package com.withpersona.sdk2.inquiry.network.dto.government_id;

import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import b8.a;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class Id implements Parcelable {
    private final List<CapturePageConfig> capturePageConfigs;

    @NotNull
    private final String f0class;
    private final IdIcon icon;

    @NotNull
    private final List<String> requiresSides;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Id> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final h createAdapter$lambda$0(Type type, Set set, w wVar) {
            if (Intrinsics.b(type, CapturePageConfig.RuleType.class)) {
                return a.a(CapturePageConfig.RuleType.class).d((Enum) null);
            }
            if (Intrinsics.b(type, CapturePageConfig.OverlayLocalIcon.class)) {
                return a.a(CapturePageConfig.OverlayLocalIcon.class).d((Enum) null);
            }
            if (Intrinsics.b(type, IdLocalIcon.class)) {
                return a.a(IdLocalIcon.class).d((Enum) null);
            }
            return null;
        }

        @NotNull
        public final h.e createAdapter() {
            return new h.e() {
                public final h create(Type type, Set set, w wVar) {
                    return Id.Companion.createAdapter$lambda$0(type, set, wVar);
                }
            };
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<Id> {
        @Override
        @NotNull
        public final Id createFromParcel(@NotNull Parcel parcel) {
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            IdIcon idIconCreateFromParcel = parcel.readInt() == 0 ? null : IdIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CapturePageConfig.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Id(string, arrayListCreateStringArrayList, idIconCreateFromParcel, arrayList);
        }

        @Override
        @NotNull
        public final Id[] newArray(int i) {
            return new Id[i];
        }
    }

    @i(generateAdapter = true)
    public static final class IdIcon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdIcon> CREATOR = new Creator();
        private final IdLocalIcon iconFallback;

        public static final class Creator implements Parcelable.Creator<IdIcon> {
            @Override
            @NotNull
            public final IdIcon createFromParcel(@NotNull Parcel parcel) {
                return new IdIcon(parcel.readInt() == 0 ? null : IdLocalIcon.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final IdIcon[] newArray(int i) {
                return new IdIcon[i];
            }
        }

        public IdIcon(IdLocalIcon idLocalIcon) {
            this.iconFallback = idLocalIcon;
        }

        public static IdIcon copy$default(IdIcon idIcon, IdLocalIcon idLocalIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                idLocalIcon = idIcon.iconFallback;
            }
            return idIcon.copy(idLocalIcon);
        }

        public final IdLocalIcon component1() {
            return this.iconFallback;
        }

        @NotNull
        public final IdIcon copy(IdLocalIcon idLocalIcon) {
            return new IdIcon(idLocalIcon);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IdIcon) && this.iconFallback == ((IdIcon) obj).iconFallback;
        }

        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public int hashCode() {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                return 0;
            }
            return idLocalIcon.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdIcon(iconFallback=" + this.iconFallback + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(idLocalIcon.name());
            }
        }
    }

    @i(generateAdapter = false)
    public static final class IdLocalIcon {
        private static final T9.a $ENTRIES;
        private static final IdLocalIcon[] $VALUES;

        @g(name = "world")
        public static final IdLocalIcon WORLD = new IdLocalIcon("WORLD", 0);

        @g(name = "card")
        public static final IdLocalIcon CARD = new IdLocalIcon("CARD", 1);

        @g(name = "flag")
        public static final IdLocalIcon FLAG = new IdLocalIcon("FLAG", 2);

        @g(name = "house")
        public static final IdLocalIcon HOUSE = new IdLocalIcon("HOUSE", 3);

        private static final IdLocalIcon[] $values() {
            return new IdLocalIcon[]{WORLD, CARD, FLAG, HOUSE};
        }

        static {
            IdLocalIcon[] idLocalIconArr$values = $values();
            $VALUES = idLocalIconArr$values;
            $ENTRIES = b.a(idLocalIconArr$values);
        }

        private IdLocalIcon(String str, int i) {
        }

        @NotNull
        public static T9.a<IdLocalIcon> getEntries() {
            return $ENTRIES;
        }

        public static IdLocalIcon valueOf(String str) {
            return (IdLocalIcon) Enum.valueOf(IdLocalIcon.class, str);
        }

        public static IdLocalIcon[] values() {
            return (IdLocalIcon[]) $VALUES.clone();
        }
    }

    public Id(@NotNull String str, @NotNull List<String> list, IdIcon idIcon, List<CapturePageConfig> list2) {
        this.f0class = str;
        this.requiresSides = list;
        this.icon = idIcon;
        this.capturePageConfigs = list2;
    }

    public static Id copy$default(Id id, String str, List list, IdIcon idIcon, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = id.f0class;
        }
        if ((i & 2) != 0) {
            list = id.requiresSides;
        }
        if ((i & 4) != 0) {
            idIcon = id.icon;
        }
        if ((i & 8) != 0) {
            list2 = id.capturePageConfigs;
        }
        return id.copy(str, list, idIcon, list2);
    }

    @NotNull
    public final String component1() {
        return this.f0class;
    }

    @NotNull
    public final List<String> component2() {
        return this.requiresSides;
    }

    public final IdIcon component3() {
        return this.icon;
    }

    public final List<CapturePageConfig> component4() {
        return this.capturePageConfigs;
    }

    @NotNull
    public final Id copy(@NotNull String str, @NotNull List<String> list, IdIcon idIcon, List<CapturePageConfig> list2) {
        return new Id(str, list, idIcon, list2);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Id)) {
            return false;
        }
        Id id = (Id) obj;
        return Intrinsics.b(this.f0class, id.f0class) && Intrinsics.b(this.requiresSides, id.requiresSides) && Intrinsics.b(this.icon, id.icon) && Intrinsics.b(this.capturePageConfigs, id.capturePageConfigs);
    }

    public final List<CapturePageConfig> getCapturePageConfigs() {
        return this.capturePageConfigs;
    }

    @NotNull
    public final String getClass() {
        return this.f0class;
    }

    public final IdIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<String> getRequiresSides() {
        return this.requiresSides;
    }

    public int hashCode() {
        int iHashCode = ((this.f0class.hashCode() * 31) + this.requiresSides.hashCode()) * 31;
        IdIcon idIcon = this.icon;
        int iHashCode2 = (iHashCode + (idIcon == null ? 0 : idIcon.hashCode())) * 31;
        List<CapturePageConfig> list = this.capturePageConfigs;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isDynamicGovId() {
        return this.capturePageConfigs != null;
    }

    @NotNull
    public String toString() {
        return "Id(class=" + this.f0class + ", requiresSides=" + this.requiresSides + ", icon=" + this.icon + ", capturePageConfigs=" + this.capturePageConfigs + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.f0class);
        parcel.writeStringList(this.requiresSides);
        IdIcon idIcon = this.icon;
        if (idIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            idIcon.writeToParcel(parcel, i);
        }
        List<CapturePageConfig> list = this.capturePageConfigs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CapturePageConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }
}
