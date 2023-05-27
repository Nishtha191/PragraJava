import java.util.Scanner;
import java.util.WeakHashMap;

public class UserDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String postalCode;
    private String password;

    public User GetUserData() {
        Scanner scanner = new Scanner(System.in);

        try {
            validateFirstName(scanner);
            validateLastName(scanner);
            validateEmail(scanner);
            validatePhoneNumber(scanner);
            validatePostalCode(scanner);
            validatePasswordCode(scanner);
        } catch (ValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        User user = new User(firstName, lastName, email, phoneNumber, postalCode, password);
        return user;
    }

    private void validateFirstName(Scanner scanner) throws NameValidationException {
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();;
       while (firstName.length()>10) {
           System.out.println("enter name less than 10 char");
           firstName = scanner.nextLine();
       }
            if (firstName.length() > 10) {
                throw new NameValidationException("First name exceeds 10 characters.");
            }

    }

    private void validateLastName(Scanner scanner) throws NameValidationException {
        System.out.println("Enter last name:");
        lastName = scanner.nextLine();
        while (lastName.length()>10) {
            System.out.println("enter last name less than 10 char");
            lastName = scanner.nextLine();
        }
        if (lastName.length() > 10) {
            throw new NameValidationException("Last name exceeds 10 characters.");
        }
    }

    private void validateEmail(Scanner scanner) throws EmailValidationException {
        System.out.println("Enter email address:");
        email = scanner.nextLine();
        while (!email.contains("@")){
            System.out.println("Enter email address which has @ sign");
            email = scanner.nextLine();
        }
            if (!email.contains("@")) {
                throw new EmailValidationException("Invalid email address.");
        }
    }

    private void validatePhoneNumber(Scanner scanner) throws PhoneNumberValidationException {
        System.out.println("Enter phone number:");


        while (!scanner.hasNextInt()) {
            System.out.println("***Please give integer input.***");
            phoneNumber = scanner.nextLine();
        }
        phoneNumber = scanner.nextLine();

        if (!phoneNumber.matches("\\d+") || phoneNumber.length() > 10){
            throw new PhoneNumberValidationException("Invalid phone number.");
        }
    }

    private void validatePostalCode(Scanner scanner) throws PostalCodeValidationException {
        System.out.println("Enter postal code:");
        postalCode = scanner.nextLine();
        while(postalCode.length() != 6 || postalCode.matches("^[a-zA-Z]*$")){
            System.out.println("Enter correct postal code");
            postalCode = scanner.nextLine();
        }
        if (postalCode.length() != 6 || postalCode.matches("^[a-zA-Z]*$")) {
            throw new PostalCodeValidationException("Invalid postal code.");
        }
    }

    private void validatePasswordCode(Scanner scanner) throws PasswordValidationException{
        System.out.println("Enter your password");
        password = scanner.nextLine();
        while(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")){
            System.out.println("Enter the password which must contains atleast one digit [0-9] \n one lowercase [a-z]" +
                    " one uppercase [A-Z], one special character [@!#$%]{}] and must be between 8-20");
            password = scanner.nextLine();
        }
        if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")){
            throw new PasswordValidationException("Password doesn't match requirements");
        }
    }
}
