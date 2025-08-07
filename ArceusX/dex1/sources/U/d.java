package U;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class d {
    private static String a(long j7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j7);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j7 - timeUnit2.toMillis(hours));
        long millis = j7 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j7 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static String b(long j7) {
        return a(j7);
    }

    public static String c(long j7) {
        return b(TimeUnit.MICROSECONDS.toMillis(j7));
    }
}
