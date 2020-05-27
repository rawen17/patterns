package roofs;

public class TileRoof implements Roof {
    @Override
    public Roof cover() {
        System.out.println("cover tile roof");
        return this;
    }

    @Override
    public void waterProtect() {
        System.out.println("water protect tile roof");
    }
}
