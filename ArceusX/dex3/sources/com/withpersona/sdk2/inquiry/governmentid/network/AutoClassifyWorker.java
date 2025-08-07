package com.withpersona.sdk2.inquiry.governmentid.network;

import P9.m;
import P9.p;
import bb.t;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import f9.InterfaceC0574a;
import ha.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.g;
import ka.h;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import u5.M;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001c!#6BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "governmentId", "Lf9/a;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lf9/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "n", "(Ljava/util/List;)Ljava/util/List;", "otherWorker", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "h", "Lf9/a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "j", "J", "k", "Z", "Ll8/M;", "l", "Ll8/M;", "idFrontAnalyzer", "SupplementaryData", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AutoClassifyWorker implements o<c> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final String fromStep;

    @NotNull
    private final String fromComponent;

    @NotNull
    private final com.withpersona.sdk2.inquiry.governmentid.network.a service;

    @NotNull
    private final GovernmentId governmentId;

    @NotNull
    private final InterfaceC0574a imageHelper;

    @NotNull
    private final SupplementaryData supplementaryData;

    private final long defaultManualCaptureDelayMs;

    private final boolean extractTextFromImage;

    @NotNull
    private final M idFrontAnalyzer;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "", "()V", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SupplementaryData {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0111a implements a {

            @NotNull
            private final String countryCode;

            @NotNull
            private final IdConfig idConfig;

            public C0111a(@NotNull String str, @NotNull IdConfig idConfig) {
                Intrinsics.checkNotNullParameter(str, "countryCode");
                Intrinsics.checkNotNullParameter(idConfig, "idConfig");
                this.countryCode = str;
                this.idConfig = idConfig;
            }

            @NotNull
            public final IdConfig getIdConfig() {
                return this.idConfig;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements a {

            @NotNull
            private final List<IdConfigForCountry> idClassesPerCountry;

            public b(@NotNull List<IdConfigForCountry> list) {
                Intrinsics.checkNotNullParameter(list, "idClassesPerCountry");
                this.idClassesPerCountry = list;
            }

            @NotNull
            public final List<IdConfigForCountry> a() {
                return this.idClassesPerCountry;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class c implements a {

            @NotNull
            private final List<IdConfigForCountry> idClassesPerCountry;

            public c(@NotNull List<IdConfigForCountry> list) {
                Intrinsics.checkNotNullParameter(list, "idClassesPerCountry");
                this.idClassesPerCountry = list;
            }

            @NotNull
            public final List<IdConfigForCountry> a() {
                return this.idClassesPerCountry;
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "service", "Lf9/a;", "imageHelper", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/a;Lf9/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "b", "Lf9/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {

        @NotNull
        private final com.withpersona.sdk2.inquiry.governmentid.network.a service;

        @NotNull
        private final InterfaceC0574a imageHelper;

        public b(@NotNull com.withpersona.sdk2.inquiry.governmentid.network.a aVar, @NotNull InterfaceC0574a interfaceC0574a) {
            Intrinsics.checkNotNullParameter(aVar, "service");
            Intrinsics.checkNotNullParameter(interfaceC0574a, "imageHelper");
            this.service = aVar;
            this.imageHelper = interfaceC0574a;
        }

        @NotNull
        public final AutoClassifyWorker a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull GovernmentId governmentId, @NotNull SupplementaryData supplementaryData, long defaultManualCaptureDelayMs, boolean extractTextFromImage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(governmentId, "governmentId");
            Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
            return new AutoClassifyWorker(sessionToken, inquiryId, fromStep, fromComponent, this.service, governmentId, this.imageHelper, supplementaryData, defaultManualCaptureDelayMs, extractTextFromImage);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "a", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements c {

            @NotNull
            private final InternalErrorInfo cause;

            public a(@NotNull InternalErrorInfo internalErrorInfo) {
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "autoClassificationResult", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements c {

            @NotNull
            private final a autoClassificationResult;

            public b(@NotNull a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "autoClassificationResult");
                this.autoClassificationResult = aVar;
            }

            @NotNull
            public final a getAutoClassificationResult() {
                return this.autoClassificationResult;
            }
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1", f = "AutoClassifyWorker.kt", l = {125, 139, 145, 156, 165, 174, 180, 184}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends k implements Function2<h<? super c>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2", f = "AutoClassifyWorker.kt", l = {126}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<AutoClassifyResponse>>, Object> {
            int d;
            final AutoClassifyWorker e;
            final List<MultipartBody.Part> i;

            a(AutoClassifyWorker autoClassifyWorker, List<MultipartBody.Part> list, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = autoClassifyWorker;
                this.i = list;
            }

            public final Object invoke(Continuation<? super t<AutoClassifyResponse>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, this.i, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    com.withpersona.sdk2.inquiry.governmentid.network.a aVar = this.e.service;
                    String str = this.e.sessionToken;
                    String str2 = this.e.inquiryId;
                    List<MultipartBody.Part> list = this.i;
                    SupplementaryData supplementaryData = this.e.supplementaryData;
                    this.d = 1;
                    obj = aVar.b(str, str2, list, supplementaryData, this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return obj;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        private static final void m(List<MultipartBody.Part> list, AutoClassifyWorker autoClassifyWorker, Frame frame) {
            String strA;
            MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
            list.add(companion.createFormData("data[attributes][image]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.Companion.create(new File(frame.getAbsoluteFilePath()), MediaType.Companion.parse(frame.getMimeType()))));
            if (!autoClassifyWorker.extractTextFromImage || (strA = autoClassifyWorker.idFrontAnalyzer.a(frame.getAbsoluteFilePath())) == null) {
                return;
            }
            list.add(companion.createFormData("data[attributes][client_extracted_text]", strA));
        }

        public final Object invoke(@NotNull h<? super c> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            d dVar = AutoClassifyWorker.this.new d(continuation);
            dVar.i = obj;
            return dVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) throws P9.m {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AutoClassifyWorker(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull com.withpersona.sdk2.inquiry.governmentid.network.a aVar, @NotNull GovernmentId governmentId, @NotNull InterfaceC0574a interfaceC0574a, @NotNull SupplementaryData supplementaryData, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(str3, "fromStep");
        Intrinsics.checkNotNullParameter(str4, "fromComponent");
        Intrinsics.checkNotNullParameter(aVar, "service");
        Intrinsics.checkNotNullParameter(governmentId, "governmentId");
        Intrinsics.checkNotNullParameter(interfaceC0574a, "imageHelper");
        Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
        this.sessionToken = str;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.service = aVar;
        this.governmentId = governmentId;
        this.imageHelper = interfaceC0574a;
        this.supplementaryData = supplementaryData;
        this.defaultManualCaptureDelayMs = j;
        this.extractTextFromImage = z;
        this.idFrontAnalyzer = new M();
    }

    public final List<IdConfigForCountry> n(List<AutoClassifyResponse.IdClassesForCountry> list) throws m {
        List<AutoClassifyResponse.IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list2, 10));
        for (AutoClassifyResponse.IdClassesForCountry idClassesForCountry : list2) {
            String countryName = idClassesForCountry.getCountryName();
            String countryCode = idClassesForCountry.getCountryCode();
            List<Id> listC = idClassesForCountry.c();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                IdConfig idConfigO = com.withpersona.sdk2.inquiry.governmentid.d.o((Id) it.next(), idClassesForCountry.getCountryCode(), this.defaultManualCaptureDelayMs);
                if (idConfigO != null) {
                    arrayList2.add(idConfigO);
                }
            }
            arrayList.add(new IdConfigForCountry(countryName, countryCode, arrayList2));
        }
        return arrayList;
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.b(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    @Override
    @NotNull
    public g<c> run() {
        return ka.i.x(ka.i.v(new d(null)), c0.a());
    }
}
