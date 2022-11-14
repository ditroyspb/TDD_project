import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public Map<String, String> contactList = new HashMap<>();

    public int add(String name, String number) {
        if (!contactList.containsValue(number)) {
            contactList.put(name, number);
        } else {
            System.out.println("Данный контакт уже добавлен в телефонную книгу :(");
        }
        return contactList.size();
    }
}
