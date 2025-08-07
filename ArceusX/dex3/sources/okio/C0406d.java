package okio;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.o;
import h.a;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;
import p0.h;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0003*\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u00012\f\u0010\b\u001a\b\u0018\u00010\u0007R\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "", "resId", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", "b", "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "resources", "d", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/h;", "c", "(Landroid/content/Context;)Landroidx/lifecycle/h;", "", "permission", "", "e", "(Landroid/content/Context;Ljava/lang/String;)Z", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0406d {
    @NotNull
    public static final Drawable a(@NotNull Context context, int i) {
        Drawable drawableB = a.b(context, i);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    @NotNull
    public static final Drawable b(@NotNull Resources resources, int i, Resources.Theme theme) {
        Drawable drawableE = h.e(resources, i, theme);
        if (drawableE != null) {
            return drawableE;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final androidx.lifecycle.h c(Context context) {
        while (!(context instanceof o)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((o) context).getLifecycle();
    }

    @NotNull
    public static final Drawable d(@NotNull Context context, @NotNull Resources resources, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(@NotNull Context context, @NotNull String str) {
        return androidx.core.content.a.a(context, str) == 0;
    }
}
