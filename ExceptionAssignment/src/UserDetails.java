import java.util.Scanner;
public class UserDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String postalCode;

    public User GetUserData() {
        Scanner scanner = new Scanner(System.in);

        try {
            validateFirstName(scanner);
            validateLastName(scanner);
            validateEmail(scanner);
            validatePhoneNumber(scanner);
            validatePostalCode(scanner);
        } catch (ValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        User user = new User(firstName, lastName, email, phoneNumber, postalCode);
        return user;
    }

    private void validateFirstName(Scanner scanner) throws NameValidationException {
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();

        if (firstName.length() > 10) {
            throw new NameValidationException("First name exceeds 10 characters.");
        }
    }

    private void validateLastName(Scanner scanner) throws NameValidationException {
        System.out.println("Enter last name:");
        lastName = scanner.nextLine();

        if (lastName.length() > 10) {
            throw new NameValidationException("Last name exceeds 10 characters.");
        }
    }

    private void validateEmail(Scanner scanner) throws EmailValidationException {
        System.out.println("Enter email address:");
        email = scanner.nextLine();

        if (!email.contains("@")) {
            throw new EmailValidationException("Invalid email address.");
        }
    }

    private void validatePhoneNumber(Scanner scanner) throws PhoneNumberValidationException {
        System.out.println("Enter phone number:");


        while (!scanner.hasNextInt()) {
            System.out.println("***Please give integer input.***");
            scanner.next();
        }
        phoneNumber = scanner.nextLine();

        if (!phoneNumber.matches("\\d+") || phoneNumber.length() > 10){
            throw new PhoneNumberValidationException("Invalid phone number.");
        }
    }

    private void validatePostalCode(Scanner scanner) throws PostalCodeValidationException {
        System.out.println("Enter postal code:");
        postalCode = scanner.nextLine();

        if (postalCode.length() != 6 || !postalCode.matches("^[a-zA-Z]*$")) {
            throw new PostalCodeValidationException("Invalid postal code.");
        }
    }
}
