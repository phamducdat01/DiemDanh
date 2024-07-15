public class Rectangle extends Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle at (" + x + "," + y + ") with width " + width + " and height " + height);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Rectangle) {
            Rectangle r = (Rectangle) other;
            return !(x + width < r.x || r.x + r.width < x || y + height < r.y || r.y + r.height < y);
        }
        return false;
    }
}
