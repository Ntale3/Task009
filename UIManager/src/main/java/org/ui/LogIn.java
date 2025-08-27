package org.ui;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import static org.ui.UIConstants.BORDER_RIGHT;
import static org.ui.UIConstants.FRAME_X;
import static org.ui.UIConstants.FRAME_Y;
import static org.ui.UIConstants.DIMENSION_HEIGHT;
import static org.ui.UIConstants.DIMENSION_WIDTH;




/**
 * LogIn class for creating login UI components.
 * This class provides static methods to create and configure
 * login form elements including email field, password field, and buttons.
 */
public final class LogIn {

    /** The main login panel frame. */
    private static JPanel frame;

    /** Password field for user password input. */
    private static JPasswordField jPasswordField;

    /** Text field for email input. */
    private static JTextField emailTextField;

    /** Label for email field. */
    private static JLabel emailLabel;

    /** Label for password field. */
    private static JLabel passwordLabel;

    /** Button for creating new account. */
    private static JButton createAcc;

    /** Button for user login. */
    private static JButton logIn;

    // UI positioning constants
    /** X position for left alignment of components. */
    private static final int LEFT_X_POSITION = 100;

    /** Width for input fields and labels. */
    private static final int COMPONENT_WIDTH = 700;

    /** Height for input fields and labels. */
    private static final int COMPONENT_HEIGHT = 90;

    /** Y position for email label. */
    private static final int EMAIL_LABEL_Y = 200;

    /** Y position for email field. */
    private static final int EMAIL_FIELD_Y = 286;

    /** Y position for password label. */
    private static final int PASSWORD_LABEL_Y = 520;

    /** Y position for password field. */
    private static final int PASSWORD_FIELD_Y = 600;

    /** Y position for buttons. */
    private static final int BUTTON_Y = 800;

    /** X position for login button. */
    private static final int LOGIN_BUTTON_X = 145;

    /** X position for create account button. */
    private static final int CREATE_BUTTON_X = 455;

    /** Width for buttons. */
    private static final int BUTTON_WIDTH = 300;

    /** Font size for input fields. */
    private static final int INPUT_FONT_SIZE = 32;

    /** Font size for labels. */
    private static final int LABEL_FONT_SIZE = 32;

    /** Font size for buttons. */
    private static final int BUTTON_FONT_SIZE = 24;

    /** Font size for title. */
    private static final int TITLE_FONT_SIZE = 40;

    /** The width of the login frame. */
    private static final int FRAME_WIDTH = 900;

    /** The height of the login frame. */
    private static final int FRAME_HEIGHT = 1200;

    /** The y-coordinate for the title label. */
    private static final int TITLE_Y = 10;

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private LogIn() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Creates and returns the sign-in panel with all login components.
     * @return the configured login JPanel
     */
    public static JPanel createSignIn() {
        frame = new JPanel();
        frame.setLayout(null);
        frame.setBounds(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);

        frame.add(createEmailLabel());
        frame.add(createEmailField());
        frame.add(createPasswordLabel());
        frame.add(createPasswordField());
        frame.add(createLoginButton());
        frame.add(createAccountButton());
        frame.add(createTitle());

        return frame;
    }

