public class InnerStaticSingleton {
    public InnerStaticSingleton() {
    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE =
                new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}
