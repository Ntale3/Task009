package org.ui;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * SignUp class for creating user registration UI components.
 */
public final class SignUp {

    // Frame positioning and sizing constants
    /** The x-coordinate for the frame's top-left corner. */
    private static final int FRAME_X = 200;

    /** The y-coordinate for the frame's top-left corner. */
    private static final int FRAME_Y = 300;

    /** The width of the frame. */
    private static final int FRAME_WIDTH = 1000;

    /** The height of the frame. */
    private static final int FRAME_HEIGHT = 1200;

    // Field positioning constants
    /** The x-coordinate for form fields. */
    private static final int FIELD_X = 280;

    /** The width of form fields. */
    private static final int FIELD_WIDTH = 700;

    /** The height of form fields. */
    private static final int FIELD_HEIGHT = 90;

    // Button positioning constants
    /** The x-coordinate for the register button. */
    private static final int REGISTER_BUTTON_X = 145;

    /** The x-coordinate for the login button. */
    private static final int LOGIN_BUTTON_X = 550;

    /** The y-coordinate for buttons. */
    private static final int BUTTON_Y = 900;

    /** The width of buttons. */
    private static final int BUTTON_WIDTH = 300;

    /** The height of buttons. */
    private static final int BUTTON_HEIGHT = 90;

    // Title positioning constants
    /** The x-coordinate for the title label. */
    private static final int TITLE_X = 400;

    /** The y-coordinate for the title label. */
    private static final int TITLE_Y = 10;

    /** The width of the title label. */
    private static final int TITLE_WIDTH = 700;

    /** The height of the title label. */
    private static final int TITLE_HEIGHT = 40;

    // Font size constants
    /** The font size for form fields. */
    private static final int FIELD_FONT_SIZE = 32;

    /** The font size for buttons. */
    private static final int BUTTON_FONT_SIZE = 24;

    /** The font size for the title label. */
    private static final int TITLE_FONT_SIZE = 32;

    // Border and dimension constants
    /** The right border size for UI components. */
    private static final int BORDER_RIGHT = 40;

    /** The width used in component dimensions. */
    private static final int DIMENSION_WIDTH = 2;

    /** The height used in component dimensions. */
    private static final int DIMENSION_HEIGHT = 9;

    // Y-axis positions for form fields
    /** The y-coordinate for the name field. */
    private static final int NAME_Y = 100;

    /** The y-coordinate for the birth year field. */
    private static final int BIRTH_Y = 200;

    /** The y-coordinate for the address field. */
    private static final int ADDRESS_Y = 300;

    /** The y-coordinate for the phone number field. */
    private static final int PHONE_Y = 400;

    /** The y-coordinate for the email field. */
    private static final int EMAIL_Y = 500;

    /** The y-coordinate for the password field. */
    private static final int PASSWORD_Y = 600;

    /** The y-coordinate for the confirm password field. */
    private static final int CONFIRM_Y = 700;

    /** The main panel frame. */
    private static JPanel frame;
    /** Text field for user name input. */
    private static JTextField nameTextField;
    /** Text field for year of birth input. */
    private static JTextField yearOfBirthField;
    /** Text field for address input. */
    private static JTextField addressField;
    /** Text field for phone number input. */
    private static JTextField phoneNumber;
    /** Text field for email input. */
    private static JTextField email;
    /** Password field for password input. */
    private static JPasswordField password;
    /** Password field for confirm password input. */
    private static JPasswordField confirmPassword;
    /** Register button. */
    private static JButton register;
    /** Sign in button. */
    private static JButton signIn;
    /** User name string. */
    private static String name;

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private SignUp() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Creates and returns the sign up panel.
     * @return the configured JPanel for sign up.
     */
    public static JPanel createSignUp() {
        frame = new JPanel();
        frame.setLayout(null);
        frame.setBounds(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);

        frame.add(Component.createLabelComponent("NAME", NAME_Y));
        frame.add(createNameField(NAME_Y));

        frame.add(Component.createLabelComponent("BIRTH YEAR", BIRTH_Y));
        frame.add(createYearOfBirth(BIRTH_Y));

        frame.add(Component.createLabelComponent("ADDRESS", ADDRESS_Y));
        frame.add(createAddress(ADDRESS_Y));

        frame.add(Component.createLabelComponent("PHONE No", PHONE_Y));
        frame.add(createPhoneNumber(PHONE_Y));

        frame.add(Component.createLabelComponent("EMAIL", EMAIL_Y));
        frame.add(createEmail(EMAIL_Y));

        frame.add(Component.createLabelComponent("PASSWORD", PASSWORD_Y));
        frame.add(createPassword(PASSWORD_Y));

        frame.add(Component.createLabelComponent("CONFIRM *", CONFIRM_Y));
        frame.add(createConfirmPassword(CONFIRM_Y));

        frame.add(createRegisterButton());
        frame.add(createLogin());

        frame.add(createTitle());

        return frame;
    }

    /**
     * Creates the name text field.
     * @param yAxis the y-axis position.
     * @return the configured name text field.
     */
    public static JTextField createNameField(final int yAxis) {
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Tahoma", Font.PLAIN, FIELD_FONT_SIZE));
        nameTextField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        nameTextField.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        name = nameTextField.getText();
        return nameTextField;
    }

