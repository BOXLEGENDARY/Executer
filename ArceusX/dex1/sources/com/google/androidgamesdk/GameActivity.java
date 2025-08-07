package com.google.androidgamesdk;

import J4.b;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.core.graphics.Insets;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import androidx.core.view.r;
import com.google.androidgamesdk.gametextinput.InputConnection;
import com.google.androidgamesdk.gametextinput.State;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import ka.oik.UJEa;

public class GameActivity extends d implements SurfaceHolder.Callback2, b, I, ViewTreeObserver.OnGlobalLayoutListener {

    protected int f18888A;

    protected int f18889B;

    protected int f18890C;

    protected boolean f18891D;

    protected int f18892d;

    private EditorInfo f18893e;

    protected a f18894i;

    private long f18895v;

    private SurfaceHolder f18896w;

    protected final int[] f18897y = new int[2];

    protected int f18898z;

    protected class a extends SurfaceView {

        InputConnection f18899d;

        public a(GameActivity gameActivity) {
            super(gameActivity);
            EditorInfo editorInfoF0 = gameActivity.f0();
            this.f18899d = new InputConnection(gameActivity, this, new com.google.androidgamesdk.gametextinput.b(editorInfoF0, editorInfoF0.inputType == 0)).setListener(gameActivity);
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            if (!this.f18899d.getSoftKeyboardActive()) {
                return null;
            }
            if (editorInfo != null) {
                com.google.androidgamesdk.gametextinput.a.a(this.f18899d.getEditorInfo(), editorInfo);
            }
            return this.f18899d;
        }

        public EditorInfo getEditorInfo() {
            return this.f18899d.getEditorInfo();
        }

        public void setEditorInfo(EditorInfo editorInfo) {
            this.f18899d.setEditorInfo(editorInfo);
        }
    }

    private static String e0(File file) {
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @Override
    public void E(Insets insets) {
        Log.v(UJEa.gnK, "onImeInsetsChanged from Text Listener");
    }

    @Override
    public void G(int i7) {
        onEditorActionNative(this.f18895v, i7);
    }

    @Override
    public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
        this.f18894i.f18899d.lambda$new$0(view, windowInsetsCompat);
        onWindowInsetsChangedNative(this.f18895v);
        view.onApplyWindowInsets(windowInsetsCompat.toWindowInsets());
        return windowInsetsCompat;
    }

    protected a d0() {
        return new a(this);
    }

    public EditorInfo f0() {
        if (this.f18893e == null) {
            EditorInfo editorInfo = new EditorInfo();
            this.f18893e = editorInfo;
            editorInfo.inputType = 1;
            editorInfo.actionId = 6;
            editorInfo.imeOptions = 33554438;
        }
        return this.f18893e;
    }

    protected void g0() {
        a aVarD0 = d0();
        this.f18894i = aVarD0;
        if (aVarD0 == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        int iK = Z.k();
        this.f18892d = iK;
        frameLayout.setId(iK);
        frameLayout.addView(this.f18894i);
        setContentView(frameLayout);
        frameLayout.requestFocus();
        this.f18894i.getHolder().addCallback(this);
        Z.B0(this.f18894i, this);
    }

    protected native String getDlError();

    public Insets getWaterfallInsets() {
        r displayCutout;
        WindowInsetsCompat windowInsetsCompatF = Z.F(this.f18894i);
        if (windowInsetsCompatF == null || (displayCutout = windowInsetsCompatF.getDisplayCutout()) == null) {
            return null;
        }
        return displayCutout.e();
    }

    public Insets getWindowInsets(int i7) {
        Insets insets;
        WindowInsetsCompat windowInsetsCompatF = Z.F(this.f18894i);
        if (windowInsetsCompatF == null || (insets = windowInsetsCompatF.getInsets(i7)) == Insets.NONE) {
            return null;
        }
        return insets;
    }

    protected void h0() {
        getWindow().setFormat(4);
        getWindow().setSoftInputMode(16);
    }

    protected boolean i0(MotionEvent motionEvent) {
        return onTouchEventNative(this.f18895v, motionEvent, motionEvent.getPointerCount(), motionEvent.getHistorySize(), motionEvent.getDeviceId(), motionEvent.getSource(), motionEvent.getAction(), motionEvent.getEventTime(), motionEvent.getDownTime(), motionEvent.getFlags(), motionEvent.getMetaState(), motionEvent.getActionButton(), motionEvent.getButtonState(), Build.VERSION.SDK_INT >= 29 ? motionEvent.getClassification() : 0, motionEvent.getEdgeFlags(), motionEvent.getXPrecision(), motionEvent.getYPrecision());
    }

    protected native long initializeNativeCode(String str, String str2, String str3, AssetManager assetManager, byte[] bArr, Configuration configuration);

    @Override
    public void m(boolean z7) {
        onSoftwareKeyboardVisibilityChangedNative(this.f18895v, z7);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f18891D) {
            return;
        }
        onConfigurationChangedNative(this.f18895v, configuration);
    }

