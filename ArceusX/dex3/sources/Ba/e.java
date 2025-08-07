package Ba;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LBa/e;", "LAa/b;", "Lkotlin/Function1;", "", "", "logger", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function1;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class e implements Aa.b {

    private final Function1<Object, Unit> logger;

    public e(Function1<Object, Unit> function1) {
        this.logger = function1;
    }

    @Override
    public Object e(Object expression, Object data) {
        Object objFirstOrNull = CollectionsKt.firstOrNull(jb.a.c(expression));
        Function1<Object, Unit> function1 = this.logger;
        if (function1 != null) {
            function1.invoke(objFirstOrNull);
        }
        return objFirstOrNull;
    }
}
