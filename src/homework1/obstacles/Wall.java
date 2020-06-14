package homework1.obstacles;
// Не правильно сделала коомит вношу изменения что бы можно было сделать ноую ветку
import homework1.competitors.Actions;
import homework1.obstacles.Obstacle;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Actions a) {
        a.jump(height);
    }
}
