public class ColorPoint extends Point implements Prototype {
    String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(ColorPoint p) {
        this(p.x, p.y, p.color);
    }

    public ColorPoint Clone() {
        return new ColorPoint(this);
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
