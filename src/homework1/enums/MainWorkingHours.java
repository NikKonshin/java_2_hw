package homework1.enums;
// Не правильно сделала коомит вношу изменения что бы можно было сделать ноую ветку
public class MainWorkingHours {

    private final static int NUMBER_OF_WORKING_DAYS = 5;

    public static void main(String[] args) {

        //Тут для подсчета нужно менять значение day.
        DayOfWeek day = DayOfWeek.valueOf("Sunday");
        int serialNumberDay = day.ordinal();

        workingHours(serialNumberDay, day);
    }

    static void workingHours(int s, DayOfWeek day) {
        // цикл конечно не особо нужен, но вдруг пригодится.
        for (DayOfWeek d : DayOfWeek.values()) {
            if (s == 5 || s == 6) {
                System.out.println(day + ".\nСегодня выходной!!!");
                return;
            } else {
                System.out.println("Сегодня " + day + ". \nДо конца недели осталось доработать: " + (NUMBER_OF_WORKING_DAYS - s) * d.getWorkingHours() +
                        " часов.");
                return;
            }

        }
    }
}
