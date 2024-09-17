import java.util.Dictionary;
import java.util.Hashtable;

public class AddressBook {
    private Dictionary<String, BuddyInfo> book;

    public AddressBook() {
        book = new Hashtable();
    }

    public void addBuddy(BuddyInfo buddy) {
        book.put(buddy.getName(), buddy);
    }

    public BuddyInfo getBuddy(String name) {
        return (BuddyInfo) book.remove(name);
    }

    public static void main(String[] args) {
        System.out.println("Address Book:");

    }
}
