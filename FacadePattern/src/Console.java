import java.util.ArrayList;
import java.util.List;

public class Console {
    private List<Viewport> viewports = new ArrayList<>();
    int width, height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    public static Console newConsole(int width, int height) {
        Buffer buffer = new Buffer(height, width);
        Viewport viewport = new Viewport(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewport(viewport);
        return console;
    }

    public void render() {
        for (int y=0; y < height; ++y) {
            for (int x=0; x < width; ++x) {
                for (Viewport viewport : viewports) {
                    System.out.println(viewport.charAt(x, y));
                }
            }
        }
    }
}
