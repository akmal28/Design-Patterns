package AbstractFactoryPattern;

public class BlueSquareFactory extends AbstractFactory{
    @Override
    public Shape getShape() {
        return new Square();
    }

    @Override
    public Color getColor() {
        return new Blue();
    }
}
