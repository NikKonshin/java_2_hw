package homework1;

import homework1.competitors.Actions;
import homework1.competitors.Cat;
import homework1.competitors.Human;
import homework1.competitors.Robot;
import homework1.obstacles.Obstacle;
import homework1.obstacles.Treadmill;
import homework1.obstacles.Wall;
// Не правильно сделала коомит вношу изменения что бы можно было сделать ноую ветку
public class Main {

	public static void main(String[] args) {

		Actions actions[] = {
				new Human("Bob", 4000, 5),
				new Cat("Tortik", 4000, 5),
				new Robot("Werter", 4500, 5)
		};

		Obstacle obstacles[] = {
				new Treadmill(4000),
				new Wall(3)

		};
		for (Actions action : actions) {
			for (Obstacle obstacle : obstacles) {
				obstacle.doIt(action);
				if(!action.isOnDistance()){
					break;
				}
			}



		}
	}
}
