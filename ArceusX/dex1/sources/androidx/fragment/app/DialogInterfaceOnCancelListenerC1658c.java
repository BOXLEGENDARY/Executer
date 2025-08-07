package androidx.fragment.app;

import Za.qhkq.dHkZSUxHu;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.C1685T;
import android.view.C1686U;
import android.view.InterfaceC1701o;
import android.view.InterfaceC1710x;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class DialogInterfaceOnCancelListenerC1658c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private InterfaceC1710x<InterfaceC1701o> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            DialogInterfaceOnCancelListenerC1658c.this.mOnDismissListener.onDismiss(DialogInterfaceOnCancelListenerC1658c.this.mDialog);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1658c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC1658c dialogInterfaceOnCancelListenerC1658c = DialogInterfaceOnCancelListenerC1658c.this;
                dialogInterfaceOnCancelListenerC1658c.onCancel(dialogInterfaceOnCancelListenerC1658c.mDialog);
            }
        }
    }

    class DialogInterfaceOnDismissListenerC0097c implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC0097c() {
        }

        @Override
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1658c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC1658c dialogInterfaceOnCancelListenerC1658c = DialogInterfaceOnCancelListenerC1658c.this;
                dialogInterfaceOnCancelListenerC1658c.onDismiss(dialogInterfaceOnCancelListenerC1658c.mDialog);
            }
        }
    }

    class d implements InterfaceC1710x<InterfaceC1701o> {
        d() {
        }

        @Override
        public void a(InterfaceC1701o interfaceC1701o) {
            if (interfaceC1701o == null || !DialogInterfaceOnCancelListenerC1658c.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC1658c.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException(dHkZSUxHu.YijhvuDFcvXEBw);
            }
            if (DialogInterfaceOnCancelListenerC1658c.this.mDialog != null) {
                if (FragmentManager.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC1658c.this.mDialog);
                }
                DialogInterfaceOnCancelListenerC1658c.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    class e extends AbstractC1665j {

        final AbstractC1665j f11193d;

        e(AbstractC1665j abstractC1665j) {
            this.f11193d = abstractC1665j;
        }

        @Override
        public View c(int i7) {
            return this.f11193d.d() ? this.f11193d.c(i7) : DialogInterfaceOnCancelListenerC1658c.this.onFindViewById(i7);
        }

        @Override
        public boolean d() {
            return this.f11193d.d() || DialogInterfaceOnCancelListenerC1658c.this.onHasView();
        }
    }

    public DialogInterfaceOnCancelListenerC1658c() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC0097c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z7, boolean z8, boolean z9) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z9) {
                getParentFragmentManager().h1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().e1(this.mBackStackId, 1, z7);
            }
            this.mBackStackId = -1;
            return;
        }
        B bP = getParentFragmentManager().p();
        bP.p(true);
        bP.m(this);
        if (z9) {
            bP.i();
        } else if (z7) {
            bP.h();
        } else {
            bP.g();
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    @Override
    AbstractC1665j createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().j(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new android.view.q(requireContext(), getTheme());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().n(this.mObserver);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true, false);
    }

    View onFindViewById(int i7) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.J0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i7 = this.mStyle;
        if (i7 != 0) {
            bundle.putInt(SAVED_STYLE, i7);
        }
        int i8 = this.mTheme;
        if (i8 != 0) {
            bundle.putInt(SAVED_THEME, i8);
        }
        boolean z7 = this.mCancelable;
        if (!z7) {
            bundle.putBoolean(SAVED_CANCELABLE, z7);
        }
        boolean z8 = this.mShowsDialog;
        if (!z8) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z8);
        }
        int i9 = this.mBackStackId;
        if (i9 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i9);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            C1685T.b(decorView, this);
            C1686U.a(decorView, this);
            b1.e.b(decorView, this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z7) {
        this.mCancelable = z7;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z7);
        }
    }

    public void setShowsDialog(boolean z7) {
        this.mShowsDialog = z7;
    }

    public void setStyle(int i7, int i8) {
        if (FragmentManager.J0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i7 + ", " + i8);
        }
        this.mStyle = i7;
        if (i7 == 2 || i7 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i8 != 0) {
            this.mTheme = i8;
        }
    }

    public void setupDialog(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        B bP = fragmentManager.p();
        bP.p(true);
        bP.d(this, str);
        bP.g();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        B bP = fragmentManager.p();
        bP.p(true);
        bP.d(this, str);
        bP.i();
    }

    public int show(B b2, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        b2.d(this, str);
        this.mViewDestroyed = false;
        int iG = b2.g();
        this.mBackStackId = iG;
        return iG;
    }

    public DialogInterfaceOnCancelListenerC1658c(int i7) {
        super(i7);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC0097c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}
