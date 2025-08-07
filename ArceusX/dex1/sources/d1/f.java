package d1;

import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld1/f;", "Lc1/h$c;", "<init>", "()V", "Lc1/h$b;", "configuration", "Lc1/h;", "a", "(Lc1/h$b;)Lc1/h;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements h.c {
    @Override
    public c1.h a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
