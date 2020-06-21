package homework3.task2;

import java.util.*;

public class PhoneBook {

    public PhoneBook() {
    }

    private static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void setPhoneBook() {
        phoneBook.put("Иванов", new ArrayList<String>(Arrays.asList("+79856451111", "+79856451234", "+79856456545")));
        phoneBook.put("Сидоров", new ArrayList<String>(Arrays.asList("+79635482222", "+79995556677", "+79541235856")));
        phoneBook.put("Петров", new ArrayList<String>(Arrays.asList("+79866564789")));
        phoneBook.put("Васильев", new ArrayList<String>(Arrays.asList("+79123456789", "+79171111111")));
        phoneBook.put("Федоров", new ArrayList<String>(Arrays.asList("+79856967898")));
    }

    public static void get(String k) {
        if (phoneBook.get(k) == null) {
            System.out.println("Номера нет в справочнике добавьте номер с помощью команды PhoneBook.add();");
        } else {
            System.out.println("Номер(а) запрашиваемого пользователя " + k + ": " + phoneBook.get(k));
        }
    }

    public static void add(String k, String v) {
        if (phoneBook.get(k) != null) {
            List<String> addNumber = phoneBook.get(k);
            addNumber.add(v);
            phoneBook.put(k, (addNumber));
        } else {
            phoneBook.put(k, new ArrayList<String>(Arrays.asList(v)));
        }
    }

}
