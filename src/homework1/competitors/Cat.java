package homework1.competitors;

public class Cat implements Actions {
    String name;
    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println("Кот " + name + " пробежал " + dist + " метров\n");
        } else {
            System.out.println("Кот " + name + " не пробежал " + dist + " метров, и сошёл с дистанции \n");
            onDistance = false;
        }
    }
    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кот " + name + " прыгнул через " + height+ " стену\n");
        } else {
            System.out.println("Кот " + name + " не прыгнул через " + height + " стену, и сошёл с дистанции\n");
            onDistance = false;
        }
    }
    @Override
    public boolean isOnDistance(){
        return onDistance;
    }

}

