package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class a {

    String f9872a;

    private b f9873b;

    private int f9874c;

    private float f9875d;

    private String f9876e;

    boolean f9877f;

    private int f9878g;

    static class C0079a {

        static final int[] f9879a;

        static {
            int[] iArr = new int[b.values().length];
            f9879a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9879a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9879a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9879a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9879a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9879a[b.f9886y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9879a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        f9886y,
        DIMENSION_TYPE
    }

    public a(String str, b bVar, Object obj) {
        this.f9872a = str;
        this.f9873b = bVar;
        d(obj);
    }

    public static HashMap<String, a> a(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (NoSuchMethodException e8) {
                e8.printStackTrace();
            } catch (InvocationTargetException e9) {
                e9.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        b bVar;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.b3);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == i.c3) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == i.f10159d3) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.f9886y;
            } else {
                if (index == i.f10173f3) {
                    bVar = b.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.f10166e3) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.f10201j3) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == i.f10180g3) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == i.f10187h3) {
                    bVar = b.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == i.f10194i3) {
                    bVar = b.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == i.f10207k3) {
                    bVar = b.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                bVar2 = bVar;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap<String, a> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = "set" + str;
            try {
                switch (C0079a.f9879a[aVar.f9873b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f9878g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f9878g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f9874c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f9875d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f9876e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f9877f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f9875d));
                        break;
                }
            } catch (IllegalAccessException e7) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e7.printStackTrace();
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", e8.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e9) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e9.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (C0079a.f9879a[this.f9873b.ordinal()]) {
            case 1:
            case 2:
                this.f9878g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f9874c = ((Integer) obj).intValue();
                break;
            case 4:
                this.f9875d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f9876e = (String) obj;
                break;
            case 6:
                this.f9877f = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f9875d = ((Float) obj).floatValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        this.f9872a = aVar.f9872a;
        this.f9873b = aVar.f9873b;
        d(obj);
    }
}
