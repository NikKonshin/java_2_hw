package homework1.competitors;
// Не правильно сделала коомит вношу изменения что бы можно было сделать ноую ветку
public class Robot implements Actions {
    String name;
    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println("Робот " + name + " пробежал " + dist + " метров\n");
        } else {
            System.out.println("Робот " + name + " не пробежал " + dist + " метров, и сошёл с дистанции\n");
            onDistance = false;
        }
    }
    @Override
    public void jump(int height) {
        if (maxJumpHeight == 0){
            System.out.println("Робот " + name + " не умеет прыгать, заржавел подшипник, сошёл с дистанции\n");
            onDistance = false;
            return;
        }
        if (height <= maxJumpHeight) {
            System.out.println("Робот " + name + " прыгнул через " + height+ " стену\n");
        } else {
            System.out.println("Робот " + name + " не прыгнул через " + height + " стену, и сошёл с дистанции\n");
            onDistance = false;
        }
    }
    @Override
    public boolean isOnDistance(){
        return onDistance;
    }

}
