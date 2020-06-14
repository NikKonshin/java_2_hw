package homework1.enums;
// Не правильно сделала коомит вношу изменения что бы можно было сделать ноую ветку
public enum DayOfWeek {
    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(8),
    Saturday(0), Sunday(0);
    int workingHours;

    DayOfWeek(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
