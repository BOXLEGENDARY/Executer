package com.google.androidgamesdk.gametextinput;

import S9.Gvmm.CAqKeu;
import Z.tNT.PexNRiLSd;
import Za.qhkq.dHkZSUxHu;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.Insets;
import androidx.core.view.C1628l0;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import com.github.luben.zstd.BuildConfig;
import com.google.androidgamesdk.gametextinput.a;

public class InputConnection extends BaseInputConnection implements View.OnKeyListener {
    private static final int MAX_LENGTH_FOR_SINGLE_LINE_EDIT_TEXT = 5000;
    private static final String TAG = "gti.InputConnection";
    private final InputMethodManager imm;
    private J4.b listener;
    private final Editable mEditable;
    private boolean mSoftKeyboardActive;
    private final com.google.androidgamesdk.gametextinput.b settings;
    private final View targetView;

    private class b implements InputFilter {
        private b() {
        }

        @Override
        public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
            StringBuilder sb = new StringBuilder(i8 - i7);
            boolean z7 = true;
            for (int i11 = i7; i11 < i8; i11++) {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt == '\n') {
                    z7 = false;
                } else {
                    sb.append(cCharAt);
                }
            }
            if (z7) {
                return null;
            }
            if (!(charSequence instanceof Spanned)) {
                return sb;
            }
            SpannableString spannableString = new SpannableString(sb);
            TextUtils.copySpansFrom((Spanned) charSequence, i7, sb.length(), null, spannableString, 0);
            return spannableString;
        }
    }

    public InputConnection(Context context, View view, com.google.androidgamesdk.gametextinput.b bVar) {
        super(view, bVar.f18904a.inputType != 0);
        Log.d(TAG, "InputConnection created");
        this.targetView = view;
        this.settings = bVar;
        Object systemService = context.getSystemService("input_method");
        if (systemService == null) {
            throw new RuntimeException("Can't get IMM");
        }
        this.imm = (InputMethodManager) systemService;
        this.mEditable = new SpannableStringBuilder();
        C1628l0.b(((Activity) view.getContext()).getWindow(), false);
        view.setOnKeyListener(this);
        setEditorInfo(bVar.f18904a);
        Z.B0(view, new I() {
            @Override
            public final WindowInsetsCompat K(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f1724d.lambda$new$0(view2, windowInsetsCompat);
            }
        });
    }

    private a.C0166a getComposingRegion() {
        return new a.C0166a(BaseInputConnection.getComposingSpanStart(this.mEditable), BaseInputConnection.getComposingSpanEnd(this.mEditable));
    }

    private a.C0166a getSelection() {
        return new a.C0166a(Selection.getSelectionStart(this.mEditable), Selection.getSelectionEnd(this.mEditable));
    }

    private void informIMM() {
        a.C0166a selection = getSelection();
        a.C0166a composingRegion = getComposingRegion();
        Log.d(TAG, "informIMM: " + selection.f18902a + "," + selection.f18903b + ". " + composingRegion.f18902a + "," + composingRegion.f18903b);
        this.imm.updateSelection(this.targetView, selection.f18902a, selection.f18903b, composingRegion.f18902a, composingRegion.f18903b);
    }

    private boolean processKeyEvent(KeyEvent keyEvent) {
        boolean z7;
        int i7;
        if (keyEvent == null) {
            return false;
        }
        Log.d(TAG, String.format("processKeyEvent(key=%d) text=%s", Integer.valueOf(keyEvent.getKeyCode()), this.mEditable.toString()));
        boolean z8 = true;
        if ((this.settings.f18904a.inputType & 131072) == 0 && ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && keyEvent.hasNoModifiers())) {
            sendEditorAction(this.settings.f18904a.actionId);
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        a.C0166a selection = getSelection();
        if (selection.f18902a == -1) {
            selection.f18902a = this.mEditable.length();
            selection.f18903b = this.mEditable.length();
        }
        if (keyEvent.getKeyCode() == 21) {
            int i8 = selection.f18902a;
            int i9 = selection.f18903b;
            if (i8 == i9) {
                setSelection(i8 - 1, i9 - 1);
            } else {
                setSelection(i8, i8);
            }
            return true;
        }
        if (keyEvent.getKeyCode() == 22) {
            int i10 = selection.f18902a;
            int i11 = selection.f18903b;
            if (i10 == i11) {
                setSelection(i10 + 1, i11 + 1);
            } else {
                setSelection(i11, i11);
            }
            return true;
        }
        if (selection.f18902a != selection.f18903b) {
            Log.d(TAG, String.format("processKeyEvent: deleting selection", new Object[0]));
            this.mEditable.delete(selection.f18902a, selection.f18903b);
            z7 = true;
        } else {
            if (keyEvent.getKeyCode() == 67 && (i7 = selection.f18902a) > 0) {
                this.mEditable.delete(i7 - 1, i7);
                stateUpdated();
                Log.d(TAG, String.format("processKeyEvent: exit after DEL, text=%s", this.mEditable.toString()));
                return true;
            }
            if (keyEvent.getKeyCode() == 112 && selection.f18902a < this.mEditable.length()) {
                Editable editable = this.mEditable;
                int i12 = selection.f18902a;
                editable.delete(i12, i12 + 1);
                stateUpdated();
                Log.d(TAG, String.format("processKeyEvent: exit after FORWARD_DEL, text=%s", this.mEditable.toString()));
                return true;
            }
            z7 = false;
        }
        keyEvent.getKeyCode();
        if (keyEvent.getUnicodeChar() != 0) {
            String string = Character.toString((char) keyEvent.getUnicodeChar());
            this.mEditable.insert(selection.f18902a, string);
            int length = this.mEditable.length();
            a.C0166a composingRegion = getComposingRegion();
            if (composingRegion.f18902a == -1) {
                composingRegion = getSelection();
                if (composingRegion.f18902a == -1) {
                    composingRegion = new a.C0166a(0, 0);
                }
            }
            int i13 = composingRegion.f18902a;
            int i14 = length + i13;
            composingRegion.f18903b = i14;
            setComposingRegion(i13, i14);
            int length2 = selection.f18902a + string.length();
            setSelection(length2, length2);
            informIMM();
            restartInput();
        } else {
            z8 = z7;
        }
        if (z8) {
            Log.d(TAG, String.format("processKeyEvent: exit, text=%s", this.mEditable.toString()));
            stateUpdated();
        }
        return z8;
    }

    private boolean sendEditorAction(int i7) {
        J4.b bVar = this.listener;
        if (bVar == null) {
            return false;
        }
        bVar.G(i7);
        return true;
    }

    private final void stateUpdated() {
        a.C0166a selection = getSelection();
        a.C0166a composingRegion = getComposingRegion();
        State state = new State(this.mEditable.toString(), selection.f18902a, selection.f18903b, composingRegion.f18902a, composingRegion.f18903b);
        J4.b bVar = this.listener;
        if (bVar != null) {
            bVar.z(state, false);
        }
    }

    @Override
    public void closeConnection() {
        Log.d(TAG, "closeConnection");
        super.closeConnection();
    }

    @Override
    public boolean commitCompletion(CompletionInfo completionInfo) {
        Log.d(TAG, "commitCompletion");
        return super.commitCompletion(completionInfo);
    }

    @Override
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        Log.d(TAG, "commitCompletion");
        return super.commitCorrection(correctionInfo);
    }

    @Override
    public boolean commitText(CharSequence charSequence, int i7) {
        Log.d(TAG, "commitText: " + charSequence + ", new pos = " + i7);
        return super.commitText(charSequence, i7);
    }

    @Override
    public boolean deleteSurroundingText(int i7, int i8) {
        Log.d(TAG, dHkZSUxHu.dbUVuFYZ + i7 + ":" + i8);
        return super.deleteSurroundingText(i7, i8);
    }

    @Override
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Log.d(TAG, "deleteSurroundingTextInCodePoints: " + i7 + ":" + i8);
        return super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    @Override
    public boolean endBatchEdit() {
        Log.d(TAG, "endBatchEdit");
        stateUpdated();
        return super.endBatchEdit();
    }

    @Override
    public boolean finishComposingText() {
        Log.d(TAG, "finishComposingText");
        return super.finishComposingText();
    }

    @Override
    public Editable getEditable() {
        Log.d(TAG, "getEditable");
        return this.mEditable;
    }

    public final EditorInfo getEditorInfo() {
        return this.settings.f18904a;
    }

    @Override
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        Log.d(TAG, "getExtractedText");
        return super.getExtractedText(extractedTextRequest, i7);
    }

    public Insets getImeInsets() {
        WindowInsetsCompat windowInsetsCompatF;
        View view = this.targetView;
        if (view != null && (windowInsetsCompatF = Z.F(view)) != null) {
            return windowInsetsCompatF.getInsets(WindowInsetsCompat.Type.ime());
        }
        return Insets.NONE;
    }

    public final J4.b getListener() {
        return this.listener;
    }

    @Override
    public CharSequence getSelectedText(int i7) {
        CharSequence selectedText = super.getSelectedText(i7);
        if (selectedText == null) {
            selectedText = BuildConfig.FLAVOR;
        }
        Log.d(TAG, "getSelectedText: " + i7 + ", result: " + ((Object) selectedText));
        return selectedText;
    }

    public final boolean getSoftKeyboardActive() {
        return this.mSoftKeyboardActive;
    }

    @Override
    public CharSequence getTextAfterCursor(int i7, int i8) {
        Log.d(TAG, "getTextAfterCursor: " + i7 + ":" + i8);
        if (i7 >= 0) {
            return super.getTextAfterCursor(i7, i8);
        }
        Log.i(TAG, "getTextAfterCursor: returning null to due to an invalid length=" + i7);
        return null;
    }

    @Override
    public CharSequence getTextBeforeCursor(int i7, int i8) {
        Log.d(TAG, "getTextBeforeCursor: " + i7 + ", flags=" + i8);
        if (i7 >= 0) {
            return super.getTextBeforeCursor(i7, i8);
        }
        Log.i(TAG, "getTextBeforeCursor: returning null to due to an invalid length=" + i7);
        return null;
    }

    public boolean isSoftwareKeyboardVisible() {
        WindowInsetsCompat windowInsetsCompatF;
        View view = this.targetView;
        if (view == null || (windowInsetsCompatF = Z.F(view)) == null) {
            return false;
        }
        return windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.ime());
    }

    public WindowInsetsCompat lambda$new$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Log.d(TAG, CAqKeu.nhUVPGSFX + isSoftwareKeyboardVisible());
        J4.b bVar = this.listener;
        if (bVar != null) {
            bVar.E(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()));
        }
        boolean zIsSoftwareKeyboardVisible = isSoftwareKeyboardVisible();
        if (zIsSoftwareKeyboardVisible == this.mSoftKeyboardActive) {
            return windowInsetsCompat;
        }
        this.mSoftKeyboardActive = zIsSoftwareKeyboardVisible;
        this.imm.restartInput(this.targetView);
        if (bVar != null) {
            bVar.m(zIsSoftwareKeyboardVisible);
        }
        return windowInsetsCompat;
    }

    @Override
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        Log.d(TAG, "onKey: " + keyEvent);
        if (getSoftKeyboardActive()) {
            return processKeyEvent(keyEvent);
        }
        return false;
    }

    @Override
    public boolean performEditorAction(int i7) {
        Log.d(TAG, "performEditorAction, action=" + i7);
        return i7 == 0 ? super.performEditorAction(i7) : sendEditorAction(i7);
    }

    @Override
    public boolean performPrivateCommand(String str, Bundle bundle) {
        Log.d(TAG, "performPrivateCommand");
        return super.performPrivateCommand(str, bundle);
    }

    @Override
    public boolean requestCursorUpdates(int i7) {
        Log.d(TAG, "Request cursor updates: " + i7);
        return super.requestCursorUpdates(i7);
    }

    public void restartInput() {
        this.imm.restartInput(this.targetView);
    }

    @Override
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        Log.d(TAG, "sendKeyEvent: " + keyEvent);
        return super.sendKeyEvent(keyEvent);
    }

    @Override
    public boolean setComposingRegion(int i7, int i8) {
        Log.d(TAG, "setComposingRegion: " + i7 + ":" + i8);
        return super.setComposingRegion(i7, i8);
    }

    @Override
    public boolean setComposingText(CharSequence charSequence, int i7) {
        Log.d(TAG, String.format("setComposingText='%s' newCursorPosition=%d", charSequence, Integer.valueOf(i7)));
        if (charSequence == null) {
            return false;
        }
        return super.setComposingText(charSequence, i7);
    }

    public final void setEditorInfo(EditorInfo editorInfo) {
        Log.d(TAG, "setEditorInfo");
        this.settings.f18904a = editorInfo;
        if ((editorInfo.inputType & 131072) == 0) {
            this.mEditable.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MAX_LENGTH_FOR_SINGLE_LINE_EDIT_TEXT), new b()});
        } else {
            this.mEditable.setFilters(new InputFilter[0]);
        }
    }

    @Override
    public boolean setImeConsumesInput(boolean z7) {
        Log.d(TAG, "setImeConsumesInput: " + z7);
        return super.setImeConsumesInput(z7);
    }

    public final InputConnection setListener(J4.b bVar) {
        this.listener = bVar;
        return this;
    }

    @Override
    public boolean setSelection(int i7, int i8) {
        Log.d(TAG, "setSelection: " + i7 + ":" + i8);
        return super.setSelection(i7, i8);
    }

    public final void setSoftKeyboardActive(boolean z7, int i7) {
        Log.d(TAG, "setSoftKeyboardActive, active: " + z7);
        this.mSoftKeyboardActive = z7;
        if (!z7) {
            this.imm.hideSoftInputFromWindow(this.targetView.getWindowToken(), i7);
            this.imm.restartInput(this.targetView);
        } else {
            this.targetView.setFocusableInTouchMode(true);
            this.targetView.requestFocus();
            this.imm.showSoftInput(this.targetView, i7);
        }
    }

    public final void setState(State state) {
        if (state == null) {
            return;
        }
        Log.d(TAG, "setState: '" + state.text + PexNRiLSd.AARZCWEmnaOg + state.selectionStart + "," + state.selectionEnd + "), composing region=(" + state.composingRegionStart + "," + state.composingRegionEnd + ")");
        this.mEditable.clear();
        this.mEditable.insert(0, state.text);
        setSelection(state.selectionStart, state.selectionEnd);
        setComposingRegion(state.composingRegionStart, state.composingRegionEnd);
        informIMM();
    }
}
