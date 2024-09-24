import java.util.Dictionary;
import java.util.Hashtable;

public class AddressBook {
    private Dictionary<String, BuddyInfo> book;

    public AddressBook() {
        book = new Hashtable<String, BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        book.put(buddy.getName(), buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        book.remove(buddy.getName());
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
