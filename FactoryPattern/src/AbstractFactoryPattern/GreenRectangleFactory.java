package AbstractFactoryPattern;

public class GreenRectangleFactory extends AbstractFactory{
    @Override
    public Shape getShape() {
        return new Rectangle();
    }

    @Override
    public Color getColor() {
        return new Green();
    }
}
