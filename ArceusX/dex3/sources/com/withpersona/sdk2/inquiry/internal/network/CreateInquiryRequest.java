package com.withpersona.sdk2.inquiry.internal.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.internal.InquiryField;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0003\u0006\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "b", "Data", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CreateInquiryRequest {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Data data;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "attributes", "", "type", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "Adapter", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Data {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final a attributes;

        @NotNull
        private final String type;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "jsonWriter", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "", "toJson", "(Lcom/squareup/moshi/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "Lcom/squareup/moshi/m;", "reader", "fromJson", "(Lcom/squareup/moshi/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @f
            @NotNull
            public final Data fromJson(@NotNull m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                reader.e();
                String strN0 = "";
                String strN02 = strN0;
                while (reader.u()) {
                    String strZ = reader.Z();
                    if (Intrinsics.b(strZ, "templateId")) {
                        strN0 = reader.n0();
                        Intrinsics.checkNotNullExpressionValue(strN0, "nextString(...)");
                    } else if (Intrinsics.b(strZ, "environment")) {
                        strN02 = reader.n0();
                        Intrinsics.checkNotNullExpressionValue(strN02, "nextString(...)");
                    } else {
                        reader.f1();
                    }
                }
                reader.j();
                String str = null;
                return new Data(new a(strN0, null, strN02, "", null, null, null, null, null, 498, null), str, 2, str);
            }

            @z
            public final void toJson(@NotNull t jsonWriter, @NotNull Data data) {
                Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
                Intrinsics.checkNotNullParameter(data, "data");
                jsonWriter.f();
                jsonWriter.Z("attributes");
                jsonWriter.f();
                String templateId = data.getAttributes().getTemplateId();
                if (templateId != null) {
                    jsonWriter.Z("inquiryTemplateId").b1(templateId);
                }
                String templateVersion = data.getAttributes().getTemplateVersion();
                if (templateVersion != null) {
                    jsonWriter.Z("inquiryTemplateVersionId").b1(templateVersion);
                }
                jsonWriter.Z("environment").b1(data.getAttributes().getEnvironment());
                String environmentId = data.getAttributes().getEnvironmentId();
                if (environmentId != null) {
                    jsonWriter.Z("environment_id").b1(environmentId);
                }
                String accountId = data.getAttributes().getAccountId();
                if (accountId != null) {
                    jsonWriter.Z("accountId").b1(accountId);
                }
                String referenceId = data.getAttributes().getReferenceId();
                if (referenceId != null) {
                    jsonWriter.Z("referenceId").b1(referenceId);
                }
                String note = data.getAttributes().getNote();
                if (note != null) {
                    jsonWriter.Z("note").b1(note);
                }
                if (data.getAttributes().d() != null) {
                    jsonWriter.Z("fields");
                    InquiryFieldMap.b.toJson(jsonWriter, new InquiryFieldMap(data.getAttributes().d()));
                }
                if (data.getAttributes().getThemeSetId() != null) {
                    jsonWriter.Z("themeSetId").b1(data.getAttributes().getThemeSetId());
                }
                jsonWriter.y();
                jsonWriter.y();
            }

            private Companion() {
            }
        }

        public Data(@NotNull a aVar, @NotNull String str) {
            Intrinsics.checkNotNullParameter(aVar, "attributes");
            Intrinsics.checkNotNullParameter(str, "type");
            this.attributes = aVar;
            this.type = str;
        }

        @NotNull
        public final a getAttributes() {
            return this.attributes;
        }

        public Data(a aVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i & 2) != 0 ? "inquiry" : str);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$b;", "", "<init>", "()V", "", "templateId", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CreateInquiryRequest a(String templateId, String templateVersion, @NotNull String environment, String environmentId, String accountId, String referenceId, Map<String, ? extends InquiryField> fields, String themeSetId) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            String str = null;
            return new CreateInquiryRequest(new Data(new a(templateId, templateVersion, environment, environmentId, accountId, referenceId, null, fields, themeSetId, 64, null), str, 2, str));
        }

        private Companion() {
        }
    }

    public CreateInquiryRequest(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "", "", "templateId", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "h", "c", "d", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "i", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        private final String templateId;

        private final String templateVersion;

        @NotNull
        private final String environment;

        private final String environmentId;

        private final String accountId;

        private final String referenceId;

        private final String note;

        private final Map<String, InquiryField> fields;

        private final String themeSetId;

        public a(String str, String str2, @NotNull String str3, String str4, String str5, String str6, String str7, Map<String, ? extends InquiryField> map, String str8) {
            Intrinsics.checkNotNullParameter(str3, "environment");
            this.templateId = str;
            this.templateVersion = str2;
            this.environment = str3;
            this.environmentId = str4;
            this.accountId = str5;
            this.referenceId = str6;
            this.note = str7;
            this.fields = map;
            this.themeSetId = str8;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        @NotNull
        public final String getEnvironment() {
            return this.environment;
        }

        public final String getEnvironmentId() {
            return this.environmentId;
        }

        public final Map<String, InquiryField> d() {
            return this.fields;
        }

        public final String getNote() {
            return this.note;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        public final String getThemeSetId() {
            return this.themeSetId;
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : map, (i & 256) != 0 ? null : str8);
        }
    }
}
