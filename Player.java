package Assignment3_000899551;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;
public class Player {
    double x;
    double y;
    int average;
    Color color;
    String title;
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRoundRect(x,y,50,50,20,10);

        Head head = new Head(x+13,y-20);
        head.draw(gc);
        Wheel wheel = new Wheel(x, y);
        wheel.draw(gc);
        gc.setFill(Color.WHEAT);
        gc.fillText(String.valueOf(average),x+20 ,y+20);
        if(title!= null){
            gc.setFill(Color.BLACK);
            gc.fillText("REFEREE "+ title,x-35,y+70);
        }
    }

    public Player(double X, double Y, Color col){
        x = X;
        y = Y;
        color = col;
        average = new Random().nextInt(100);
    }
    public Player(double X, double Y, String tit, Color col){
        x = X;
        y = Y;
        title = tit;
        color = col;
        average = 100;
    }
}