package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.AbstractC1607b;
import g.C2447a;
import g.C2454h;
import h.C2473a;
import java.lang.reflect.InvocationTargetException;

public class ShareActionProvider extends AbstractC1607b {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    final Context mContext;
    private int mMaxShownActivityCount;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final b mOnMenuItemClickListener;
    OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    String mShareHistoryFileName;

    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    private class a implements ActivityChooserModel.OnChooseActivityListener {
        a() {
        }

        @Override
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.mOnShareTargetSelectedListener;
            if (onShareTargetSelectedListener == null) {
                return false;
            }
            onShareTargetSelectedListener.onShareTargetSelected(shareActionProvider, intent);
            return false;
        }
    }

    private class b implements MenuItem.OnMenuItemClickListener {
        b() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent intentB = ActivityChooserModel.d(shareActionProvider.mContext, shareActionProvider.mShareHistoryFileName).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider.this.updateIntent(intentB);
            }
            ShareActionProvider.this.mContext.startActivity(intentB);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new b();
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new a();
        }
        ActivityChooserModel.d(this.mContext, this.mShareHistoryFileName).q(this.mOnChooseActivityListener);
    }

    @Override
    public boolean hasSubMenu() {
        return true;
    }

    @Override
    public View onCreateActionView() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.d(this.mContext, this.mShareHistoryFileName));
        }
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(C2447a.f20549k, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C2473a.b(this.mContext, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C2454h.f20715r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C2454h.f20714q);
        return activityChooserView;
    }

    @Override
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel activityChooserModelD = ActivityChooserModel.d(this.mContext, this.mShareHistoryFileName);
        PackageManager packageManager = this.mContext.getPackageManager();
        int iF = activityChooserModelD.f();
        int iMin = Math.min(iF, this.mMaxShownActivityCount);
        for (int i7 = 0; i7 < iMin; i7++) {
            ResolveInfo resolveInfoE = activityChooserModelD.e(i7);
            subMenu.add(0, i7, i7, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.mContext.getString(C2454h.f20699b));
            for (int i8 = 0; i8 < iF; i8++) {
                ResolveInfo resolveInfoE2 = activityChooserModelD.e(i8);
                subMenuAddSubMenu.add(0, i8, i8, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.mOnShareTargetSelectedListener = onShareTargetSelectedListener;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        ActivityChooserModel.d(this.mContext, this.mShareHistoryFileName).p(intent);
    }

    void updateIntent(Intent intent) {
        intent.addFlags(134742016);
    }
}
