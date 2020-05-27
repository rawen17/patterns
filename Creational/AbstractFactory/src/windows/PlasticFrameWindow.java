package windows;

public class PlasticFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("open plastic frame window");
    }

    @Override
    public void close() {
        System.out.println("close plastic frame window");
    }

    @Override
    public Window install() {
        System.out.println("install plastic frame window");
        return this;
    }
}
