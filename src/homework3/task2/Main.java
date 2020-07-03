package homework3.task2;

public class Main {
    public static void main(String[] args) {
        new PhoneBook();
        PhoneBook.setPhoneBook();
        PhoneBook.add("Иванов","+7955555555");
        PhoneBook.add("Иванов","+7955555556");
        PhoneBook.add("Иванов","+7955555557");
        PhoneBook.get("Иванов");
        PhoneBook.get("Сидоров");
    }
}
