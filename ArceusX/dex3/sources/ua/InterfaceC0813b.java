package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lua/b;", "Object", "Field", "Lwa/a;", "container", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0813b<Object, Field> extends wa.a<Object, Field> {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static <Object, Field> Field a(@NotNull InterfaceC0813b<? super Object, Field> interfaceC0813b, Object object) {
            Field fieldA = interfaceC0813b.a(object);
            if (fieldA != null) {
                return fieldA;
            }
            throw new IllegalStateException("Field " + interfaceC0813b.getName() + " is not set");
        }
    }

    Field a(Object container);

    Field b(Object container);
}
