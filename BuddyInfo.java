public class BuddyInfo {

    private String name;

    private String address;

    private int phoneNumber;

    public BuddyInfo (String name, String address, int phoneNumber){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        System.out.println(name+ "\n" + "Hello");
    }
    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("John", "Smith",82748209);
        //System.out.println("Hello World!");
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

}