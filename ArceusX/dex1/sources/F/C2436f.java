package f;

import K0.wJ.BtcVLuo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import com.github.luben.zstd.BuildConfig;
import e.C2407g;
import f.AbstractC2431a;
import f.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Lf/f;", "Lf/a;", "Le/g;", BuildConfig.FLAVOR, "Landroid/net/Uri;", BuildConfig.FLAVOR, "maxItems", "<init>", "(I)V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Le/g;)Landroid/content/Intent;", "Lf/a$a;", "b", "(Landroid/content/Context;Le/g;)Lf/a$a;", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/util/List;", "I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class C2436f extends AbstractC2431a<C2407g, List<Uri>> {

    public static final Companion INSTANCE = new Companion(null);

    private final int maxItems;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf/f$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "()I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            if (h.INSTANCE.e()) {
                return MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }

        private Companion() {
        }
    }

    public C2436f(int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? INSTANCE.a() : i7);
    }

    @Override
    public Intent createIntent(Context context, C2407g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        h.Companion aVar = h.INSTANCE;
        if (aVar.e()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.b(input.getMediaType()));
            int iMin = Math.min(this.maxItems, input.getMaxItems());
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.getIsOrderedSelection());
            if (!input.getIsCustomAccentColorApplied()) {
                return intent;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            return intent;
        }
        if (!aVar.d(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.b(input.getMediaType()));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() != null) {
                return intent2;
            }
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent2;
        }
        ResolveInfo resolveInfoA = aVar.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aVar.b(input.getMediaType()));
        int iMin2 = Math.min(this.maxItems, input.getMaxItems());
        if (iMin2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
        intent3.putExtra(BtcVLuo.EzQcv, input.getIsOrderedSelection());
        if (input.getIsCustomAccentColorApplied()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
        }
        return intent3;
    }

    @Override
    public final AbstractC2431a.C0186a<List<Uri>> getSynchronousResult(Context context, C2407g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
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

    public C2436f(int i7) {
        this.maxItems = i7;
        if (i7 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }
}
