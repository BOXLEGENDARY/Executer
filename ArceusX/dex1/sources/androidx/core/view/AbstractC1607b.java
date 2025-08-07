package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class AbstractC1607b {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private a mSubUiVisibilityListener;
    private InterfaceC0087b mVisibilityListener;

    public interface a {
        void i(boolean z7);
    }

    public interface InterfaceC0087b {
        void onActionProviderVisibilityChanged(boolean z7);
    }

    public AbstractC1607b(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        this.mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(a aVar) {
        this.mSubUiVisibilityListener = aVar;
    }

    public void setVisibilityListener(InterfaceC0087b interfaceC0087b) {
        if (this.mVisibilityListener != null && interfaceC0087b != null) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = interfaceC0087b;
    }

    public void subUiVisibilityChanged(boolean z7) {
        a aVar = this.mSubUiVisibilityListener;
        if (aVar != null) {
            aVar.i(z7);
        }
    }
}
