import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> list;

    public AddressBook() {
        list = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo person){
        if (person != null){
            list.add(person);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < list.size()){
            return list.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

        BuddyInfo buddy2 = new BuddyInfo("Basma", "Carleton", "613");
        addressBook.addBuddy(buddy2);
    }
}