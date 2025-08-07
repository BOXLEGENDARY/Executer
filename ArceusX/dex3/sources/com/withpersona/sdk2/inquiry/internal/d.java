package com.withpersona.sdk2.inquiry.internal;

import android.os.Bundle;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import ha.EnumC0342d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b1\u0010\fR\u0013\u00104\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b3\u0010\fR\u0011\u00106\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b5\u0010-R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u0010\fR\u0011\u0010>\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u0010\fR\u0011\u0010@\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b?\u0010\fR\u0013\u0010B\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bA\u0010\fR\u0011\u0010D\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bC\u0010-R\u0011\u0010F\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bE\u0010-R\u0011\u0010H\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0011\u0010J\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bI\u0010-¨\u0006K"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/d;", "", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "a", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "", "n", "()Ljava/lang/String;", "requestKey", "t", "templateId", "u", "templateVersion", "k", "inquiryId", "r", "sessionToken", "m", "referenceId", "accountId", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "j", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "fieldsWrapper", "", "v", "()Ljava/lang/Integer;", "theme", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "s", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "LF8/d;", "f", "()LF8/d;", "environment", "g", "environmentId", "", "e", "()Z", "enableErrorLogging", "x", "useServerStyles", "p", "routingCountry", "l", "locale", "o", "returnCollectedData", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "h", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "q", "serverEndpoint", "y", "webRtcServerEndpoint", "i", "fallbackModeServerEndpoint", "w", "themeSetId", "b", "consumeExceptions", "z", "isNavBarEnabled", "c", "controlNavigationBar", "d", "controlStatusBar", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    private final Bundle bundle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/d$a;", "", "<init>", "()V", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "DEFAULT_FALLBACK_MODE_SERVER_ENDPOINT", "Ljava/lang/String;", "DEFAULT_SERVER_ENDPOINT", "DEFAULT_WEB_RTC_SERVER_ENDPOINT", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str != null) {
                return StringsKt.J0(str, "Bearer ", (String) null, 2, (Object) null);
            }
            return null;
        }

        private Companion() {
        }
    }

    public d(Bundle bundle) {
        this.bundle = bundle;
    }

    public final String a() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ACCOUNT_ID_KEY");
        }
        return null;
    }

    public final boolean b() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONSUME_EXCEPTIONS", false);
        }
        return false;
    }

    public final boolean c() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_NAVIGATION_BAR", true);
        }
        return true;
    }

    public final boolean d() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_STATUS_BAR", true);
        }
        return true;
    }

    public final boolean e() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("ENABLE_ERROR_LOGGING", true);
        }
        return true;
    }

    @NotNull
    public final EnumC0342d f() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("ENVIRONMENT_KEY") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -2056856391) {
                if (iHashCode == -1711584601 && string.equals("SANDBOX")) {
                    return EnumC0342d.e;
                }
            } else if (string.equals("PRODUCTION")) {
                return EnumC0342d.d;
            }
        }
        return EnumC0342d.d;
    }

    public final String g() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ENVIRONMENT_ID_KEY");
        }
        return null;
    }

    @NotNull
    public final FallbackMode h() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("FALLBACK_MODE") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 64924498) {
                if (iHashCode != 74175084) {
                    if (iHashCode == 1933739535 && string.equals("ALWAYS")) {
                        return FallbackMode.ALWAYS;
                    }
                } else if (string.equals("NEVER")) {
                    return FallbackMode.NEVER;
                }
            } else if (string.equals("DEFER")) {
                return FallbackMode.DEFER;
            }
        }
        return FallbackMode.NEVER;
    }

    @NotNull
    public final String i() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("FALLBACK_MODE_SERVER_ENDPOINT", "https://inquiry-fallback.withpersona.com") : null;
        return string == null ? "https://inquiry-fallback.withpersona.com" : string;
    }

    public final InquiryFieldsMap j() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (InquiryFieldsMap) u0.c.a(bundle, "FIELDS_MAP_KEY", InquiryFieldsMap.class);
        }
        return null;
    }

    public final String k() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("INQUIRY_ID_KEY");
        }
        return null;
    }

    public final String l() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("LOCALE");
        }
        return null;
    }

    public final String m() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("REFERENCE_ID_KEY");
        }
        return null;
    }

    @NotNull
    public final String n() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("REQUEST_KEY") : null;
        return string == null ? "com.withpersona.sdk2.request_key" : string;
    }

    public final boolean o() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("RETURN_COLLECTED_DATA", false);
        }
        return false;
    }

    public final String p() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ROUTING_COUNTRY");
        }
        return null;
    }

    @NotNull
    public final String q() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("SERVER_ENDPOINT", "https://withpersona.com") : null;
        return string == null ? "https://withpersona.com" : string;
    }

    public final String r() {
        String string;
        Bundle bundle = this.bundle;
        if (bundle == null || (string = bundle.getString("SESSION_TOKEN_KEY")) == null) {
            return null;
        }
        return "Bearer " + string;
    }

    public final StaticInquiryTemplate s() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (StaticInquiryTemplate) u0.c.a(bundle, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class);
        }
        return null;
    }

    public final String t() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_ID_KEY");
        }
        return null;
    }

    public final String u() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_VERSION_KEY");
        }
        return null;
    }

    public final Integer v() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return Integer.valueOf(bundle.getInt("THEME_KEY"));
        }
        return null;
    }

    public final String w() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("THEME_SET_ID_KEY");
        }
        return null;
    }

    public final boolean x() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("USE_SERVER_STYLES", true);
        }
        return true;
    }

    @NotNull
    public final String y() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("WEB_RTC_SERVER_ENDPOINT", "https://webrtc-consumer.withpersona.com") : null;
        return string == null ? "https://webrtc-consumer.withpersona.com" : string;
    }

    public final boolean z() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("IS_NAV_BAR_ENABLED", true);
        }
        return true;
    }
}
