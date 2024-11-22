package lab.lab_1;

public class MyProfile {
    public static void main(String[] args) {

        // Call profile function to display my personal profile
        profile("Saiket Das", "22117847", "Jalan SS 7/19, 47301", "saiketdas02@gmail.com", "01156262784");
    }

    public static void profile(String name, String matricNumber, String address, String email, String contactNumber) {
        // Full name
        System.err.println("Full name: " + name);
        // Matric Number
        System.err.println("Matric number: " + matricNumber);
        // Address
        System.err.println("Address: " + address);
        // Email
        System.err.println("Email: " + email);
        // Contact Number
        System.err.println("Contact number: " + contactNumber);
    }
}
