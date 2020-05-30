// double checked lock
// + thread safe
// +- performance better than sync
public class Singleton4 {
    private Singleton4() {
        System.out.println("Singleton 4 created");
    }

    private volatile static Singleton4 instance;

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
