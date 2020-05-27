package windows;

public class WoodFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("open wood window");
    }

    @Override
    public void close() {
        System.out.println("close wood window");
    }

    @Override
    public Window install() {
        System.out.println("install wood window");
        return this;
    }

    @Override
    public String toString() {
        return "WoodFrameWindow{}";
    }
}
