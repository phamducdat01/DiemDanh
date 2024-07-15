public class Triangle extends Shape {
    private int x, y, base, height;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle at (" + x + "," + y + ") with base " + base + " and height " + height);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public boolean overlaps(Shape other) {
        return false;
    }
}
