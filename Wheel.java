package Assignment3_000899551;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wheel {
    double x;
    double y;

    public Wheel(double X, double Y){
        x = X;
        y = Y;
    }
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.DARKRED);
        gc.fillOval(x-10,y+5,10,30);
        gc.fillOval(x+50,y+5,10,30);
    }
}