package com.axjava.JNIFunctions;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class CustomGLSurfaceView extends GLSurfaceView {
    private BaseInputConnection inputConnection;

    public CustomGLSurfaceView(Context context) {
        super(context);
        Log.e("sss", "dieieuer3 ");
    }

    class a extends BaseInputConnection {
        a(CustomGLSurfaceView this$0, View arg0, boolean arg1) {
            super(arg0, arg1);
        }

        @Override
        public boolean commitText(CharSequence text, int newCursorPosition) {
            JNIUtils.handleTextInput(text.toString());
            Log.e("sss", "dieieuer2 " + text.toString());
            return true;
        }
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        if (this.inputConnection == null) {
            this.inputConnection = new a(this, this, false);
        }
        Log.e("sss", "dieieuer");
        outAttrs.actionLabel = null;
        outAttrs.inputType = 0;
        outAttrs.imeOptions = 6;
        return this.inputConnection;
    }
}
