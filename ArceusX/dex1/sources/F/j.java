package f;

import android.content.Context;
import android.content.Intent;
import com.github.luben.zstd.BuildConfig;
import f.AbstractC2431a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf/j;", "Lf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", BuildConfig.FLAVOR, "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lf/a$a;", "b", "(Landroid/content/Context;Ljava/lang/String;)Lf/a$a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends AbstractC2431a<String, Boolean> {
    @Override
    public Intent createIntent(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return i.INSTANCE.a(new String[]{input});
    }

    @Override
    public AbstractC2431a.C0186a<Boolean> getSynchronousResult(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (androidx.core.content.a.a(context, input) == 0) {
            return new AbstractC2431a.C0186a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override
    public Boolean parseResult(int resultCode, Intent intent) {
        if (intent == null || resultCode != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z7 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (intArrayExtra[i7] == 0) {
                    z7 = true;
                    break;
                }
                i7++;
            }
        }
        return Boolean.valueOf(z7);
    }
}
