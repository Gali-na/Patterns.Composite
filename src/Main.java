public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape square3 = new Square();
        Shape square4 = new Square();

        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();
        Shape circle4 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addShape(square1);
        composite1.addShape(square2);
        composite1.addShape(square3);
        composite1.addShape(square4);

        composite1.draw();

        composite2.addShape(circle1);
        composite2.addShape(circle2);
        composite2.addShape(circle3);
        composite2.addShape(circle4);

        composite2.draw();
        System.out.println();
        System.out.println("*******************");
        System.out.println();
        composite.addShape(composite1);
        composite.addShape(composite2);
        composite.draw();

    }
}