    /**
     * Creates the year of birth text field.
     * @param yAxis the y-axis position.
     * @return the configured year of birth text field.
     */
    public static JTextField createYearOfBirth(final int yAxis) {
        yearOfBirthField = new JTextField();
        yearOfBirthField.setFont(new Font("Tahoma", Font.PLAIN,
                FIELD_FONT_SIZE));
        yearOfBirthField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        yearOfBirthField.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        return yearOfBirthField;
    }

    /**
     * Creates the address text field.
     * @param yAxis the y-axis position.
     * @return the configured address text field.
     */
    public static JTextField createAddress(final int yAxis) {
        addressField = new JTextField();
        addressField.setFont(new Font("Tahoma", Font.PLAIN, FIELD_FONT_SIZE));
        addressField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        addressField.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        return addressField;
    }

    /**
     * Creates the phone number text field.
     * @param yAxis the y-axis position.
     * @return the configured phone number text field.
     */
    public static JTextField createPhoneNumber(final int yAxis) {
        phoneNumber = new JTextField();
        phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, FIELD_FONT_SIZE));
        phoneNumber.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        phoneNumber.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        return phoneNumber;
    }

    /**
     * Creates the email text field.
     * @param yAxis the y-axis position.
     * @return the configured email text field.
     */
    public static JTextField createEmail(final int yAxis) {
        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, FIELD_FONT_SIZE));
        email.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        email.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        return email;
    }

    /**
     * Creates the password field.
     * @param yAxis the y-axis position.
     * @return the configured password field.
     */
    public static JTextField createPassword(final int yAxis) {
        confirmPassword = new JPasswordField();
        confirmPassword.setFont(new Font("Tahoma", Font.PLAIN,
                FIELD_FONT_SIZE));
        confirmPassword.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        confirmPassword.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        return confirmPassword;
    }

    /**
     * Creates the confirm password field.
     * @param yAxis the y-axis position.
     * @return the configured confirm password field.
     */
    public static JTextField createConfirmPassword(final int yAxis) {
        password = new JPasswordField();
        password.setFont(new Font("Tahoma", Font.PLAIN, FIELD_FONT_SIZE));
        password.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
                BORDER_RIGHT));
        password.setBounds(FIELD_X, yAxis, FIELD_WIDTH, FIELD_HEIGHT);
        return password;
    }

    /**
     * Creates the register button.
     * @return the configured register button.
     */
    public static JButton createRegisterButton() {
        register = new JButton();
        register.setText("REGISTER");
        register.setBounds(REGISTER_BUTTON_X, BUTTON_Y, BUTTON_WIDTH,
                BUTTON_HEIGHT);
        register.setPreferredSize(new Dimension(DIMENSION_WIDTH,
                DIMENSION_HEIGHT));
        register.setFocusPainted(false);
        register.setFont(new Font("Tahoma", Font.BOLD, BUTTON_FONT_SIZE));
        register.addActionListener(AuthUI.getActionListener());
        return register;
    }

    /**
     * Creates the login button.
     * @return the configured login button.
     */
    public static JButton createLogin() {
        signIn = new JButton();
        signIn.setText("BACK TO LOGIN");
        signIn.setBounds(LOGIN_BUTTON_X, BUTTON_Y, BUTTON_WIDTH,
                BUTTON_HEIGHT);
        signIn.setPreferredSize(new Dimension(DIMENSION_WIDTH,
                DIMENSION_HEIGHT));
        signIn.setFocusPainted(false);
        signIn.setFont(new Font("Tahoma", Font.BOLD, BUTTON_FONT_SIZE));
        signIn.addActionListener(AuthUI.getActionListener());
        return signIn;
    }

    /**
     * Creates the title label.
     * @return the configured title label.
     */
    public static JLabel createTitle() {
        JLabel label = new JLabel();
        label.setText("CREATE ACCOUNT!");
        label.setBounds(TITLE_X, TITLE_Y, TITLE_WIDTH, TITLE_HEIGHT);
        label.setFont(new Font("Tahoma", Font.BOLD, TITLE_FONT_SIZE));
        return label;
    }

    /**
     * Gets the name text field.
     * @return the name text field.
     */
    public static JTextField getNameTextField() {
        return nameTextField;
    }

    /**
     * Gets the year of birth field.
     * @return the year of birth field.
     */
    public static JTextField getYearOfBirthField() {
        return yearOfBirthField;
    }

    /**
     * Gets the address field.
     * @return the address field.
     */
    public static JTextField getAddressField() {
        return addressField;
    }

    /**
     * Gets the phone number field.
     * @return the phone number field.
     */
    public static JTextField getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the email field.
     * @return the email field.
     */
    public static JTextField getEmail() {
        return email;
    }

    /**
     * Gets the password field.
     * @return the password field.
     */
    public static JPasswordField getPassword() {
        return password;
    }

    /**
     * Gets the confirm password field.
     * @return the confirm password field.
     */
    public static JPasswordField getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Gets the register button.
     * @return the register button.
     */
    public static JButton getRegister() {
        return register;
    }

    /**
     * Gets the sign in button.
     * @return the sign in button.
     */
    public static JButton getSignIn() {
        return signIn;
    }

    /**
     * Gets the name string.
     * @return the name string.
     */
    public static String getName() {
        return name;
    }
}
