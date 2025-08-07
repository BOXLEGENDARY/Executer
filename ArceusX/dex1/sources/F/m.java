package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import f.AbstractC2431a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf/m;", "Lf/a;", "Landroid/net/Uri;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Lf/a$a;", "b", "(Landroid/content/Context;Landroid/net/Uri;)Lf/a$a;", BuildConfig.FLAVOR, "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class m extends AbstractC2431a<Uri, Boolean> {
    @Override
    public Intent createIntent(Context context, Uri input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return intentPutExtra;
    }

    @Override
    public final AbstractC2431a.C0186a<Boolean> getSynchronousResult(Context context, Uri input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override
    public final Boolean parseResult(int resultCode, Intent intent) {
        return Boolean.valueOf(resultCode == -1);
    }
}
