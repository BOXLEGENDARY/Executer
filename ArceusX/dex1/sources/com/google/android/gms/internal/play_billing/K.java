package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

final class K {

    private static final Collector f15882a = Collector.of(new Supplier() {
        @Override
        public final Object get() {
            return new C2033a0(4);
        }
    }, new BiConsumer() {
        @Override
        public final void accept(Object obj, Object obj2) {
            ((C2033a0) obj).e(obj2);
        }
    }, new BinaryOperator() {
        @Override
        public final Object apply(Object obj, Object obj2) {
            C2033a0 c2033a0 = (C2033a0) obj;
            C2033a0 c2033a02 = (C2033a0) obj2;
            c2033a0.c(c2033a02.f15952a, c2033a02.f15953b);
            return c2033a0;
        }
    }, new Function() {
        @Override
        public final Object apply(Object obj) {
            return ((C2033a0) obj).f();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() {
            @Override
            public final Object get() {
                return new C2093k0();
            }
        }, new BiConsumer() {
            @Override
            public final void accept(Object obj, Object obj2) {
                ((C2093k0) obj).e(obj2);
            }
        }, new BinaryOperator() {
            @Override
            public final Object apply(Object obj, Object obj2) {
                C2093k0 c2093k0 = (C2093k0) obj;
                C2093k0 c2093k02 = (C2093k0) obj2;
                c2093k0.c(c2093k02.f15952a, c2093k02.f15953b);
                return c2093k0;
            }
        }, new Function() {
            @Override
            public final Object apply(Object obj) {
                C2093k0 c2093k0 = (C2093k0) obj;
                int i7 = c2093k0.f15953b;
                if (i7 == 0) {
                    return H0.f15808B;
                }
                if (i7 == 1) {
                    Object obj2 = c2093k0.f15952a[0];
                    Objects.requireNonNull(obj2);
                    return new K0(obj2);
                }
                AbstractC2099l0 abstractC2099l0R = AbstractC2099l0.r(i7, c2093k0.f15952a);
                c2093k0.f15953b = abstractC2099l0R.size();
                c2093k0.f15954c = true;
                return abstractC2099l0R;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() {
            @Override
            public final Object get() {
                return new C2081i0();
            }
        }, new BiConsumer() {
            @Override
            public final void accept(Object obj, Object obj2) {
                ((C2081i0) obj).a((C2176y0) obj2);
            }
        }, new BinaryOperator() {
            @Override
            public final Object apply(Object obj, Object obj2) {
                C2081i0 c2081i0 = (C2081i0) obj;
                c2081i0.b((C2081i0) obj2);
                return c2081i0;
            }
        }, new Function() {
            @Override
            public final Object apply(Object obj) {
                return ((C2081i0) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector a() {
        return f15882a;
    }
}
