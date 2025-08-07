package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import w0.p;

public final class j {

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static int b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void c(TextView textView, int i7) {
            textView.setBreakStrategy(i7);
        }

        static void d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void f(TextView textView, int i7) {
            textView.setHyphenationFrequency(i7);
        }
    }

    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class c {
        static int a(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int b(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int c(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static void d(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }
    }

    static class d {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i7) {
            textView.setFirstBaselineToTopHeight(i7);
        }
    }

    private static class e implements ActionMode.Callback {

        private final ActionMode.Callback f10796a;

        private final TextView f10797b;

        private Class<?> f10798c;

        private Method f10799d;

        private boolean f10800e;

        private boolean f10801f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f10796a = callback;
            this.f10797b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Context context = this.f10797b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f10801f) {
                this.f10801f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f10798c = cls;
                    this.f10799d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f10800e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f10798c = null;
                    this.f10799d = null;
                    this.f10800e = false;
                }
            }
            try {
                Method declaredMethod = (this.f10800e && this.f10798c.isInstance(menu)) ? this.f10799d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int i7 = 0; i7 < listC.size(); i7++) {
                    ResolveInfo resolveInfo = listC.get(i7);
                    menu.add(0, 0, i7 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f10797b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        ActionMode.Callback d() {
            return this.f10796a;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f10796a.onActionItemClicked(actionMode, menuItem);
        }

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f10796a.onCreateActionMode(actionMode, menu);
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f10796a.onDestroyActionMode(actionMode);
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            g(menu);
            return this.f10796a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.a(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int b(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.b(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    public static int c(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.c(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @Deprecated
    public static Drawable[] d(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int e(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int f(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int g(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic h(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z7 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z7) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    public static p.a i(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new p.a(d.c(textView));
        }
        p.a.C0237a c0237a = new p.a.C0237a(new TextPaint(textView.getPaint()));
        c0237a.b(a.a(textView));
        c0237a.c(a.b(textView));
        c0237a.d(h(textView));
        return c0237a.a();
    }

    public static void j(TextView textView, int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.d(textView, i7, i8, i9, i10);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }
    }

    public static void k(TextView textView, ColorStateList colorStateList) {
        x0.g.g(textView);
        a.d(textView, colorStateList);
    }

    public static void l(TextView textView, PorterDuff.Mode mode) {
        x0.g.g(textView);
        a.e(textView, mode);
    }

    @Deprecated
    public static void m(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void n(TextView textView, int i7) {
        x0.g.d(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            d.d(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void o(TextView textView, int i7) {
        x0.g.d(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static void p(TextView textView, int i7) {
        x0.g.d(i7);
        if (i7 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public static void q(TextView textView, p pVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(d.a(pVar.b()));
        } else {
            if (!i(textView).a(pVar.a())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(pVar);
        }
    }

    public static void r(TextView textView, int i7) {
        textView.setTextAppearance(i7);
    }

    public static void s(TextView textView, p.a aVar) {
        textView.setTextDirection(g(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.c(textView, aVar.b());
        a.f(textView, aVar.c());
    }

    public static ActionMode.Callback t(ActionMode.Callback callback) {
        return callback instanceof e ? ((e) callback).d() : callback;
    }

    public static ActionMode.Callback u(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof e) || callback == null) ? callback : new e(callback, textView);
    }
}
