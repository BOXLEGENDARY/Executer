package com.withpersona.sdk2.inquiry.steps.ui.components;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/squareup/moshi/w;", "moshi", "<init>", "(Lcom/squareup/moshi/w;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/m;", "reader", "a", "(Lcom/squareup/moshi/m;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/squareup/moshi/t;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/t;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;)V", "Lcom/squareup/moshi/m$b;", "Lcom/squareup/moshi/m$b;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "Lcom/squareup/moshi/h;", "clickableStackAdapter", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "c", "listOfUiComponentAdapter", "", "d", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<ClickableStackComponent> {

    @NotNull
    private final m.b options;

    @NotNull
    private final h<ClickableStack> clickableStackAdapter;

    @NotNull
    private final h<List<UiComponent>> listOfUiComponentAdapter;

    @NotNull
    private final h<Boolean> booleanAdapter;

    private volatile Constructor<ClickableStackComponent> constructorRef;

    public GeneratedJsonAdapter(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "moshi");
        m.b bVarA = m.b.a(new String[]{"config", "children", "isActive"});
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<ClickableStack> hVarF = wVar.f(ClickableStack.class, L.d(), "config");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.clickableStackAdapter = hVarF;
        h<List<UiComponent>> hVarF2 = wVar.f(A.j(List.class, new Type[]{UiComponent.class}), L.d(), "children");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.listOfUiComponentAdapter = hVarF2;
        h<Boolean> hVarF3 = wVar.f(Boolean.TYPE, L.d(), "isActive");
        Intrinsics.checkNotNullExpressionValue(hVarF3, "adapter(...)");
        this.booleanAdapter = hVarF3;
    }

    @NotNull
    public ClickableStackComponent fromJson(@NotNull m reader) throws IllegalAccessException, j, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.e();
        ClickableStack clickableStack = null;
        List list = null;
        int i = -1;
        while (reader.u()) {
            int iP0 = reader.P0(this.options);
            if (iP0 == -1) {
                reader.b1();
                reader.f1();
            } else if (iP0 == 0) {
                clickableStack = (ClickableStack) this.clickableStackAdapter.fromJson(reader);
                if (clickableStack == null) {
                    j jVarX = c.x("config", "config", reader);
                    Intrinsics.checkNotNullExpressionValue(jVarX, "unexpectedNull(...)");
                    throw jVarX;
                }
            } else if (iP0 == 1) {
                list = (List) this.listOfUiComponentAdapter.fromJson(reader);
                if (list == null) {
                    j jVarX2 = c.x("children", "children", reader);
                    Intrinsics.checkNotNullExpressionValue(jVarX2, "unexpectedNull(...)");
                    throw jVarX2;
                }
                i &= -3;
            } else if (iP0 == 2) {
                bool = (Boolean) this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    j jVarX3 = c.x("isActive", "isActive", reader);
                    Intrinsics.checkNotNullExpressionValue(jVarX3, "unexpectedNull(...)");
                    throw jVarX3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        reader.j();
        if (i == -7) {
            if (clickableStack != null) {
                Intrinsics.e(list, "null cannot be cast to non-null type kotlin.collections.List<com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent>");
                return new ClickableStackComponent(clickableStack, list, bool.booleanValue());
            }
            j jVarO = c.o("config", "config", reader);
            Intrinsics.checkNotNullExpressionValue(jVarO, "missingProperty(...)");
            throw jVarO;
        }
        Constructor<ClickableStackComponent> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStackComponent.class.getDeclaredConstructor(ClickableStack.class, List.class, Boolean.TYPE, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (clickableStack != null) {
            ClickableStackComponent clickableStackComponentNewInstance = declaredConstructor.newInstance(clickableStack, list, bool, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(clickableStackComponentNewInstance, "newInstance(...)");
            return clickableStackComponentNewInstance;
        }
        j jVarO2 = c.o("config", "config", reader);
        Intrinsics.checkNotNullExpressionValue(jVarO2, "missingProperty(...)");
        throw jVarO2;
    }

    public void toJson(@NotNull t writer, ClickableStackComponent value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.Z("config");
        this.clickableStackAdapter.toJson(writer, value_.e());
        writer.Z("children");
        this.listOfUiComponentAdapter.toJson(writer, value_.getChildren());
        writer.Z("isActive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getIsActive()));
        writer.y();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClickableStackComponent");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
