package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.view.Z;
import com.github.luben.zstd.BuildConfig;
import f6.ck.ZJZXBWla;
import g.C2456j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class q {

    private static final Class<?>[] f8713b = {Context.class, AttributeSet.class};

    private static final int[] f8714c = {R.attr.onClick};

    private static final int[] f8715d = {R.attr.accessibilityHeading};

    private static final int[] f8716e = {R.attr.accessibilityPaneTitle};

    private static final int[] f8717f = {R.attr.screenReaderFocusable};

    private static final String[] f8718g = {"android.widget.", "android.view.", "android.webkit."};

    private static final g0.k<String, Constructor<? extends View>> f8719h = new g0.k<>();

    private final Object[] f8720a = new Object[2];

    private static class a implements View.OnClickListener {

        private final View f8721d;

        private final String f8722e;

        private Method f8723i;

        private Context f8724v;

        public a(View view, String str) {
            this.f8721d = view;
            this.f8722e = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f8722e, View.class)) != null) {
                        this.f8723i = method;
                        this.f8724v = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f8721d.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f8721d.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f8722e + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f8721d.getClass() + str);
        }

        @Override
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f8723i == null) {
                a(this.f8721d.getContext());
            }
            try {
                this.f8723i.invoke(this.f8724v, view);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException("Could not execute method for android:onClick", e8);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8715d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            Z.o0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f8716e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            Z.q0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f8717f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            Z.D0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && Z.N(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8714c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws InflateException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String str3;
        g0.k<String, Constructor<? extends View>> kVar = f8719h;
        Constructor<? extends View> constructor = kVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f8713b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f8720a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f8720a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i7 = 0;
            while (true) {
                String[] strArr = f8718g;
                if (i7 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i7]);
                if (viewS != null) {
                    return viewS;
                }
                i7++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f8720a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z7, boolean z8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2456j.f20754J3, 0, 0);
        int resourceId = z7 ? typedArrayObtainStyledAttributes.getResourceId(C2456j.f20757K3, 0) : 0;
        if (z8 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20760L3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected AppCompatCheckedTextView f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    protected AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected AppCompatMultiAutoCompleteTextView j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected AppCompatRatingBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    protected AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected AppCompatToggleButton p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z7, boolean z8, boolean z9, boolean z10) {
        View viewL;
        Context context2 = (!z7 || view == null) ? context : view.getContext();
        if (z8 || z9) {
            context2 = u(context2, attributeSet, z8, z9);
        }
        if (z10) {
            context2 = TintContextWrapper.wrap(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals(ZJZXBWla.PjZ)) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case 1:
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case 2:
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case 3:
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case 4:
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case 5:
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case 6:
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case 7:
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case '\b':
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case '\t':
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case '\n':
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case 11:
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case '\f':
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case '\r':
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
