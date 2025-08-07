package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import org.greenrobot.eventbus.ThreadMode;

public class NotificationStreamActivity extends RobloxWebActivity {

    class a implements MenuItem.OnMenuItemClickListener {
        a() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            NotificationStreamActivity.this.L0("SETTINGS_TAG", a0.U());
            return false;
        }
    }

    static class b {

        static final int[] f19695a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f19695a = iArr;
            try {
                iArr[e7.f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19695a[e7.f.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19695a[e7.f.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void M0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(L.f19579d, menu);
        MenuItem menuItemFindItem = menu.findItem(J.f19520d);
        int i7 = b.f19695a[new e7.g().getTheme().ordinal()];
        menuItemFindItem.setIcon(i7 != 1 ? i7 != 2 ? I.f19478u : I.f19477t : I.f19479v);
        menuItemFindItem.setOnMenuItemClickListener(new a());
    }

    public void L0(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    @Override
    public void R(e7.f fVar) {
        Menu menu = this.f19835J.getMenu();
        menu.clear();
        M0(menu, getMenuInflater());
        super.R(fVar);
    }

    @Override
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("URL_EXTRA", a0.w0());
            intent.putExtra("TITLE_EXTRA", getString(M.f19611P));
        }
        super.onCreate(bundle);
        M0(this.f19835J.getMenu(), getMenuInflater());
    }

    @Override
    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g6.i iVar) {
        L0(iVar.f21001a, iVar.f21002b);
    }
}
