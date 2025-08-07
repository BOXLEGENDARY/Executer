package m3;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import n3.C2643a;

public class m {
    public static void a(Status status, C1574k<Void> c1574k) {
        b(status, null, c1574k);
    }

    public static <ResultT> void b(Status status, ResultT resultt, C1574k<ResultT> c1574k) {
        if (status.r()) {
            c1574k.c(resultt);
        } else {
            c1574k.b(C2643a.a(status));
        }
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(Status status, ResultT resultt, C1574k<ResultT> c1574k) {
        return status.r() ? c1574k.e(resultt) : c1574k.d(C2643a.a(status));
    }
}
