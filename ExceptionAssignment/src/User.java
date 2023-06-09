public class User {
    private String firstName;
   private String lastName;
   private String email;
  private   String phoneNumber;
    private String postalCode;
   private String password;

    public User(String firstName, String lastName, String email, String phoneNumber, String postalCode, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.password = password;
    }

    // Getter and Setter methods for all private members

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "\n FirstName='" + firstName + '\n' +
                " LastName='" + lastName + '\n' +
                " Email='" + email + '\n' +
                " PhoneNumber='" + phoneNumber + '\n' +
                " PostalCode='" + postalCode + '\n' +
                "password = " + password;
    }
}
