package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.A;
import androidx.core.view.AbstractC1607b;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import f6.ck.ZJZXBWla;
import g.C2456j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r0.InterfaceMenuC2740a;

public class g extends MenuInflater {

    static final Class<?>[] f8819e;

    static final Class<?>[] f8820f;

    final Object[] f8821a;

    final Object[] f8822b;

    Context f8823c;

    private Object f8824d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        private static final Class<?>[] f8825c = {MenuItem.class};

        private Object f8826a;

        private Method f8827b;

        public a(Object obj, String str) {
            this.f8826a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f8827b = cls.getMethod(str, f8825c);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f8827b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8827b.invoke(this.f8826a, menuItem)).booleanValue();
                }
                this.f8827b.invoke(this.f8826a, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    private class b {

        AbstractC1607b f8828A;

        private CharSequence f8829B;

        private CharSequence f8830C;

        private ColorStateList f8831D = null;

        private PorterDuff.Mode f8832E = null;

        private Menu f8834a;

        private int f8835b;

        private int f8836c;

        private int f8837d;

        private int f8838e;

        private boolean f8839f;

        private boolean f8840g;

        private boolean f8841h;

        private int f8842i;

        private int f8843j;

        private CharSequence f8844k;

        private CharSequence f8845l;

        private int f8846m;

        private char f8847n;

        private int f8848o;

        private char f8849p;

        private int f8850q;

        private int f8851r;

        private boolean f8852s;

        private boolean f8853t;

        private boolean f8854u;

        private int f8855v;

        private int f8856w;

        private String f8857x;

        private String f8858y;

        private String f8859z;

        public b(Menu menu) {
            this.f8834a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f8823c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z7 = false;
            menuItem.setChecked(this.f8852s).setVisible(this.f8853t).setEnabled(this.f8854u).setCheckable(this.f8851r >= 1).setTitleCondensed(this.f8845l).setIcon(this.f8846m);
            int i7 = this.f8855v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f8859z != null) {
                if (g.this.f8823c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f8859z));
            }
            if (this.f8851r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f8857x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f8819e, g.this.f8821a));
                z7 = true;
            }
            int i8 = this.f8856w;
            if (i8 > 0) {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            AbstractC1607b abstractC1607b = this.f8828A;
            if (abstractC1607b != null) {
                A.a(menuItem, abstractC1607b);
            }
            A.c(menuItem, this.f8829B);
            A.g(menuItem, this.f8830C);
            A.b(menuItem, this.f8847n, this.f8848o);
            A.f(menuItem, this.f8849p, this.f8850q);
            PorterDuff.Mode mode = this.f8832E;
            if (mode != null) {
                A.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f8831D;
            if (colorStateList != null) {
                A.d(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f8841h = true;
            i(this.f8834a.add(this.f8835b, this.f8842i, this.f8843j, this.f8844k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f8841h = true;
            SubMenu subMenuAddSubMenu = this.f8834a.addSubMenu(this.f8835b, this.f8842i, this.f8843j, this.f8844k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f8841h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f8823c.obtainStyledAttributes(attributeSet, C2456j.q1);
            this.f8835b = typedArrayObtainStyledAttributes.getResourceId(C2456j.s1, 0);
            this.f8836c = typedArrayObtainStyledAttributes.getInt(C2456j.u1, 0);
            this.f8837d = typedArrayObtainStyledAttributes.getInt(C2456j.v1, 0);
            this.f8838e = typedArrayObtainStyledAttributes.getInt(C2456j.w1, 0);
            this.f8839f = typedArrayObtainStyledAttributes.getBoolean(C2456j.t1, true);
            this.f8840g = typedArrayObtainStyledAttributes.getBoolean(C2456j.r1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(g.this.f8823c, attributeSet, C2456j.x1);
            this.f8842i = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.A1, 0);
            this.f8843j = (tintTypedArrayObtainStyledAttributes.getInt(C2456j.D1, this.f8836c) & (-65536)) | (tintTypedArrayObtainStyledAttributes.getInt(C2456j.E1, this.f8837d) & 65535);
            this.f8844k = tintTypedArrayObtainStyledAttributes.getText(C2456j.F1);
            this.f8845l = tintTypedArrayObtainStyledAttributes.getText(C2456j.G1);
            this.f8846m = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20895y1, 0);
            this.f8847n = c(tintTypedArrayObtainStyledAttributes.getString(C2456j.H1));
            this.f8848o = tintTypedArrayObtainStyledAttributes.getInt(C2456j.O1, 4096);
            this.f8849p = c(tintTypedArrayObtainStyledAttributes.getString(C2456j.I1));
            this.f8850q = tintTypedArrayObtainStyledAttributes.getInt(C2456j.S1, 4096);
            int i7 = C2456j.J1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i7)) {
                this.f8851r = tintTypedArrayObtainStyledAttributes.getBoolean(i7, false) ? 1 : 0;
            } else {
                this.f8851r = this.f8838e;
            }
            this.f8852s = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.B1, false);
            this.f8853t = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.C1, this.f8839f);
            this.f8854u = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.z1, this.f8840g);
            this.f8855v = tintTypedArrayObtainStyledAttributes.getInt(C2456j.T1, -1);
            this.f8859z = tintTypedArrayObtainStyledAttributes.getString(C2456j.K1);
            this.f8856w = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.L1, 0);
            this.f8857x = tintTypedArrayObtainStyledAttributes.getString(C2456j.N1);
            String string = tintTypedArrayObtainStyledAttributes.getString(C2456j.M1);
            this.f8858y = string;
            boolean z7 = string != null;
            if (z7 && this.f8856w == 0 && this.f8857x == null) {
                this.f8828A = (AbstractC1607b) e(string, g.f8820f, g.this.f8822b);
            } else {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f8828A = null;
            }
            this.f8829B = tintTypedArrayObtainStyledAttributes.getText(C2456j.P1);
            this.f8830C = tintTypedArrayObtainStyledAttributes.getText(C2456j.U1);
            int i8 = C2456j.R1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
                this.f8832E = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i8, -1), this.f8832E);
            } else {
                this.f8832E = null;
            }
            int i9 = C2456j.Q1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
                this.f8831D = tintTypedArrayObtainStyledAttributes.getColorStateList(i9);
            } else {
                this.f8831D = null;
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.f8841h = false;
        }

        public void h() {
            this.f8835b = 0;
            this.f8836c = 0;
            this.f8837d = 0;
            this.f8838e = 0;
            this.f8839f = true;
            this.f8840g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f8819e = clsArr;
        f8820f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f8823c = context;
        Object[] objArr = {context};
        this.f8821a = objArr;
        this.f8822b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String str;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = KwdswzaUHE.ahqA;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(str)) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        String str2 = null;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException(ZJZXBWla.GddTfbVuY);
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z8 && name2.equals(str2)) {
                        z8 = false;
                        str2 = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC1607b abstractC1607b = bVar.f8828A;
                            if (abstractC1607b == null || !abstractC1607b.hasSubMenu()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals(str)) {
                        z7 = true;
                    }
                }
            } else if (!z8) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals(str)) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str2 = name3;
                    z8 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f8824d == null) {
            this.f8824d = a(this.f8823c);
        }
        return this.f8824d;
    }

    @Override
    public void inflate(int i7, Menu menu) {
        if (!(menu instanceof InterfaceMenuC2740a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f8823c.getResources().getLayout(i7);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
