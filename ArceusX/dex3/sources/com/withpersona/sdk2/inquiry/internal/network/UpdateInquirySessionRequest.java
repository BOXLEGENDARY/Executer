package com.withpersona.sdk2.inquiry.internal.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0003\n\u0006\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "b", "Attributes", "Data", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class UpdateInquirySessionRequest {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Data data;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "", "", "gpsLongitude", "gpsLatitude", "", "gpsPrecision", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Attributes {

        private final Double gpsLongitude;

        private final Double gpsLatitude;

        private final String gpsPrecision;

        public Attributes() {
            this(null, null, null, 7, null);
        }

        public final Double getGpsLatitude() {
            return this.gpsLatitude;
        }

        public final Double getGpsLongitude() {
            return this.gpsLongitude;
        }

        public final String getGpsPrecision() {
            return this.gpsPrecision;
        }

        public Attributes(Double d, Double d2, String str) {
            this.gpsLongitude = d;
            this.gpsLatitude = d2;
            this.gpsPrecision = str;
        }

        public Attributes(Double d, Double d2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str);
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Data {

        @NotNull
        private final Attributes attributes;

        public Data(@NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        @NotNull
        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;", "", "<init>", "()V", "", "gpsLongitude", "gpsLatitude", "", "gpsPrecision", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "a", "(DDLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UpdateInquirySessionRequest a(double gpsLongitude, double gpsLatitude, @NotNull String gpsPrecision) {
            Intrinsics.checkNotNullParameter(gpsPrecision, "gpsPrecision");
            return new UpdateInquirySessionRequest(new Data(new Attributes(Double.valueOf(gpsLongitude), Double.valueOf(gpsLatitude), gpsPrecision)));
        }

        private Companion() {
        }
    }

    public UpdateInquirySessionRequest(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }
}
