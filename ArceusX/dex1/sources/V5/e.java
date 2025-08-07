package V5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import com.github.luben.zstd.BuildConfig;
import com.google.gson.stream.JsonReader;
import com.roblox.client.O;
import h7.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class e {

    private static Map<Integer, Pair<String, Float>> f7561a;

    static class a {

        private static Hashtable<String, Typeface> f7562a = new Hashtable<>();

        public static Typeface a(String str, Context context) {
            Typeface typeface = f7562a.get(str);
            if (typeface != null) {
                return typeface;
            }
            if (j6.d.a().r2()) {
                h7.d.a(str);
            }
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                f7562a.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static Map<Integer, Pair<String, Float>> a(Context context) throws IOException, NumberFormatException {
        try {
            HashMap map = new HashMap();
            if (j6.d.a().r2()) {
                h7.d.a("android/fonts/font-mappings.json");
            }
            JsonReader jsonReaderQ = new com.google.gson.f().q(new BufferedReader(new InputStreamReader(context.getAssets().open("android/fonts/font-mappings.json"))));
            jsonReaderQ.beginArray();
            while (jsonReaderQ.hasNext()) {
                String strNextString = BuildConfig.FLAVOR;
                jsonReaderQ.beginObject();
                int iNextInt = -1;
                float fNextDouble = 0.793f;
                while (jsonReaderQ.hasNext()) {
                    String strNextName = jsonReaderQ.nextName();
                    if (strNextName.equals("enum")) {
                        iNextInt = jsonReaderQ.nextInt();
                    } else if (strNextName.equals("font")) {
                        strNextString = jsonReaderQ.nextString();
                    } else if (strNextName.equals("fromRbxFontRatio")) {
                        fNextDouble = (float) jsonReaderQ.nextDouble();
                    } else {
                        jsonReaderQ.skipValue();
                    }
                }
                map.put(Integer.valueOf(iNextInt), Pair.create(strNextString, Float.valueOf(fNextDouble)));
                jsonReaderQ.endObject();
            }
            jsonReaderQ.endArray();
            return map;
        } catch (IOException e7) {
            l.e("rbx.glview.text", "Unable to parse mapping json", e7);
            return new HashMap();
        }
    }

    public static float b(int i7, Context context) {
        if (f7561a == null) {
            f7561a = a(context);
        }
        if (f7561a.containsKey(Integer.valueOf(i7))) {
            return ((Float) f7561a.get(Integer.valueOf(i7)).second).floatValue();
        }
        return 0.793f;
    }

    public static void c(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O.o1);
        String string = typedArrayObtainStyledAttributes.getString(O.p1);
        if (string == null) {
            string = "SourceSansPro-Light.ttf";
        }
        d(textView, context, string);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void d(TextView textView, Context context, String str) {
        if (str != null) {
            Typeface typefaceA = a.a("fonts/" + str, context);
            if (typefaceA != null) {
                textView.setTypeface(typefaceA);
            }
        }
    }

    public static boolean e(TextView textView, Context context, int i7) {
        if (f7561a == null) {
            f7561a = a(context);
        }
        if (f7561a.containsKey(Integer.valueOf(i7))) {
            return f(textView, (String) f7561a.get(Integer.valueOf(i7)).first, context);
        }
        return false;
    }

    public static boolean f(TextView textView, String str, Context context) {
        if (str == null || k7.h.h() == null) {
            return false;
        }
        Typeface typefaceA = a.a("content/fonts/" + str, context);
        if (typefaceA != null) {
            textView.setTypeface(typefaceA);
            return true;
        }
        l.d("rbx.glview.text", String.format("Attempting to load non-existant font: %s.", str));
        return false;
    }
}
