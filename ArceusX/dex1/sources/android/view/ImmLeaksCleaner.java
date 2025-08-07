package android.view;

import P9.h;
import P9.i;
import android.app.Activity;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import y0.xyyu.hkVlaTTCDY;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0004\u000e\u000f\n\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "activity", "e", "a", "c", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImmLeaksCleaner implements InterfaceC1698l {

    public static final Companion INSTANCE = new Companion(null);

    private static final h<a> f8417i = i.b(b.f8419d);

    private final Activity activity;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", BuildConfig.FLAVOR, "a", "(Landroid/view/inputmethod/InputMethodManager;)Z", "b", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "c", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "Landroidx/activity/ImmLeaksCleaner$d;", "Landroidx/activity/ImmLeaksCleaner$e;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$a;", "a", "()Landroidx/activity/ImmLeaksCleaner$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements Function0<a> {

        public static final b f8419d = new b();

        b() {
            super(0);
        }

        public final a invoke() throws NoSuchFieldException, SecurityException {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                Intrinsics.checkNotNullExpressionValue(declaredField3, "hField");
                Intrinsics.checkNotNullExpressionValue(declaredField, hkVlaTTCDY.kLAjgc);
                Intrinsics.checkNotNullExpressionValue(declaredField2, "nextServedViewField");
                return new e(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return d.f8420a;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$c;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/activity/ImmLeaksCleaner$a;", "cleaner$delegate", "LP9/h;", "a", "()Landroidx/activity/ImmLeaksCleaner$a;", "cleaner", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return (a) ImmLeaksCleaner.f8417i.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$d;", "Landroidx/activity/ImmLeaksCleaner$a;", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", BuildConfig.FLAVOR, "a", "(Landroid/view/inputmethod/InputMethodManager;)Z", BuildConfig.FLAVOR, "b", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "c", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends a {

        public static final d f8420a = new d();

        private d() {
            super(null);
        }

        @Override
        public boolean a(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return false;
        }

        @Override
        public Object b(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return null;
        }

        @Override
        public View c(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$e;", "Landroidx/activity/ImmLeaksCleaner$a;", "Ljava/lang/reflect/Field;", "hField", "servedViewField", "nextServedViewField", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V", "Landroid/view/inputmethod/InputMethodManager;", BuildConfig.FLAVOR, "a", "(Landroid/view/inputmethod/InputMethodManager;)Z", "Ljava/lang/reflect/Field;", "b", "c", BuildConfig.FLAVOR, "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends a {

        private final Field hField;

        private final Field servedViewField;

        private final Field nextServedViewField;

        public e(Field field, Field field2, Field field3) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "hField");
            Intrinsics.checkNotNullParameter(field2, "servedViewField");
            Intrinsics.checkNotNullParameter(field3, "nextServedViewField");
            this.hField = field;
            this.servedViewField = field2;
            this.nextServedViewField = field3;
        }

        @Override
        public boolean a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override
        public Object b(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override
        public View c(InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1694h.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a aVarA = INSTANCE.a();
        Object objB = aVarA.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = aVarA.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = aVarA.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
