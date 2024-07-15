public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle at (" + x + "," + y + ") with radius " + radius);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Circle) {
            Circle c = (Circle) other;
            double distance = Math.sqrt(Math.pow(x - c.x, 2) + Math.pow(y - c.y, 2));
            return distance < (radius + c.radius);
        }
        return false;
    }
}
