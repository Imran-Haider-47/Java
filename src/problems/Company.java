package problems;

public class Company {

    public String companyName;
    public String Address;
    private String Phone;
    public  static String start_date="10-April-2000";

    // No arguments contructor
    public Company() {
    }

    // arguments contructor
    public Company(String name, String Address) {
        this.companyName = name;
        this.Address = Address;
    }

    // All Arguments Constructor
    public Company(String name, String Address, String Phone) {
        this.companyName = name;
        this.Address = Address;
        this.Phone = Phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    public static void printAllAttributes(){
        System.out.println("abc static");
    }
}
