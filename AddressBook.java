import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> myBuddies = new ArrayList<>();

    public static void main (String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    private void addBuddy (BuddyInfo buddyInfo) {
        myBuddies.add(buddyInfo);

    }
    private void removeBuddy(BuddyInfo buddyInfo) {
        myBuddies.remove(buddyInfo);

    }

}