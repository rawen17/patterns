import windows.Window;

public class Supplier {
    public Window createWindow() {
        return new Window() {
            @Override
            public String toString() {
                return "window{}";
            }

            @Override
            public void open() {
                System.out.println("open window");
            }

            @Override
            public void close() {
                System.out.println("close window");
            }

            @Override
            public Window install() {
                System.out.println("install window");
                return this;
            }
        };
    }

}
