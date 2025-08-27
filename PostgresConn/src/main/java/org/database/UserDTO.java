package org.database;

/**
 * Data Transfer Object for User data.
 */
public final class UserDTO {

    /** User's full name. */
    private String newName;

    /** User's year of birth. */
    private String yearOfBirth;

    /** User's residential address. */
    private String address;

    /** User's phone number. */
    private String phone;

    /** User's email. */
    private String email;

    /** User's password. */
    private String password;


    /**
     * Constructor to initialize all user fields.
     *
     * @param newName1 user's full name
     * @param yearOfBirth1 user's year of birth
     * @param address1 user's address
     * @param phone1 user's phone number
     * @param email1 user's email
     * @param password1 user's password
     */
    public UserDTO(final String newName1,
                   final String yearOfBirth1,
                   final String address1,
                   final String phone1,
                   final String email1,
                   final String password1) {
        this.newName = newName1;
        this.yearOfBirth = yearOfBirth1;
        this.address = address1;
        this.phone = phone1;
        this.email = email1;
        this.password = password1;
    }

    /**
     * Gets the email.
     * @return user's email
     */
    public String getEmailValue() {
        return email;
    }
    /**
     * Gets the yearOfBirth.
     * @return user's yearOfBirth
     */
    public String getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Gets the phone.
     * @return user's phone
     */
    public String getPhoneValue() {
        return phone;
    }

    /**
     * Gets the password.
     * @return user's password
     */
    public String getPasswordValue() {
        return password;
    }

    /**
     * Gets the newName.
     * @return user's newName
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Gets the address.
     * @return user's address
     */
    public String getAddressValue() {
        return address;
    }

    /**
     * Sets the email.
     * @param emailValue user's email
     */
    public void setEmailValue(final String emailValue) {
        this.email = emailValue;
    }

    /**
     * Sets the address.
     * @param addr user's address
     */
    public void setAddress(final String addr) {
        this.address = addr;
    }

    /**
     * Sets the phoneNumber.
     * @param phoneNumber user's phoneNumber
     */
    public void setPhoneNumber(final String phoneNumber) {
        this.phone = phoneNumber;
    }

    /**
     * Sets the newName.
     * @param name user's newName
     */
    public void setName(final String name) {
        this.newName = name;
    }
}
