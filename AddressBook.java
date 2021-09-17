import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> myBuddies = new ArrayList<>();

    public static void main (String[] args){
        System.out.println("Address Book");
    }

    private void addBuddy (BuddyInfo buddyInfo) {
        myBuddies.add(buddyInfo);

    }
    private void removeBuddy(BuddyInfo buddyInfo) {
        myBuddies.remove(buddyInfo);

    }

}