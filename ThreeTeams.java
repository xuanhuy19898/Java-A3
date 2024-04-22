package Assignment3_000899551;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class ThreeTeams extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(700,600);
        stage.setTitle("ROBOT OLYMPIC~ 000899551");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHEAT);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Draw teams
        Team t1 = new Team("TEAM TOMATO", new Player(100, 100, Color.TOMATO),
                new Player(200, 100, Color.TOMATO), new Player(300, 100, Color.TOMATO));
        Team t2 = new Team("TEAM POTATO", new Player(100, 250, Color.DARKGOLDENROD),
                new Player(200, 250, Color.DARKGOLDENROD), new Player(300, 250, Color.DARKGOLDENROD));
        Team t3 = new Team("TEAM AVOCADO", new Player(100, 400, Color.FORESTGREEN),
                new Player(200, 400, Color.FORESTGREEN), new Player(300, 400, Color.FORESTGREEN));
        t1.draw(gc);
        t2.draw(gc);
        t3.draw(gc);

        // Randomly select the referee's team color and name
        Random random = new Random();
        int refereeChoice = random.nextInt(3);
        Color refereeColor;
        String refereeName;

        switch (refereeChoice) {
            case 0:
                refereeColor = Color.TOMATO;
                refereeName = "is with TOMATO";
                break;
            case 1:
                refereeColor = Color.DARKGOLDENROD;
                refereeName = "is with POTATO";
                break;
            default:
                refereeColor = Color.FORESTGREEN;
                refereeName = "is with AVOCADO";
                break;
        }

        Player referee = new Player(480, 250, refereeName, refereeColor);
        referee.draw(gc);

        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
