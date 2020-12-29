package GeometricShapes;

public class ShapesDemo {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.children.add(new Circle("Yellow"));
        drawing.children.add(new Square("Red"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Circle("Blue"));
        group.children.add(new Square(""));

        drawing.children.add(group);

        System.out.println(drawing);
    }
}
