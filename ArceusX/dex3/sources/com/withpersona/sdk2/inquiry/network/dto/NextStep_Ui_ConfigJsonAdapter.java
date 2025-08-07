package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Ui_ConfigJsonAdapter extends h<NextStep.Ui.Config> {
    private volatile Constructor<NextStep.Ui.Config> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;

    @NotNull
    private final h<List<UiComponentError>> nullableListOfUiComponentErrorAdapter;

    @NotNull
    private final h<NextStep.Ui.Localizations> nullableLocalizationsAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"components", "backStepEnabled", "cancelButtonEnabled", "terminal", "localizations", "serverComponentErrors"});

    public NextStep_Ui_ConfigJsonAdapter(@NotNull w wVar) {
        this.nullableListOfUiComponentConfigAdapter = wVar.f(A.j(List.class, new Type[]{UiComponentConfig.class}), L.d(), "components");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "backStepEnabled");
        this.nullableLocalizationsAdapter = wVar.f(NextStep.Ui.Localizations.class, L.d(), "localizations");
        this.nullableListOfUiComponentErrorAdapter = wVar.f(A.j(List.class, new Type[]{UiComponentError.class}), L.d(), "serverComponentErrors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Ui.Config");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Ui.Config m196fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        List list = null;
        int i = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        NextStep.Ui.Localizations localizations = null;
        List list2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    list = (List) this.nullableListOfUiComponentConfigAdapter.fromJson(mVar);
                    break;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    i &= -3;
                    break;
                case 2:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    i &= -5;
                    break;
                case 3:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    i &= -9;
                    break;
                case 4:
                    localizations = (NextStep.Ui.Localizations) this.nullableLocalizationsAdapter.fromJson(mVar);
                    i &= -17;
                    break;
                case 5:
                    list2 = (List) this.nullableListOfUiComponentErrorAdapter.fromJson(mVar);
                    i &= -33;
                    break;
            }
        }
        mVar.j();
        if (i == -63) {
            return new NextStep.Ui.Config(list, bool, bool2, bool3, localizations, list2);
        }
        Constructor<NextStep.Ui.Config> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.Ui.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, Boolean.class, NextStep.Ui.Localizations.class, List.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(list, bool, bool2, bool3, localizations, list2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.Ui.Config config) {
        if (config == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("components");
        this.nullableListOfUiComponentConfigAdapter.toJson(tVar, config.getComponents());
        tVar.Z("backStepEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getBackStepEnabled());
        tVar.Z("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getCancelButtonEnabled());
        tVar.Z("terminal");
        this.nullableBooleanAdapter.toJson(tVar, config.getTerminal());
        tVar.Z("localizations");
        this.nullableLocalizationsAdapter.toJson(tVar, config.getLocalizations());
        tVar.Z("serverComponentErrors");
        this.nullableListOfUiComponentErrorAdapter.toJson(tVar, config.getServerComponentErrors());
        tVar.y();
    }
}
