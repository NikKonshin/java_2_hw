package homework1.enums;

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
