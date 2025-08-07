package com.withpersona.sdk2.inquiry.internal.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "data", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "b", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "Attributes", "Data", "GpsCollectionRequirement", "GpsPrecisionRequirement", "Meta", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CreateInquirySessionResponse {

    @NotNull
    private final Data data;

    @NotNull
    private final Meta meta;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "gpsCollectionRequirement", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "gpsPrecisionRequirement", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "b", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Attributes {

        private final GpsCollectionRequirement gpsCollectionRequirement;

        private final GpsPrecisionRequirement gpsPrecisionRequirement;

        public Attributes() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final GpsCollectionRequirement getGpsCollectionRequirement() {
            return this.gpsCollectionRequirement;
        }

        public final GpsPrecisionRequirement getGpsPrecisionRequirement() {
            return this.gpsPrecisionRequirement;
        }

        public Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement) {
            this.gpsCollectionRequirement = gpsCollectionRequirement;
            this.gpsPrecisionRequirement = gpsPrecisionRequirement;
        }

        public Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gpsCollectionRequirement, (i & 2) != 0 ? null : gpsPrecisionRequirement);
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "", "", "id", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Data {

        @NotNull
        private final String id;

        @NotNull
        private final Attributes attributes;

        public Data(@NotNull String str, @NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.id = str;
            this.attributes = attributes;
        }

        @NotNull
        public final Attributes getAttributes() {
            return this.attributes;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "", "(Ljava/lang/String;I)V", "REQUIRE", "OPTIONAL", "NONE", "Companion", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class GpsCollectionRequirement {
        private static final T9.a $ENTRIES;
        private static final GpsCollectionRequirement[] $VALUES;

        @NotNull
        public static final Companion INSTANCE;
        public static final GpsCollectionRequirement REQUIRE = new GpsCollectionRequirement("REQUIRE", 0);
        public static final GpsCollectionRequirement OPTIONAL = new GpsCollectionRequirement("OPTIONAL", 1);
        public static final GpsCollectionRequirement NONE = new GpsCollectionRequirement("NONE", 2);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "<init>", "()V", "Lcom/squareup/moshi/m;", "reader", "fromJson", "(Lcom/squareup/moshi/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "Lcom/squareup/moshi/t;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;)V", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Companion extends h<GpsCollectionRequirement> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t writer, GpsCollectionRequirement value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            private Companion() {
            }

            @f
            @NotNull
            public GpsCollectionRequirement m85fromJson(@NotNull m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM0 = reader.M0();
                return Intrinsics.b(objM0, "require") ? GpsCollectionRequirement.REQUIRE : Intrinsics.b(objM0, "optional") ? GpsCollectionRequirement.OPTIONAL : GpsCollectionRequirement.NONE;
            }
        }

        static {
            GpsCollectionRequirement[] gpsCollectionRequirementArrC = c();
            $VALUES = gpsCollectionRequirementArrC;
            $ENTRIES = T9.b.a(gpsCollectionRequirementArrC);
            INSTANCE = new Companion(null);
        }

        private GpsCollectionRequirement(String str, int i) {
        }

        private static final GpsCollectionRequirement[] c() {
            return new GpsCollectionRequirement[]{REQUIRE, OPTIONAL, NONE};
        }

        public static GpsCollectionRequirement valueOf(String str) {
            return (GpsCollectionRequirement) Enum.valueOf(GpsCollectionRequirement.class, str);
        }

        public static GpsCollectionRequirement[] values() {
            return (GpsCollectionRequirement[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "Companion", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class GpsPrecisionRequirement {
        private static final T9.a $ENTRIES;
        private static final GpsPrecisionRequirement[] $VALUES;

        @NotNull
        public static final Companion INSTANCE;
        public static final GpsPrecisionRequirement ROUGH = new GpsPrecisionRequirement("ROUGH", 0);
        public static final GpsPrecisionRequirement PRECISE = new GpsPrecisionRequirement("PRECISE", 1);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "<init>", "()V", "Lcom/squareup/moshi/m;", "reader", "fromJson", "(Lcom/squareup/moshi/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "Lcom/squareup/moshi/t;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;)V", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Companion extends h<GpsPrecisionRequirement> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t writer, GpsPrecisionRequirement value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            private Companion() {
            }

            @f
            @NotNull
            public GpsPrecisionRequirement m86fromJson(@NotNull m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Intrinsics.b(reader.M0(), "rough") ? GpsPrecisionRequirement.ROUGH : GpsPrecisionRequirement.PRECISE;
            }
        }

        static {
            GpsPrecisionRequirement[] gpsPrecisionRequirementArrC = c();
            $VALUES = gpsPrecisionRequirementArrC;
            $ENTRIES = T9.b.a(gpsPrecisionRequirementArrC);
            INSTANCE = new Companion(null);
        }

        private GpsPrecisionRequirement(String str, int i) {
        }

        private static final GpsPrecisionRequirement[] c() {
            return new GpsPrecisionRequirement[]{ROUGH, PRECISE};
        }

        public static GpsPrecisionRequirement valueOf(String str) {
            return (GpsPrecisionRequirement) Enum.valueOf(GpsPrecisionRequirement.class, str);
        }

        public static GpsPrecisionRequirement[] values() {
            return (GpsPrecisionRequirement[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "", "", "accessToken", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Meta {

        @NotNull
        private final String accessToken;

        public Meta(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "accessToken");
            this.accessToken = str;
        }

        @NotNull
        public final String getAccessToken() {
            return this.accessToken;
        }
    }

    public CreateInquirySessionResponse(@NotNull Data data, @NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final Meta getMeta() {
        return this.meta;
    }
}
