package AbstractFactoryPattern;

public class App {
    private AbstractFactory factory;
    private Shape shape;
    private Color color;

    public App(AbstractFactory factory) {
        this.factory = factory;
    }

    public void create() {
        this.shape = this.factory.getShape();
        this.color = this.factory.getColor();
    }

    public void show() {
        this.shape.draw();
        this.color.fill();
    }
}
