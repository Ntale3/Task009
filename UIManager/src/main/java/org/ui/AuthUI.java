package org.ui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * AuthUI class for managing authentication user interface components.
 * This class handles the main frame and panel switching for login,
 * registration, and dashboard views.
 */
public final class AuthUI {

    /** The main application frame. */
    private static JFrame frame;

    /** The main panel container. */
    private static JPanel panel;

    /** Card layout for switching between different views. */
    private static CardLayout cardLayout = new CardLayout();

    /** Action listener instance for handling UI events. */
    private static Listener.ActionListenerImpl al =
            new Listener.ActionListenerImpl();

    /** User name field value. */
    private static String name;

    /** User address field value. */
    private static String address;

    /** User email field value. */
    private static String email;

    /** User phone number field value. */
    private static String phoneNumber;

    /** User password field value. */
    private static String password;

    /** User confirm password field value. */
    private static String confirmPassword;

    /** User year of birth field value. */
    private static String yearOfBirth;

    /** Login password field value. */
    private static String loginPass;

    /** Returned email from database. */
    private static String returnedEmail;

    /** Returned password from database. */
    private static String returnedPassword;

    /** Email text field value. */
    private static String emailText;

    /**
     * Constructor that initializes the authentication UI.
     */
    public AuthUI() {
        this.designAuth();
    }

    /**
     * Designs and creates the main authentication frame.
     * @return the configured main JFrame.
     */
    public JFrame designAuth() {
        frame = new JFrame("SWING AUTHENTICATION");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final int frameX = 200;
        final int frameY = 300;
        final int frameWidth = 1000;
        final int frameHeight = 1200;

        frame.setBounds(frameX, frameY, frameWidth, frameHeight);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(createContentPanel());

        return frame;
    }

    /**
     * Creates and configures the main content panel with card layout.
     * @return the configured content panel.
     */
    public static JPanel createContentPanel() {
        panel = new JPanel();
        panel.setLayout(cardLayout);

        panel.add("signIn", LogIn.createSignIn());
        panel.add("signUp", SignUp.createSignUp());
        panel.add("dash", DashBoard.dashBoard());

        return panel;
    }

    /**
     * Gets the main application frame.
     * @return the main JFrame.
     */
    public static JFrame getFrame() {
        return frame;
    }

    /**
     * Gets the main content panel.
     * @return the main JPanel.
     */
    public static JPanel getPanel() {
        return panel;
    }

    /**
     * Gets the card layout manager.
     * @return the CardLayout instance.
     */
    public static CardLayout getCardLayout() {
        return cardLayout;
    }

    /**
     * Gets the action listener instance.
     * @return the ActionListenerImpl instance.
     */
    public static Listener.ActionListenerImpl getActionListener() {
        return al;
    }

    /**
     * Gets the user name.
     * @return the user name.
     */
    public static String getName() {
        return name;
    }

    /**
     * Sets the user name.
     * @param userName the user name to set.
     */
    public static void setName(final String userName) {
        AuthUI.name = userName;
    }

    /**
     * Gets the user address.
     * @return the user address.
     */
    public static String getAddress() {
        return address;
    }

    /**
     * Sets the user address.
     * @param userAddress the user address to set.
     */
    public static void setAddress(final String userAddress) {
        AuthUI.address = userAddress;
    }

    /**
     * Gets the user email.
     * @return the user email.
     */
    public static String getEmail() {
        return email;
    }

    /**
     * Sets the user email.
     * @param userEmail the user email to set.
     */
    public static void setEmail(final String userEmail) {
        AuthUI.email = userEmail;
    }

    /**
     * Gets the user phone number.
     * @return the user phone number.
     */
    public static String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the user phone number.
     * @param userPhoneNumber the user phone number to set.
     */
    public static void setPhoneNumber(final String userPhoneNumber) {
        AuthUI.phoneNumber = userPhoneNumber;
    }

    /**
     * Gets the user password.
     * @return the user password.
     */
    public static String getPassword() {
        return password;
    }

    /**
     * Sets the user password.
     * @param userPassword the user password to set.
     */
    public static void setPassword(final String userPassword) {
        AuthUI.password = userPassword;
    }

    /**
     * Gets the confirmation password.
     * @return the confirmation password.
     */
    public static String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Sets the confirmation password.
     * @param userConfirmPassword the confirmation password to set.
     */
    public static void setConfirmPassword(final String userConfirmPassword) {
        AuthUI.confirmPassword = userConfirmPassword;
    }

    /**
     * Gets the year of birth.
     * @return the year of birth.
     */
    public static String getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Sets the year of birth.
     * @param userYearOfBirth the year of birth to set.
     */
    public static void setYearOfBirth(final String userYearOfBirth) {
        AuthUI.yearOfBirth = userYearOfBirth;
    }

    /**
     * Gets the login password.
     * @return the login password.
     */
    public static String getLoginPass() {
        return loginPass;
    }

    /**
     * Sets the login password.
     * @param userLoginPass the login password to set.
     */
    public static void setLoginPass(final String userLoginPass) {
        AuthUI.loginPass = userLoginPass;
    }

    /**
     * Gets the returned email from database.
     * @return the returned email.
     */
    public static String getReturnedEmail() {
        return returnedEmail;
    }

    /**
     * Sets the returned email from database.
     * @param dbReturnedEmail the returned email to set.
     */
    public static void setReturnedEmail(final String dbReturnedEmail) {
        AuthUI.returnedEmail = dbReturnedEmail;
    }

    /**
     * Gets the returned password from database.
     * @return the returned password.
     */
    public static String getReturnedPassword() {
        return returnedPassword;
    }

    /**
     * Sets the returned password from database.
     * @param dbReturnedPassword the returned password to set.
     */
    public static void setReturnedPassword(final String dbReturnedPassword) {
        AuthUI.returnedPassword = dbReturnedPassword;
    }

    /**
     * Gets the email text.
     * @return the email text.
     */
    public static String getEmailText() {
        return emailText;
    }

    /**
     * Sets the email text.
     * @param userEmailText the email text to set.
     */
    public static void setEmailText(final String userEmailText) {
        AuthUI.emailText = userEmailText;
    }
}
