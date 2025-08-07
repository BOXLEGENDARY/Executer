package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import eb.k;
import eb.o;
import eb.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "request", "Lbb/t;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authHeader", "LI8/h;", "productionEndpoint", "", "requestCount", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "b", "(Ljava/lang/String;LI8/h;ILcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Lokhttp3/RequestBody;", "body", "d", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SessionIdRequest", "SessionIdResponse", "StaticTemplate", "StatusRequest", "StatusResponse", "UploadUrlRequest", "UploadUrlResponse", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface FallbackModeService {

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJz\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "", "", "inquiryTemplateId", "inquiryTemplateVersion", "inquiryId", "referenceId", "accountId", "environment", "environmentId", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "e", "d", "h", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "i", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SessionIdRequest {

        @NotNull
        private final String inquiryTemplateId;

        private final String inquiryTemplateVersion;

        private final String inquiryId;

        private final String referenceId;

        private final String accountId;

        private final String environment;

        private final String environmentId;

        private final InquiryFieldMap fields;

        private final String themeSetId;

        public SessionIdRequest(@com.squareup.moshi.g(name = "inquiry-template-id") @NotNull String str, @com.squareup.moshi.g(name = "inquiry-template-version-id") String str2, @com.squareup.moshi.g(name = "inquiry-id") String str3, @com.squareup.moshi.g(name = "reference-id") String str4, @com.squareup.moshi.g(name = "account-id") String str5, String str6, @com.squareup.moshi.g(name = "environment-id") String str7, InquiryFieldMap inquiryFieldMap, @com.squareup.moshi.g(name = "theme-set-id") String str8) {
            Intrinsics.checkNotNullParameter(str, "inquiryTemplateId");
            this.inquiryTemplateId = str;
            this.inquiryTemplateVersion = str2;
            this.inquiryId = str3;
            this.referenceId = str4;
            this.accountId = str5;
            this.environment = str6;
            this.environmentId = str7;
            this.fields = inquiryFieldMap;
            this.themeSetId = str8;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @NotNull
        public final SessionIdRequest copy(@com.squareup.moshi.g(name = "inquiry-template-id") @NotNull String inquiryTemplateId, @com.squareup.moshi.g(name = "inquiry-template-version-id") String inquiryTemplateVersion, @com.squareup.moshi.g(name = "inquiry-id") String inquiryId, @com.squareup.moshi.g(name = "reference-id") String referenceId, @com.squareup.moshi.g(name = "account-id") String accountId, String environment, @com.squareup.moshi.g(name = "environment-id") String environmentId, InquiryFieldMap fields, @com.squareup.moshi.g(name = "theme-set-id") String themeSetId) {
            Intrinsics.checkNotNullParameter(inquiryTemplateId, "inquiryTemplateId");
            return new SessionIdRequest(inquiryTemplateId, inquiryTemplateVersion, inquiryId, referenceId, accountId, environment, environmentId, fields, themeSetId);
        }

        public final InquiryFieldMap getFields() {
            return this.fields;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionIdRequest)) {
                return false;
            }
            SessionIdRequest sessionIdRequest = (SessionIdRequest) other;
            return Intrinsics.b(this.inquiryTemplateId, sessionIdRequest.inquiryTemplateId) && Intrinsics.b(this.inquiryTemplateVersion, sessionIdRequest.inquiryTemplateVersion) && Intrinsics.b(this.inquiryId, sessionIdRequest.inquiryId) && Intrinsics.b(this.referenceId, sessionIdRequest.referenceId) && Intrinsics.b(this.accountId, sessionIdRequest.accountId) && Intrinsics.b(this.environment, sessionIdRequest.environment) && Intrinsics.b(this.environmentId, sessionIdRequest.environmentId) && Intrinsics.b(this.fields, sessionIdRequest.fields) && Intrinsics.b(this.themeSetId, sessionIdRequest.themeSetId);
        }

        @NotNull
        public final String getInquiryTemplateId() {
            return this.inquiryTemplateId;
        }

        public final String getInquiryTemplateVersion() {
            return this.inquiryTemplateVersion;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public int hashCode() {
            int iHashCode = this.inquiryTemplateId.hashCode() * 31;
            String str = this.inquiryTemplateVersion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inquiryId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.referenceId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accountId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.environment;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.environmentId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            InquiryFieldMap inquiryFieldMap = this.fields;
            int iHashCode8 = (iHashCode7 + (inquiryFieldMap == null ? 0 : inquiryFieldMap.hashCode())) * 31;
            String str7 = this.themeSetId;
            return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String getThemeSetId() {
            return this.themeSetId;
        }

        @NotNull
        public String toString() {
            return "SessionIdRequest(inquiryTemplateId=" + this.inquiryTemplateId + ", inquiryTemplateVersion=" + this.inquiryTemplateVersion + ", inquiryId=" + this.inquiryId + ", referenceId=" + this.referenceId + ", accountId=" + this.accountId + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ")";
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SessionIdResponse {

        @NotNull
        private final String token;

        public SessionIdResponse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "token");
            this.token = str;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionIdResponse) && Intrinsics.b(this.token, ((SessionIdResponse) other).token);
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        @NotNull
        public String toString() {
            return "SessionIdResponse(token=" + this.token + ")";
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class StaticTemplate {

        @NotNull
        private final List<NextStep> steps;

        public StaticTemplate(@NotNull List<? extends NextStep> list) {
            Intrinsics.checkNotNullParameter(list, "steps");
            this.steps = list;
        }

        @NotNull
        public final List<NextStep> a() {
            return this.steps;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StaticTemplate) && Intrinsics.b(this.steps, ((StaticTemplate) other).steps);
        }

        public int hashCode() {
            return this.steps.hashCode();
        }

        @NotNull
        public String toString() {
            return "StaticTemplate(steps=" + this.steps + ")";
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "", "", "inquiryTemplateId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class StatusRequest {

        private final String inquiryTemplateId;

        public StatusRequest(@com.squareup.moshi.g(name = "inquiry-template-id") String str) {
            this.inquiryTemplateId = str;
        }

        public final String getInquiryTemplateId() {
            return this.inquiryTemplateId;
        }

        @NotNull
        public final StatusRequest copy(@com.squareup.moshi.g(name = "inquiry-template-id") String inquiryTemplateId) {
            return new StatusRequest(inquiryTemplateId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusRequest) && Intrinsics.b(this.inquiryTemplateId, ((StatusRequest) other).inquiryTemplateId);
        }

        public int hashCode() {
            String str = this.inquiryTemplateId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "StatusRequest(inquiryTemplateId=" + this.inquiryTemplateId + ")";
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "staticInquiryTemplate", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)V", "copy", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class StatusResponse {

        private final StaticTemplate staticInquiryTemplate;

        public StatusResponse(@com.squareup.moshi.g(name = "static-inquiry-template") StaticTemplate staticTemplate) {
            this.staticInquiryTemplate = staticTemplate;
        }

        public final StaticTemplate getStaticInquiryTemplate() {
            return this.staticInquiryTemplate;
        }

        @NotNull
        public final StatusResponse copy(@com.squareup.moshi.g(name = "static-inquiry-template") StaticTemplate staticInquiryTemplate) {
            return new StatusResponse(staticInquiryTemplate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusResponse) && Intrinsics.b(this.staticInquiryTemplate, ((StatusResponse) other).staticInquiryTemplate);
        }

        public int hashCode() {
            StaticTemplate staticTemplate = this.staticInquiryTemplate;
            if (staticTemplate == null) {
                return 0;
            }
            return staticTemplate.hashCode();
        }

        @NotNull
        public String toString() {
            return "StatusResponse(staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "", "", "expectedContentLength", "", "expectedContentType", "<init>", "(JLjava/lang/String;)V", "copy", "(JLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class UploadUrlRequest {

        private final long expectedContentLength;

        @NotNull
        private final String expectedContentType;

        public UploadUrlRequest(@com.squareup.moshi.g(name = "expected-content-length") long j, @com.squareup.moshi.g(name = "expected-content-type") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "expectedContentType");
            this.expectedContentLength = j;
            this.expectedContentType = str;
        }

        public final long getExpectedContentLength() {
            return this.expectedContentLength;
        }

        @NotNull
        public final String getExpectedContentType() {
            return this.expectedContentType;
        }

        @NotNull
        public final UploadUrlRequest copy(@com.squareup.moshi.g(name = "expected-content-length") long expectedContentLength, @com.squareup.moshi.g(name = "expected-content-type") @NotNull String expectedContentType) {
            Intrinsics.checkNotNullParameter(expectedContentType, "expectedContentType");
            return new UploadUrlRequest(expectedContentLength, expectedContentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadUrlRequest)) {
                return false;
            }
            UploadUrlRequest uploadUrlRequest = (UploadUrlRequest) other;
            return this.expectedContentLength == uploadUrlRequest.expectedContentLength && Intrinsics.b(this.expectedContentType, uploadUrlRequest.expectedContentType);
        }

        public int hashCode() {
            return (Long.hashCode(this.expectedContentLength) * 31) + this.expectedContentType.hashCode();
        }

        @NotNull
        public String toString() {
            return "UploadUrlRequest(expectedContentLength=" + this.expectedContentLength + ", expectedContentType=" + this.expectedContentType + ")";
        }
    }

    @com.squareup.moshi.i(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "", "", "location", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class UploadUrlResponse {

        @NotNull
        private final String location;

        public UploadUrlResponse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "location");
            this.location = str;
        }

        @NotNull
        public final String getLocation() {
            return this.location;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadUrlResponse) && Intrinsics.b(this.location, ((UploadUrlResponse) other).location);
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        @NotNull
        public String toString() {
            return "UploadUrlResponse(location=" + this.location + ")";
        }
    }

    @k({"Content-Type: application/json"})
    @o("/session")
    Object a(@eb.a @NotNull SessionIdRequest sessionIdRequest, @NotNull Continuation<? super t<SessionIdResponse>> continuation);

    @k({"Content-Type: application/json"})
    @o("/part")
    Object b(@eb.i("Authorization") @NotNull String str, @eb.i("Persona-Fallback-Production-Endpoint") @NotNull I8.h hVar, @eb.i("Persona-Fallback-Request-Count") int i, @eb.a @NotNull UploadUrlRequest uploadUrlRequest, @NotNull Continuation<? super t<UploadUrlResponse>> continuation);

    @k({"Content-Type: application/json"})
    @o("/template")
    Object c(@eb.i("Authorization") String str, @eb.a @NotNull StatusRequest statusRequest, @NotNull Continuation<? super t<StatusResponse>> continuation);

    @o
    Object d(@y @NotNull String str, @eb.a @NotNull RequestBody requestBody, @NotNull Continuation<? super t<Object>> continuation);
}
