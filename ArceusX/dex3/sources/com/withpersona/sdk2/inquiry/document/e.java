package com.withpersona.sdk2.inquiry.document;

import P1.k;
import P9.m;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0356g;
import ha.C0448G;
import ha.C0449H;
import ha.C0458f;
import ha.C0469n;
import ha.InterfaceC0883h;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C0413k;
import org.jetbrains.annotations.NotNull;
import q8.C0741g;
import q8.C0742h;
import r8.C0744b;
import s9.v;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010;\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010:R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/content/Context;", "context", "Lz1/h;", "imageLoader", "Lkotlin/Function0;", "", "onClickAddButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Landroid/content/Context;Lz1/h;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "", "addButtonEnabled", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/document/e$a;", "G", "(ZLjava/util/List;)Ljava/util/List;", "Lr8/d;", "binding", "F", "(Lr8/d;)V", "Lr8/b;", "E", "(Lr8/b;)V", "", "position", "g", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;", "holder", "r", "(Landroidx/recyclerview/widget/RecyclerView$D;I)V", "e", "()I", "K", "(ZLjava/util/List;)V", "d", "Lz1/h;", "getImageLoader", "()Lz1/h;", "Lkotlin/jvm/functions/Function0;", "getOnClickAddButton", "()Lkotlin/jvm/functions/Function0;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "h", "Ljava/util/List;", "items", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getRemoveDocument", "()Lkotlin/jvm/functions/Function1;", "J", "(Lkotlin/jvm/functions/Function1;)V", "removeDocument", "a", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e extends RecyclerView.h<RecyclerView.D> {

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final Function0<Unit> onClickAddButton;

    private final StepStyles.DocumentStepStyle styles;

    private final LayoutInflater inflater;

    @NotNull
    private List<? extends a> items;

    private Function1<? super DocumentFile, Unit> removeDocument;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/e$a$a;", "Lcom/withpersona/sdk2/inquiry/document/e$a$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a$a;", "Lcom/withpersona/sdk2/inquiry/document/e$a;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class AddButtonItem extends a {

            private final boolean isEnabled;

            public AddButtonItem(boolean z) {
                super(null);
                this.isEnabled = z;
            }

            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddButtonItem) && this.isEnabled == ((AddButtonItem) other).isEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled);
            }

            @NotNull
            public String toString() {
                return "AddButtonItem(isEnabled=" + this.isEnabled + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a$b;", "Lcom/withpersona/sdk2/inquiry/document/e$a;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "a", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "document", "", "b", "()Ljava/lang/String;", "mimeType", "Lcom/withpersona/sdk2/inquiry/document/e$a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/e$a$b$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static abstract class b extends a {

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/e$a$b;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "document", "", "mimeType", "<init>", "(Ljava/io/File;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "d", "()Ljava/io/File;", "b", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "c", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class Local extends b {

                @NotNull
                private final File file;

                @NotNull
                private final DocumentFile.Local document;

                private final String mimeType;

                public Local(@NotNull File file, @NotNull DocumentFile.Local local, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(local, "document");
                    this.file = file;
                    this.document = local;
                    this.mimeType = str;
                }

                @Override
                public String getMimeType() {
                    return this.mimeType;
                }

                @Override
                @NotNull
                public DocumentFile.Local a() {
                    return this.document;
                }

                @NotNull
                public final File getFile() {
                    return this.file;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Local)) {
                        return false;
                    }
                    Local local = (Local) other;
                    return Intrinsics.b(this.file, local.file) && Intrinsics.b(this.document, local.document) && Intrinsics.b(this.mimeType, local.mimeType);
                }

                public int hashCode() {
                    int iHashCode = ((this.file.hashCode() * 31) + this.document.hashCode()) * 31;
                    String str = this.mimeType;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @NotNull
                public String toString() {
                    return "Local(file=" + this.file + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/e$a$b;", "", "remoteUrl", "filename", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class Remote extends b {

                @NotNull
                private final String remoteUrl;

                private final String filename;

                @NotNull
                private final DocumentFile.Remote document;

                private final String mimeType;

                public Remote(@NotNull String str, String str2, @NotNull DocumentFile.Remote remote, String str3) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "remoteUrl");
                    Intrinsics.checkNotNullParameter(remote, "document");
                    this.remoteUrl = str;
                    this.filename = str2;
                    this.document = remote;
                    this.mimeType = str3;
                }

                @Override
                public String getMimeType() {
                    return this.mimeType;
                }

                @Override
                @NotNull
                public DocumentFile.Remote a() {
                    return this.document;
                }

                public final String getFilename() {
                    return this.filename;
                }

                @NotNull
                public final String getRemoteUrl() {
                    return this.remoteUrl;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Remote)) {
                        return false;
                    }
                    Remote remote = (Remote) other;
                    return Intrinsics.b(this.remoteUrl, remote.remoteUrl) && Intrinsics.b(this.filename, remote.filename) && Intrinsics.b(this.document, remote.document) && Intrinsics.b(this.mimeType, remote.mimeType);
                }

                public int hashCode() {
                    int iHashCode = this.remoteUrl.hashCode() * 31;
                    String str = this.filename;
                    int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.document.hashCode()) * 31;
                    String str2 = this.mimeType;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Remote(remoteUrl=" + this.remoteUrl + ", filename=" + this.filename + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }
            }

            public b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public abstract DocumentFile a();

            public abstract String getMimeType();

            private b() {
                super(null);
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"com/withpersona/sdk2/inquiry/document/e$b", "Landroidx/recyclerview/widget/h$b;", "", "e", "()I", "d", "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "a", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b extends h.b {
        final List<a> a;
        final List<a> b;

        b(List<? extends a> list, List<? extends a> list2) {
            this.a = list;
            this.b = list2;
        }

        public boolean a(int oldItemPosition, int newItemPosition) throws m {
            boolean zB;
            a aVar = this.a.get(oldItemPosition);
            a aVar2 = this.b.get(newItemPosition);
            if (b(oldItemPosition, newItemPosition)) {
                if (aVar instanceof a.AddButtonItem) {
                    zB = Intrinsics.b(aVar, aVar2);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new m();
                    }
                    zB = true;
                }
                if (zB) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int oldItemPosition, int newItemPosition) throws m {
            a aVar = this.a.get(oldItemPosition);
            a aVar2 = this.b.get(newItemPosition);
            if (aVar.getClass() != aVar2.getClass()) {
                return false;
            }
            if (aVar instanceof a.AddButtonItem) {
                return true;
            }
            if (aVar instanceof a.b.Local) {
                String absolutePath = ((a.b.Local) aVar).getFile().getAbsolutePath();
                Intrinsics.e(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Local");
                return Intrinsics.b(absolutePath, ((a.b.Local) aVar2).getFile().getAbsolutePath());
            }
            if (!(aVar instanceof a.b.Remote)) {
                throw new m();
            }
            String remoteUrl = ((a.b.Remote) aVar).getRemoteUrl();
            Intrinsics.e(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Remote");
            return Intrinsics.b(remoteUrl, ((a.b.Remote) aVar2).getRemoteUrl());
        }

        public int d() {
            return this.b.size();
        }

        public int e() {
            return this.a.size();
        }
    }

    public e(@NotNull Context context, @NotNull InterfaceC0883h interfaceC0883h, @NotNull Function0<Unit> function0, StepStyles.DocumentStepStyle documentStepStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interfaceC0883h, "imageLoader");
        Intrinsics.checkNotNullParameter(function0, "onClickAddButton");
        this.imageLoader = interfaceC0883h;
        this.onClickAddButton = function0;
        this.styles = documentStepStyle;
        this.inflater = LayoutInflater.from(context);
        this.items = CollectionsKt.j();
    }

    private final void E(C0744b binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.c.setRadius((float) C0458f.a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.c.setStrokeWidth((int) Math.ceil(C0458f.a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.c.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.b.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.b;
        Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "addButton");
        s9.e.f(themeableLottieAnimationView, this.styles.getImagePreviewPlusIconStrokeColor(), this.styles.getImagePreviewPlusIconFillColor(), null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, new String[0]);
    }

    private final void F(r8.d binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
        if (strokeColorValue != null) {
            binding.f.setIndicatorColor(new int[]{strokeColorValue.intValue()});
        }
        Integer fillColorValue = this.styles.getFillColorValue();
        if (fillColorValue != null) {
            binding.f.setTrackColor(fillColorValue.intValue());
        }
        Integer imagePreviewCropAreaFillColor = this.styles.getImagePreviewCropAreaFillColor();
        if (imagePreviewCropAreaFillColor != null) {
            binding.d.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
        }
        Double imagePreviewBorderRadius = this.styles.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.b.setRadius((float) C0458f.a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.b.setStrokeWidth((int) Math.ceil(C0458f.a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.b.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        TextBasedComponentStyle imageNameStyleValue = this.styles.getImageNameStyleValue();
        if (imageNameStyleValue != null) {
            TextView textView = binding.c;
            Intrinsics.checkNotNullExpressionValue(textView, "filenameView");
            v.e(textView, imageNameStyleValue);
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.e.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.g;
        Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "removeButton");
        s9.e.f(themeableLottieAnimationView, this.styles.getImagePreviewXIconStrokeColor(), this.styles.getImagePreviewXIconFillColor(), null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, new String[0]);
    }

    private final List<a> G(boolean addButtonEnabled, List<? extends DocumentFile> documents) throws m {
        a remote;
        ArrayList arrayList = new ArrayList();
        for (DocumentFile documentFile : documents) {
            if (documentFile instanceof DocumentFile.Local) {
                DocumentFile.Local local = (DocumentFile.Local) documentFile;
                File file = new File(local.getAbsoluteFilePath());
                remote = new a.b.Local(file, local, MimeTypeMap.getSingleton().getMimeTypeFromExtension(X9.h.p(file)));
            } else {
                if (!(documentFile instanceof DocumentFile.Remote)) {
                    throw new m();
                }
                DocumentFile.Remote remote2 = (DocumentFile.Remote) documentFile;
                remote = new a.b.Remote(remote2.getRemoteUrl(), remote2.getFilename(), remote2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(remote2.getRemoteUrl())));
            }
            arrayList.add(remote);
        }
        arrayList.add(new a.AddButtonItem(addButtonEnabled));
        return arrayList;
    }

    public static final void H(e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        eVar.onClickAddButton.invoke();
    }

    public static final void I(e eVar, a aVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$item");
        Function1<? super DocumentFile, Unit> function1 = eVar.removeDocument;
        if (function1 != null) {
            function1.invoke(((a.b) aVar).a());
        }
    }

    public final void J(Function1<? super DocumentFile, Unit> function1) {
        this.removeDocument = function1;
    }

    public final void K(boolean addButtonEnabled, @NotNull List<? extends DocumentFile> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        List<a> listG = G(addButtonEnabled, documents);
        List<? extends a> list = this.items;
        h.e eVarB = h.b(new b(list, listG));
        Intrinsics.checkNotNullExpressionValue(eVarB, "calculateDiff(...)");
        this.items = listG;
        eVarB.c(this);
        List<? extends a> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(CollectionsKt.t(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(obj, (a) obj);
        }
        for (IndexedValue indexedValue : CollectionsKt.w0(listG)) {
            int iA = indexedValue.a();
            a aVar = (a) indexedValue.b();
            a aVar2 = (a) linkedHashMap.get(aVar);
            if ((aVar2 instanceof a.b.Local) && (aVar instanceof a.b.Local)) {
                a.b.Local local = (a.b.Local) aVar;
                if (((a.b.Local) aVar2).a().getUploadProgress() != local.a().getUploadProgress()) {
                    if (local.a().getUploadProgress() == 100) {
                        k(iA);
                    } else {
                        l(iA, Unit.a);
                    }
                }
            }
        }
    }

    public int e() {
        return this.items.size();
    }

    public int g(int position) throws m {
        a aVar = this.items.get(position);
        if (aVar instanceof a.AddButtonItem) {
            return C0741g.c;
        }
        if (aVar instanceof a.b) {
            return C0741g.d;
        }
        throw new m();
    }

    public void r(@NotNull RecyclerView.D holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final a aVar = this.items.get(position);
        if (aVar instanceof a.AddButtonItem) {
            C0744b c0744b = (C0744b) C0449H.a(holder);
            c0744b.b.setEnabled(((a.AddButtonItem) aVar).getIsEnabled());
            c0744b.b.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.document.e.H(this.d, view);
                }
            });
            return;
        }
        if (aVar instanceof a.b) {
            r8.d dVar = (r8.d) C0449H.a(holder);
            dVar.g.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.document.e.I(this.d, aVar, view);
                }
            });
            ImageView imageView = dVar.d;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            C0413k.a(imageView);
            dVar.d.setImageDrawable(null);
            a.b bVar = (a.b) aVar;
            if (bVar instanceof a.b.Local) {
                a.b.Local local = (a.b.Local) aVar;
                dVar.d.setVisibility(local.a().getUploadProgress() < 100 ? 4 : 0);
                dVar.g.setVisibility(8);
                dVar.c.setText(local.getFile().getName());
                dVar.f.setVisibility(local.a().getUploadProgress() < 100 ? 0 : 8);
                dVar.f.setProgress(local.a().getUploadProgress());
                return;
            }
            if (bVar instanceof a.b.Remote) {
                dVar.d.setVisibility(0);
                if (Intrinsics.b(bVar.getMimeType(), "application/pdf")) {
                    ImageView imageView2 = dVar.d;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
                    Integer numValueOf = Integer.valueOf(C0469n.k);
                    InterfaceC0883h interfaceC0883h = this.imageLoader;
                    C0356g.a aVarS = new C0356g.a(imageView2.getContext()).d(numValueOf).s(imageView2);
                    aVarS.o(100, 100);
                    interfaceC0883h.a(aVarS.a());
                } else {
                    ImageView imageView3 = dVar.d;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "imageView");
                    String remoteUrl = ((a.b.Remote) aVar).getRemoteUrl();
                    InterfaceC0883h interfaceC0883h2 = this.imageLoader;
                    C0356g.a aVarS2 = new C0356g.a(imageView3.getContext()).d(remoteUrl).s(imageView3);
                    aVarS2.c(true);
                    aVarS2.b(100);
                    aVarS2.o(500, 500);
                    interfaceC0883h2.a(aVarS2.a());
                }
                dVar.f.setVisibility(8);
                dVar.g.setVisibility(0);
                dVar.c.setText(((a.b.Remote) aVar).getFilename());
            }
        }
    }

    @NotNull
    public RecyclerView.D t(@NotNull ViewGroup parent, int viewType) {
        C0448G c0448g;
        P1.d dVarB;
        P1.d dVarB2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(viewType, parent, false);
        if (viewType == C0741g.c) {
            c0448g = new C0448G(C0744b.b(viewInflate));
            k<P1.d> kVarO = P1.e.o(((C0744b) c0448g.O()).a().getContext(), C0742h.a);
            if (kVarO != null && (dVarB2 = kVarO.b()) != null) {
                ((C0744b) c0448g.O()).b.setComposition(dVarB2);
            }
            j1.a aVarO = c0448g.O();
            Intrinsics.checkNotNullExpressionValue(aVarO, "<get-binding>(...)");
            E((C0744b) aVarO);
        } else {
            if (viewType != C0741g.d) {
                throw new IllegalStateException(("Unknown view type " + viewType).toString());
            }
            c0448g = new C0448G(r8.d.b(viewInflate));
            k<P1.d> kVarO2 = P1.e.o(((r8.d) c0448g.O()).a().getContext(), C0742h.b);
            if (kVarO2 != null && (dVarB = kVarO2.b()) != null) {
                ((r8.d) c0448g.O()).g.setComposition(dVarB);
            }
            j1.a aVarO2 = c0448g.O();
            Intrinsics.checkNotNullExpressionValue(aVarO2, "<get-binding>(...)");
            F((r8.d) aVarO2);
        }
        return c0448g;
    }
}
