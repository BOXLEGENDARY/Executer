package com.withpersona.sdk2.inquiry.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000f\b\u0010\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "c", "Attributes", "Data", "Meta", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class TransitionInquiryRequest {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Data data;

    @NotNull
    private final Meta meta;

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Attributes {

        private final Map<String, ComponentParam> componentParams;

        public Attributes(Map<String, ? extends ComponentParam> map) {
            this.componentParams = map;
        }

        public final Map<String, ComponentParam> a() {
            return this.componentParams;
        }
    }

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
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

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "", "", "fromComponent", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Meta {

        @NotNull
        private final String fromComponent;

        @NotNull
        private final String fromStep;

        public Meta(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "fromComponent");
            Intrinsics.checkNotNullParameter(str2, "fromStep");
            this.fromComponent = str;
            this.fromStep = str2;
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransitionInquiryRequest a(@NotNull UiComponent fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new TransitionInquiryRequest(new Data(new Attributes(componentParams)), new Meta(fromComponent.getName(), fromStep));
        }

        private Companion() {
        }
    }

    public TransitionInquiryRequest(@NotNull Data data, @NotNull Meta meta) {
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
