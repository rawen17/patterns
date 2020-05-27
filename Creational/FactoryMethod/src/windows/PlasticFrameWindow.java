package windows;

public class PlasticFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("open plastic window");
    }

    @Override
    public void close() {
        System.out.println("close plastic window");
    }

    @Override
    public Window install() {
        System.out.println("install plastic window");
        return this;
    }

    @Override
    public String toString() {
        return "PlasticFrameWindow{}";
    }
}
