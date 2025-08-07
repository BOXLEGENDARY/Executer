package com.withpersona.sdk2.inquiry.document;

import M8.i;
import M8.j;
import P9.m;
import P9.p;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import bb.C0758a;
import com.squareup.workflow1.ui.q;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.a;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.b;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.d;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import ha.AbstractC0559i;
import ha.C0399v;
import ha.C0456d;
import ha.C0553c;
import ha.C0586a;
import ha.InterfaceC0552b;
import ha.InterfaceC0883h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ka.Snapshot;
import ka.k;
import ka.r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006FHJLN\\Bi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\"*\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)JU\u00101\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0/0-0,*\u00020*2\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JU\u00104\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0/0-0,*\u0002032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b4\u00105JG\u00107\u001a\u00020\"*\u0002062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020\"*\u0002092\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\bB\u0010CJC\u0010D\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010[¨\u0006]"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "Lz1/h;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "LL8/v$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/b$a;", "documentFileUploadWorker", "Ls8/a$a;", "documentFileDeleteWorker", "Lcom/withpersona/sdk2/inquiry/document/network/d$a;", "documentSubmitWorker", "Lh9/a;", "navigationStateManager", "Le9/c;", "externalEventLogger", "<init>", "(Lz1/h;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/document/a;LL8/v$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lcom/withpersona/sdk2/inquiry/document/network/b$a;Ls8/a$a;Lcom/withpersona/sdk2/inquiry/document/network/d$a;Lh9/a;Le9/c;)V", "renderProps", "renderState", "", "n", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "event", "o", "(Lf8/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "context", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "k", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lf8/k$a;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "l", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lf8/k$a;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "q", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lf8/k$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "r", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lf8/k$a;)V", "props", "Lf8/i;", "snapshot", "m", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;Lf8/i;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "state", "s", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lf8/i;", "p", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lf8/k$a;)Ljava/lang/Object;", "a", "Lz1/h;", "b", "Landroid/content/Context;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "d", "Lcom/withpersona/sdk2/inquiry/document/a;", "e", "LL8/v$b;", "f", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "g", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/network/b$a;", "i", "Ls8/a$a;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/d$a;", "Lh9/a;", "Le9/c;", "State", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DocumentWorkflow extends k<Input, State, AbstractC0500c, Object> {

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final PermissionRequestWorkflow permissionRequestWorkflow;

    @NotNull
    private final a documentCameraWorker;

    @NotNull
    private final C0399v.b documentsSelectWorkerFactory;

    @NotNull
    private final a.C0092a documentCreateWorker;

    @NotNull
    private final c.a documentLoadWorker;

    @NotNull
    private final b.a documentFileUploadWorker;

    @NotNull
    private final C0758a.C0268a documentFileDeleteWorker;

    @NotNull
    private final d.a documentSubmitWorker;

    @NotNull
    private final C0586a navigationStateManager;

    @NotNull
    private final C0553c externalEventLogger;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/document/network/d$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class A extends l implements Function1<d.b, r<? super Input, State, ? extends AbstractC0500c>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(AbstractC0500c.d.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final d.b d;

            b(d.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new AbstractC0500c.Errored(((d.b.Error) this.d).getCause()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        A() {
            super(1);
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull d.b bVar) throws m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (Intrinsics.b(bVar, d.b.C0103b.a)) {
                return ka.z.d(DocumentWorkflow.this, null, a.d, 1, null);
            }
            if (bVar instanceof d.b.Error) {
                return ka.z.d(DocumentWorkflow.this, null, new b(bVar), 1, null);
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class B extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        B(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws m {
            m26invoke();
            return Unit.a;
        }

        public final void m26invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws m {
            m27invoke();
            return Unit.a;
        }

        public final void m27invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class D extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        D(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m28invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.d.a);
        }

        public Object invoke() throws m {
            m28invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class E extends l implements Function1<PermissionRequestWorkflow.Output, r<? super Input, State, ? extends AbstractC0500c>> {
        final State e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final DocumentWorkflow e;
            final State i;

            @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public class C0077a {
                public static final int[] a;

                static {
                    int[] iArr = new int[Q8.m.values().length];
                    try {
                        iArr[Q8.m.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q8.m.e.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q8.m.i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state) {
                super(1);
                this.d = output;
                this.e = documentWorkflow;
                this.i = state;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int i = C0077a.a[this.d.getPermissionState().getResult().ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        cVar.e(this.i.a(State.a.d));
                        return;
                    }
                    return;
                }
                com.withpersona.sdk2.inquiry.document.a aVar = this.e.documentCameraWorker;
                String string = this.e.applicationContext.getString(S8.e.a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cVar.e(aVar.f(string) ? this.i.a(State.a.i) : this.i.a(State.a.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        E(State state) {
            super(1);
            this.e = state;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull PermissionRequestWorkflow.Output output) {
            Intrinsics.checkNotNullParameter(output, "it");
            DocumentWorkflow documentWorkflow = DocumentWorkflow.this;
            return ka.z.d(documentWorkflow, null, new a(output, documentWorkflow, this.e), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class F extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        F(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws m {
            m29invoke();
            return Unit.a;
        }

        public final void m29invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.c.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class G extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        G(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m30invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.g.a);
        }

        public Object invoke() throws m {
            m30invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class H extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        H(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m31invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.h.a);
        }

        public Object invoke() throws m {
            m31invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class I extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        I(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m32invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.j.a);
        }

        public Object invoke() throws m {
            m32invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class J extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        J(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m33invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.e.a);
        }

        public Object invoke() throws m {
            m33invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class K extends l implements Function1<DocumentFile.Remote, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        K(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull DocumentFile.Remote remote) throws m {
            Intrinsics.checkNotNullParameter(remote, "document");
            DocumentWorkflow.this.o(this.e, new AbstractC0498a.RemoveDocument(remote));
        }

        public Object invoke(Object obj) throws m {
            a((DocumentFile.Remote) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class L extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        L(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m34invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.i.a);
        }

        public Object invoke() throws m {
            m34invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class M extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        M(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m35invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.b.a);
        }

        public Object invoke() throws m {
            m35invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class N extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        N(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public final void m36invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.C0078a.a);
        }

        public Object invoke() throws m {
            m36invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class O extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        O(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws m {
            m37invoke();
            return Unit.a;
        }

        public final void m37invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.C0078a.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class P extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        P(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws m {
            m38invoke();
            return Unit.a;
        }

        public final void m38invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/document/a$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class Q extends l implements Function1<a.AbstractC0081a, r<? super Input, State, ? extends AbstractC0500c>> {
        final Input e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final a.AbstractC0081a d;
            final Input e;

            a(a.AbstractC0081a abstractC0081a, Input input) {
                super(1);
                this.d = abstractC0081a;
                this.e = input;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                State.b bVar = State.b.e;
                State.a aVar = null;
                DocumentFile documentFile = null;
                boolean z = false;
                boolean z2 = false;
                String str = null;
                cVar.e(new State.ReviewCaptures(CollectionsKt.n0(CollectionsKt.f0(cVar.c().h(), new DocumentFile.Local(((a.AbstractC0081a.b) this.d).getAbsoluteFilePath(), CaptureMethod.i, 0, 4, null)), this.e.getDocumentFileLimit()), cVar.c().getDocumentId(), aVar, bVar, documentFile, z, z2, str, 244, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            public static final b d = new b();

            b() {
                super(1);
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(cVar.c().a(State.a.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        Q(Input input) {
            super(1);
            this.e = input;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull a.AbstractC0081a abstractC0081a) throws m {
            Intrinsics.checkNotNullParameter(abstractC0081a, "it");
            if (abstractC0081a instanceof a.AbstractC0081a.b) {
                return ka.z.d(DocumentWorkflow.this, null, new a(abstractC0081a, this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0081a, a.AbstractC0081a.C0082a.a)) {
                return ka.z.d(DocumentWorkflow.this, null, b.d, 1, null);
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LL8/v$c;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(LL8/v$c;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class R extends l implements Function1<C0399v.c, r<? super Input, State, ? extends AbstractC0500c>> {
        final Input e;
        final State i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final C0399v.c d;
            final Input e;

            a(C0399v.c cVar, Input input) {
                super(1);
                this.d = cVar;
                this.e = input;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                State.a aVar = null;
                cVar.e(new State.ReviewCaptures(CollectionsKt.n0(CollectionsKt.e0(cVar.c().h(), f.c(((C0399v.c.Success) this.d).a())), this.e.getDocumentFileLimit()), cVar.c().getDocumentId(), aVar, State.b.e, null, false, false, null, 244, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final C0399v.c d;
            final Input e;
            final DocumentWorkflow i;

            b(C0399v.c cVar, Input input, DocumentWorkflow documentWorkflow) {
                super(1);
                this.d = cVar;
                this.e = input;
                this.i = documentWorkflow;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                State.a aVar = null;
                cVar.e(new State.ReviewCaptures(CollectionsKt.n0(CollectionsKt.e0(cVar.c().h(), f.c(((C0399v.c.Failure) this.d).a())), this.e.getDocumentFileLimit()), cVar.c().getDocumentId(), aVar, State.b.e, null, false, false, this.i.applicationContext.getString(S8.e.j), 116, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final State d;

            c(State state) {
                super(1);
                this.d = state;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(this.d.a(State.a.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        R(Input input, State state) {
            super(1);
            this.e = input;
            this.i = state;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull C0399v.c cVar) throws m {
            Intrinsics.checkNotNullParameter(cVar, "it");
            if (cVar instanceof C0399v.c.Success) {
                return ka.z.d(DocumentWorkflow.this, null, new a(cVar, this.e), 1, null);
            }
            if (cVar instanceof C0399v.c.Failure) {
                DocumentWorkflow documentWorkflow = DocumentWorkflow.this;
                return ka.z.d(documentWorkflow, null, new b(cVar, this.e, documentWorkflow), 1, null);
            }
            if (Intrinsics.b(cVar, C0399v.c.a.a)) {
                return ka.z.d(DocumentWorkflow.this, null, new c(this.i), 1, null);
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class S extends l implements Function1<a.b, r<? super Input, State, ? extends AbstractC0500c>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final a.b d;

            a(a.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(State.d(cVar.c(), State.b.v, ((a.b.C0094b) this.d).getDocumentId(), null, null, 12, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final a.b d;

            b(a.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (((a.b.Error) this.d).getCause().isRecoverable()) {
                    return;
                }
                cVar.d(new AbstractC0500c.Errored(((a.b.Error) this.d).getCause()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        S() {
            super(1);
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull a.b bVar) throws m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof a.b.C0094b) {
                return ka.z.d(DocumentWorkflow.this, null, new a(bVar), 1, null);
            }
            if (bVar instanceof a.b.Error) {
                return ka.z.d(DocumentWorkflow.this, null, new b(bVar), 1, null);
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0011%&'\u000fB1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0001\u0003()*¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "uploadState", "", "documentId", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Ljava/lang/String;Ljava/util/List;)V", "", "shouldShowUploadOptionsDialog", "b", "(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "documentFileToDelete", "c", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "d", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "f", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "i", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "v", "Ljava/util/List;", "h", "()Ljava/util/List;", "ReviewCaptures", "Start", "UploadDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        @NotNull
        private final a captureState;

        @NotNull
        private final b uploadState;

        private final String documentId;

        @NotNull
        private final List<DocumentFile> documents;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "w", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a {
            public static final a d = new a("None", 0);
            public static final a e = new a("CheckCameraPermissions", 1);
            public static final a i = new a("CameraRunning", 2);
            public static final a v = new a("SelectFileFromDocuments", 3);
            public static final a w = new a("SelectImageFromPhotoLibrary", 4);
            private static final a[] y;
            private static final T9.a z;

            static {
                a[] aVarArrC = c();
                y = aVarArrC;
                z = T9.b.a(aVarArrC);
            }

            private a(String str, int i2) {
            }

            private static final a[] c() {
                return new a[]{d, e, i, v, w};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) y.clone();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b {
            public static final b d = new b("CreateDocument", 0);
            public static final b e = new b("UploadFiles", 1);
            public static final b i = new b("DeleteFiles", 2);
            public static final b v = new b("ReadyToSubmit", 3);
            private static final b[] w;
            private static final T9.a y;

            static {
                b[] bVarArrC = c();
                w = bVarArrC;
                y = T9.b.a(bVarArrC);
            }

            private b(String str, int i2) {
            }

            private static final b[] c() {
                return new b[]{d, e, i, v};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) w.clone();
            }
        }

        public State(a aVar, b bVar, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, bVar, str, list);
        }

        public static State d(State state, b bVar, String str, List list, DocumentFile documentFile, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWithUploadState");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            if ((i & 8) != 0) {
                documentFile = null;
            }
            return state.c(bVar, str, list, documentFile);
        }

        @NotNull
        public final State a(@NotNull a captureState) throws m {
            Intrinsics.checkNotNullParameter(captureState, "captureState");
            if (this instanceof Start) {
                return Start.l((Start) this, captureState, null, null, false, 14, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.l((ReviewCaptures) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new m();
        }

        @NotNull
        public final State b(boolean shouldShowUploadOptionsDialog) throws m {
            if (this instanceof Start) {
                return Start.l((Start) this, null, null, null, shouldShowUploadOptionsDialog, 7, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.l((ReviewCaptures) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new m();
        }

        @NotNull
        public final State c(@NotNull b uploadState, String documentId, List<? extends DocumentFile> documents, DocumentFile documentFileToDelete) throws m {
            Intrinsics.checkNotNullParameter(uploadState, "uploadState");
            if (this instanceof Start) {
                Start start = (Start) this;
                if (documentId == null) {
                    documentId = getDocumentId();
                }
                return Start.l(start, null, uploadState, documentId, false, 9, null);
            }
            if (!(this instanceof ReviewCaptures)) {
                if (this instanceof UploadDocument) {
                    return UploadDocument.l((UploadDocument) this, null, null, uploadState, null, 11, null);
                }
                throw new m();
            }
            if (documents == null) {
                documents = h();
            }
            return ReviewCaptures.l((ReviewCaptures) this, documents, null, null, uploadState, documentFileToDelete, false, false, null, 230, null);
        }

        @NotNull
        public a getCaptureState() {
            return this.captureState;
        }

        public String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        public List<DocumentFile> h() {
            return this.documents;
        }

        @NotNull
        public b getUploadState() {
            return this.uploadState;
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u000f¨\u0006,"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "uploadState", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Ljava/lang/String;)V", "k", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "w", "Ljava/util/List;", "h", "()Ljava/util/List;", "y", "Ljava/lang/String;", "g", "z", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "i", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "A", "getError", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class UploadDocument extends State {

            @NotNull
            public static final Parcelable.Creator<UploadDocument> CREATOR = new a();

            private final String error;

            @NotNull
            private final List<DocumentFile> documents;

            private final String documentId;

            @NotNull
            private final b uploadState;

            @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<UploadDocument> {
                @Override
                @NotNull
                public final UploadDocument createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(UploadDocument.class.getClassLoader()));
                    }
                    return new UploadDocument(arrayList, parcel.readString(), b.valueOf(parcel.readString()), parcel.readString());
                }

                @Override
                @NotNull
                public final UploadDocument[] newArray(int i) {
                    return new UploadDocument[i];
                }
            }

            public UploadDocument(List list, String str, b bVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i & 4) != 0 ? b.d : bVar, (i & 8) != 0 ? null : str2);
            }

            public static UploadDocument l(UploadDocument uploadDocument, List list, String str, b bVar, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = uploadDocument.documents;
                }
                if ((i & 2) != 0) {
                    str = uploadDocument.documentId;
                }
                if ((i & 4) != 0) {
                    bVar = uploadDocument.uploadState;
                }
                if ((i & 8) != 0) {
                    str2 = uploadDocument.error;
                }
                return uploadDocument.k(list, str, bVar, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadDocument)) {
                    return false;
                }
                UploadDocument uploadDocument = (UploadDocument) other;
                return Intrinsics.b(this.documents, uploadDocument.documents) && Intrinsics.b(this.documentId, uploadDocument.documentId) && this.uploadState == uploadDocument.uploadState && Intrinsics.b(this.error, uploadDocument.error);
            }

            @Override
            public String getDocumentId() {
                return this.documentId;
            }

            @Override
            @NotNull
            public List<DocumentFile> h() {
                return this.documents;
            }

            public int hashCode() {
                int iHashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.uploadState.hashCode()) * 31;
                String str2 = this.error;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override
            @NotNull
            public b getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final UploadDocument k(@NotNull List<? extends DocumentFile> documents, String documentId, @NotNull b uploadState, String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new UploadDocument(documents, documentId, uploadState, error);
            }

            @NotNull
            public String toString() {
                return "UploadDocument(documents=" + this.documents + ", documentId=" + this.documentId + ", uploadState=" + this.uploadState + ", error=" + this.error + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                List<DocumentFile> list = this.documents;
                parcel.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeParcelable(it.next(), flags);
                }
                parcel.writeString(this.documentId);
                parcel.writeString(this.uploadState.name());
                parcel.writeString(this.error);
            }

            public UploadDocument(@NotNull List<? extends DocumentFile> list, String str, @NotNull b bVar, String str2) {
                super(a.d, bVar, str, list, null);
                Intrinsics.checkNotNullParameter(list, "documents");
                Intrinsics.checkNotNullParameter(bVar, "uploadState");
                this.documents = list;
                this.documentId = str;
                this.uploadState = bVar;
                this.error = str2;
            }
        }

        private State(a aVar, b bVar, String str, List<? extends DocumentFile> list) {
            this.captureState = aVar;
            this.uploadState = bVar;
            this.documentId = str;
            this.documents = list;
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011Jl\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010\u0015¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "k", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "w", "Ljava/util/List;", "h", "()Ljava/util/List;", "y", "Ljava/lang/String;", "g", "z", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "f", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "A", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "i", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "B", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "C", "Z", "p", "()Z", "D", "q", "E", "o", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ReviewCaptures extends State {

            @NotNull
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new a();

            @NotNull
            private final b uploadState;

            private final DocumentFile documentFileToDelete;

            private final boolean reloadingFromPreviousSession;

            private final boolean shouldShowUploadOptionsDialog;

            private final String error;

            @NotNull
            private final List<DocumentFile> documents;

            private final String documentId;

            @NotNull
            private final a captureState;

            @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCaptures> {
                @Override
                @NotNull
                public final ReviewCaptures createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                    }
                    return new ReviewCaptures(arrayList, parcel.readString(), a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), (DocumentFile) parcel.readParcelable(ReviewCaptures.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
                }

                @Override
                @NotNull
                public final ReviewCaptures[] newArray(int i) {
                    return new ReviewCaptures[i];
                }
            }

            public ReviewCaptures(List list, String str, a aVar, b bVar, DocumentFile documentFile, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i & 4) != 0 ? a.d : aVar, (i & 8) != 0 ? b.d : bVar, (i & 16) != 0 ? null : documentFile, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : str2);
            }

            public static ReviewCaptures l(ReviewCaptures reviewCaptures, List list, String str, a aVar, b bVar, DocumentFile documentFile, boolean z, boolean z2, String str2, int i, Object obj) {
                return reviewCaptures.k((i & 1) != 0 ? reviewCaptures.documents : list, (i & 2) != 0 ? reviewCaptures.documentId : str, (i & 4) != 0 ? reviewCaptures.captureState : aVar, (i & 8) != 0 ? reviewCaptures.uploadState : bVar, (i & 16) != 0 ? reviewCaptures.documentFileToDelete : documentFile, (i & 32) != 0 ? reviewCaptures.reloadingFromPreviousSession : z, (i & 64) != 0 ? reviewCaptures.shouldShowUploadOptionsDialog : z2, (i & 128) != 0 ? reviewCaptures.error : str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.b(this.documents, reviewCaptures.documents) && Intrinsics.b(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && this.uploadState == reviewCaptures.uploadState && Intrinsics.b(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCaptures.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && Intrinsics.b(this.error, reviewCaptures.error);
            }

            @Override
            @NotNull
            public a getCaptureState() {
                return this.captureState;
            }

            @Override
            public String getDocumentId() {
                return this.documentId;
            }

            @Override
            @NotNull
            public List<DocumentFile> h() {
                return this.documents;
            }

            public int hashCode() {
                int iHashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int iHashCode3 = (((((iHashCode2 + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str2 = this.error;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override
            @NotNull
            public b getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final ReviewCaptures k(@NotNull List<? extends DocumentFile> documents, String documentId, @NotNull a captureState, @NotNull b uploadState, DocumentFile documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCaptures(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            public final DocumentFile getDocumentFileToDelete() {
                return this.documentFileToDelete;
            }

            public final String getError() {
                return this.error;
            }

            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "ReviewCaptures(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                List<DocumentFile> list = this.documents;
                parcel.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeParcelable(it.next(), flags);
                }
                parcel.writeString(this.documentId);
                parcel.writeString(this.captureState.name());
                parcel.writeString(this.uploadState.name());
                parcel.writeParcelable(this.documentFileToDelete, flags);
                parcel.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                parcel.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                parcel.writeString(this.error);
            }

            public ReviewCaptures(@NotNull List<? extends DocumentFile> list, String str, @NotNull a aVar, @NotNull b bVar, DocumentFile documentFile, boolean z, boolean z2, String str2) {
                super(aVar, bVar, str, list, null);
                Intrinsics.checkNotNullParameter(list, "documents");
                Intrinsics.checkNotNullParameter(aVar, "captureState");
                Intrinsics.checkNotNullParameter(bVar, "uploadState");
                this.documents = list;
                this.documentId = str;
                this.captureState = aVar;
                this.uploadState = bVar;
                this.documentFileToDelete = documentFile;
                this.reloadingFromPreviousSession = z;
                this.shouldShowUploadOptionsDialog = z2;
                this.error = str2;
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "uploadState", "", "documentId", "", "shouldShowUploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Ljava/lang/String;Z)V", "k", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "w", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "f", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "y", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "i", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$b;", "z", "Ljava/lang/String;", "g", "A", "Z", "n", "()Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Start extends State {

            @NotNull
            public static final Parcelable.Creator<Start> CREATOR = new a();

            private final boolean shouldShowUploadOptionsDialog;

            @NotNull
            private final a captureState;

            @NotNull
            private final b uploadState;

            private final String documentId;

            @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Start> {
                @Override
                @NotNull
                public final Start createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Start(a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override
                @NotNull
                public final Start[] newArray(int i) {
                    return new Start[i];
                }
            }

            public Start(a aVar, b bVar, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? a.d : aVar, (i & 2) != 0 ? b.d : bVar, str, (i & 8) != 0 ? false : z);
            }

            public static Start l(Start start, a aVar, b bVar, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = start.captureState;
                }
                if ((i & 2) != 0) {
                    bVar = start.uploadState;
                }
                if ((i & 4) != 0) {
                    str = start.documentId;
                }
                if ((i & 8) != 0) {
                    z = start.shouldShowUploadOptionsDialog;
                }
                return start.k(aVar, bVar, str, z);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return this.captureState == start.captureState && this.uploadState == start.uploadState && Intrinsics.b(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            @Override
            @NotNull
            public a getCaptureState() {
                return this.captureState;
            }

            @Override
            public String getDocumentId() {
                return this.documentId;
            }

            public int hashCode() {
                int iHashCode = ((this.captureState.hashCode() * 31) + this.uploadState.hashCode()) * 31;
                String str = this.documentId;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog);
            }

            @Override
            @NotNull
            public b getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final Start k(@NotNull a captureState, @NotNull b uploadState, String documentId, boolean shouldShowUploadOptionsDialog) {
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new Start(captureState, uploadState, documentId, shouldShowUploadOptionsDialog);
            }

            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "Start(captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentId=" + this.documentId + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.captureState.name());
                parcel.writeString(this.uploadState.name());
                parcel.writeString(this.documentId);
                parcel.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
            }

            public Start(@NotNull a aVar, @NotNull b bVar, String str, boolean z) {
                super(aVar, bVar, str, CollectionsKt.j(), null);
                Intrinsics.checkNotNullParameter(aVar, "captureState");
                Intrinsics.checkNotNullParameter(bVar, "uploadState");
                this.captureState = aVar;
                this.uploadState = bVar;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4", f = "DocumentWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class T extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final k<Input, State, AbstractC0500c, Object>.a e;
        final DocumentWorkflow i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(State.d(cVar.c(), State.b.v, null, null, null, 14, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        T(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar, DocumentWorkflow documentWorkflow, Continuation<? super T> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = documentWorkflow;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new T(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            this.e.b().d(ka.z.d(this.i, null, a.d, 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "response", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/document/network/b$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class U extends l implements Function1<b.AbstractC0095b, r<? super Input, State, ? extends AbstractC0500c>> {
        final DocumentFile.Local e;
        final State i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final b.AbstractC0095b d;

            a(b.AbstractC0095b abstractC0095b) {
                super(1);
                this.d = abstractC0095b;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                State.b bVar;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                List<DocumentFile> listH = cVar.c().h();
                b.AbstractC0095b abstractC0095b = this.d;
                ArrayList arrayList = new ArrayList(CollectionsKt.t(listH, 10));
                for (Parcelable newRemoteDocument : listH) {
                    b.AbstractC0095b.d dVar = (b.AbstractC0095b.d) abstractC0095b;
                    if (Intrinsics.b(newRemoteDocument, dVar.getOldLocalDocument())) {
                        newRemoteDocument = dVar.getNewRemoteDocument();
                    }
                    arrayList.add(newRemoteDocument);
                }
                if (arrayList.isEmpty()) {
                    bVar = State.b.v;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                            bVar = State.b.e;
                            break;
                        }
                    }
                    bVar = State.b.v;
                }
                cVar.e(State.d(cVar.c(), bVar, null, arrayList, null, 10, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final DocumentFile.Local d;
            final b.AbstractC0095b e;

            b(DocumentFile.Local local, b.AbstractC0095b abstractC0095b) {
                super(1);
                this.d = local;
                this.e = abstractC0095b;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                List<DocumentFile> listH = cVar.c().h();
                DocumentFile.Local local = this.d;
                b.AbstractC0095b abstractC0095b = this.e;
                ArrayList arrayList = new ArrayList(CollectionsKt.t(listH, 10));
                for (Parcelable parcelableB : listH) {
                    if ((parcelableB instanceof DocumentFile.Local) && Intrinsics.b(parcelableB, local)) {
                        parcelableB = DocumentFile.Local.b((DocumentFile.Local) parcelableB, null, null, ((b.AbstractC0095b.c) abstractC0095b).getProgressPercentage(), 3, null);
                    }
                    arrayList.add(parcelableB);
                }
                cVar.e(State.d(cVar.c(), cVar.c().getUploadState(), null, arrayList, null, 10, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final DocumentFile.Local d;
            final State e;
            final b.AbstractC0095b i;
            final DocumentWorkflow v;

            c(DocumentFile.Local local, State state, b.AbstractC0095b abstractC0095b, DocumentWorkflow documentWorkflow) {
                super(1);
                this.d = local;
                this.e = state;
                this.i = abstractC0095b;
                this.v = documentWorkflow;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                State.b bVar;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                List listD0 = CollectionsKt.d0(cVar.c().h(), this.d);
                List list = listD0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    bVar = State.b.v;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                            bVar = State.b.e;
                            break;
                        }
                    }
                    bVar = State.b.v;
                }
                cVar.e(new State.ReviewCaptures(listD0, this.e.getDocumentId(), State.a.d, bVar, null, false, false, f.d(((b.AbstractC0095b.a) this.i).getCause(), this.v.applicationContext), 80, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final b.AbstractC0095b d;

            d(b.AbstractC0095b abstractC0095b) {
                super(1);
                this.d = abstractC0095b;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new AbstractC0500c.Errored(((b.AbstractC0095b.C0096b) this.d).getCause()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        U(DocumentFile.Local local, State state) {
            super(1);
            this.e = local;
            this.i = state;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull b.AbstractC0095b abstractC0095b) throws m {
            Intrinsics.checkNotNullParameter(abstractC0095b, "response");
            if (abstractC0095b instanceof b.AbstractC0095b.d) {
                return ka.z.d(DocumentWorkflow.this, null, new a(abstractC0095b), 1, null);
            }
            if (abstractC0095b instanceof b.AbstractC0095b.c) {
                return ka.z.d(DocumentWorkflow.this, null, new b(this.e, abstractC0095b), 1, null);
            }
            if (abstractC0095b instanceof b.AbstractC0095b.a) {
                DocumentWorkflow documentWorkflow = DocumentWorkflow.this;
                return ka.z.d(documentWorkflow, null, new c(this.e, this.i, abstractC0095b, documentWorkflow), 1, null);
            }
            if (abstractC0095b instanceof b.AbstractC0095b.C0096b) {
                return ka.z.d(DocumentWorkflow.this, null, new d(abstractC0095b), 1, null);
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls8/a$b;", "response", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Ls8/a$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class V extends l implements Function1<C0758a.b, r<? super Input, State, ? extends AbstractC0500c>> {
        final DocumentFile.Remote e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final DocumentFile.Remote d;
            final C0758a.b e;

            a(DocumentFile.Remote remote, C0758a.b bVar) {
                super(1);
                this.d = remote;
                this.e = bVar;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                State.b bVar;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                State stateC = cVar.c();
                State.ReviewCaptures reviewCaptures = stateC instanceof State.ReviewCaptures ? (State.ReviewCaptures) stateC : null;
                if (reviewCaptures == null) {
                    return;
                }
                List listD0 = CollectionsKt.d0(reviewCaptures.h(), this.d);
                List list = listD0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    bVar = State.b.v;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                            bVar = State.b.e;
                            break;
                        }
                    }
                    bVar = State.b.v;
                }
                State.b bVar2 = bVar;
                C0758a.b bVar3 = this.e;
                if (bVar3 instanceof C0758a.b.C0270b) {
                    cVar.e(State.ReviewCaptures.l(reviewCaptures, listD0, null, null, bVar2, null, false, false, null, 230, null));
                } else if (bVar3 instanceof C0758a.b.Error) {
                    cVar.d(new AbstractC0500c.Errored(((C0758a.b.Error) bVar3).getCause()));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        V(DocumentFile.Remote remote) {
            super(1);
            this.e = remote;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull C0758a.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "response");
            return ka.z.d(DocumentWorkflow.this, null, new a(this.e, bVar), 1, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0498a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0078a extends AbstractC0498a {

            @NotNull
            public static final C0078a a = new C0078a();

            private C0078a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0078a);
            }

            public int hashCode() {
                return 1245705540;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends AbstractC0498a {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1143899241;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class c extends AbstractC0498a {

            @NotNull
            public static final c a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1422406686;
            }

            @NotNull
            public String toString() {
                return "CloseUploadOptions";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d extends AbstractC0498a {

            @NotNull
            public static final d a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -967280389;
            }

            @NotNull
            public String toString() {
                return "DismissError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class e extends AbstractC0498a {

            @NotNull
            public static final e a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1532240394;
            }

            @NotNull
            public String toString() {
                return "OpenUploadOptions";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class RemoveDocument extends AbstractC0498a {

            @NotNull
            private final DocumentFile.Remote document;

            public RemoveDocument(@NotNull DocumentFile.Remote remote) {
                super(null);
                Intrinsics.checkNotNullParameter(remote, "document");
                this.document = remote;
            }

            @NotNull
            public final DocumentFile.Remote getDocument() {
                return this.document;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RemoveDocument) && Intrinsics.b(this.document, ((RemoveDocument) other).document);
            }

            public int hashCode() {
                return this.document.hashCode();
            }

            @NotNull
            public String toString() {
                return "RemoveDocument(document=" + this.document + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class g extends AbstractC0498a {

            @NotNull
            public static final g a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1818587564;
            }

            @NotNull
            public String toString() {
                return "SelectDocument";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class h extends AbstractC0498a {

            @NotNull
            public static final h a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1457257560;
            }

            @NotNull
            public String toString() {
                return "SelectPhotoFromLibrary";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class i extends AbstractC0498a {

            @NotNull
            public static final i a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return -667710155;
            }

            @NotNull
            public String toString() {
                return "Submit";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class j extends AbstractC0498a {

            @NotNull
            public static final j a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -623405138;
            }

            @NotNull
            public String toString() {
                return "TakePhoto";
            }
        }

        public AbstractC0498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0498a() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b3\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b:\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b;\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b<\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b9\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b=\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b7\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b>\u0010DR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b5\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b/\u0010IR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\b1\u0010IR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bK\u0010&R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\bJ\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\bG\u0010&R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bE\u0010&R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bA\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bM\u0010O\u001a\u0004\b,\u0010PR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b:\u0010Q\u001a\u0004\b?\u0010R¨\u0006S"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "promptTitle", "promptDescription", "disclaimer", "submitButtonText", "pendingTitle", "pendingDescription", "fieldKeyDocument", "kind", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;", "startPage", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "", "documentFileLimit", "", "backStepEnabled", "cancelButtonEnabled", "permissionsTitle", "permissionsRationale", "permissionsModalPositiveButton", "permissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "v", "b", "j", "c", "i", "d", "h", "e", "u", "f", "t", "g", "y", "o", "m", "k", "l", "n", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;", "w", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "p", "I", "q", "Z", "()Z", "r", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Input {

        @NotNull
        private final String sessionToken;

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String fromStep;

        @NotNull
        private final String fromComponent;

        private final String promptTitle;

        private final String promptDescription;

        private final String disclaimer;

        private final String submitButtonText;

        private final String pendingTitle;

        private final String pendingDescription;

        @NotNull
        private final String fieldKeyDocument;

        @NotNull
        private final String kind;

        private final String documentId;

        @NotNull
        private final EnumC0502e startPage;

        @NotNull
        private final DocumentPages pages;

        private final int documentFileLimit;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        private final String permissionsTitle;

        private final String permissionsRationale;

        private final String permissionsModalPositiveButton;

        private final String permissionsModalNegativeButton;

        private final StepStyles.DocumentStepStyle styles;

        @NotNull
        private final NextStep.Document.AssetConfig assetConfig;

        @NotNull
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        public Input(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, String str9, String str10, @NotNull String str11, @NotNull String str12, String str13, @NotNull EnumC0502e enumC0502e, @NotNull DocumentPages documentPages, int i, boolean z, boolean z2, String str14, String str15, String str16, String str17, StepStyles.DocumentStepStyle documentStepStyle, @NotNull NextStep.Document.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextPosition) {
            Intrinsics.checkNotNullParameter(str, "sessionToken");
            Intrinsics.checkNotNullParameter(str2, "inquiryId");
            Intrinsics.checkNotNullParameter(str3, "fromStep");
            Intrinsics.checkNotNullParameter(str4, "fromComponent");
            Intrinsics.checkNotNullParameter(str11, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(str12, "kind");
            Intrinsics.checkNotNullParameter(enumC0502e, "startPage");
            Intrinsics.checkNotNullParameter(documentPages, "pages");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = str;
            this.inquiryId = str2;
            this.fromStep = str3;
            this.fromComponent = str4;
            this.promptTitle = str5;
            this.promptDescription = str6;
            this.disclaimer = str7;
            this.submitButtonText = str8;
            this.pendingTitle = str9;
            this.pendingDescription = str10;
            this.fieldKeyDocument = str11;
            this.kind = str12;
            this.documentId = str13;
            this.startPage = enumC0502e;
            this.pages = documentPages;
            this.documentFileLimit = i;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.permissionsTitle = str14;
            this.permissionsRationale = str15;
            this.permissionsModalPositiveButton = str16;
            this.permissionsModalNegativeButton = str17;
            this.styles = documentStepStyle;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
        }

        @NotNull
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final int getDocumentFileLimit() {
            return this.documentFileLimit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.b(this.sessionToken, input.sessionToken) && Intrinsics.b(this.inquiryId, input.inquiryId) && Intrinsics.b(this.fromStep, input.fromStep) && Intrinsics.b(this.fromComponent, input.fromComponent) && Intrinsics.b(this.promptTitle, input.promptTitle) && Intrinsics.b(this.promptDescription, input.promptDescription) && Intrinsics.b(this.disclaimer, input.disclaimer) && Intrinsics.b(this.submitButtonText, input.submitButtonText) && Intrinsics.b(this.pendingTitle, input.pendingTitle) && Intrinsics.b(this.pendingDescription, input.pendingDescription) && Intrinsics.b(this.fieldKeyDocument, input.fieldKeyDocument) && Intrinsics.b(this.kind, input.kind) && Intrinsics.b(this.documentId, input.documentId) && this.startPage == input.startPage && Intrinsics.b(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.b(this.permissionsTitle, input.permissionsTitle) && Intrinsics.b(this.permissionsRationale, input.permissionsRationale) && Intrinsics.b(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && Intrinsics.b(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && Intrinsics.b(this.styles, input.styles) && Intrinsics.b(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition;
        }

        public final String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        public int hashCode() {
            int iHashCode = ((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31;
            String str = this.promptTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promptDescription;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclaimer;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.submitButtonText;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pendingTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pendingDescription;
            int iHashCode7 = (((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.kind.hashCode()) * 31;
            String str7 = this.documentId;
            int iHashCode8 = (((((((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.startPage.hashCode()) * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.documentFileLimit)) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31;
            String str8 = this.permissionsTitle;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.permissionsRationale;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.permissionsModalPositiveButton;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.permissionsModalNegativeButton;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            return ((((iHashCode12 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0)) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode();
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        public final String getKind() {
            return this.kind;
        }

        @NotNull
        public final DocumentPages getPages() {
            return this.pages;
        }

        public final String getPendingDescription() {
            return this.pendingDescription;
        }

        @NotNull
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        public final String getPendingTitle() {
            return this.pendingTitle;
        }

        public final String getPermissionsModalNegativeButton() {
            return this.permissionsModalNegativeButton;
        }

        public final String getPermissionsModalPositiveButton() {
            return this.permissionsModalPositiveButton;
        }

        public final String getPermissionsRationale() {
            return this.permissionsRationale;
        }

        public final String getPermissionsTitle() {
            return this.permissionsTitle;
        }

        public final String getPromptDescription() {
            return this.promptDescription;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromStep=" + this.fromStep + ", fromComponent=" + this.fromComponent + ", promptTitle=" + this.promptTitle + ", promptDescription=" + this.promptDescription + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", pendingTitle=" + this.pendingTitle + ", pendingDescription=" + this.pendingDescription + ", fieldKeyDocument=" + this.fieldKeyDocument + ", kind=" + this.kind + ", documentId=" + this.documentId + ", startPage=" + this.startPage + ", pages=" + this.pages + ", documentFileLimit=" + this.documentFileLimit + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", permissionsTitle=" + this.permissionsTitle + ", permissionsRationale=" + this.permissionsRationale + ", permissionsModalPositiveButton=" + this.permissionsModalPositiveButton + ", permissionsModalNegativeButton=" + this.permissionsModalNegativeButton + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ")";
        }

        public final String getPromptTitle() {
            return this.promptTitle;
        }

        @NotNull
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        public final EnumC0502e getStartPage() {
            return this.startPage;
        }

        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$d;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0500c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0500c {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 89823627;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends AbstractC0500c {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1234032835;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Errored extends AbstractC0500c {

            @NotNull
            private final InternalErrorInfo cause;

            public Errored(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Errored) && Intrinsics.b(this.cause, ((Errored) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Errored(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d extends AbstractC0500c {

            @NotNull
            public static final d a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1784519914;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public AbstractC0500c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0500c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$b;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0501d {

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b%\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b\u001d\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;", "", Title.type, "prompt", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "f", "c", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class LoadingAnimation extends AbstractC0501d {

            private final String title;

            private final String prompt;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final Function0<Unit> onBack;

            @NotNull
            private final Function0<Unit> onCancel;

            private final StepStyles.DocumentStepStyle styles;

            private final NextStep.Document.AssetConfig.PendingPage assetConfig;

            @NotNull
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            public LoadingAnimation(String str, String str2, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, @NotNull PendingPageTextPosition pendingPageTextPosition) {
                super(null);
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(function0, "onBack");
                Intrinsics.checkNotNullParameter(function02, "onCancel");
                Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
                this.title = str;
                this.prompt = str2;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.styles = documentStepStyle;
                this.assetConfig = pendingPage;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            }

            public final NextStep.Document.AssetConfig.PendingPage getAssetConfig() {
                return this.assetConfig;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onCancel;
            }

            @NotNull
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingAnimation)) {
                    return false;
                }
                LoadingAnimation loadingAnimation = (LoadingAnimation) other;
                return Intrinsics.b(this.title, loadingAnimation.title) && Intrinsics.b(this.prompt, loadingAnimation.prompt) && Intrinsics.b(this.navigationState, loadingAnimation.navigationState) && Intrinsics.b(this.onBack, loadingAnimation.onBack) && Intrinsics.b(this.onCancel, loadingAnimation.onCancel) && Intrinsics.b(this.styles, loadingAnimation.styles) && Intrinsics.b(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.prompt;
                int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                NextStep.Document.AssetConfig.PendingPage pendingPage = this.assetConfig;
                return ((iHashCode3 + (pendingPage != null ? pendingPage.hashCode() : 0)) * 31) + this.pendingPageTextVerticalPosition.hashCode();
            }

            @NotNull
            public String toString() {
                return "LoadingAnimation(title=" + this.title + ", prompt=" + this.prompt + ", navigationState=" + this.navigationState + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ")";
            }
        }

        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b4\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b6\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bF\u0010JR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010AR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\bB\u0010AR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\b>\u0010AR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b1\u0010NR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\b-\u0010NR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010M\u001a\u0004\bL\u0010NR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\b7\u0010%R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bD\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bK\u0010S¨\u0006T"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;", "Lz1/h;", "imageLoader", "", Title.type, "prompt", "disclaimer", "submitButtonText", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "openSelectFile", "selectFromPhotoLibrary", "openCamera", "openUploadOptions", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "onRemove", "onSubmit", "onCancel", "onBack", "", "disabled", "addButtonEnabled", "submitButtonEnabled", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Lz1/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lz1/h;", "f", "()Lz1/h;", "b", "Ljava/lang/String;", "r", "c", "n", "d", "e", "q", "Ljava/util/List;", "()Ljava/util/List;", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "getOpenSelectFile", "()Lkotlin/jvm/functions/Function0;", "i", "getSelectFromPhotoLibrary", "j", "getOpenCamera", "k", "m", "l", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "o", "p", "Z", "()Z", "s", "t", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ReviewCaptures extends AbstractC0501d {

            @NotNull
            private final InterfaceC0883h imageLoader;

            private final String title;

            private final String prompt;

            private final String disclaimer;

            private final String submitButtonText;

            @NotNull
            private final List<DocumentFile> documents;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final Function0<Unit> openSelectFile;

            @NotNull
            private final Function0<Unit> selectFromPhotoLibrary;

            @NotNull
            private final Function0<Unit> openCamera;

            @NotNull
            private final Function0<Unit> openUploadOptions;

            @NotNull
            private final Function1<DocumentFile.Remote, Unit> onRemove;

            @NotNull
            private final Function0<Unit> onSubmit;

            @NotNull
            private final Function0<Unit> onCancel;

            @NotNull
            private final Function0<Unit> onBack;

            private final boolean disabled;

            private final boolean addButtonEnabled;

            private final boolean submitButtonEnabled;

            private final String error;

            @NotNull
            private final Function0<Unit> onErrorDismissed;

            private final StepStyles.DocumentStepStyle styles;

            public ReviewCaptures(@NotNull InterfaceC0883h interfaceC0883h, String str, String str2, String str3, String str4, @NotNull List<? extends DocumentFile> list, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function1<? super DocumentFile.Remote, Unit> function1, @NotNull Function0<Unit> function05, @NotNull Function0<Unit> function06, @NotNull Function0<Unit> function07, boolean z, boolean z2, boolean z3, String str5, @NotNull Function0<Unit> function08, StepStyles.DocumentStepStyle documentStepStyle) {
                super(null);
                Intrinsics.checkNotNullParameter(interfaceC0883h, "imageLoader");
                Intrinsics.checkNotNullParameter(list, "documents");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(function0, "openSelectFile");
                Intrinsics.checkNotNullParameter(function02, "selectFromPhotoLibrary");
                Intrinsics.checkNotNullParameter(function03, "openCamera");
                Intrinsics.checkNotNullParameter(function04, "openUploadOptions");
                Intrinsics.checkNotNullParameter(function1, "onRemove");
                Intrinsics.checkNotNullParameter(function05, "onSubmit");
                Intrinsics.checkNotNullParameter(function06, "onCancel");
                Intrinsics.checkNotNullParameter(function07, "onBack");
                Intrinsics.checkNotNullParameter(function08, "onErrorDismissed");
                this.imageLoader = interfaceC0883h;
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.submitButtonText = str4;
                this.documents = list;
                this.navigationState = navigationState;
                this.openSelectFile = function0;
                this.selectFromPhotoLibrary = function02;
                this.openCamera = function03;
                this.openUploadOptions = function04;
                this.onRemove = function1;
                this.onSubmit = function05;
                this.onCancel = function06;
                this.onBack = function07;
                this.disabled = z;
                this.addButtonEnabled = z2;
                this.submitButtonEnabled = z3;
                this.error = str5;
                this.onErrorDismissed = function08;
                this.styles = documentStepStyle;
            }

            public final boolean getAddButtonEnabled() {
                return this.addButtonEnabled;
            }

            public final boolean getDisabled() {
                return this.disabled;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            public final List<DocumentFile> d() {
                return this.documents;
            }

            public final String getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.b(this.imageLoader, reviewCaptures.imageLoader) && Intrinsics.b(this.title, reviewCaptures.title) && Intrinsics.b(this.prompt, reviewCaptures.prompt) && Intrinsics.b(this.disclaimer, reviewCaptures.disclaimer) && Intrinsics.b(this.submitButtonText, reviewCaptures.submitButtonText) && Intrinsics.b(this.documents, reviewCaptures.documents) && Intrinsics.b(this.navigationState, reviewCaptures.navigationState) && Intrinsics.b(this.openSelectFile, reviewCaptures.openSelectFile) && Intrinsics.b(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && Intrinsics.b(this.openCamera, reviewCaptures.openCamera) && Intrinsics.b(this.openUploadOptions, reviewCaptures.openUploadOptions) && Intrinsics.b(this.onRemove, reviewCaptures.onRemove) && Intrinsics.b(this.onSubmit, reviewCaptures.onSubmit) && Intrinsics.b(this.onCancel, reviewCaptures.onCancel) && Intrinsics.b(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && Intrinsics.b(this.error, reviewCaptures.error) && Intrinsics.b(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && Intrinsics.b(this.styles, reviewCaptures.styles);
            }

            @NotNull
            public final InterfaceC0883h getImageLoader() {
                return this.imageLoader;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onBack;
            }

            public int hashCode() {
                int iHashCode = this.imageLoader.hashCode() * 31;
                String str = this.title;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.prompt;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclaimer;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.submitButtonText;
                int iHashCode5 = (((((((((((((((((((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.documents.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.openSelectFile.hashCode()) * 31) + this.selectFromPhotoLibrary.hashCode()) * 31) + this.openCamera.hashCode()) * 31) + this.openUploadOptions.hashCode()) * 31) + this.onRemove.hashCode()) * 31) + this.onSubmit.hashCode()) * 31) + this.onCancel.hashCode()) * 31) + this.onBack.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.addButtonEnabled)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31;
                String str5 = this.error;
                int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                return iHashCode6 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0);
            }

            @NotNull
            public final Function0<Unit> i() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final Function1<DocumentFile.Remote, Unit> k() {
                return this.onRemove;
            }

            @NotNull
            public final Function0<Unit> l() {
                return this.onSubmit;
            }

            @NotNull
            public final Function0<Unit> m() {
                return this.openUploadOptions;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            public final String getSubmitButtonText() {
                return this.submitButtonText;
            }

            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public String toString() {
                return "ReviewCaptures(imageLoader=" + this.imageLoader + ", title=" + this.title + ", prompt=" + this.prompt + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", documents=" + this.documents + ", navigationState=" + this.navigationState + ", openSelectFile=" + this.openSelectFile + ", selectFromPhotoLibrary=" + this.selectFromPhotoLibrary + ", openCamera=" + this.openCamera + ", openUploadOptions=" + this.openUploadOptions + ", onRemove=" + this.onRemove + ", onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onBack=" + this.onBack + ", disabled=" + this.disabled + ", addButtonEnabled=" + this.addButtonEnabled + ", submitButtonEnabled=" + this.submitButtonEnabled + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ")";
            }
        }

        public AbstractC0501d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0501d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "document_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class EnumC0502e {
        public static final EnumC0502e d = new EnumC0502e("Prompt", 0);
        public static final EnumC0502e e = new EnumC0502e("Review", 1);
        private static final EnumC0502e[] i;
        private static final T9.a v;

        static {
            EnumC0502e[] enumC0502eArrC = c();
            i = enumC0502eArrC;
            v = T9.b.a(enumC0502eArrC);
        }

        private EnumC0502e(String str, int i2) {
        }

        private static final EnumC0502e[] c() {
            return new EnumC0502e[]{d, e};
        }

        public static EnumC0502e valueOf(String str) {
            return (EnumC0502e) Enum.valueOf(EnumC0502e.class, str);
        }

        public static EnumC0502e[] values() {
            return (EnumC0502e[]) i.clone();
        }
    }

    @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0503f {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] iArr = new int[EnumC0502e.values().length];
            try {
                iArr[EnumC0502e.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0502e.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[State.a.values().length];
            try {
                iArr2[State.a.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[State.a.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[State.a.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[State.a.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[State.a.w.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[State.b.values().length];
            try {
                iArr3[State.b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[State.b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[State.b.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[State.b.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0504g extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0504g(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.g.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0505h extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0505h(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.h.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0506i extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0506i(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.j.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0507j extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0507j(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.e.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0508k extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0508k(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.g.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0509l extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0509l(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.h.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0510m extends l implements Function1<UiComponent, Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        C0510m(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) throws m {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            DocumentWorkflow.this.o(this.e, AbstractC0498a.j.a);
        }

        public Object invoke(Object obj) throws m {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0511n extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0511n d = new C0511n();

        C0511n() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.e(new State.UploadDocument(cVar.c().h(), cVar.c().getDocumentId(), State.b.v, null, 8, null));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0512o extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0512o d = new C0512o();

        C0512o() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.d(AbstractC0500c.b.a);
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0513p extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0513p d = new C0513p();

        C0513p() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.d(AbstractC0500c.a.a);
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0514q extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0514q d = new C0514q();

        C0514q() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.e(cVar.c().a(State.a.v).b(false));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0515r extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0515r d = new C0515r();

        C0515r() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.e(cVar.c().a(State.a.w).b(false));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0516s extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0516s d = new C0516s();

        C0516s() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.e(cVar.c().a(State.a.e).b(false));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0517t extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0517t d = new C0517t();

        C0517t() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.e(cVar.c().b(true));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0518u extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final C0518u d = new C0518u();

        C0518u() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.e(cVar.c().b(false));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0519v extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        final AbstractC0498a d;

        C0519v(AbstractC0498a abstractC0498a) {
            super(1);
            this.d = abstractC0498a;
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            if (cVar.c() instanceof State.ReviewCaptures) {
                cVar.e(State.d(cVar.c(), State.b.i, null, null, ((AbstractC0498a.RemoveDocument) this.d).getDocument(), 6, null));
            }
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class w extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
        public static final w d = new w();

        w() {
            super(1);
        }

        public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            State stateC = cVar.c();
            if (stateC instanceof State.ReviewCaptures) {
                cVar.e(State.ReviewCaptures.l((State.ReviewCaptures) stateC, null, null, null, null, null, false, false, null, 127, null));
            }
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class x extends l implements Function1<PermissionRequestWorkflow.Output, r<? super Input, State, ? extends AbstractC0500c>> {
        final State e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final DocumentWorkflow e;
            final State i;

            @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public class C0080a {
                public static final int[] a;

                static {
                    int[] iArr = new int[Q8.m.values().length];
                    try {
                        iArr[Q8.m.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q8.m.e.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q8.m.i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state) {
                super(1);
                this.d = output;
                this.e = documentWorkflow;
                this.i = state;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int i = C0080a.a[this.d.getPermissionState().getResult().ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        cVar.e(this.i.a(State.a.d));
                        return;
                    }
                    return;
                }
                com.withpersona.sdk2.inquiry.document.a aVar = this.e.documentCameraWorker;
                String string = this.e.applicationContext.getString(S8.e.a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cVar.e(aVar.f(string) ? this.i.a(State.a.i) : this.i.a(State.a.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        x(State state) {
            super(1);
            this.e = state;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull PermissionRequestWorkflow.Output output) {
            Intrinsics.checkNotNullParameter(output, "it");
            DocumentWorkflow documentWorkflow = DocumentWorkflow.this;
            return ka.z.d(documentWorkflow, null, new a(output, documentWorkflow, this.e), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "a", "(Lcom/withpersona/sdk2/inquiry/document/network/c$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class y extends l implements Function1<c.b, r<? super Input, State, ? extends AbstractC0500c>> {
        final State e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final State d;
            final c.b e;

            a(State state, c.b bVar) {
                super(1);
                this.d = state;
                this.e = bVar;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(State.ReviewCaptures.l((State.ReviewCaptures) this.d, ((c.b.C0101b) this.e).a(), null, null, State.b.v, null, false, false, null, 214, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Input, State, ? extends AbstractC0500c>.c, Unit> {
            final c.b d;

            b(c.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull r<? super Input, State, ? extends AbstractC0500c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new AbstractC0500c.Errored(((c.b.a) this.d).getCause()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        y(State state) {
            super(1);
            this.e = state;
        }

        @NotNull
        public final r<Input, State, AbstractC0500c> invoke(@NotNull c.b bVar) throws m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof c.b.C0101b) {
                return ka.z.d(DocumentWorkflow.this, null, new a(this.e, bVar), 1, null);
            }
            if (bVar instanceof c.b.a) {
                return ka.z.d(DocumentWorkflow.this, null, new b(bVar), 1, null);
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class z extends l implements Function0<Unit> {
        final k<Input, State, AbstractC0500c, Object>.a e;

        z(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws m {
            m39invoke();
            return Unit.a;
        }

        public final void m39invoke() throws m {
            DocumentWorkflow.this.o(this.e, AbstractC0498a.c.a);
        }
    }

    public DocumentWorkflow(@NotNull InterfaceC0883h interfaceC0883h, @NotNull Context context, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull a aVar, @NotNull C0399v.b bVar, @NotNull a.C0092a c0092a, @NotNull c.a aVar2, @NotNull b.a aVar3, @NotNull C0758a.C0268a c0268a, @NotNull d.a aVar4, @NotNull C0586a c0586a, @NotNull C0553c c0553c) {
        Intrinsics.checkNotNullParameter(interfaceC0883h, "imageLoader");
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(aVar, "documentCameraWorker");
        Intrinsics.checkNotNullParameter(bVar, "documentsSelectWorkerFactory");
        Intrinsics.checkNotNullParameter(c0092a, "documentCreateWorker");
        Intrinsics.checkNotNullParameter(aVar2, "documentLoadWorker");
        Intrinsics.checkNotNullParameter(aVar3, "documentFileUploadWorker");
        Intrinsics.checkNotNullParameter(c0268a, "documentFileDeleteWorker");
        Intrinsics.checkNotNullParameter(aVar4, "documentSubmitWorker");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        Intrinsics.checkNotNullParameter(c0553c, "externalEventLogger");
        this.imageLoader = interfaceC0883h;
        this.applicationContext = context;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.documentCameraWorker = aVar;
        this.documentsSelectWorkerFactory = bVar;
        this.documentCreateWorker = c0092a;
        this.documentLoadWorker = aVar2;
        this.documentFileUploadWorker = aVar3;
        this.documentFileDeleteWorker = c0268a;
        this.documentSubmitWorker = aVar4;
        this.navigationStateManager = c0586a;
        this.externalEventLogger = c0553c;
    }

    private final List<Pair<String, Function1<UiComponent, Unit>>> k(DocumentStartPage documentStartPage, k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
        return new NestedUiStep.a().a(documentStartPage.getSelectDocumentButton(), new C0504g(aVar)).a(documentStartPage.getSelectPhotoButton(), new C0505h(aVar)).a(documentStartPage.getTakePhotoButton(), new C0506i(aVar)).a(documentStartPage.getLaunchUploadOptionsButton(), new C0507j(aVar)).b();
    }

    private final List<Pair<String, Function1<UiComponent, Unit>>> l(UploadOptionsDialog uploadOptionsDialog, k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
        return new NestedUiStep.a().a(uploadOptionsDialog.getSelectDocumentButton(), new C0508k(aVar)).a(uploadOptionsDialog.getSelectPhotoButton(), new C0509l(aVar)).a(uploadOptionsDialog.getTakePhotoButton(), new C0510m(aVar)).b();
    }

    private final void n(Input renderProps, State renderState) throws m {
        InterfaceC0552b interfaceC0552b;
        if (renderState.getCaptureState() == State.a.i) {
            interfaceC0552b = InterfaceC0552b.d.a;
        } else if (renderState instanceof State.Start) {
            interfaceC0552b = InterfaceC0552b.C0221b.a;
        } else if (renderState instanceof State.ReviewCaptures) {
            interfaceC0552b = InterfaceC0552b.c.a;
        } else {
            if (!(renderState instanceof State.UploadDocument)) {
                throw new m();
            }
            interfaceC0552b = InterfaceC0552b.a.a;
        }
        this.externalEventLogger.c(new AbstractC0559i.b(renderProps.getFromStep(), interfaceC0552b));
    }

    public final void o(k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar, AbstractC0498a abstractC0498a) throws m {
        r<? super Object, State, ? extends Object> rVarD;
        if (Intrinsics.b(abstractC0498a, AbstractC0498a.b.a)) {
            rVarD = ka.z.d(this, null, C0512o.d, 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.C0078a.a)) {
            rVarD = ka.z.d(this, null, C0513p.d, 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.g.a)) {
            rVarD = ka.z.d(this, null, C0514q.d, 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.h.a)) {
            rVarD = ka.z.d(this, null, C0515r.d, 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.j.a)) {
            rVarD = ka.z.d(this, null, C0516s.d, 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.e.a)) {
            rVarD = ka.z.d(this, null, C0517t.d, 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.c.a)) {
            rVarD = ka.z.d(this, null, C0518u.d, 1, null);
        } else if (abstractC0498a instanceof AbstractC0498a.RemoveDocument) {
            rVarD = ka.z.d(this, null, new C0519v(abstractC0498a), 1, null);
        } else if (Intrinsics.b(abstractC0498a, AbstractC0498a.d.a)) {
            rVarD = ka.z.d(this, null, w.d, 1, null);
        } else {
            if (!Intrinsics.b(abstractC0498a, AbstractC0498a.i.a)) {
                throw new m();
            }
            rVarD = ka.z.d(this, null, C0511n.d, 1, null);
        }
        aVar.b().d(rVarD);
    }

    private final void q(State.a aVar, Input input, State state, k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar2) {
        int i = C0503f.b[aVar.ordinal()];
        if (i == 3) {
            ka.w.l(aVar2, this.documentCameraWorker, kotlin.jvm.internal.z.j(a.class), "", new Q(input));
        } else if (i == 4 || i == 5) {
            ka.w.l(aVar2, state.getCaptureState() == State.a.v ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.d(), kotlin.jvm.internal.z.j(C0399v.class), "", new R(input, state));
        }
    }

    private final void r(State.b bVar, Input input, State state, k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a aVar) {
        int i = C0503f.c[bVar.ordinal()];
        if (i == 1) {
            if (state.getDocumentId() != null) {
                return;
            }
            ka.w.l(aVar, this.documentCreateWorker.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.document.network.a.class), "", new S());
            return;
        }
        if (i != 2) {
            if (i == 3 && (state instanceof State.ReviewCaptures)) {
                DocumentFile documentFileToDelete = ((State.ReviewCaptures) state).getDocumentFileToDelete();
                DocumentFile.Remote remote = documentFileToDelete instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFileToDelete : null;
                if (remote == null) {
                    return;
                }
                C0758a.C0268a c0268a = this.documentFileDeleteWorker;
                String sessionToken = input.getSessionToken();
                String documentId = state.getDocumentId();
                Intrinsics.d(documentId);
                ka.w.l(aVar, c0268a.a(sessionToken, documentId, remote), kotlin.jvm.internal.z.j(C0758a.class), "", new V(remote));
                return;
            }
            return;
        }
        List<DocumentFile> listH = state.h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.a("upload_complete", new T(aVar, this, null));
            return;
        }
        for (DocumentFile.Local local : CollectionsKt.n0(arrayList, 3)) {
            b.a aVar2 = this.documentFileUploadWorker;
            String sessionToken2 = input.getSessionToken();
            String documentId2 = state.getDocumentId();
            Intrinsics.d(documentId2);
            ka.w.l(aVar, aVar2.a(sessionToken2, documentId2, local), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.document.network.b.class), local.getAbsoluteFilePath(), new U(local, state));
        }
    }

    @Override
    @NotNull
    public State d(@NotNull Input props, Snapshot snapshot) throws m {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.E() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrJ = hVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.d(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            State state = (State) parcelable;
            if (state != null) {
                return state;
            }
        }
        int i = C0503f.a[props.getStartPage().ordinal()];
        if (i == 1) {
            return new State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (i != 2) {
            throw new m();
        }
        return new State.ReviewCaptures(CollectionsKt.j(), props.getDocumentId(), null, null, null, true, false, null, 220, null);
    }

    @Override
    @NotNull
    public Object f(@NotNull Input renderProps, @NotNull State renderState, @NotNull k<? super Input, State, ? extends AbstractC0500c, ? extends Object>.a context) throws m {
        boolean z2;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof State.UploadDocument));
        q(renderState.getCaptureState(), renderProps, renderState, context);
        r(renderState.getUploadState(), renderProps, renderState, context);
        n(renderProps, renderState);
        if (renderState instanceof State.Start) {
            Object documentInstructionsView = new DocumentInstructionsView(l9.b.a(renderProps.getPages().getDocumentStartPage()), k(renderProps.getPages().getDocumentStartPage(), context), this.navigationStateManager.b(), new O(context), new P(context));
            if (((State.Start) renderState).getShouldShowUploadOptionsDialog()) {
                documentInstructionsView = j.a(l9.j.a.h(l9.b.a(renderProps.getPages().getUploadOptionsDialog()), l(renderProps.getPages().getUploadOptionsDialog(), context), new F(context), renderProps.getPages().getUploadOptionsDialog().getCancelButton()), documentInstructionsView, "document_upload_options_dialog");
            }
            z2 = renderState.getCaptureState() == State.a.e;
            Q8.l lVar = Q8.l.d;
            String permissionsTitle = renderProps.getPermissionsTitle();
            String str = permissionsTitle == null ? "" : permissionsTitle;
            String permissionsRationale = renderProps.getPermissionsRationale();
            if (permissionsRationale == null) {
                permissionsRationale = this.applicationContext.getString(S8.e.c);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
            }
            String str2 = permissionsRationale;
            Context context2 = this.applicationContext;
            String string = context2.getString(S8.e.b, C0456d.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return com.withpersona.sdk2.inquiry.permissions.d.d(documentInstructionsView, context, z2, lVar, (19976 & 8) != 0 ? false : false, str, str2, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new x(renderState));
        }
        if (!(renderState instanceof State.ReviewCaptures)) {
            if (!(renderState instanceof State.UploadDocument)) {
                throw new m();
            }
            ka.w.l(context, this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.h()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.document.network.d.class), "", new A());
            C0586a.d(this.navigationStateManager, false, false, false, 4, null);
            return new AbstractC0501d.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new B(context), new C(context), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition());
        }
        State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) renderState;
        if (reviewCaptures.getReloadingFromPreviousSession()) {
            c.a aVar = this.documentLoadWorker;
            String sessionToken = renderProps.getSessionToken();
            String documentId = renderState.getDocumentId();
            Intrinsics.d(documentId);
            ka.w.l(context, aVar.a(sessionToken, documentId), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.document.network.c.class), "", new y(renderState));
        }
        AbstractC0501d.ReviewCaptures reviewCaptures2 = new AbstractC0501d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), renderState.h(), this.navigationStateManager.b(), new G(context), new H(context), new I(context), new J(context), new K(context), new L(context), new M(context), new N(context), reviewCaptures.getReloadingFromPreviousSession(), renderState.h().size() < renderProps.getDocumentFileLimit(), !renderState.h().isEmpty() && renderState.getUploadState() == State.b.v, reviewCaptures.getError(), new D(context), renderProps.getStyles());
        z2 = renderState.getCaptureState() == State.a.e;
        Q8.l lVar2 = Q8.l.d;
        String permissionsTitle2 = renderProps.getPermissionsTitle();
        String str3 = permissionsTitle2 == null ? "" : permissionsTitle2;
        String permissionsRationale2 = renderProps.getPermissionsRationale();
        if (permissionsRationale2 == null) {
            permissionsRationale2 = this.applicationContext.getString(S8.e.c);
            Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
        }
        String str4 = permissionsRationale2;
        Context context3 = this.applicationContext;
        String string2 = context3.getString(S8.e.b, C0456d.b(context3));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        i iVarD = com.withpersona.sdk2.inquiry.permissions.d.d(reviewCaptures2, context, z2, lVar2, (19976 & 8) != 0 ? false : false, str3, str4, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new E(renderState));
        return reviewCaptures.getShouldShowUploadOptionsDialog() ? j.a(l9.j.a.h(l9.b.a(renderProps.getPages().getUploadOptionsDialog()), l(renderProps.getPages().getUploadOptionsDialog(), context), new z(context), renderProps.getPages().getUploadOptionsDialog().getCancelButton()), iVarD, "document_upload_screen") : new i(iVarD, CollectionsKt.j(), "document_upload_screen");
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }
}
