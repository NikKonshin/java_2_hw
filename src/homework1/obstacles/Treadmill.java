package homework1.obstacles;

import homework1.competitors.Actions;
import homework1.obstacles.Obstacle;

public class Treadmill implements Obstacle {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Actions a) {
        a.run(dist);
    }
}
