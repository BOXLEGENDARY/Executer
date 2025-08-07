package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import T9.b;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface Button extends UiComponentConfig {

    @i(generateAdapter = false)
    public static final class ButtonType {
        private static final T9.a $ENTRIES;
        private static final ButtonType[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final ButtonType PRIMARY = new ButtonType("PRIMARY", 0);
        public static final ButtonType SECONDARY = new ButtonType("SECONDARY", 1);

        public static final class Companion extends h<ButtonType> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, ButtonType buttonType) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public ButtonType m218fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                return Intrinsics.b(objM0, "primary") ? ButtonType.PRIMARY : Intrinsics.b(objM0, "secondary") ? ButtonType.SECONDARY : ButtonType.PRIMARY;
            }
        }

        private static final ButtonType[] $values() {
            return new ButtonType[]{PRIMARY, SECONDARY};
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = b.a(buttonTypeArr$values);
            Companion = new Companion(null);
        }

        private ButtonType(String str, int i) {
        }

        @NotNull
        public static T9.a<ButtonType> getEntries() {
            return $ENTRIES;
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    @Override
    BaseButtonAttributes getAttributes();

    BaseButtonComponentStyle getStyles();
}
