public abstract class Shape {
    public abstract void draw();
    public abstract void move(int dx, int dy);
    public abstract boolean overlaps(Shape other);
}
