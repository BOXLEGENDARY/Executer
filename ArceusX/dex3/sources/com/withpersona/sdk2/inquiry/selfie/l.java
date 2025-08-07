package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0356g;
import ha.C0454b;
import ha.C0588c;
import ha.C0876a;
import i9.C0596c;
import j9.C0601d;
import java.util.ArrayList;
import java.util.List;
import ka.C0726c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d;", "LW8/e;", "binding", "<init>", "(LW8/e;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/squareup/workflow1/ui/y;)V", "rendering", "e", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$d;Lcom/squareup/workflow1/ui/y;)V", "b", "LW8/e;", "Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "c", "Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "singleItemLayoutManager", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "multiItemLayoutManager", "f", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class l implements com.squareup.workflow1.ui.j<p.AbstractC0528d.C0173d> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final W8.e binding;

    @NotNull
    private final b adapter;

    @NotNull
    private final LinearLayoutManager singleItemLayoutManager;

    @NotNull
    private final GridAutoFitLayoutManager multiItemLayoutManager;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$d;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<p.AbstractC0528d.C0173d> {
        private final A<p.AbstractC0528d.C0173d> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0165a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, W8.e> {
            public static final C0165a d = new C0165a();

            C0165a() {
                super(3, W8.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;", 0);
            }

            @NotNull
            public final W8.e f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return W8.e.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<W8.e, l> {
            public static final b d = new b();

            b() {
                super(1, l.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;)V", 0);
            }

            @NotNull
            public final l invoke(@NotNull W8.e eVar) {
                Intrinsics.checkNotNullParameter(eVar, "p0");
                return new l(eVar);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull p.AbstractC0528d.C0173d initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super p.AbstractC0528d.C0173d> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(p.AbstractC0528d.C0173d.class), C0165a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "<init>", "()V", "", "D", "", "position", "g", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;", "e", "()I", "holder", "r", "(Landroidx/recyclerview/widget/RecyclerView$D;I)V", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;", "strings", "G", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textStyle", "E", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "data", "F", "(Ljava/util/List;)V", "d", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;", "Ljava/util/List;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "bodyTextStyle", "La9/b;", "Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "La9/b;", "adapterHelper", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class b extends RecyclerView.h<RecyclerView.D> {

        private p.AbstractC0528d.C0173d.Strings strings;

        @NotNull
        private List<? extends Selfie> data = CollectionsKt.j();

        private TextBasedComponentStyle bodyTextStyle;

        @NotNull
        private final C0454b<SelfieItem> adapterHelper;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "", "", "label", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class SelfieItem {

            private final String label;

            @NotNull
            private final Selfie selfie;

            public SelfieItem(String str, @NotNull Selfie selfie) {
                Intrinsics.checkNotNullParameter(selfie, "selfie");
                this.label = str;
                this.selfie = selfie;
            }

            public final String getLabel() {
                return this.label;
            }

            @NotNull
            public final Selfie getSelfie() {
                return this.selfie;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelfieItem)) {
                    return false;
                }
                SelfieItem selfieItem = (SelfieItem) other;
                return Intrinsics.b(this.label, selfieItem.label) && Intrinsics.b(this.selfie, selfieItem.selfie);
            }

            public int hashCode() {
                String str = this.label;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.selfie.hashCode();
            }

            @NotNull
            public String toString() {
                return "SelfieItem(label=" + this.label + ", selfie=" + this.selfie + ")";
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public class C0166b {
            public static final int[] a;

            static {
                int[] iArr = new int[Selfie.b.values().length];
                try {
                    iArr[Selfie.b.d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Selfie.b.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Selfie.b.i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "old", "new", "", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function2<SelfieItem, SelfieItem, Boolean> {
            public static final c d = new c();

            c() {
                super(2);
            }

            @NotNull
            public final Boolean invoke(@NotNull SelfieItem selfieItem, @NotNull SelfieItem selfieItem2) {
                Intrinsics.checkNotNullParameter(selfieItem, "old");
                Intrinsics.checkNotNullParameter(selfieItem2, "new");
                return Boolean.valueOf(Intrinsics.b(selfieItem.getSelfie().getAbsoluteFilePath(), selfieItem2.getSelfie().getAbsoluteFilePath()));
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class d extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, W8.f> {
            public static final d d = new d();

            d() {
                super(3, W8.f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewItemBinding;", 0);
            }

            @NotNull
            public final W8.f f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return W8.f.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "item", "LW8/f;", "b", "Landroidx/recyclerview/widget/RecyclerView$D;", "h", "", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;LW8/f;Landroidx/recyclerview/widget/RecyclerView$D;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class e extends kotlin.jvm.internal.l implements aa.n<SelfieItem, W8.f, RecyclerView.D, Unit> {
            e() {
                super(3);
            }

            public final void a(@NotNull SelfieItem selfieItem, @NotNull W8.f fVar, @NotNull RecyclerView.D d) {
                Intrinsics.checkNotNullParameter(selfieItem, "item");
                Intrinsics.checkNotNullParameter(fVar, "b");
                Intrinsics.checkNotNullParameter(d, "h");
                ImageView imageView = fVar.b;
                Intrinsics.checkNotNullExpressionValue(imageView, "image");
                C0876a.a(imageView.getContext()).a(new C0356g.a(imageView.getContext()).d(selfieItem.getSelfie().getAbsoluteFilePath()).s(imageView).a());
                String label = selfieItem.getLabel();
                if (label == null || StringsKt.Y(label)) {
                    fVar.c.setVisibility(8);
                } else {
                    fVar.c.setVisibility(0);
                    TextView textView = fVar.c;
                    Intrinsics.checkNotNullExpressionValue(textView, "label");
                    C0726c.c(textView, selfieItem.getLabel());
                }
                TextBasedComponentStyle textBasedComponentStyle = b.this.bodyTextStyle;
                if (textBasedComponentStyle != null) {
                    TextView textView2 = fVar.c;
                    Intrinsics.checkNotNullExpressionValue(textView2, "label");
                    v.e(textView2, textBasedComponentStyle);
                }
                fVar.a().setContentDescription(selfieItem.getLabel());
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                a((SelfieItem) obj, (W8.f) obj2, (RecyclerView.D) obj3);
                return Unit.a;
            }
        }

        public b() {
            C0454b<SelfieItem> c0454b = new C0454b<>(c.d, null, null, 6, null);
            c0454b.f(z.b(SelfieItem.class), z.b(W8.f.class), d.d, new e(), null);
            this.adapterHelper = c0454b;
        }

        private final void D() throws P9.m {
            ArrayList arrayList = new ArrayList();
            for (Selfie selfie : this.data) {
                String strC = null;
                if (selfie instanceof Selfie.SelfieImage) {
                    int i = C0166b.a[((Selfie.SelfieImage) selfie).getPose().ordinal()];
                    if (i == 1) {
                        p.AbstractC0528d.C0173d.Strings aVar = this.strings;
                        if (aVar != null) {
                            strC = aVar.getSelfieLabelFront();
                        }
                    } else if (i == 2) {
                        p.AbstractC0528d.C0173d.Strings aVar2 = this.strings;
                        if (aVar2 != null) {
                            strC = aVar2.getSelfieLabelLeft();
                        }
                    } else {
                        if (i != 3) {
                            throw new P9.m();
                        }
                        p.AbstractC0528d.C0173d.Strings aVar3 = this.strings;
                        if (aVar3 != null) {
                            strC = aVar3.getSelfieLabelRight();
                        }
                    }
                    strC = new SelfieItem(strC, selfie);
                } else if (!(selfie instanceof Selfie.SelfieVideo)) {
                    throw new P9.m();
                }
                if (strC != null) {
                    arrayList.add(strC);
                }
            }
            C0454b.n(this.adapterHelper, arrayList, this, null, 4, null);
        }

        public final void E(@NotNull TextBasedComponentStyle textStyle) throws P9.m {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.bodyTextStyle = textStyle;
            D();
        }

        public final void F(@NotNull List<? extends Selfie> data) throws P9.m {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            D();
        }

        public final void G(@NotNull p.AbstractC0528d.C0173d.Strings strings) throws P9.m {
            Intrinsics.checkNotNullParameter(strings, "strings");
            this.strings = strings;
            D();
        }

        public int e() {
            return this.adapterHelper.g();
        }

        public int g(int position) {
            return this.adapterHelper.i(position);
        }

        public void r(@NotNull RecyclerView.D holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.adapterHelper.k(holder, position);
        }

        @NotNull
        public RecyclerView.D t(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return this.adapterHelper.l(parent, viewType);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.C0173d d;

        c(p.AbstractC0528d.C0173d c0173d) {
            super(0);
            this.d = c0173d;
        }

        public Object invoke() {
            m535invoke();
            return Unit.a;
        }

        public final void m535invoke() {
            this.d.b().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.C0173d d;

        d(p.AbstractC0528d.C0173d c0173d) {
            super(0);
            this.d = c0173d;
        }

        public Object invoke() {
            m536invoke();
            return Unit.a;
        }

        public final void m536invoke() {
            this.d.c().invoke();
        }
    }

    public l(@NotNull W8.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "binding");
        this.binding = eVar;
        b bVar = new b();
        this.adapter = bVar;
        this.singleItemLayoutManager = new LinearLayoutManager(eVar.a().getContext());
        Context context = eVar.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.multiItemLayoutManager = new GridAutoFitLayoutManager(context, eVar.a().getContext().getResources().getDimensionPixelSize(V8.e.a));
        eVar.e.setAdapter(bVar);
        eVar.e.setHasFixedSize(true);
        ConstraintLayout constraintLayoutA = eVar.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0601d.c(constraintLayoutA, false, false, false, false, 15, null);
    }

    private final void d(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment) throws P9.m {
        StepStyles.StepCancelButtonComponentStyleContainer base;
        ButtonCancelComponentStyle base2;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.g;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.g.getPaddingRight(), 0);
            TextView textView2 = this.binding.g;
            Intrinsics.checkNotNullExpressionValue(textView2, Title.type);
            v.e(textView2, titleStyleValue);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView3 = this.binding.b;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.b.getPaddingRight(), 0);
            TextView textView4 = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(textView4, "body");
            v.e(textView4, textStyleValue);
            this.adapter.E(textStyleValue);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.a().setBackgroundColor(iIntValue);
            C0596c.a(viewEnvironment, iIntValue);
        }
        Context context = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableBackgroundImageDrawable = styles.backgroundImageDrawable(context);
        if (drawableBackgroundImageDrawable != null) {
            this.binding.a().setBackground(drawableBackgroundImageDrawable);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.d.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            Button button = this.binding.h;
            Intrinsics.checkNotNullExpressionValue(button, "usePhotosButton");
            s9.d.f(button, buttonPrimaryStyleValue, false, false, 6, null);
        }
        StepStyles.StepSecondaryButtonComponentStyle buttonSecondaryStyle = styles.getButtonSecondaryStyle();
        if (buttonSecondaryStyle != null && (base = buttonSecondaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            Button button2 = this.binding.f;
            Intrinsics.checkNotNullExpressionValue(button2, "retakeButton");
            s9.d.f(button2, base2, false, false, 6, null);
        }
        Integer headerButtonColorValue2 = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue2 != null) {
            this.binding.d.setControlsColor(headerButtonColorValue2.intValue());
        }
    }

    public static final void f(p.AbstractC0528d.C0173d c0173d, View view) {
        Intrinsics.checkNotNullParameter(c0173d, "$rendering");
        c0173d.e().invoke();
    }

    public static final void g(p.AbstractC0528d.C0173d c0173d, View view) {
        Intrinsics.checkNotNullParameter(c0173d, "$rendering");
        c0173d.d().invoke();
    }

    @Override
    public void a(@NotNull final p.AbstractC0528d.C0173d rendering, @NotNull ViewEnvironment viewEnvironment) throws P9.m {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        W8.e eVar = this.binding;
        if (rendering.f().size() <= 1) {
            eVar.e.setLayoutManager(this.singleItemLayoutManager);
        } else {
            eVar.e.setLayoutManager(this.multiItemLayoutManager);
        }
        TextView textView = eVar.g;
        Intrinsics.checkNotNullExpressionValue(textView, Title.type);
        C0726c.c(textView, rendering.getStrings().getTitle());
        TextView textView2 = eVar.b;
        Intrinsics.checkNotNullExpressionValue(textView2, "body");
        C0726c.c(textView2, rendering.getStrings().getDescription());
        eVar.h.setText(rendering.getStrings().getSubmitButton());
        eVar.h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.l.f(rendering, view);
            }
        });
        eVar.f.setText(rendering.getStrings().getRetakeButton());
        eVar.f.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.l.g(rendering, view);
            }
        });
        if (rendering.getStyles() != null) {
            d(rendering.getStyles(), viewEnvironment);
        }
        this.adapter.G(rendering.getStrings());
        this.adapter.F(rendering.f());
        NavigationState navigationStateA = rendering.getNavigationState();
        c cVar = new c(rendering);
        d dVar = new d(rendering);
        Pi2NavigationBar pi2NavigationBar = this.binding.d;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        ConstraintLayout constraintLayoutA = this.binding.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0588c.a(navigationStateA, cVar, dVar, pi2NavigationBar, constraintLayoutA);
    }
}
