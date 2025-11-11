package JavaConstructor;
class Circle {
    double radius;

    Circle() {
        this(67.6);
    }
    Circle(double radius) {
        this.radius = radius;
    }
    void display() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Circle c2 = new Circle(45.3);
        c2.display();
    }
}