package com.withpersona.sdk2.inquiry.network.dto.government_id;

import T9.a;
import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CapturePageConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CapturePageConfig> CREATOR = new Creator();
    private final AutoCaptureConfig autoCaptureConfig;
    private final ManualCaptureConfig manualCaptureConfig;
    private final OverlayConfig overlay;
    private final String side;

    @i(generateAdapter = true)
    public static final class AutoCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new Creator();
        private final List<RuleSet> ruleSets;

        public static final class Creator implements Parcelable.Creator<AutoCaptureConfig> {
            @Override
            @NotNull
            public final AutoCaptureConfig createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(RuleSet.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new AutoCaptureConfig(arrayList);
            }

            @Override
            @NotNull
            public final AutoCaptureConfig[] newArray(int i) {
                return new AutoCaptureConfig[i];
            }
        }

        public AutoCaptureConfig(List<RuleSet> list) {
            this.ruleSets = list;
        }

        public static AutoCaptureConfig copy$default(AutoCaptureConfig autoCaptureConfig, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = autoCaptureConfig.ruleSets;
            }
            return autoCaptureConfig.copy(list);
        }

        public final List<RuleSet> component1() {
            return this.ruleSets;
        }

        @NotNull
        public final AutoCaptureConfig copy(List<RuleSet> list) {
            return new AutoCaptureConfig(list);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AutoCaptureConfig) && Intrinsics.b(this.ruleSets, ((AutoCaptureConfig) obj).ruleSets);
        }

        public final List<RuleSet> getRuleSets() {
            return this.ruleSets;
        }

        public int hashCode() {
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "AutoCaptureConfig(ruleSets=" + this.ruleSets + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RuleSet> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
    }

    public static final class Creator implements Parcelable.Creator<CapturePageConfig> {
        @Override
        @NotNull
        public final CapturePageConfig createFromParcel(@NotNull Parcel parcel) {
            return new CapturePageConfig(parcel.readString(), parcel.readInt() == 0 ? null : ManualCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final CapturePageConfig[] newArray(int i) {
            return new CapturePageConfig[i];
        }
    }

    @i(generateAdapter = true)
    public static final class ManualCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new Creator();
        private final Long delayMs;
        private final Boolean isEnabled;

        public static final class Creator implements Parcelable.Creator<ManualCaptureConfig> {
            @Override
            @NotNull
            public final ManualCaptureConfig createFromParcel(@NotNull Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ManualCaptureConfig(boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override
            @NotNull
            public final ManualCaptureConfig[] newArray(int i) {
                return new ManualCaptureConfig[i];
            }
        }

        public ManualCaptureConfig(Boolean bool, Long l) {
            this.isEnabled = bool;
            this.delayMs = l;
        }

        public static ManualCaptureConfig copy$default(ManualCaptureConfig manualCaptureConfig, Boolean bool, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = manualCaptureConfig.isEnabled;
            }
            if ((i & 2) != 0) {
                l = manualCaptureConfig.delayMs;
            }
            return manualCaptureConfig.copy(bool, l);
        }

        public final Boolean component1() {
            return this.isEnabled;
        }

        public final Long component2() {
            return this.delayMs;
        }

        @NotNull
        public final ManualCaptureConfig copy(Boolean bool, Long l) {
            return new ManualCaptureConfig(bool, l);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) obj;
            return Intrinsics.b(this.isEnabled, manualCaptureConfig.isEnabled) && Intrinsics.b(this.delayMs, manualCaptureConfig.delayMs);
        }

        public final Long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l = this.delayMs;
            return iHashCode + (l != null ? l.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Long l = this.delayMs;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }
    }

    @i(generateAdapter = true)
    public static final class OverlayConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OverlayConfig> CREATOR = new Creator();
        private final RemoteImage overlay;
        private final OverlayLocalIcon overlayFallback;

        public static final class Creator implements Parcelable.Creator<OverlayConfig> {
            @Override
            @NotNull
            public final OverlayConfig createFromParcel(@NotNull Parcel parcel) {
                return new OverlayConfig(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayLocalIcon.valueOf(parcel.readString()) : null);
            }

            @Override
            @NotNull
            public final OverlayConfig[] newArray(int i) {
                return new OverlayConfig[i];
            }
        }

        public OverlayConfig(RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon) {
            this.overlay = remoteImage;
            this.overlayFallback = overlayLocalIcon;
        }

        public static OverlayConfig copy$default(OverlayConfig overlayConfig, RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                remoteImage = overlayConfig.overlay;
            }
            if ((i & 2) != 0) {
                overlayLocalIcon = overlayConfig.overlayFallback;
            }
            return overlayConfig.copy(remoteImage, overlayLocalIcon);
        }

        public final RemoteImage component1() {
            return this.overlay;
        }

        public final OverlayLocalIcon component2() {
            return this.overlayFallback;
        }

        @NotNull
        public final OverlayConfig copy(RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon) {
            return new OverlayConfig(remoteImage, overlayLocalIcon);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverlayConfig)) {
                return false;
            }
            OverlayConfig overlayConfig = (OverlayConfig) obj;
            return Intrinsics.b(this.overlay, overlayConfig.overlay) && this.overlayFallback == overlayConfig.overlayFallback;
        }

        public final RemoteImage getOverlay() {
            return this.overlay;
        }

        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        public int hashCode() {
            RemoteImage remoteImage = this.overlay;
            int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            return iHashCode + (overlayLocalIcon != null ? overlayLocalIcon.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OverlayConfig(overlay=" + this.overlay + ", overlayFallback=" + this.overlayFallback + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            RemoteImage remoteImage = this.overlay;
            if (remoteImage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImage.writeToParcel(parcel, i);
            }
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            if (overlayLocalIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(overlayLocalIcon.name());
            }
        }
    }

    @i(generateAdapter = false)
    public static final class OverlayLocalIcon {
        private static final a $ENTRIES;
        private static final OverlayLocalIcon[] $VALUES;

        @g(name = "barcode")
        public static final OverlayLocalIcon BARCODE = new OverlayLocalIcon("BARCODE", 0);

        @g(name = "passport")
        public static final OverlayLocalIcon PASSPORT = new OverlayLocalIcon("PASSPORT", 1);

        @g(name = "id_front")
        public static final OverlayLocalIcon ID_FRONT = new OverlayLocalIcon("ID_FRONT", 2);

        @g(name = "id_back")
        public static final OverlayLocalIcon ID_BACK = new OverlayLocalIcon("ID_BACK", 3);

        @g(name = "corners_only")
        public static final OverlayLocalIcon CORNERS_ONLY = new OverlayLocalIcon("CORNERS_ONLY", 4);

        @g(name = "empty")
        public static final OverlayLocalIcon EMPTY = new OverlayLocalIcon("EMPTY", 5);

        private static final OverlayLocalIcon[] $values() {
            return new OverlayLocalIcon[]{BARCODE, PASSPORT, ID_FRONT, ID_BACK, CORNERS_ONLY, EMPTY};
        }

        static {
            OverlayLocalIcon[] overlayLocalIconArr$values = $values();
            $VALUES = overlayLocalIconArr$values;
            $ENTRIES = b.a(overlayLocalIconArr$values);
        }

        private OverlayLocalIcon(String str, int i) {
        }

        @NotNull
        public static a<OverlayLocalIcon> getEntries() {
            return $ENTRIES;
        }

        public static OverlayLocalIcon valueOf(String str) {
            return (OverlayLocalIcon) Enum.valueOf(OverlayLocalIcon.class, str);
        }

        public static OverlayLocalIcon[] values() {
            return (OverlayLocalIcon[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    public static final class Rule implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Rule> CREATOR = new Creator();
        private final Boolean isRequired;
        private final RuleType type;

        public static final class Creator implements Parcelable.Creator<Rule> {
            @Override
            @NotNull
            public final Rule createFromParcel(@NotNull Parcel parcel) {
                Boolean boolValueOf = null;
                RuleType ruleTypeValueOf = parcel.readInt() == 0 ? null : RuleType.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Rule(ruleTypeValueOf, boolValueOf);
            }

            @Override
            @NotNull
            public final Rule[] newArray(int i) {
                return new Rule[i];
            }
        }

        public Rule(RuleType ruleType, Boolean bool) {
            this.type = ruleType;
            this.isRequired = bool;
        }

        public static Rule copy$default(Rule rule, RuleType ruleType, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                ruleType = rule.type;
            }
            if ((i & 2) != 0) {
                bool = rule.isRequired;
            }
            return rule.copy(ruleType, bool);
        }

        public final RuleType component1() {
            return this.type;
        }

        public final Boolean component2() {
            return this.isRequired;
        }

        @NotNull
        public final Rule copy(RuleType ruleType, Boolean bool) {
            return new Rule(ruleType, bool);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return this.type == rule.type && Intrinsics.b(this.isRequired, rule.isRequired);
        }

        public final RuleType getType() {
            return this.type;
        }

        public int hashCode() {
            RuleType ruleType = this.type;
            int iHashCode = (ruleType == null ? 0 : ruleType.hashCode()) * 31;
            Boolean bool = this.isRequired;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isRequired() {
            return this.isRequired;
        }

        @NotNull
        public String toString() {
            return "Rule(type=" + this.type + ", isRequired=" + this.isRequired + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            RuleType ruleType = this.type;
            if (ruleType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(ruleType.name());
            }
            Boolean bool = this.isRequired;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RuleSet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RuleSet> CREATOR = new Creator();
        private final List<Rule> rules;

        public static final class Creator implements Parcelable.Creator<RuleSet> {
            @Override
            @NotNull
            public final RuleSet createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(Rule.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new RuleSet(arrayList);
            }

            @Override
            @NotNull
            public final RuleSet[] newArray(int i) {
                return new RuleSet[i];
            }
        }

        public RuleSet(List<Rule> list) {
            this.rules = list;
        }

        public static RuleSet copy$default(RuleSet ruleSet, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ruleSet.rules;
            }
            return ruleSet.copy(list);
        }

        public final List<Rule> component1() {
            return this.rules;
        }

        @NotNull
        public final RuleSet copy(List<Rule> list) {
            return new RuleSet(list);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RuleSet) && Intrinsics.b(this.rules, ((RuleSet) obj).rules);
        }

        public final List<Rule> getRules() {
            return this.rules;
        }

        public int hashCode() {
            List<Rule> list = this.rules;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "RuleSet(rules=" + this.rules + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            List<Rule> list = this.rules;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = false)
    public static final class RuleType {
        private static final a $ENTRIES;
        private static final RuleType[] $VALUES;

        @g(name = "id_front")
        public static final RuleType ID_FRONT = new RuleType("ID_FRONT", 0);

        @g(name = "id_front_or_back")
        public static final RuleType ID_FRONT_OR_BACK = new RuleType("ID_FRONT_OR_BACK", 1);

        @g(name = "barcode_pdf417")
        public static final RuleType BARCODE_PDF417 = new RuleType("BARCODE_PDF417", 2);

        @g(name = "passport_mrz")
        public static final RuleType PASSPORT_MRZ = new RuleType("PASSPORT_MRZ", 3);

        @g(name = "text_extraction")
        public static final RuleType TEXT_EXTRACTION = new RuleType("TEXT_EXTRACTION", 4);

        private static final RuleType[] $values() {
            return new RuleType[]{ID_FRONT, ID_FRONT_OR_BACK, BARCODE_PDF417, PASSPORT_MRZ, TEXT_EXTRACTION};
        }

        static {
            RuleType[] ruleTypeArr$values = $values();
            $VALUES = ruleTypeArr$values;
            $ENTRIES = b.a(ruleTypeArr$values);
        }

        private RuleType(String str, int i) {
        }

        @NotNull
        public static a<RuleType> getEntries() {
            return $ENTRIES;
        }

        public static RuleType valueOf(String str) {
            return (RuleType) Enum.valueOf(RuleType.class, str);
        }

        public static RuleType[] values() {
            return (RuleType[]) $VALUES.clone();
        }
    }

    public CapturePageConfig(String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig) {
        this.side = str;
        this.manualCaptureConfig = manualCaptureConfig;
        this.autoCaptureConfig = autoCaptureConfig;
        this.overlay = overlayConfig;
    }

    public static CapturePageConfig copy$default(CapturePageConfig capturePageConfig, String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capturePageConfig.side;
        }
        if ((i & 2) != 0) {
            manualCaptureConfig = capturePageConfig.manualCaptureConfig;
        }
        if ((i & 4) != 0) {
            autoCaptureConfig = capturePageConfig.autoCaptureConfig;
        }
        if ((i & 8) != 0) {
            overlayConfig = capturePageConfig.overlay;
        }
        return capturePageConfig.copy(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    public final String component1() {
        return this.side;
    }

    public final ManualCaptureConfig component2() {
        return this.manualCaptureConfig;
    }

    public final AutoCaptureConfig component3() {
        return this.autoCaptureConfig;
    }

    public final OverlayConfig component4() {
        return this.overlay;
    }

    @NotNull
    public final CapturePageConfig copy(String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig) {
        return new CapturePageConfig(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CapturePageConfig)) {
            return false;
        }
        CapturePageConfig capturePageConfig = (CapturePageConfig) obj;
        return Intrinsics.b(this.side, capturePageConfig.side) && Intrinsics.b(this.manualCaptureConfig, capturePageConfig.manualCaptureConfig) && Intrinsics.b(this.autoCaptureConfig, capturePageConfig.autoCaptureConfig) && Intrinsics.b(this.overlay, capturePageConfig.overlay);
    }

    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    public final String getSide() {
        return this.side;
    }

    public int hashCode() {
        String str = this.side;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        int iHashCode2 = (iHashCode + (manualCaptureConfig == null ? 0 : manualCaptureConfig.hashCode())) * 31;
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        int iHashCode3 = (iHashCode2 + (autoCaptureConfig == null ? 0 : autoCaptureConfig.hashCode())) * 31;
        OverlayConfig overlayConfig = this.overlay;
        return iHashCode3 + (overlayConfig != null ? overlayConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CapturePageConfig(side=" + this.side + ", manualCaptureConfig=" + this.manualCaptureConfig + ", autoCaptureConfig=" + this.autoCaptureConfig + ", overlay=" + this.overlay + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.side);
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        if (manualCaptureConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            manualCaptureConfig.writeToParcel(parcel, i);
        }
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        if (autoCaptureConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoCaptureConfig.writeToParcel(parcel, i);
        }
        OverlayConfig overlayConfig = this.overlay;
        if (overlayConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayConfig.writeToParcel(parcel, i);
        }
    }
}
