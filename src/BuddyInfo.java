public class BuddyInfo {
    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "123 Main st.", "123456789");
    }
}
