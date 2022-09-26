public class BuddyInfo {

    private String name;
    private String number;
    private String address;

    // Constructor that take in the created attributes as parameters
    public BuddyInfo(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    // Default constructor
    public BuddyInfo() {
        name = "Basma";
        number = "123456";
        address = "Carleton";
    }

    // Getter method for attribute "name"
    public String getName() {
        return name;
    }

    // Getter method for attribute "number"
    public String getNumber() {
        return number;
    }

    // Getter method for attribute "address"
    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo friend = new BuddyInfo("Homer", "123456","bank");
        System.out.println("Hello " + friend.name + "!");
    }
}


