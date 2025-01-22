abstract class Shape {
    protected int x, y;
    public Shape(int x, int y) { this.x = x; this.y = y; }
    public void move(int newX, int newY) { x = newX; y = newY; }
    public abstract void show();
}

class Line extends Shape {
    private int x2, y2;
    public Line(int x, int y, int x2, int y2) { super(x, y); this.x2 = x2; this.y2 = y2; }
    @Override public void show() { System.out.println("Line: (" + x + ", " + y + ") to (" + x2 + ", " + y2 + ")"); }
}

class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, int radius) { super(x, y); this.radius = radius; }
    @Override public void show() { System.out.println("Circle: Center (" + x + ", " + y + "), Radius = " + radius); }
}

class Rectangle extends Shape {
    private int x2, y2;
    public Rectangle(int x, int y, int x2, int y2) { super(x, y); this.x2 = x2; this.y2 = y2; }
    @Override public void show() { System.out.println("Rectangle: (" + x + ", " + y + ") to (" + x2 + ", " + y2 + ")"); }
}

public class AbstractBaseClassShape {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");
        Shape[] shapes = {
            new Line(0, 0, 5, 5), new Circle(3, 3, 4),
            new Rectangle(1, 1, 4, 4), new Line(2, 2, 6, 6),
            new Circle(5, 5, 7), new Rectangle(0, 0, 8, 8)
        };
        for (Shape shape : shapes) { shape.show(); }
    }
}