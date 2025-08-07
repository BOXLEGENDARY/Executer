package x2;

public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i7, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) throws Throwable {
        TResult tresultApply;
        if (i7 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i7--;
        } while (i7 >= 1);
        return tresultApply;
    }
}
