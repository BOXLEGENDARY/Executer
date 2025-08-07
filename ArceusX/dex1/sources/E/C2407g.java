package e;

import com.github.luben.zstd.BuildConfig;
import f.C2436f;
import f.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR*\u0010*\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b\u0006\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Le/g;", BuildConfig.FLAVOR, "<init>", "()V", "Lf/h$g;", "<set-?>", "a", "Lf/h$g;", "d", "()Lf/h$g;", "k", "(Lf/h$g;)V", "mediaType", BuildConfig.FLAVOR, "b", "I", "c", "()I", "j", "(I)V", "maxItems", BuildConfig.FLAVOR, "Z", "f", "()Z", "l", "(Z)V", "isOrderedSelection", "Lf/h$b;", "Lf/h$b;", "()Lf/h$b;", "i", "(Lf/h$b;)V", "defaultTab", "e", "h", "isCustomAccentColorApplied", BuildConfig.FLAVOR, "J", "()J", "g", "(J)V", "accentColor", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C2407g {

    private boolean isOrderedSelection;

    private boolean isCustomAccentColorApplied;

    private long accentColor;

    private h.g mediaType = h.c.f20436a;

    private int maxItems = C2436f.INSTANCE.a();

    private h.b defaultTab = h.b.a.f20434a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Le/g$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lf/h$g;", "mediaType", "d", "(Lf/h$g;)Le/g$a;", BuildConfig.FLAVOR, "maxItems", "c", "(I)Le/g$a;", BuildConfig.FLAVOR, "isOrderedSelection", "e", "(Z)Le/g$a;", "Lf/h$b;", "defaultTab", "b", "(Lf/h$b;)Le/g$a;", "Le/g;", "a", "()Le/g;", "Lf/h$g;", "I", "Z", "Lf/h$b;", "isCustomAccentColorApplied", BuildConfig.FLAVOR, "f", "J", "accentColor", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        private boolean isOrderedSelection;

        private boolean isCustomAccentColorApplied;

        private long accentColor;

        private h.g mediaType = h.c.f20436a;

        private int maxItems = C2436f.INSTANCE.a();

        private h.b defaultTab = h.b.a.f20434a;

        public final C2407g a() {
            C2407g c2407g = new C2407g();
            c2407g.k(this.mediaType);
            c2407g.j(this.maxItems);
            c2407g.l(this.isOrderedSelection);
            c2407g.i(this.defaultTab);
            c2407g.h(this.isCustomAccentColorApplied);
            c2407g.g(this.accentColor);
            return c2407g;
        }

        public final a b(h.b defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        public final a c(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        public final a d(h.g mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        public final a e(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }
    }

    public final long getAccentColor() {
        return this.accentColor;
    }

    public final h.b getDefaultTab() {
        return this.defaultTab;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    public final h.g getMediaType() {
        return this.mediaType;
    }

    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void g(long j7) {
        this.accentColor = j7;
    }

    public final void h(boolean z7) {
        this.isCustomAccentColorApplied = z7;
    }

    public final void i(h.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.defaultTab = bVar;
    }

    public final void j(int i7) {
        this.maxItems = i7;
    }

    public final void k(h.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.mediaType = gVar;
    }

    public final void l(boolean z7) {
        this.isOrderedSelection = z7;
    }
}
