package com.withpersona.sdk2.inquiry.network.dto;

import T9.a;
import T9.b;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.internal.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CheckInquiryResponse {

    @NotNull
    private final Data data;
    private final String token;

    @i(generateAdapter = true)
    public static final class Attributes {
        private final String environment;
        private final Map<String, InquiryField> fields;

        @NotNull
        private final NextStep nextStep;
        private final String selectedCountryCode;
        private final String status;

        @NotNull
        private final WaitForTransitionConfig waitForTransitionConfig;

        public Attributes(String str, String str2, @NotNull NextStep nextStep, Map<String, ? extends InquiryField> map, @g(name = "waitForTransition") @NotNull WaitForTransitionConfig waitForTransitionConfig, String str3) {
            this.selectedCountryCode = str;
            this.status = str2;
            this.nextStep = nextStep;
            this.fields = map;
            this.waitForTransitionConfig = waitForTransitionConfig;
            this.environment = str3;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        @NotNull
        public final NextStep getNextStep() {
            return this.nextStep;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final WaitForTransitionConfig getWaitForTransitionConfig() {
            return this.waitForTransitionConfig;
        }
    }

    public static final class PollingMode {
        private static final a $ENTRIES;
        private static final PollingMode[] $VALUES;

        @g(name = "blocking")
        public static final PollingMode Blocking = new PollingMode("Blocking", 0);

        @g(name = "background")
        public static final PollingMode Background = new PollingMode("Background", 1);

        @g(name = "none")
        public static final PollingMode None = new PollingMode("None", 2);

        private static final PollingMode[] $values() {
            return new PollingMode[]{Blocking, Background, None};
        }

        static {
            PollingMode[] pollingModeArr$values = $values();
            $VALUES = pollingModeArr$values;
            $ENTRIES = b.a(pollingModeArr$values);
        }

        private PollingMode(String str, int i) {
        }

        @NotNull
        public static a<PollingMode> getEntries() {
            return $ENTRIES;
        }

        public static PollingMode valueOf(String str) {
            return (PollingMode) Enum.valueOf(PollingMode.class, str);
        }

        public static PollingMode[] values() {
            return (PollingMode[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    public static final class WaitForTransitionConfig {
        private final Long intervalMs;
        private final Long maxAttempts;

        @NotNull
        private final PollingMode pollingMode;

        public WaitForTransitionConfig(Long l, Long l2, @NotNull PollingMode pollingMode) {
            this.intervalMs = l;
            this.maxAttempts = l2;
            this.pollingMode = pollingMode;
        }

        public final Long getIntervalMs() {
            return this.intervalMs;
        }

        public final Long getMaxAttempts() {
            return this.maxAttempts;
        }

        @NotNull
        public final PollingMode getPollingMode() {
            return this.pollingMode;
        }
    }

    public CheckInquiryResponse(@NotNull Data data, String str) {
        this.data = data;
        this.token = str;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    public final String getToken() {
        return this.token;
    }

    @i(generateAdapter = true)
    public static final class Data {

        @NotNull
        private final Attributes attributes;

        @NotNull
        private final String id;

        @NotNull
        private final String type;

        public Data(@NotNull String str, @NotNull String str2, @NotNull Attributes attributes) {
            this.id = str;
            this.type = str2;
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

        @NotNull
        public final String getType() {
            return this.type;
        }

        public Data(String str, String str2, Attributes attributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new Attributes(null, null, NextStep.Unknown.INSTANCE, null, new WaitForTransitionConfig(null, null, PollingMode.None), null) : attributes);
        }
    }
}
