package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import f.AbstractC2431a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lf/d;", "Lf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lf/a$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lf/a$a;", BuildConfig.FLAVOR, "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/util/List;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class C2434d extends AbstractC2431a<String[], List<Uri>> {
    @Override
    public Intent createIntent(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    @Override
    public final AbstractC2431a.C0186a<List<Uri>> getSynchronousResult(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, sMlEMqrxoGI.rnCvz);
        return null;
    }

    @Override
    public final List<Uri> parseResult(int resultCode, Intent intent) {
        List<Uri> listA;
        if (resultCode != -1) {
            intent = null;
        }
        return (intent == null || (listA = C2432b.INSTANCE.a(intent)) == null) ? CollectionsKt.j() : listA;
    }
}
