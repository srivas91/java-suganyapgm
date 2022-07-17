public class AddressDemo {
    public static void main(String[] args) {
        String houseno="35";
        String street="kannan street";
        String nagar="gandhi nagar";
        String city="tiruvallur";
        String pincode="600023";
        String address="".join(",",houseno,street,nagar,city,pincode);
        System.out.println("address is"+address);
    }  
}
