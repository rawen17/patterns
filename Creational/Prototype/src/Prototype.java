public interface Prototype {
    Prototype Clone();

    public static Prototype createRedPoint() {
        return Program.protos.get("red").Clone();
    }
}