    /**
     * Creates the password
     * field for user input.
     * @return the
     * configured password field
     */
    public static JPasswordField createPasswordField() {
        jPasswordField = new JPasswordField();
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, INPUT_FONT_SIZE));
        jPasswordField.setBorder(BorderFactory
                      .createEmptyBorder(0, 0, 0, BORDER_RIGHT));
        jPasswordField.setBounds(
                LEFT_X_POSITION,
                PASSWORD_FIELD_Y,
                COMPONENT_WIDTH,
                COMPONENT_HEIGHT
        );
        return jPasswordField;
    }

    /**
     * Creates the email text field for user input.
     * @return the configured email text field
     */
    public static JTextField createEmailField() {
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Tahoma", Font.PLAIN, INPUT_FONT_SIZE));
        emailTextField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        emailTextField.setBounds(
                LEFT_X_POSITION,
                EMAIL_FIELD_Y,
                COMPONENT_WIDTH,
                COMPONENT_HEIGHT
        );
        return emailTextField;
    }

    /**
     * Creates the email label.
     * @return the configured email label
     */
    public static JLabel createEmailLabel() {
        emailLabel = new JLabel("EMAIL");
        emailLabel.setBounds(
                LEFT_X_POSITION,
                EMAIL_LABEL_Y,
                COMPONENT_WIDTH,
                COMPONENT_HEIGHT
        );
        emailLabel.setFont(new Font("Tahoma", Font.BOLD, LABEL_FONT_SIZE));
        return emailLabel;
    }

    /**
     * Creates the title label for the login form.
     * @return the configured title label
     */
    public static JLabel createTitle() {
        final JLabel titleLabel = new JLabel("LOGIN OR CREATE ACCOUNT");
        titleLabel.setBounds(
                LOGIN_BUTTON_X,
                TITLE_Y,
                COMPONENT_WIDTH,
                COMPONENT_HEIGHT
        );
        titleLabel.setFont(new Font("Arial", Font.BOLD, TITLE_FONT_SIZE));
        return titleLabel;
    }

    /**
     * Creates the password label.
     * @return the configured password label
     */
    public static JLabel createPasswordLabel() {
        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(
                LEFT_X_POSITION,
                PASSWORD_LABEL_Y,
                COMPONENT_WIDTH,
                COMPONENT_HEIGHT
        );
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, LABEL_FONT_SIZE));
        return passwordLabel;
    }

    /**
     * Creates the login button.
     * @return the configured login button
     */
    public static JButton createLoginButton() {
        logIn = new JButton();
        logIn.setText("LOGIN");
        logIn.setBounds(
                LOGIN_BUTTON_X,
                BUTTON_Y,
                BUTTON_WIDTH,
                COMPONENT_HEIGHT
        );
        logIn.setPreferredSize(
                new Dimension(DIMENSION_WIDTH, DIMENSION_HEIGHT));
        logIn.setFont(new Font("Tahoma", Font.BOLD, BUTTON_FONT_SIZE));
        logIn.setFocusPainted(false);
        logIn.addActionListener(AuthUI.getActionListener());
        return logIn;
    }

    /**
     * Creates the create account button.
     * @return the configured create account button
     */
    public static JButton createAccountButton() {
        createAcc = new JButton();
        createAcc.setText("CREATE ACCOUNT");
        createAcc.setBounds(
                CREATE_BUTTON_X,
                BUTTON_Y,
                BUTTON_WIDTH,
                COMPONENT_HEIGHT
        );
        createAcc.setPreferredSize(
                new Dimension(DIMENSION_WIDTH, DIMENSION_HEIGHT));
        createAcc.setFont(new Font("Tahoma", Font.BOLD, BUTTON_FONT_SIZE));
        createAcc.setFocusPainted(false);
        createAcc.addActionListener(AuthUI.getActionListener());
        return createAcc;
    }

    /**
     * Gets the login panel frame.
     * @return the login panel
     */
    public static JPanel getFrame() {
        return frame;
    }

    /**
     * Gets the password field.
     * @return the password field
     */
    public static JPasswordField getJPasswordField() {
        return jPasswordField;
    }

    /**
     * Gets the email text field.
     * @return the email text field
     */
    public static JTextField getEmailTextField() {
        return emailTextField;
    }

    /**
     * Gets the email label.
     * @return the email label
     */
    public static JLabel getEmailLabel() {
        return emailLabel;
    }

    /**
     * Gets the password label.
     * @return the password label
     */
    public static JLabel getPasswordLabel() {
        return passwordLabel;
    }

    /**
     * Gets the create account button.
     * @return the create account button
     */
    public static JButton getCreateAcc() {
        return createAcc;
    }

    /**
     * Gets the login button.
     * @return the login button
     */
    public static JButton getLogIn() {
        return logIn;
    }
}
