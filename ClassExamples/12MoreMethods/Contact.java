import java.util.ArrayList;

public class Contact {
    long phone = 0;
    String name;

    public Contact(String name) {
        this.name = name;
    }

    // student task two, add the two constructors here!
    public Contact(String name, String phone){
        this.name = name;
        setPhone(phone);
        
    }

    public Contact(String name, long phone){
        this.name = name;
        setPhone(phone);
    }
    

    public String getFormattedPhone() {
        return String.format("(%d) %d-%d", getAreaCode(), getPrefix(), getNumber());
    }

    public int getPrefix() {
        long tmp = phone / 10000;
        return (int) (tmp % 1000);
    }

    public int getAreaCode() {
        long tmp = phone / 10000000;
        return (int) (tmp % 1000);
    }

    public int getNumber() {
        return (int) phone % 10000;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        // Student task 2
        this.phone = phone;
    }

    public void setPhone(String phone) {
       // STUDENT task 2
       String sendBack = "";
       for(int i = 0; i < phone.length(); i++){
           char curDigit = phone.charAt(i);
           if(Character.isDigit(curDigit)){
               sendBack += curDigit;
           }
       }
       long sentBack = Long.parseLong(sendBack);
       setPhone(sentBack);
    }

    public String toString() {
        return String.format("Name: %s, phone: %s", name, getFormattedPhone());
    }

    public static void main(String[] args) {
        ArrayList<Contact> advisors = new ArrayList<>();
        Contact bess = new Contact("Bess");
        bess.setPhone(9704915944L); // the "L" at the end is how we tell java it is a
        advisors.add(new Contact("Elisa","(970) 491-3739"));
        advisors.add(new Contact("Tran"));
        advisors.add(new Contact("Heidi"));
        advisors.add(bess); // just doing this so you can see adding other ways to add objects to ArrayLists

        for(Contact advisor:advisors) {
            if(advisor.getPhone() > 0) {
                System.out.println(advisor);
           }
        }
    }
}