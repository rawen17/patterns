package roofs;

public class WoodRoof implements Roof {
    @Override
    public Roof cover() {
        System.out.println("cover wood roof");
        return this;
    }

    @Override
    public void waterProtect() {
        System.out.println("water protect wood roof");
    }
}
