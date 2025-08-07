package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.github.luben.zstd.BuildConfig;
import f6.ck.ZJZXBWla;
import g.C2447a;
import g.C2452f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class y extends G0.c implements View.OnClickListener {

    private final SearchView f9353E;

    private final SearchableInfo f9354F;

    private final Context f9355G;

    private final WeakHashMap<String, Drawable.ConstantState> f9356H;

    private final int f9357I;

    private boolean f9358J;

    private int f9359K;

    private ColorStateList f9360L;

    private int f9361M;

    private int f9362N;

    private int f9363O;

    private int f9364P;

    private int f9365Q;

    private int f9366R;

    private static final class a {

        public final TextView f9367a;

        public final TextView f9368b;

        public final ImageView f9369c;

        public final ImageView f9370d;

        public final ImageView f9371e;

        public a(View view) {
            this.f9367a = (TextView) view.findViewById(R.id.text1);
            this.f9368b = (TextView) view.findViewById(R.id.text2);
            this.f9369c = (ImageView) view.findViewById(R.id.icon1);
            this.f9370d = (ImageView) view.findViewById(R.id.icon2);
            this.f9371e = (ImageView) view.findViewById(C2452f.f20669s);
        }
    }

    public y(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f9358J = false;
        this.f9359K = 1;
        this.f9361M = -1;
        this.f9362N = -1;
        this.f9363O = -1;
        this.f9364P = -1;
        this.f9365Q = -1;
        this.f9366R = -1;
        this.f9353E = searchView;
        this.f9354F = searchableInfo;
        this.f9357I = searchView.getSuggestionCommitIconResId();
        this.f9355G = context;
        this.f9356H = weakHashMap;
    }

    private Drawable A(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return B(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f9355G.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException(ZJZXBWla.PND + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e7) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e7);
                }
            }
        } catch (FileNotFoundException e8) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
        return null;
    }

    private Drawable C(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i7 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f9355G.getPackageName() + "/" + i7;
            Drawable drawableU = u(str2);
            if (drawableU != null) {
                return drawableU;
            }
            Drawable drawableE = androidx.core.content.a.e(this.f9355G, i7);
            K(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableU2 = u(str);
            if (drawableU2 != null) {
                return drawableU2;
            }
            Drawable drawableA = A(Uri.parse(str));
            K(str, drawableA);
            return drawableA;
        }
    }

    private Drawable D(Cursor cursor) throws NumberFormatException, IOException {
        int i7 = this.f9364P;
        if (i7 == -1) {
            return null;
        }
        Drawable drawableC = C(cursor.getString(i7));
        return drawableC != null ? drawableC : z();
    }

    private Drawable E(Cursor cursor) {
        int i7 = this.f9365Q;
        if (i7 == -1) {
            return null;
        }
        return C(cursor.getString(i7));
    }

    private static String G(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e(KwdswzaUHE.DNkprGkvsK, "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    private void I(ImageView imageView, Drawable drawable, int i7) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i7);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void J(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void K(String str, Drawable drawable) {
        if (drawable != null) {
            this.f9356H.put(str, drawable.getConstantState());
        }
    }

    private void L(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable u(String str) {
        Drawable.ConstantState constantState = this.f9356H.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence v(CharSequence charSequence) {
        if (this.f9360L == null) {
            TypedValue typedValue = new TypedValue();
            this.f9355G.getTheme().resolveAttribute(C2447a.f20536Q, typedValue, true);
            this.f9360L = this.f9355G.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f9360L, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable w(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f9355G.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("SuggestionsAdapter", e7.toString());
            return null;
        }
    }

    private Drawable x(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f9356H.containsKey(strFlattenToShortString)) {
            Drawable drawableW = w(componentName);
            this.f9356H.put(strFlattenToShortString, drawableW != null ? drawableW.getConstantState() : null);
            return drawableW;
        }
        Drawable.ConstantState constantState = this.f9356H.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f9355G.getResources());
    }

    public static String y(Cursor cursor, String str) {
        return G(cursor, cursor.getColumnIndex(str));
    }

    private Drawable z() throws PackageManager.NameNotFoundException {
        Drawable drawableX = x(this.f9354F.getSearchActivity());
        return drawableX != null ? drawableX : this.f9355G.getPackageManager().getDefaultActivityIcon();
    }

    Drawable B(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f9355G.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor F(SearchableInfo searchableInfo, String str, int i7) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i7 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i7));
        }
        return this.f9355G.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void H(int i7) {
        this.f9359K = i7;
    }

    @Override
    public void a(Cursor cursor) {
        if (this.f9358J) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f9361M = cursor.getColumnIndex("suggest_text_1");
                this.f9362N = cursor.getColumnIndex("suggest_text_2");
                this.f9363O = cursor.getColumnIndex("suggest_text_2_url");
                this.f9364P = cursor.getColumnIndex("suggest_icon_1");
                this.f9365Q = cursor.getColumnIndex("suggest_icon_2");
                this.f9366R = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override
    public CharSequence d(Cursor cursor) {
        String strY;
        String strY2;
        if (cursor == null) {
            return null;
        }
        String strY3 = y(cursor, "suggest_intent_query");
        if (strY3 != null) {
            return strY3;
        }
        if (this.f9354F.shouldRewriteQueryFromData() && (strY2 = y(cursor, "suggest_intent_data")) != null) {
            return strY2;
        }
        if (!this.f9354F.shouldRewriteQueryFromText() || (strY = y(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strY;
    }

    @Override
    public Cursor g(CharSequence charSequence) {
        String string = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f9353E.getVisibility() == 0 && this.f9353E.getWindowVisibility() == 0) {
            try {
                Cursor cursorF = F(this.f9354F, string, 50);
                if (cursorF != null) {
                    cursorF.getCount();
                    return cursorF;
                }
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
        }
        return null;
    }

    @Override
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewQ = q(this.f9355G, b(), viewGroup);
            if (viewQ != null) {
                ((a) viewQ.getTag()).f9367a.setText(e7.toString());
            }
            return viewQ;
        }
    }

    @Override
    public View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewR = r(this.f9355G, b(), viewGroup);
            if (viewR != null) {
                ((a) viewR.getTag()).f9367a.setText(e7.toString());
            }
            return viewR;
        }
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        L(b());
    }

    @Override
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        L(b());
    }

    @Override
    public void o(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i7 = this.f9366R;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        if (aVar.f9367a != null) {
            J(aVar.f9367a, G(cursor, this.f9361M));
        }
        if (aVar.f9368b != null) {
            String strG = G(cursor, this.f9363O);
            CharSequence charSequenceV = strG != null ? v(strG) : G(cursor, this.f9362N);
            if (TextUtils.isEmpty(charSequenceV)) {
                TextView textView = aVar.f9367a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f9367a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f9367a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f9367a.setMaxLines(1);
                }
            }
            J(aVar.f9368b, charSequenceV);
        }
        ImageView imageView = aVar.f9369c;
        if (imageView != null) {
            I(imageView, D(cursor), 4);
        }
        ImageView imageView2 = aVar.f9370d;
        if (imageView2 != null) {
            I(imageView2, E(cursor), 8);
        }
        int i9 = this.f9359K;
        if (i9 != 2 && (i9 != 1 || (i8 & 1) == 0)) {
            aVar.f9371e.setVisibility(8);
            return;
        }
        aVar.f9371e.setVisibility(0);
        aVar.f9371e.setTag(aVar.f9367a.getText());
        aVar.f9371e.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f9353E.onQueryRefine((CharSequence) tag);
        }
    }

    @Override
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewR = super.r(context, cursor, viewGroup);
        viewR.setTag(new a(viewR));
        ((ImageView) viewR.findViewById(C2452f.f20669s)).setImageResource(this.f9357I);
        return viewR;
    }
}
