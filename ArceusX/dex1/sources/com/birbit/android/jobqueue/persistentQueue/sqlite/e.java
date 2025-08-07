package com.birbit.android.jobqueue.persistentQueue.sqlite;

import com.birbit.android.jobqueue.persistentQueue.sqlite.c;
import f2.f;
import g0.j;
import java.util.Iterator;

class e {

    private final j<Long, d> f13863a = new a(15);

    private final String f13864b;

    class a extends j<Long, d> {
        a(int i7) {
            super(i7);
        }

        @Override
        public void b(boolean z7, Long l7, d dVar, d dVar2) {
            dVar.b();
        }
    }

    public e(long j7) {
        this.f13864b = Long.toString(j7);
    }

    private long b(com.birbit.android.jobqueue.c cVar) {
        return ((cVar.i() == null ? 1 : 0) << 21) | (cVar.g() == null ? 2 : cVar.g().ordinal()) | (cVar.h().size() << 2) | (cVar.c().size() << 8) | (cVar.d().size() << 14) | ((cVar.b() ? 1 : 0) << 20);
    }

    private d c(long j7, com.birbit.android.jobqueue.c cVar, StringBuilder sb) {
        int size;
        sb.setLength(0);
        sb.append("( (");
        c.C0150c c0150c = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13807C;
        sb.append(c0150c.f13849a);
        sb.append(" != ");
        sb.append(d.f13855i);
        sb.append(" AND ");
        sb.append(c0150c.f13849a);
        sb.append(" <= ?) OR ");
        sb.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13806B.f13849a);
        sb.append(" <= ?)");
        sb.append(" AND (");
        c.C0150c c0150c2 = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13809E;
        sb.append(c0150c2.f13849a);
        sb.append(" IS NULL OR ");
        sb.append(c0150c2.f13849a);
        sb.append(" != 1)");
        if (cVar.i() != null) {
            sb.append(" AND ");
            sb.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13819z.f13849a);
            sb.append(" <= ?");
            size = 3;
        } else {
            size = 2;
        }
        if (cVar.g() != null) {
            if (cVar.h().isEmpty()) {
                sb.append(" AND 0 ");
            } else {
                sb.append(" AND ");
                sb.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e.f13849a);
                sb.append(" IN ( SELECT ");
                c.C0150c c0150c3 = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13811G;
                sb.append(c0150c3.f13849a);
                sb.append(" FROM ");
                sb.append("job_holder_tags");
                sb.append(" WHERE ");
                sb.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13812H.f13849a);
                sb.append(" IN (");
                c.a(sb, cVar.h().size());
                sb.append(")");
                if (cVar.g() == f.f20490e) {
                    sb.append(")");
                } else {
                    if (cVar.g() != f.ALL) {
                        throw new IllegalArgumentException("unknown constraint " + cVar);
                    }
                    sb.append(" GROUP BY (`");
                    sb.append(c0150c3.f13849a);
                    sb.append("`)");
                    sb.append(" HAVING count(*) = ");
                    sb.append(cVar.h().size());
                    sb.append(")");
                }
                size += cVar.h().size();
            }
        }
        if (!cVar.c().isEmpty()) {
            sb.append(" AND (");
            c.C0150c c0150c4 = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13816v;
            sb.append(c0150c4.f13849a);
            sb.append(" IS NULL OR ");
            sb.append(c0150c4.f13849a);
            sb.append(" NOT IN(");
            c.a(sb, cVar.c().size());
            sb.append("))");
            size += cVar.c().size();
        }
        if (!cVar.d().isEmpty()) {
            sb.append(" AND ");
            sb.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e.f13849a);
            sb.append(" NOT IN(");
            c.a(sb, cVar.d().size());
            sb.append(")");
            size += cVar.d().size();
        }
        if (cVar.b()) {
            sb.append(" AND ");
            sb.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13805A.f13849a);
            sb.append(" != ?");
            size++;
        }
        return new d(j7, sb.toString(), new String[size]);
    }

    private void d(com.birbit.android.jobqueue.c cVar, d dVar) {
        dVar.f13858c[0] = Long.toString(cVar.f());
        dVar.f13858c[1] = Integer.toString(cVar.e());
        int i7 = 2;
        if (cVar.i() != null) {
            dVar.f13858c[2] = Long.toString(cVar.i().longValue());
            i7 = 3;
        }
        if (cVar.g() != null) {
            Iterator<String> it = cVar.h().iterator();
            while (it.hasNext()) {
                dVar.f13858c[i7] = it.next();
                i7++;
            }
        }
        Iterator<String> it2 = cVar.c().iterator();
        while (it2.hasNext()) {
            dVar.f13858c[i7] = it2.next();
            i7++;
        }
        Iterator<String> it3 = cVar.d().iterator();
        while (it3.hasNext()) {
            dVar.f13858c[i7] = it3.next();
            i7++;
        }
        if (cVar.b()) {
            dVar.f13858c[i7] = this.f13864b;
            i7++;
        }
        if (i7 == dVar.f13858c.length) {
            return;
        }
        throw new IllegalStateException("something is wrong with where query cache for " + dVar.f13857b);
    }

    private boolean e(com.birbit.android.jobqueue.c cVar) {
        return cVar.h().size() < 64 && cVar.c().size() < 64 && cVar.d().size() < 64;
    }

    public d a(com.birbit.android.jobqueue.c cVar, StringBuilder sb) {
        boolean zE = e(cVar);
        long jB = b(cVar);
        d dVarD = zE ? this.f13863a.d(Long.valueOf(jB)) : null;
        if (dVarD == null) {
            dVarD = c(jB, cVar, sb);
            if (zE) {
                this.f13863a.f(Long.valueOf(jB), dVarD);
            }
        }
        d(cVar, dVarD);
        return dVarD;
    }
}
