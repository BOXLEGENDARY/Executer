package s2;

import java.util.concurrent.Executor;

class m implements Executor {

    private final Executor f23640d;

    static class a implements Runnable {

        private final Runnable f23641d;

        a(Runnable runnable) {
            this.f23641d = runnable;
        }

        @Override
        public void run() {
            try {
                this.f23641d.run();
            } catch (Exception e7) {
                w2.a.c("Executor", "Background execution failure.", e7);
            }
        }
    }

    m(Executor executor) {
        this.f23640d = executor;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f23640d.execute(new a(runnable));
    }
}
