package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import com.github.luben.zstd.BuildConfig;
import g.C2447a;
import g.C2450d;
import g.C2452f;
import g.C2453g;
import g.C2454h;
import g.C2456j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t4.gYZ.uCYQMIHsy;

public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final l PRE_API_29_HIDDEN_METHOD_INVOKER;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    G0.a mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private m mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i7);

        boolean onSuggestionSelect(int i7);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        boolean f9202d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f9202d + "}";
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f9202d));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9202d = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        final Runnable mRunShowSoftInputIfNecessary;
        private SearchView mSearchView;
        private int mThreshold;

        class a implements Runnable {
            a() {
            }

            @Override
            public void run() {
                SearchAutoComplete.this.showSoftInputIfNecessary();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override
        public boolean enoughToFilter() {
            return this.mThreshold <= 0 || super.enoughToFilter();
        }

        void ensureImeVisible() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean isEmpty() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.mHasPendingShowSoftInputRequest) {
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                post(this.mRunShowSoftInputIfNecessary);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override
        protected void onFocusChanged(boolean z7, int i7, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z7, i7, rect);
            this.mSearchView.onTextFocusChanged();
        }

        @Override
        public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.mSearchView.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override
        public void onWindowFocusChanged(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z7);
            if (z7 && this.mSearchView.hasFocus() && getVisibility() == 0) {
                this.mHasPendingShowSoftInputRequest = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    ensureImeVisible();
                }
            }
        }

        @Override
        public void performCompletion() {
        }

        @Override
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z7) {
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.mHasPendingShowSoftInputRequest = true;
                    return;
                }
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.mSearchView = searchView;
        }

        @Override
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.mThreshold = i7;
        }

        void showSoftInputIfNecessary() {
            if (this.mHasPendingShowSoftInputRequest) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.mHasPendingShowSoftInputRequest = false;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C2447a.f20556r);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.mRunShowSoftInputIfNecessary = new a();
            this.mThreshold = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView.this.onTextChanged(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            SearchView.this.updateFocusedState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override
        public void run() {
            G0.a aVar = SearchView.this.mSuggestionsAdapter;
            if (aVar instanceof y) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override
        public void onFocusChange(View view, boolean z7) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z7);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView.this.adjustDropDownSizeAndPosition();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.mSearchButton) {
                searchView.onSearchClicked();
                return;
            }
            if (view == searchView.mCloseButton) {
                searchView.onCloseClicked();
                return;
            }
            if (view == searchView.mGoButton) {
                searchView.onSubmitQuery();
            } else if (view == searchView.mVoiceButton) {
                searchView.onVoiceClicked();
            } else if (view == searchView.mSearchSrcTextView) {
                searchView.forceSuggestionQuery();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.mSearchable == null) {
                return false;
            }
            if (searchView.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                return SearchView.this.onSuggestionsKey(view, i7, keyEvent);
            }
            if (SearchView.this.mSearchSrcTextView.isEmpty() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.launchQuerySearch(0, null, searchView2.mSearchSrcTextView.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.onSubmitQuery();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            SearchView.this.onItemClicked(i7, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
            SearchView.this.onItemSelected(i7);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i7) {
            searchAutoComplete.setInputMethodMode(i7);
        }
    }

    private static class l {

        private Method f9214a;

        private Method f9215b;

        private Method f9216c;

        l() throws NoSuchMethodException, SecurityException {
            this.f9214a = null;
            this.f9215b = null;
            this.f9216c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f9214a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f9215b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f9216c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f9215b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f9214a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f9216c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static class m extends TouchDelegate {

        private final View f9217a;

        private final Rect f9218b;

        private final Rect f9219c;

        private final Rect f9220d;

        private final int f9221e;

        private boolean f9222f;

        public m(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f9221e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f9218b = new Rect();
            this.f9220d = new Rect();
            this.f9219c = new Rect();
            a(rect, rect2);
            this.f9217a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f9218b.set(rect);
            this.f9220d.set(rect);
            Rect rect3 = this.f9220d;
            int i7 = this.f9221e;
            rect3.inset(-i7, -i7);
            this.f9219c.set(rect2);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z7;
            boolean z8;
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z9 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z8 = this.f9222f;
                    if (z8 && !this.f9220d.contains(x7, y7)) {
                        z9 = z8;
                        z7 = false;
                    }
                } else {
                    if (action == 3) {
                        z8 = this.f9222f;
                        this.f9222f = false;
                    }
                    z7 = true;
                    z9 = false;
                }
                z9 = z8;
                z7 = true;
            } else if (this.f9218b.contains(x7, y7)) {
                this.f9222f = true;
                z7 = true;
            } else {
                z7 = true;
                z9 = false;
            }
            if (!z9) {
                return false;
            }
            if (!z7 || this.f9219c.contains(x7, y7)) {
                Rect rect = this.f9219c;
                motionEvent.setLocation(x7 - rect.left, y7 - rect.top);
            } else {
                motionEvent.setLocation(this.f9217a.getWidth() / 2, this.f9217a.getHeight() / 2);
            }
            return this.f9217a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        PRE_API_29_HIDDEN_METHOD_INVOKER = Build.VERSION.SDK_INT < 29 ? new l() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i7, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i7 != 0) {
            intent.putExtra("action_key", i7);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i7, String str) {
        int position;
        String strY;
        try {
            String strY2 = y.y(cursor, "suggest_intent_action");
            if (strY2 == null) {
                strY2 = this.mSearchable.getSuggestIntentAction();
            }
            if (strY2 == null) {
                strY2 = "android.intent.action.SEARCH";
            }
            String str2 = strY2;
            String strY3 = y.y(cursor, "suggest_intent_data");
            if (strY3 == null) {
                strY3 = this.mSearchable.getSuggestIntentData();
            }
            if (strY3 != null && (strY = y.y(cursor, "suggest_intent_data_id")) != null) {
                strY3 = strY3 + "/" + Uri.encode(strY);
            }
            return createIntent(str2, strY3 == null ? null : Uri.parse(strY3), y.y(cursor, "suggest_intent_extra_data"), y.y(cursor, "suggest_intent_query"), i7, str);
        } catch (RuntimeException e7) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(LOG_TAG, "Search suggestions cursor at row " + position + " returned exception.", e7);
            return null;
        }
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i7 = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i8 = i7 - iArr2[1];
        int i9 = iArr[0] - iArr2[0];
        rect.set(i9, i8, view.getWidth() + i9, view.getHeight() + i8);
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (this.mSearchSrcTextView.getTextSize() * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C2450d.f20580g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C2450d.f20581h);
    }

    private boolean hasVoiceSearch() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.mSearchable.getVoiceSearchLaunchWebSearch() ? this.mVoiceWebSearchIntent : this.mSearchable.getVoiceSearchLaunchRecognizer() ? this.mVoiceAppSearchIntent : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void launchIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e7) {
            Log.e(LOG_TAG, "Failed launch activity: " + intent, e7);
        }
    }

    private boolean launchSuggestion(int i7, int i8, String str) {
        Cursor cursorB = this.mSuggestionsAdapter.b();
        if (cursorB == null || !cursorB.moveToPosition(i7)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursorB, i8, str));
        return true;
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i7) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursorB = this.mSuggestionsAdapter.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceD = this.mSuggestionsAdapter.d(cursorB);
        if (charSequenceD != null) {
            setQuery(charSequenceD);
        } else {
            setQuery(text);
        }
    }

    private void updateCloseButton() {
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mCloseButton.setVisibility(!zIsEmpty || (this.mIconifiedByDefault && !this.mExpandedInActionView) ? 0 : 8);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        G0.a aVar = this.mSuggestionsAdapter;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            y yVar = new y(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = yVar;
            this.mSearchSrcTextView.setAdapter(yVar);
            ((y) this.mSuggestionsAdapter).H(this.mQueryRefinement ? 2 : 1);
        }
    }

    private void updateSubmitArea() {
        this.mSubmitArea.setVisibility((isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    private void updateSubmitButton(boolean z7) {
        this.mGoButton.setVisibility((this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z7 || !this.mVoiceButtonEnabled)) ? 0 : 8);
    }

    private void updateViewsVisibility(boolean z7) {
        this.mIconified = z7;
        int i7 = 8;
        int i8 = z7 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i8);
        updateSubmitButton(!zIsEmpty);
        this.mSearchEditFrame.setVisibility(z7 ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() != null && !this.mIconifiedByDefault) {
            i7 = 0;
        }
        this.mCollapsedIcon.setVisibility(i7);
        updateCloseButton();
        updateVoiceButton(zIsEmpty);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean z7) {
        int i7 = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z7) {
            this.mGoButton.setVisibility(8);
            i7 = 0;
        }
        this.mVoiceButton.setVisibility(i7);
    }

    void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(C2450d.f20578e) + resources.getDimensionPixelSize(C2450d.f20579f) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            this.mSearchSrcTextView.setDropDownHorizontalOffset(zIsLayoutRtl ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    @Override
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    void forceSuggestionQuery() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.mSearchSrcTextView);
            return;
        }
        l lVar = PRE_API_29_HIDDEN_METHOD_INVOKER;
        lVar.b(this.mSearchSrcTextView);
        lVar.a(this.mSearchSrcTextView);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public G0.a getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    void launchQuerySearch(int i7, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i7, str));
    }

    @Override
    public void onActionViewCollapsed() {
        setQuery(BuildConfig.FLAVOR, false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText(BuildConfig.FLAVOR);
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            OnCloseListener onCloseListener = this.mOnCloseListener;
            if (onCloseListener == null || !onCloseListener.onClose()) {
                clearFocus();
                updateViewsVisibility(true);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    boolean onItemClicked(int i7, int i8, String str) {
        OnSuggestionListener onSuggestionListener = this.mOnSuggestionListener;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionClick(i7)) {
            return false;
        }
        launchSuggestion(i7, 0, null);
        this.mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
        return true;
    }

    boolean onItemSelected(int i7) {
        OnSuggestionListener onSuggestionListener = this.mOnSuggestionListener;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionSelect(i7)) {
            return false;
        }
        rewriteQueryFromSuggestion(i7);
        return true;
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            Rect rect = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect2 = this.mSearchSrcTextViewBounds;
            rect.set(rect2.left, 0, rect2.right, i10 - i8);
            m mVar = this.mTouchDelegate;
            if (mVar != null) {
                mVar.a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
                return;
            }
            m mVar2 = new m(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
            this.mTouchDelegate = mVar2;
            setTouchDelegate(mVar2);
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        int i9;
        if (isIconified()) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.mMaxWidth;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.mMaxWidth) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    protected void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        updateViewsVisibility(savedState.f9202d);
        requestLayout();
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9202d = isIconified();
        return savedState;
    }

    void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.mOnQueryChangeListener;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            if (this.mSearchable != null) {
                launchQuerySearch(0, null, text.toString());
            }
            this.mSearchSrcTextView.setImeVisibility(false);
            dismissSuggestions();
        }
    }

    boolean onSuggestionsKey(View view, int i7, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i7 == 21 || i7 == 22) {
                this.mSearchSrcTextView.setSelection(i7 == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.ensureImeVisible();
                return true;
            }
            if (i7 == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
        }
        return false;
    }

    void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        updateSubmitButton(!zIsEmpty);
        updateVoiceButton(zIsEmpty);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    void onTextFocusChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(uCYQMIHsy.IUnRIGl, "Could not find voice search activity");
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        postUpdateFocusedState();
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i7, rect);
        }
        boolean zRequestFocus = this.mSearchSrcTextView.requestFocus(i7, rect);
        if (zRequestFocus) {
            updateViewsVisibility(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.mIconifiedByDefault == z7) {
            return;
        }
        this.mIconifiedByDefault = z7;
        updateViewsVisibility(z7);
        updateQueryHint();
    }

    public void setImeOptions(int i7) {
        this.mSearchSrcTextView.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.mSearchSrcTextView.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.mMaxWidth = i7;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.mOnQueryChangeListener = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.mOnSuggestionListener = onSuggestionListener;
    }

    public void setQuery(CharSequence charSequence, boolean z7) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z7 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        this.mQueryRefinement = z7;
        G0.a aVar = this.mSuggestionsAdapter;
        if (aVar instanceof y) {
            ((y) aVar).H(z7 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean zHasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = zHasVoiceSearch;
        if (zHasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.mSubmitButtonEnabled = z7;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(G0.a aVar) {
        this.mSuggestionsAdapter = aVar;
        this.mSearchSrcTextView.setAdapter(aVar);
    }

    void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20532M);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new b();
        this.mReleaseCursorRunnable = new c();
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        f fVar = new f();
        this.mOnClickListener = fVar;
        this.mTextKeyListener = new g();
        h hVar = new h();
        this.mOnEditorActionListener = hVar;
        i iVar = new i();
        this.mOnItemClickListener = iVar;
        j jVar = new j();
        this.mOnItemSelectedListener = jVar;
        this.mTextWatcher = new a();
        int[] iArr = C2456j.f20826h2;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        Z.l0(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        LayoutInflater.from(context).inflate(tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20867r2, C2453g.f20696t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C2452f.f20638I);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(C2452f.f20634E);
        View viewFindViewById = findViewById(C2452f.f20637H);
        this.mSearchPlate = viewFindViewById;
        View viewFindViewById2 = findViewById(C2452f.f20644O);
        this.mSubmitArea = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C2452f.f20632C);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2452f.f20635F);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C2452f.f20633D);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C2452f.f20639J);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C2452f.f20636G);
        this.mCollapsedIcon = imageView5;
        Z.r0(viewFindViewById, tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20871s2));
        Z.r0(viewFindViewById2, tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20887w2));
        int i8 = C2456j.f20883v2;
        imageView.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(i8));
        imageView2.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20859p2));
        imageView3.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20848m2));
        imageView4.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20896y2));
        imageView5.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(i8));
        this.mSearchHintIcon = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20879u2);
        TooltipCompat.setTooltipText(imageView, getResources().getString(C2454h.f20713p));
        this.mSuggestionRowLayout = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20891x2, C2453g.f20695s);
        this.mSuggestionCommitIconResId = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20852n2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.f20863q2, true));
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20836j2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = tintTypedArrayObtainStyledAttributes.getText(C2456j.o2);
        this.mQueryHint = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20875t2);
        int i9 = tintTypedArrayObtainStyledAttributes.getInt(C2456j.f20844l2, -1);
        if (i9 != -1) {
            setImeOptions(i9);
        }
        int i10 = tintTypedArrayObtainStyledAttributes.getInt(C2456j.f20840k2, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.f20831i2, true));
        tintTypedArrayObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
