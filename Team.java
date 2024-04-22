package Assignment3_000899551;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class Team {
    double x;
    double y;
    String name;
    Color color;
    int average;
    List<Player> playerlist;

    public Team(String Name, Player player1, Player player2, Player player3){
        name = Name;
        x =player1.x;
        y = player1.y;
        playerlist = new ArrayList<Player>();
        color = player1.color;
        playerlist.add(player1);
        playerlist.add(player2);
        playerlist.add(player3);
        average = (playerlist.get(0).average + playerlist.get(1).average + playerlist.get(2).average)/3 ;
    }
    public void draw(GraphicsContext gc) {
        playerlist.get(0).draw(gc);
        playerlist.get(1).draw(gc);
        playerlist.get(2).draw(gc);
        gc.setFill(Color.BLACK);
        String finalstr = name +" ~" +" "+String.valueOf(average) + " WIN %";
        gc.fillText(finalstr, x + 40, y+70);
    }

}