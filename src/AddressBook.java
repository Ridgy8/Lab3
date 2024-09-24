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
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Change done");
        System.out.println("Yet another change");
    }
}