    protected native void onConfigurationChangedNative(long j7, Configuration configuration);

    protected native void onContentRectChangedNative(long j7, int i7, int i8, int i9, int i10);

    @Override
    protected void onCreate(Bundle bundle) {
        g0();
        a aVar = this.f18894i;
        if (aVar != null) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        h0();
        String str = new String("main");
        try {
            Bundle bundle2 = getPackageManager().getActivityInfo(getIntent().getComponent(), 128).metaData;
            if (bundle2 != null) {
                String string = bundle2.getString("android.app.lib_name");
                if (string != null) {
                    str = string;
                }
            }
            String str2 = "lib" + str + ".so";
            Log.i("GameActivity", "Looking for library " + str2);
            BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) getClassLoader();
            String strFindLibrary = baseDexClassLoader.findLibrary(str);
            if (strFindLibrary != null) {
                Log.i("GameActivity", "Found library " + str2 + ". Loading...");
                System.loadLibrary(str);
            } else {
                if (!str.equals("main")) {
                    throw new IllegalArgumentException("unable to find native library " + str2 + " using classloader: " + baseDexClassLoader.toString());
                }
                Log.i("GameActivity", "Application should have loaded the native library " + str2 + " explicitly by now. ");
            }
            File file = null;
            byte[] byteArray = bundle != null ? bundle.getByteArray("android:native_state") : null;
            File[] externalFilesDirs = getExternalFilesDirs(null);
            if (externalFilesDirs != null && externalFilesDirs.length > 0) {
                file = externalFilesDirs[0];
            }
            long jInitializeNativeCode = initializeNativeCode(e0(getFilesDir()), e0(getObbDir()), e0(file), getAssets(), byteArray, getResources().getConfiguration());
            this.f18895v = jInitializeNativeCode;
            if (jInitializeNativeCode != 0) {
                a aVar2 = this.f18894i;
                if (aVar2 != null) {
                    setInputConnectionNative(jInitializeNativeCode, aVar2.f18899d);
                }
                super.onCreate(bundle);
                return;
            }
            throw new UnsatisfiedLinkError("Unable to initialize native code \"" + strFindLibrary + "\": " + getDlError());
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("Error getting activity info", e7);
        }
    }

    @Override
    protected void onDestroy() {
        this.f18891D = true;
        if (this.f18896w != null) {
            onSurfaceDestroyedNative(this.f18895v);
            this.f18896w = null;
        }
        terminateNativeCode(this.f18895v);
        super.onDestroy();
    }

    protected native void onEditorActionNative(long j7, int i7);

    @Override
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (i0(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override
    public void onGlobalLayout() {
        this.f18894i.getLocationInWindow(this.f18897y);
        int width = this.f18894i.getWidth();
        int height = this.f18894i.getHeight();
        int[] iArr = this.f18897y;
        int i7 = iArr[0];
        if (i7 == this.f18898z && iArr[1] == this.f18888A && width == this.f18889B && height == this.f18890C) {
            return;
        }
        this.f18898z = i7;
        int i8 = iArr[1];
        this.f18888A = i8;
        this.f18889B = width;
        this.f18890C = height;
        if (this.f18891D) {
            return;
        }
        onContentRectChangedNative(this.f18895v, i7, i8, width, height);
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (onKeyDownNative(this.f18895v, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    protected native boolean onKeyDownNative(long j7, KeyEvent keyEvent);

    @Override
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (onKeyUpNative(this.f18895v, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    protected native boolean onKeyUpNative(long j7, KeyEvent keyEvent);

    @Override
    protected void onPause() {
        super.onPause();
        onPauseNative(this.f18895v);
    }

    protected native void onPauseNative(long j7);

    @Override
    protected void onResume() {
        super.onResume();
        onResumeNative(this.f18895v);
    }

    protected native void onResumeNative(long j7);

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        byte[] bArrOnSaveInstanceStateNative = onSaveInstanceStateNative(this.f18895v);
        if (bArrOnSaveInstanceStateNative != null) {
            bundle.putByteArray("android:native_state", bArrOnSaveInstanceStateNative);
        }
    }

    protected native byte[] onSaveInstanceStateNative(long j7);

    protected native void onSoftwareKeyboardVisibilityChangedNative(long j7, boolean z7);

    @Override
    protected void onStart() {
        super.onStart();
        onStartNative(this.f18895v);
    }

    protected native void onStartNative(long j7);

    @Override
    protected void onStop() {
        super.onStop();
        onStopNative(this.f18895v);
    }

    protected native void onStopNative(long j7);

    protected native void onSurfaceChangedNative(long j7, Surface surface, int i7, int i8, int i9);

    protected native void onSurfaceCreatedNative(long j7, Surface surface);

    protected native void onSurfaceDestroyedNative(long j7);

    protected native void onSurfaceRedrawNeededNative(long j7, Surface surface);

    protected native void onTextInputEventNative(long j7, State state);

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (i0(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected native boolean onTouchEventNative(long j7, MotionEvent motionEvent, int i7, int i8, int i9, int i10, int i11, long j8, long j9, int i12, int i13, int i14, int i15, int i16, int i17, float f7, float f8);

    @Override
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (this.f18891D) {
            return;
        }
        onTrimMemoryNative(this.f18895v, i7);
    }

    protected native void onTrimMemoryNative(long j7, int i7);

    @Override
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (this.f18891D) {
            return;
        }
        onWindowFocusChangedNative(this.f18895v, z7);
    }

    protected native void onWindowFocusChangedNative(long j7, boolean z7);

    protected native void onWindowInsetsChangedNative(long j7);

    public void setImeEditorInfo(EditorInfo editorInfo) {
        this.f18893e = editorInfo;
        this.f18894i.f18899d.setEditorInfo(editorInfo);
    }

    public void setImeEditorInfoFields(int i7, int i8, int i9) {
        EditorInfo editorInfoF0 = f0();
        editorInfoF0.inputType = i7;
        editorInfoF0.actionId = i8;
        editorInfoF0.imeOptions = i9;
        this.f18894i.f18899d.setEditorInfo(editorInfoF0);
    }

    protected native void setInputConnectionNative(long j7, InputConnection inputConnection);

    void setWindowFlags(int i7, int i8) {
        getWindow().setFlags(i7, i8);
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        if (this.f18891D) {
            return;
        }
        this.f18896w = surfaceHolder;
        onSurfaceChangedNative(this.f18895v, surfaceHolder.getSurface(), i7, i8, i9);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f18891D) {
            return;
        }
        this.f18896w = surfaceHolder;
        onSurfaceCreatedNative(this.f18895v, surfaceHolder.getSurface());
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f18896w = null;
        if (this.f18891D) {
            return;
        }
        onSurfaceDestroyedNative(this.f18895v);
    }

    @Override
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        if (this.f18891D) {
            return;
        }
        this.f18896w = surfaceHolder;
        onSurfaceRedrawNeededNative(this.f18895v, surfaceHolder.getSurface());
    }

    protected native void terminateNativeCode(long j7);

    @Override
    public void z(State state, boolean z7) {
        onTextInputEventNative(this.f18895v, state);
    }
}
