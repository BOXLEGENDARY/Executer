package ra;

import com.roblox.client.personasdk.R;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a1\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"#\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\"#\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"#\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"", "hours", "minutes", "seconds", "Lra/i;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lra/i;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "LP9/h;", "getIsoFormat", "()Ljava/time/format/DateTimeFormatter;", "isoFormat", "b", "getIsoBasicFormat", "isoBasicFormat", "c", "getFourDigitsFormat", "fourDigitsFormat", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {

    @NotNull
    private static final P9.h a = P9.i.b(c.d);

    @NotNull
    private static final P9.h b = P9.i.b(b.d);

    @NotNull
    private static final P9.h c = P9.i.b(a.d);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "a", "()Ljava/time/format/DateTimeFormatter;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends l implements Function0<DateTimeFormatter> {
        public static final a d = new a();

        a() {
            super(0);
        }

        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "a", "()Ljava/time/format/DateTimeFormatter;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function0<DateTimeFormatter> {
        public static final b d = new b();

        b() {
            super(0);
        }

        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "a", "()Ljava/time/format/DateTimeFormatter;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function0<DateTimeFormatter> {
        public static final c d = new c();

        c() {
            super(0);
        }

        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }

    @NotNull
    public static final i a(Integer num, Integer num2, Integer num3) {
        i iVar;
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                iVar = new i(zoneOffsetOfHoursMinutesSeconds);
            } else if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                iVar = new i(zoneOffsetOfHoursMinutesSeconds2);
            } else {
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
                iVar = new i(zoneOffsetOfTotalSeconds);
            }
            return iVar;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
