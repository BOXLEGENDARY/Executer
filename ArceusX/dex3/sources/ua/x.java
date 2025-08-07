package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ua.InterfaceC0813b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lua/x;", "Object", "Field", "Lua/b;", "Lfa/i;", "property", "<init>", "(Lfa/i;)V", "container", "newValue", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lfa/i;", "", "getName", "()Ljava/lang/String;", "name", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class x<Object, Field> implements InterfaceC0813b<Object, Field> {

    @NotNull
    private final fa.i<Object, Field> property;

    public x(@NotNull fa.i<Object, Field> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "property");
        this.property = iVar;
    }

    @Override
    public Field a(Object container) {
        return (Field) this.property.get(container);
    }

    @Override
    public Field b(Object object) {
        return (Field) InterfaceC0813b.a.a(this, object);
    }

    @Override
    public Field c(Object container, Field newValue) {
        Field field = (Field) this.property.get(container);
        if (field == null) {
            this.property.l(container, newValue);
        } else if (!Intrinsics.b(field, newValue)) {
            return field;
        }
        return null;
    }

    @Override
    @NotNull
    public String getName() {
        return this.property.getName();
    }
}
