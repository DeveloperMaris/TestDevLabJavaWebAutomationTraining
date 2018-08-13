package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private String password;

    public User() {
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.mobileNumber = generateRandomPhoneNumber();
        this.emailAddress = generateRandomEmail();
        this.password = generateRandomString();
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

}
