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
        System.out.println("Address Book");
    }
}