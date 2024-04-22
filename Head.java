package Assignment3_000899551;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Head {
    double x;
    double y;
    public Head(double X, double Y){
        x = X;
        y = Y;

    }
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.DARKRED);
        gc.fillRoundRect(x, y, 22,18,50,10);
        gc.fillRect(x+9, y, 5, 20);
        gc.setFill(Color.WHITE);
        gc.fillOval(x+3, y+3, 5,5);
        gc.fillOval(x+15, y+3, 5,5);
    }
}