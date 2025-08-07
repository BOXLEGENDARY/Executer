package W5;

import P9.m;
import W5.i;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.M;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LW5/f;", "LW5/i;", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", BuildConfig.FLAVOR, "message", "Lkotlin/Function1;", "LW5/i$a;", BuildConfig.FLAVOR, "shouldShowDialog", BuildConfig.FLAVOR, "startUpgrade", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "type", "a", "(LW5/i$a;)V", "Landroid/app/Activity;", "b", "Lkotlin/jvm/functions/Function0;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Landroidx/appcompat/app/c;", "e", "Landroidx/appcompat/app/c;", "dialog", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements i {

    private final Activity activity;

    private final Function0<String> message;

    private final Function1<i.a, Boolean> shouldShowDialog;

    private final Function0<Unit> startUpgrade;

    private androidx.appcompat.app.c dialog;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public class a {

        public static final int[] f7688a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.f7691d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.a.f7692e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.a.f7693i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7688a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override
        public final void onClick(DialogInterface dialogInterface, int i7) {
            f.this.startUpgrade.invoke();
            androidx.appcompat.app.c cVar = f.this.dialog;
            if (cVar != null) {
                cVar.dismiss();
            }
            f.this.dialog = null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override
        public final void onClick(DialogInterface dialogInterface, int i7) {
            f.this.startUpgrade.invoke();
            f.this.a(i.a.f7692e);
        }
    }

    public f(Activity activity, Function0<String> function0, Function1<? super i.a, Boolean> function1, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(function0, "message");
        Intrinsics.checkNotNullParameter(function1, "shouldShowDialog");
        Intrinsics.checkNotNullParameter(function02, "startUpgrade");
        this.activity = activity;
        this.message = function0;
        this.shouldShowDialog = function1;
        this.startUpgrade = function02;
    }

    public static final boolean d(i.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        return true;
    }

    public static final void h(f fVar, i.a aVar) throws m {
        androidx.appcompat.app.c cVarQ;
        androidx.appcompat.app.c cVar = fVar.dialog;
        if (cVar != null) {
            h.d(cVar);
        }
        if (((Boolean) fVar.shouldShowDialog.invoke(aVar)).booleanValue()) {
            int i7 = a.f7688a[aVar.ordinal()];
            if (i7 == 1) {
                Activity activity = fVar.activity;
                cVarQ = new c.a(activity).o(M.f19678t).h((String) fVar.message.invoke()).m(M.f19672q, fVar.new b()).d(false).q();
                Intrinsics.checkNotNullExpressionValue(cVarQ, "show(...)");
            } else if (i7 == 2) {
                Activity activity2 = fVar.activity;
                cVarQ = new c.a(activity2).o(M.f19678t).h((String) fVar.message.invoke()).m(M.f19672q, fVar.new c()).d(false).q();
                Intrinsics.checkNotNullExpressionValue(cVarQ, "show(...)");
            } else {
                if (i7 != 3) {
                    throw new m();
                }
                cVarQ = h.e(fVar.activity);
            }
        } else {
            fVar.startUpgrade.invoke();
            Unit unit = Unit.a;
            cVarQ = null;
        }
        fVar.dialog = cVarQ;
    }

    @Override
    public void a(final i.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public final void run() throws m {
                f.h(this.f7681d, type);
            }
        });
    }

    public f(Activity activity, Function0 function0, Function1 function1, Function0 function02, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, function0, (i7 & 4) != 0 ? new Function1() {
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.d((i.a) obj));
            }
        } : function1, function02);
    }
}
