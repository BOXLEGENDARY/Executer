package W5;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.appcompat.app.c;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.M;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/appcompat/app/c;", BuildConfig.FLAVOR, "d", "(Landroidx/appcompat/app/c;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "e", "(Landroid/content/Context;)Landroidx/appcompat/app/c;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final void d(androidx.appcompat.app.c cVar) {
        if (cVar.isShowing()) {
            cVar.dismiss();
        }
    }

    public static final androidx.appcompat.app.c e(Context context) {
        return new c.a(context).d(false).g(M.f19674r).l(new DialogInterface.OnKeyListener() {
            @Override
            public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                return h.f(dialogInterface, i7, keyEvent);
            }
        }).q();
    }

    public static final boolean f(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        return i7 == 4;
    }
}
