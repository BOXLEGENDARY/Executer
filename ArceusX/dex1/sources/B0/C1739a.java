package b0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003\u0015\u0017\u0019B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010!R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001eR\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010&R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010&R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0018R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\u001e¨\u0006I"}, d2 = {"Lb0/a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "spanSlop", "minSpan", "Lb0/a$b;", "listener", "<init>", "(Landroid/content/Context;IILb0/a$b;)V", BuildConfig.FLAVOR, "e", "()Z", BuildConfig.FLAVOR, "d", "()F", "Landroid/view/MotionEvent;", "event", "f", "(Landroid/view/MotionEvent;)Z", "a", "Landroid/content/Context;", "b", "I", "c", "Lb0/a$b;", "focusX", "focusY", "g", "Z", "isQuickZoomEnabled", "setQuickZoomEnabled", "(Z)V", "h", "isStylusZoomEnabled", "setStylusZoomEnabled", "i", "F", "currentSpan", "j", "previousSpan", "k", "currentSpanX", "l", "currentSpanY", "m", "previousSpanX", "n", "previousSpanY", BuildConfig.FLAVOR, "o", "J", "eventTime", "p", "isInProgress", "q", "initialSpan", "r", "prevTime", "s", "anchoredZoomStartX", "t", "anchoredZoomStartY", "u", "anchoredZoomMode", "Landroid/view/GestureDetector;", "v", "Landroid/view/GestureDetector;", "gestureDetector", "w", "eventBeforeOrAboveStartingGestureEvent", "x", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1739a {

    private final Context context;

    private final int spanSlop;

    private final int minSpan;

    private final b listener;

    private int focusX;

    private int focusY;

    private boolean isQuickZoomEnabled;

    private boolean isStylusZoomEnabled;

    private float currentSpan;

    private float previousSpan;

    private float currentSpanX;

    private float currentSpanY;

    private float previousSpanX;

    private float previousSpanY;

    private long eventTime;

    private boolean isInProgress;

    private float initialSpan;

    private long prevTime;

    private float anchoredZoomStartX;

    private float anchoredZoomStartY;

    private int anchoredZoomMode;

    private GestureDetector gestureDetector;

    private boolean eventBeforeOrAboveStartingGestureEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lb0/a$b;", BuildConfig.FLAVOR, "Lb0/a$c;", "zoomEvent", BuildConfig.FLAVOR, "a", "(Lb0/a$c;)Z", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        boolean a(c zoomEvent);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0003\t\r\u0011B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lb0/a$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "eventTime", BuildConfig.FLAVOR, "focusX", "focusY", "<init>", "(JII)V", "a", "J", "getEventTime", "()J", "b", "I", "getFocusX", "()I", "c", "getFocusY", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c {

        private final long eventTime;

        private final int focusX;

        private final int focusY;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb0/a$c$a;", "Lb0/a$c;", BuildConfig.FLAVOR, "eventTime", BuildConfig.FLAVOR, "focusX", "focusY", "<init>", "(JII)V", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0129a extends c {
            public C0129a(long j7, int i7, int i8) {
                super(j7, i7, i8, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb0/a$c$b;", "Lb0/a$c;", BuildConfig.FLAVOR, "eventTime", BuildConfig.FLAVOR, "focusX", "focusY", BuildConfig.FLAVOR, "incrementalScaleFactor", "<init>", "(JIIF)V", "d", "F", "getIncrementalScaleFactor", "()F", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends c {

            private final float incrementalScaleFactor;

            public b(long j7, int i7, int i8, float f7) {
                super(j7, i7, i8, null);
                this.incrementalScaleFactor = f7;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb0/a$c$c;", "Lb0/a$c;", BuildConfig.FLAVOR, "eventTime", BuildConfig.FLAVOR, "focusX", "focusY", BuildConfig.FLAVOR, "incrementalScaleFactor", "<init>", "(JIIF)V", "d", "F", "a", "()F", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0130c extends c {

            private final float incrementalScaleFactor;

            public C0130c(long j7, int i7, int i8, float f7) {
                super(j7, i7, i8, null);
                this.incrementalScaleFactor = f7;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public c(long j7, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, i7, i8);
        }

        private c(long j7, int i7, int i8) {
            this.eventTime = j7;
            this.focusX = i7;
            this.focusY = i8;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"b0/a$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", BuildConfig.FLAVOR, "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        d() {
        }

        @Override
        public boolean onDoubleTap(MotionEvent e7) {
            Intrinsics.checkNotNullParameter(e7, "e");
            C1739a.this.anchoredZoomStartX = e7.getX();
            C1739a.this.anchoredZoomStartY = e7.getY();
            C1739a.this.anchoredZoomMode = 1;
            return true;
        }
    }

    public C1739a(Context context, b bVar) {
        this(context, 0, 0, bVar, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bVar, "listener");
    }

    private final float d() {
        if (!e()) {
            float f7 = this.previousSpan;
            if (f7 > 0.0f) {
                return this.currentSpan / f7;
            }
            return 1.0f;
        }
        boolean z7 = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z8 = (z7 && this.currentSpan < this.previousSpan) || (!z7 && this.currentSpan > this.previousSpan);
        float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z8 ? 1.0f + fAbs : 1.0f - fAbs;
    }

    private final boolean e() {
        return this.anchoredZoomMode != 0;
    }

    public final boolean f(MotionEvent event) {
        float f7;
        float f8;
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z7 = (event.getButtonState() & 32) != 0;
        boolean z8 = this.anchoredZoomMode == 2 && !z7;
        boolean z9 = actionMasked == 1 || actionMasked == 3 || z8;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z9) {
            if (this.isInProgress) {
                this.listener.a(new c.b(this.eventTime, this.focusX, this.focusY, d()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else if (e() && z9) {
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            }
            if (z9) {
                return true;
            }
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !e() && !z9 && z7) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z10 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z8;
        boolean z11 = actionMasked == 6;
        int actionIndex = z11 ? event.getActionIndex() : -1;
        int i7 = z11 ? pointerCount - 1 : pointerCount;
        if (e()) {
            f8 = this.anchoredZoomStartX;
            f7 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f7;
        } else {
            float x7 = 0.0f;
            float y7 = 0.0f;
            for (int i8 = 0; i8 < pointerCount; i8++) {
                if (actionIndex != i8) {
                    x7 += event.getX(i8);
                    y7 += event.getY(i8);
                }
            }
            float f9 = i7;
            float f10 = x7 / f9;
            f7 = y7 / f9;
            f8 = f10;
        }
        float fAbs2 = 0.0f;
        for (int i9 = 0; i9 < pointerCount; i9++) {
            if (actionIndex != i9) {
                fAbs += Math.abs(event.getX(i9) - f8);
                fAbs2 += Math.abs(event.getY(i9) - f7);
            }
        }
        float f11 = i7;
        float f12 = 2;
        float f13 = (fAbs / f11) * f12;
        float f14 = (fAbs2 / f11) * f12;
        float fHypot = e() ? f14 : (float) Math.hypot(f13, f14);
        boolean z12 = this.isInProgress;
        this.focusX = ca.a.b(f8);
        this.focusY = ca.a.b(f7);
        if (!e() && this.isInProgress && (fHypot < this.minSpan || z10)) {
            this.listener.a(new c.b(this.eventTime, this.focusX, this.focusY, d()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z10) {
            this.currentSpanX = f13;
            this.previousSpanX = f13;
            this.currentSpanY = f14;
            this.previousSpanY = f14;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i10 = e() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i10 && (z12 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f13;
            this.previousSpanX = f13;
            this.currentSpanY = f14;
            this.previousSpanY = f14;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            long j7 = this.eventTime;
            this.prevTime = j7;
            this.isInProgress = this.listener.a(new c.C0129a(j7, this.focusX, this.focusY));
        }
        if (actionMasked != 2) {
            return true;
        }
        this.currentSpanX = f13;
        this.currentSpanY = f14;
        this.currentSpan = fHypot;
        if (!(this.isInProgress ? this.listener.a(new c.C0130c(this.eventTime, this.focusX, this.focusY, d())) : true)) {
            return true;
        }
        this.previousSpanX = this.currentSpanX;
        this.previousSpanY = this.currentSpanY;
        this.previousSpan = this.currentSpan;
        this.prevTime = this.eventTime;
        return true;
    }

    public C1739a(Context context, int i7, int i8, b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bVar, "listener");
        this.context = context;
        this.spanSlop = i7;
        this.minSpan = i8;
        this.listener = bVar;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new d());
    }

    public C1739a(Context context, int i7, int i8, b bVar, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i7, (i9 & 4) != 0 ? 0 : i8, bVar);
    }
}
