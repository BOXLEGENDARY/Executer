package f;

import android.content.Context;
import android.content.Intent;
import android.view.result.ActivityResult;
import android.view.result.IntentSenderRequest;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lf/l;", "Lf/a;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroidx/activity/result/IntentSenderRequest;)Landroid/content/Intent;", BuildConfig.FLAVOR, "resultCode", "intent", "b", "(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends AbstractC2431a<IntentSenderRequest, ActivityResult> {
    @Override
    public Intent createIntent(Context context, IntentSenderRequest input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override
    public ActivityResult parseResult(int resultCode, Intent intent) {
        return new ActivityResult(resultCode, intent);
    }
}
