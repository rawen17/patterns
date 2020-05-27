package windows;

public class WoodFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("open wood frame window");
    }

    @Override
    public void close() {
        System.out.println("close wood frame window");
    }

    @Override
    public Window install() {
        System.out.println("install wood frame window");
        return this;
    }
}
