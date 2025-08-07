package ha;

import aa.n;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import com.roblox.client.personasdk.R;
import fa.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u00014B[\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0093\u0001\u0010\u001e\u001a\u00020\u001a\"\b\b\u0001\u0010\u000f*\u00028\u0000\"\b\b\u0002\u0010\u0011*\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u00152\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00152\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b'\u0010(J9\u0010/\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010-¢\u0006\u0004\b/\u00100R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00018\u00008\u0000078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010=R*\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR&\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010ER\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000)8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b@\u0010J¨\u0006L"}, d2 = {"La9/b;", "", "T", "Lkotlin/Function2;", "", "areItemsTheSame", "areContentsTheSame", "getChangePayload", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "", "position", "La9/b$c;", "h", "(I)La9/b$c;", "R", "Lj1/a;", "VB", "Lfa/c;", "clazz", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "f", "(Lfa/c;Lfa/c;Laa/n;Laa/n;Lkotlin/jvm/functions/Function1;)V", "i", "(I)I", "parent", "viewType", "l", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;", "holder", "k", "(Landroidx/recyclerview/widget/RecyclerView$D;I)V", "", "newItems", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "cb", "m", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function2;", "b", "c", "d", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "e", "Landroidx/recyclerview/widget/d;", "differ", "", "Ljava/util/List;", "itemInfos", "", "g", "Ljava/util/Map;", "itemInfoByItemType", "itemInfoByViewType", "La9/I;", "La9/I;", "viewTypeGenerator", "j", "()Ljava/util/List;", "items", "()I", "itemCount", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0454b<T> {

    @NotNull
    private final Function2<T, T, Boolean> areItemsTheSame;

    @NotNull
    private final Function2<T, T, Boolean> areContentsTheSame;

    @NotNull
    private final Function2<T, T, Object> getChangePayload;

    private RecyclerView.h<?> adapter;

    @NotNull
    private final androidx.recyclerview.widget.d<T> differ;

    @NotNull
    private final List<ItemInfo<T>> itemInfos;

    @NotNull
    private final Map<c<?>, ItemInfo<T>> itemInfoByItemType;

    @NotNull
    private final Map<Integer, ItemInfo<T>> itemInfoByViewType;

    @NotNull
    private final C0450I viewTypeGenerator;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "oldItem", "newItem", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class a extends l implements Function2<T, T, Boolean> {
        public static final a d = new a();

        a() {
            super(2);
        }

        @NotNull
        public final Boolean invoke(@NotNull T t, @NotNull T t2) {
            Intrinsics.checkNotNullParameter(t, "oldItem");
            Intrinsics.checkNotNullParameter(t2, "newItem");
            return Boolean.valueOf(Intrinsics.b(t, t2));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "old", "new", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class C0058b extends l implements Function2 {
        public static final C0058b d = new C0058b();

        C0058b() {
            super(2);
        }

        public final Void invoke(@NotNull T t, @NotNull T t2) {
            Intrinsics.checkNotNullParameter(t, "old");
            Intrinsics.checkNotNullParameter(t2, "new");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R/\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010%R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"La9/b$c;", "T", "", "", "viewType", "Lfa/c;", "Lj1/a;", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "<init>", "(ILfa/c;Laa/n;Laa/n;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Lfa/c;", "getViewBindingClass", "()Lfa/c;", "c", "Laa/n;", "()Laa/n;", "e", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ItemInfo<T> {

        private final int viewType;

        @NotNull
        private final c<? extends j1.a> viewBindingClass;

        @NotNull
        private final n<LayoutInflater, ViewGroup, Boolean, j1.a> inflateFn;

        @NotNull
        private final n<T, j1.a, RecyclerView.D, Unit> bindViewHolder;

        private final Function1<j1.a, Unit> onViewCreated;

        public ItemInfo(int i, @NotNull c<? extends j1.a> cVar, @NotNull n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends j1.a> nVar, @NotNull n<? super T, ? super j1.a, ? super RecyclerView.D, Unit> nVar2, Function1<? super j1.a, Unit> function1) {
            Intrinsics.checkNotNullParameter(cVar, "viewBindingClass");
            Intrinsics.checkNotNullParameter(nVar, "inflateFn");
            Intrinsics.checkNotNullParameter(nVar2, "bindViewHolder");
            this.viewType = i;
            this.viewBindingClass = cVar;
            this.inflateFn = nVar;
            this.bindViewHolder = nVar2;
            this.onViewCreated = function1;
        }

        @NotNull
        public final n<T, j1.a, RecyclerView.D, Unit> a() {
            return this.bindViewHolder;
        }

        @NotNull
        public final n<LayoutInflater, ViewGroup, Boolean, j1.a> b() {
            return this.inflateFn;
        }

        public final Function1<j1.a, Unit> c() {
            return this.onViewCreated;
        }

        public final int getViewType() {
            return this.viewType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemInfo)) {
                return false;
            }
            ItemInfo itemInfo = (ItemInfo) other;
            return this.viewType == itemInfo.viewType && Intrinsics.b(this.viewBindingClass, itemInfo.viewBindingClass) && Intrinsics.b(this.inflateFn, itemInfo.inflateFn) && Intrinsics.b(this.bindViewHolder, itemInfo.bindViewHolder) && Intrinsics.b(this.onViewCreated, itemInfo.onViewCreated);
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.viewType) * 31) + this.viewBindingClass.hashCode()) * 31) + this.inflateFn.hashCode()) * 31) + this.bindViewHolder.hashCode()) * 31;
            Function1<j1.a, Unit> function1 = this.onViewCreated;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        @NotNull
        public String toString() {
            return "ItemInfo(viewType=" + this.viewType + ", viewBindingClass=" + this.viewBindingClass + ", inflateFn=" + this.inflateFn + ", bindViewHolder=" + this.bindViewHolder + ", onViewCreated=" + this.onViewCreated + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0000*\u00028\u0002\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"R", "Lj1/a;", "VB", "", "T", "item", "b", "Landroidx/recyclerview/widget/RecyclerView$D;", "h", "", "a", "(Ljava/lang/Object;Lj1/a;Landroidx/recyclerview/widget/RecyclerView$D;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends l implements n<T, j1.a, RecyclerView.D, Unit> {
        final n<R, VB, RecyclerView.D, Unit> d;

        d(n<? super R, ? super VB, ? super RecyclerView.D, Unit> nVar) {
            super(3);
            this.d = nVar;
        }

        public final void a(@NotNull T t, @NotNull j1.a aVar, @NotNull RecyclerView.D d) {
            Intrinsics.checkNotNullParameter(t, "item");
            Intrinsics.checkNotNullParameter(aVar, "b");
            Intrinsics.checkNotNullParameter(d, "h");
            this.d.invoke(t, aVar, d);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            a(obj, (j1.a) obj2, (RecyclerView.D) obj3);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00028\u0002\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"R", "Lj1/a;", "VB", "", "T", "viewBinding", "", "a", "(Lj1/a;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends l implements Function1<j1.a, Unit> {
        final Function1<VB, Unit> d;

        e(Function1<? super VB, Unit> function1) {
            super(1);
            this.d = function1;
        }

        public final void a(@NotNull j1.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "viewBinding");
            this.d.invoke(aVar);
        }

        public Object invoke(Object obj) {
            a((j1.a) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"a9/b$f", "Landroidx/recyclerview/widget/n;", "", "position", "count", "", "b", "(II)V", "c", "fromPosition", "toPosition", "a", "", "payload", "d", "(IILjava/lang/Object;)V", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class f implements androidx.recyclerview.widget.n {
        final C0454b<T> a;

        f(C0454b<T> c0454b) {
            this.a = c0454b;
        }

        public void a(int fromPosition, int toPosition) {
            RecyclerView.h hVar = ((C0454b) this.a).adapter;
            if (hVar != null) {
                hVar.m(fromPosition, toPosition);
            }
        }

        public void b(int position, int count) {
            RecyclerView.h hVar = ((C0454b) this.a).adapter;
            if (hVar != null) {
                hVar.o(position, count);
            }
        }

        public void c(int position, int count) {
            RecyclerView.h hVar = ((C0454b) this.a).adapter;
            if (hVar != null) {
                hVar.p(position, count);
            }
        }

        public void d(int position, int count, Object payload) {
            RecyclerView.h hVar = ((C0454b) this.a).adapter;
            if (hVar != null) {
                hVar.n(position, count, payload);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"a9/b$g", "Landroidx/recyclerview/widget/h$f;", "oldItem", "newItem", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class g extends h.f<T> {
        final C0454b<T> a;

        g(C0454b<T> c0454b) {
            this.a = c0454b;
        }

        public boolean a(@NotNull T oldItem, @NotNull T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) ((C0454b) this.a).areContentsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        public boolean b(@NotNull T oldItem, @NotNull T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) ((C0454b) this.a).areItemsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        public Object c(@NotNull T oldItem, @NotNull T newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((C0454b) this.a).getChangePayload.invoke(oldItem, newItem);
        }
    }

    public C0454b(@NotNull Function2<? super T, ? super T, Boolean> function2, @NotNull Function2<? super T, ? super T, Boolean> function22, @NotNull Function2<? super T, ? super T, ? extends Object> function23) {
        Intrinsics.checkNotNullParameter(function2, "areItemsTheSame");
        Intrinsics.checkNotNullParameter(function22, "areContentsTheSame");
        Intrinsics.checkNotNullParameter(function23, "getChangePayload");
        this.areItemsTheSame = function2;
        this.areContentsTheSame = function22;
        this.getChangePayload = function23;
        this.differ = new androidx.recyclerview.widget.d<>(new f(this), new c.a(new g(this)).a());
        this.itemInfos = new ArrayList();
        this.itemInfoByItemType = new LinkedHashMap();
        this.itemInfoByViewType = new LinkedHashMap();
        this.viewTypeGenerator = C0451J.a.a();
    }

    private final ItemInfo<T> h(int position) {
        T t = j().get(position);
        ItemInfo<T> itemInfo = this.itemInfoByItemType.get(z.b(t.getClass()));
        if (itemInfo != null) {
            return itemInfo;
        }
        throw new IllegalArgumentException(("No item info for type '" + t.getClass() + "'. Ensure this type is added.").toString());
    }

    public static void n(C0454b c0454b, List list, RecyclerView.h hVar, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c0454b.m(list, hVar, function0);
    }

    public static final void o(Function0 function0) {
        function0.invoke();
    }

    public final <R extends T, VB extends j1.a> void f(@NotNull fa.c<?> clazz, @NotNull fa.c<VB> viewBindingClass, @NotNull n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends j1.a> inflateFn, @NotNull n<? super R, ? super VB, ? super RecyclerView.D, Unit> bindViewHolder, Function1<? super VB, Unit> onViewCreated) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
        Intrinsics.checkNotNullParameter(bindViewHolder, "bindViewHolder");
        if (this.itemInfoByItemType.get(clazz) == null) {
            ItemInfo<T> itemInfo = new ItemInfo<>(this.viewTypeGenerator.a(), viewBindingClass, inflateFn, new d(bindViewHolder), onViewCreated != null ? new e(onViewCreated) : null);
            this.itemInfos.add(itemInfo);
            this.itemInfoByItemType.put(clazz, itemInfo);
            this.itemInfoByViewType.put(Integer.valueOf(itemInfo.getViewType()), itemInfo);
            return;
        }
        throw new IllegalArgumentException(("Item type " + clazz + " has already been added.").toString());
    }

    public final int g() {
        return this.differ.a().size();
    }

    public final int i(int position) {
        return h(position).getViewType();
    }

    @NotNull
    public final List<T> j() {
        List<T> listA = this.differ.a();
        Intrinsics.checkNotNullExpressionValue(listA, "getCurrentList(...)");
        return listA;
    }

    public final void k(@NotNull RecyclerView.D holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemInfo<T> itemInfoH = h(position);
        itemInfoH.a().invoke(j().get(position), C0449H.a(holder), holder);
    }

    @NotNull
    public final RecyclerView.D l(@NotNull ViewGroup parent, int viewType) {
        ItemInfo<T> itemInfo;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.itemInfos.size() == 1) {
            itemInfo = (ItemInfo) CollectionsKt.M(this.itemInfos);
        } else {
            ItemInfo<T> itemInfo2 = this.itemInfoByViewType.get(Integer.valueOf(viewType));
            if (itemInfo2 == null) {
                throw new IllegalArgumentException(("No item for layout id '" + viewType + "'. Ensure this item is added. Maybe you forgot 'override fun getItemViewType(position: Int): Int = ...'?").toString());
            }
            itemInfo = itemInfo2;
        }
        n<LayoutInflater, ViewGroup, Boolean, j1.a> nVarB = itemInfo.b();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        C0448G c0448g = new C0448G((j1.a) nVarB.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        Function1<j1.a, Unit> function1C = itemInfo.c();
        if (function1C != null) {
            function1C.invoke(c0448g.O());
        }
        return c0448g;
    }

    public final void m(@NotNull List<? extends T> newItems, @NotNull RecyclerView.h<?> adapter, final Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
        this.differ.e(newItems, cb != null ? new Runnable() {
            @Override
            public final void run() {
                C0454b.o(cb);
            }
        } : null);
    }

    public C0454b(Function2 function2, Function2 function22, Function2 function23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i & 2) != 0 ? a.d : function22, (i & 4) != 0 ? C0058b.d : function23);
    }
}
