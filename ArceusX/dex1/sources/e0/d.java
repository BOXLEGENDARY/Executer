package E0;

import C0.m;
import D0.A;
import D0.B;
import D0.C;
import D0.C0366a;
import D0.C0367b;
import D0.C0368c;
import D0.C0369d;
import D0.D;
import D0.f;
import D0.g;
import D0.h;
import D0.i;
import D0.j;
import D0.k;
import D0.l;
import D0.n;
import D0.o;
import D0.p;
import D0.q;
import D0.r;
import D0.s;
import D0.t;
import D0.u;
import D0.v;
import D0.w;
import D0.x;
import D0.y;
import D0.z;
import E0.c;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"LE0/d;", "LE0/e;", "LD0/e;", "domError", BuildConfig.FLAVOR, "errorMessage", "<init>", "(LD0/e;Ljava/lang/CharSequence;)V", "w", "LD0/e;", "getDomError", "()LD0/e;", "y", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends e {

    public static final Companion INSTANCE = new Companion(null);

    private final D0.e domError;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LE0/d$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "type", "msg", "LC0/m;", "a", "(Ljava/lang/String;Ljava/lang/String;)LC0/m;", "TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(String type, String msg) throws F0.a {
            Object objB;
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                c.Companion companion = c.INSTANCE;
                CharSequence charSequence = null;
                d dVar = new d(new B(), charSequence, 2, charSequence);
                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + GObvYfBKohxpYX.UrFpxlFvuuro)) {
                    objB = companion.b(new C0366a(), msg, dVar);
                } else {
                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        objB = companion.b(new C0367b(), msg, dVar);
                    } else {
                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                            objB = companion.b(new C0368c(), msg, dVar);
                        } else {
                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + tAjeAKSIqDqzNP.lntitPmVzZOjmi)) {
                                objB = companion.b(new C0369d(), msg, dVar);
                            } else {
                                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                                    objB = companion.b(new f(), msg, dVar);
                                } else {
                                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                                        objB = companion.b(new g(), msg, dVar);
                                    } else {
                                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                                            objB = companion.b(new h(), msg, dVar);
                                        } else {
                                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                                                objB = companion.b(new i(), msg, dVar);
                                            } else {
                                                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                                                    objB = companion.b(new j(), msg, dVar);
                                                } else {
                                                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                                                        objB = companion.b(new k(), msg, dVar);
                                                    } else {
                                                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                                                            objB = companion.b(new l(), msg, dVar);
                                                        } else {
                                                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                                                                objB = companion.b(new D0.m(), msg, dVar);
                                                            } else {
                                                                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                                                                    objB = companion.b(new n(), msg, dVar);
                                                                } else {
                                                                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                                                                        objB = companion.b(new o(), msg, dVar);
                                                                    } else {
                                                                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                                                                            objB = companion.b(new p(), msg, dVar);
                                                                        } else {
                                                                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                                                                                objB = companion.b(new q(), msg, dVar);
                                                                            } else {
                                                                                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                                                                                    objB = companion.b(new r(), msg, dVar);
                                                                                } else {
                                                                                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                                                                                        objB = companion.b(new s(), msg, dVar);
                                                                                    } else {
                                                                                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                                                                                            objB = companion.b(new t(), msg, dVar);
                                                                                        } else {
                                                                                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                                                                                                objB = companion.b(new u(), msg, dVar);
                                                                                            } else {
                                                                                                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                                                                                                    objB = companion.b(new v(), msg, dVar);
                                                                                                } else {
                                                                                                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                                                                                                        objB = companion.b(new w(), msg, dVar);
                                                                                                    } else {
                                                                                                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                                                                                                            objB = companion.b(new x(), msg, dVar);
                                                                                                        } else {
                                                                                                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                                                                                                                objB = companion.b(new y(), msg, dVar);
                                                                                                            } else {
                                                                                                                if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                                                                                                                    objB = companion.b(new z(), msg, dVar);
                                                                                                                } else {
                                                                                                                    if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                                                                                                                        objB = companion.b(new A(), msg, dVar);
                                                                                                                    } else {
                                                                                                                        if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                                                                                                                            objB = companion.b(new B(), msg, dVar);
                                                                                                                        } else {
                                                                                                                            if (Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                                                                                                                                objB = companion.b(new C(), msg, dVar);
                                                                                                                            } else {
                                                                                                                                if (!Intrinsics.b(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                                                                                                                                    throw new F0.a();
                                                                                                                                }
                                                                                                                                objB = companion.b(new D(), msg, dVar);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return (m) objB;
            } catch (F0.a unused) {
                return new C0.l(type, msg);
            }
        }

        private Companion() {
        }
    }

    public d(D0.e eVar, CharSequence charSequence, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i7 & 2) != 0 ? null : charSequence);
    }

    public d(D0.e eVar, CharSequence charSequence) {
        super("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + eVar.getType(), charSequence);
        Intrinsics.checkNotNullParameter(eVar, "domError");
        this.domError = eVar;
    }
}
