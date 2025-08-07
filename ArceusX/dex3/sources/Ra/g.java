package ra;

import P9.m;
import com.roblox.client.personasdk.R;
import java.time.DateTimeException;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.AbstractC0756c;
import ta.C0805b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lra/f;", "", "value", "Lra/c$b;", "unit", "b", "(Lra/f;ILra/c$b;)Lra/f;", "", "c", "(Lra/f;JLra/c$b;)Lra/f;", "epochDay", "Ljava/time/LocalDate;", "a", "(J)Ljava/time/LocalDate;", "J", "minEpochDay", "maxEpochDay", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g {
    private static final long a = LocalDate.MIN.toEpochDay();
    private static final long b = LocalDate.MAX.toEpochDay();

    private static final LocalDate a(long j) {
        long j2 = a;
        if (j <= b && j2 <= j) {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j);
            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
            return localDateOfEpochDay;
        }
        throw new DateTimeException("The resulting day " + j + " is out of supported LocalDate range.");
    }

    @NotNull
    public static final f b(@NotNull f fVar, int i, @NotNull AbstractC0756c.b bVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "unit");
        return c(fVar, i, bVar);
    }

    @NotNull
    public static final f c(@NotNull f fVar, long j, @NotNull AbstractC0756c.b bVar) throws Exception {
        LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "unit");
        try {
            if (bVar instanceof AbstractC0756c.C0267c) {
                localDatePlusMonths = a(C0805b.a(fVar.getValue().toEpochDay(), C0805b.c(j, ((AbstractC0756c.C0267c) bVar).getDays())));
            } else {
                if (!(bVar instanceof AbstractC0756c.d)) {
                    throw new m();
                }
                localDatePlusMonths = fVar.getValue().plusMonths(C0805b.c(j, ((AbstractC0756c.d) bVar).getMonths()));
            }
            return new f(localDatePlusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new C0754a("The result of adding " + j + " of " + bVar + " to " + fVar + " is out of LocalDate range.", e);
        }
    }
}
