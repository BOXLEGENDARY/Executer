package r2;

import r2.a;

final class c extends r2.a {

    private final Integer f22767a;

    private final String f22768b;

    private final String f22769c;

    private final String f22770d;

    private final String f22771e;

    private final String f22772f;

    private final String f22773g;

    private final String f22774h;

    private final String f22775i;

    private final String f22776j;

    private final String f22777k;

    private final String f22778l;

    static final class b extends a.AbstractC0219a {

        private Integer f22779a;

        private String f22780b;

        private String f22781c;

        private String f22782d;

        private String f22783e;

        private String f22784f;

        private String f22785g;

        private String f22786h;

        private String f22787i;

        private String f22788j;

        private String f22789k;

        private String f22790l;

        b() {
        }

        @Override
        public r2.a a() {
            return new c(this.f22779a, this.f22780b, this.f22781c, this.f22782d, this.f22783e, this.f22784f, this.f22785g, this.f22786h, this.f22787i, this.f22788j, this.f22789k, this.f22790l);
        }

        @Override
        public a.AbstractC0219a b(String str) {
            this.f22790l = str;
            return this;
        }

        @Override
        public a.AbstractC0219a c(String str) {
            this.f22788j = str;
            return this;
        }

        @Override
        public a.AbstractC0219a d(String str) {
            this.f22782d = str;
            return this;
        }

        @Override
        public a.AbstractC0219a e(String str) {
            this.f22786h = str;
            return this;
        }

        @Override
        public a.AbstractC0219a f(String str) {
            this.f22781c = str;
            return this;
        }

        @Override
        public a.AbstractC0219a g(String str) {
            this.f22787i = str;
            return this;
        }

        @Override
        public a.AbstractC0219a h(String str) {
            this.f22785g = str;
            return this;
        }

        @Override
        public a.AbstractC0219a i(String str) {
            this.f22789k = str;
            return this;
        }

        @Override
        public a.AbstractC0219a j(String str) {
            this.f22780b = str;
            return this;
        }

        @Override
        public a.AbstractC0219a k(String str) {
            this.f22784f = str;
            return this;
        }

        @Override
        public a.AbstractC0219a l(String str) {
            this.f22783e = str;
            return this;
        }

        @Override
        public a.AbstractC0219a m(Integer num) {
            this.f22779a = num;
            return this;
        }
    }

    @Override
    public String b() {
        return this.f22778l;
    }

    @Override
    public String c() {
        return this.f22776j;
    }

    @Override
    public String d() {
        return this.f22770d;
    }

    @Override
    public String e() {
        return this.f22774h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2.a)) {
            return false;
        }
        r2.a aVar = (r2.a) obj;
        Integer num = this.f22767a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f22768b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f22769c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f22770d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f22771e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f22772f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f22773g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f22774h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f22775i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f22776j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f22777k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f22778l;
                                                    if (str11 == null) {
                                                        if (aVar.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.b())) {
                                                        return true;
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
        return false;
    }

    @Override
    public String f() {
        return this.f22769c;
    }

    @Override
    public String g() {
        return this.f22775i;
    }

    @Override
    public String h() {
        return this.f22773g;
    }

    public int hashCode() {
        Integer num = this.f22767a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f22768b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f22769c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22770d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22771e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f22772f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f22773g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f22774h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f22775i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f22776j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f22777k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f22778l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override
    public String i() {
        return this.f22777k;
    }

    @Override
    public String j() {
        return this.f22768b;
    }

    @Override
    public String k() {
        return this.f22772f;
    }

    @Override
    public String l() {
        return this.f22771e;
    }

    @Override
    public Integer m() {
        return this.f22767a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f22767a + ", model=" + this.f22768b + ", hardware=" + this.f22769c + ", device=" + this.f22770d + ", product=" + this.f22771e + ", osBuild=" + this.f22772f + ", manufacturer=" + this.f22773g + ", fingerprint=" + this.f22774h + ", locale=" + this.f22775i + ", country=" + this.f22776j + ", mccMnc=" + this.f22777k + ", applicationBuild=" + this.f22778l + "}";
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f22767a = num;
        this.f22768b = str;
        this.f22769c = str2;
        this.f22770d = str3;
        this.f22771e = str4;
        this.f22772f = str5;
        this.f22773g = str6;
        this.f22774h = str7;
        this.f22775i = str8;
        this.f22776j = str9;
        this.f22777k = str10;
        this.f22778l = str11;
    }
}
