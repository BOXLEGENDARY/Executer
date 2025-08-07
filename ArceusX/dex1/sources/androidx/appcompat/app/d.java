package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.C1586K;
import android.view.C1685T;
import android.view.C1686U;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.app.x;
import androidx.fragment.app.ActivityC1663h;
import androidx.savedstate.a;
import d.InterfaceC2379b;

public class d extends ActivityC1663h implements e, x.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements a.c {
        a() {
        }

        @Override
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.getDelegate().C(bundle);
            return bundle;
        }
    }

    class b implements InterfaceC2379b {
        b() {
        }

        @Override
        public void a(Context context) {
            g delegate = d.this.getDelegate();
            delegate.t();
            delegate.y(d.this.getSavedStateRegistry().b(d.DELEGATE_TAG));
        }
    }

    public d() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        C1685T.b(getWindow().getDecorView(), this);
        C1686U.a(getWindow().getDecorView(), this);
        b1.e.b(getWindow().getDecorView(), this);
        C1586K.a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().e(view, layoutParams);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().g(context));
    }

    @Override
    public void closeOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public <T extends View> T findViewById(int i7) {
        return (T) getDelegate().j(i7);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.h(this, this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.b getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    @Override
    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    @Override
    public Resources getResources() {
        if (this.mResources == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.mResources = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().s();
    }

    @Override
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.j.a(this);
    }

    @Override
    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(androidx.core.app.x xVar) {
        xVar.e(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    protected void onLocalesChanged(u0.i iVar) {
    }

    @Override
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    protected void onNightModeChanged(int i7) {
    }

    @Override
    public void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A(bundle);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().B();
    }

    public void onPrepareSupportNavigateUpTaskStack(androidx.core.app.x xVar) {
    }

    @Override
    protected void onStart() {
        super.onStart();
        getDelegate().D();
    }

    @Override
    protected void onStop() {
        super.onStop();
        getDelegate().E();
    }

    @Override
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.x xVarJ = androidx.core.app.x.j(this);
        onCreateSupportNavigateUpTaskStack(xVarJ);
        onPrepareSupportNavigateUpTaskStack(xVarJ);
        xVarJ.k();
        try {
            androidx.core.app.b.o(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override
    protected void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        getDelegate().O(charSequence);
    }

    @Override
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override
    public void openOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override
    public void setContentView(int i7) {
        initViewTreeOwners();
        getDelegate().I(i7);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().M(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z7) {
    }

    @Override
    public void setTheme(int i7) {
        super.setTheme(i7);
        getDelegate().N(i7);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().P(aVar);
    }

    @Override
    public void supportInvalidateOptionsMenu() {
        getDelegate().u();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.j.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i7) {
        return getDelegate().H(i7);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.j.f(this, intent);
    }

    public d(int i7) {
        super(i7);
        initDelegate();
    }

    @Override
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().J(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().K(view, layoutParams);
    }
}
