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

    public void removeBuddy(BuddyInfo buddy) {
        book.remove(buddy.getName());
    }

    public static void main(String[] args) {
        System.out.println("Address Book:");
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Change done");
    }
}
