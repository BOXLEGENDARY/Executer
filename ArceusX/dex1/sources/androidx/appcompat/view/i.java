package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i implements Window.Callback {

    final Window.Callback f8869d;

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i7) {
            return callback.onWindowStartingActionMode(callback2, i7);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            callback.onProvideKeyboardShortcuts(list, menu, i7);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean z7) {
            callback.onPointerCaptureChanged(z7);
        }
    }

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f8869d = callback;
    }

    public final Window.Callback a() {
        return this.f8869d;
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f8869d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8869d.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f8869d.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f8869d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f8869d.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f8869d.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        this.f8869d.onActionModeFinished(actionMode);
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        this.f8869d.onActionModeStarted(actionMode);
    }

    @Override
    public void onAttachedToWindow() {
        this.f8869d.onAttachedToWindow();
    }

    @Override
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return this.f8869d.onCreatePanelMenu(i7, menu);
    }

    @Override
    public View onCreatePanelView(int i7) {
        return this.f8869d.onCreatePanelView(i7);
    }

    @Override
    public void onDetachedFromWindow() {
        this.f8869d.onDetachedFromWindow();
    }

    @Override
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f8869d.onMenuItemSelected(i7, menuItem);
    }

    @Override
    public boolean onMenuOpened(int i7, Menu menu) {
        return this.f8869d.onMenuOpened(i7, menu);
    }

    @Override
    public void onPanelClosed(int i7, Menu menu) {
        this.f8869d.onPanelClosed(i7, menu);
    }

    @Override
    public void onPointerCaptureChanged(boolean z7) {
        c.a(this.f8869d, z7);
    }

    @Override
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return this.f8869d.onPreparePanel(i7, view, menu);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        b.a(this.f8869d, list, menu, i7);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f8869d, searchEvent);
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f8869d.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public void onWindowFocusChanged(boolean z7) {
        this.f8869d.onWindowFocusChanged(z7);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        return a.b(this.f8869d, callback, i7);
    }

    @Override
    public boolean onSearchRequested() {
        return this.f8869d.onSearchRequested();
    }
}
