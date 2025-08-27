package org.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.database.Config;
import org.database.DatabaseConnect;
import org.database.UserDTO;



/**
 * Listener class containing action listeners for UI components.
 */
public final class Listener {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private Listener() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Action listener implementation for handling UI events.
     */
    public static class ActionListenerImpl implements ActionListener {

        /**
         * Handles action events from various UI components.
         * @param e the action event
         */
        @Override
        public void actionPerformed(final ActionEvent e) {
            final JButton src = (JButton) e.getSource();

            handleLoginAction(src);
            handleCreateAccountAction(src);
            handleSignInAction(src);
            handleRegisterAction(src);
        }

        /**
         * Handles login button action.
         * @param src the source button
         */
        private void handleLoginAction(final JButton src) {
            if (src.equals(LogIn.getLogIn())) {
                AuthUI.setEmailText(LogIn.getEmailTextField().getText());
                final char[] passwordChar =
                        LogIn.getJPasswordField().getPassword();
                AuthUI.setLoginPass(new String(passwordChar));

                DatabaseConnect.searchBy(Config.getConnection(),
                        Config.getTableName(), AuthUI.getEmailText());

                if (AuthUI.getEmailText().
                        equals(DatabaseConnect.getEmailValue())
                    && AuthUI.getLoginPass().
                        equals(DatabaseConnect.getPasswordValue())) {
                    DatabaseConnect.
                            readData(Config.getConnection(),
                            Config.getTableName(), AuthUI.getEmailText());
                    JOptionPane.
                            showMessageDialog(AuthUI.getFrame(),
                                     "Login successfully!",
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                    AuthUI.getCardLayout().show(AuthUI.getPanel(),
                            "dash");
                } else {
                    JOptionPane.showMessageDialog(
                            AuthUI.getFrame(), "Invalid credentials!",
                            "Failure", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        /**
         * Handles create account button action.
         * @param src the source button
         */
        private void handleCreateAccountAction(final JButton src) {
            if (src.equals(LogIn.getCreateAcc())) {
                AuthUI.getCardLayout().show(AuthUI.getPanel(), "signUp");
            }
        }

        /**
         * Handles sign in button action.
         * @param src the source button
         */
        private void handleSignInAction(final JButton src) {
            if (src.equals(SignUp.getSignIn())) {
                AuthUI.getCardLayout().show(AuthUI.getPanel(), "signIn");
            }
        }

        /**
         * Handles register button action.
         * @param src the source button
         */
        private void handleRegisterAction(final JButton src) {
            if (src.equals(SignUp.getRegister())) {
                extractFormData();

                final char[] passwordChar = SignUp.getPassword()
                                            .getPassword();
                final char[] confirmChar = SignUp
                        .getConfirmPassword()
                        .getPassword();
                if (Arrays.
                    equals(passwordChar,
                    confirmChar)) {
                    AuthUI.setPassword(new String(SignUp
                            .getPassword().getPassword()));
                    AuthUI.setConfirmPassword(new String(SignUp
                            .getConfirmPassword().getPassword()));
                if (areAllFieldsValid()) {
                        registerUser();
                        clearAllFields();
                        showSuccessMessage();
                        AuthUI.getCardLayout().show(AuthUI.getPanel(), "dash");
                    } else {
                        showFieldValidationError();
                    }
                } else {
                    showPasswordMismatchError();
                }
            }
        }

        /**
         * Extracts form data from UI components.
         */
        private void extractFormData() {
            AuthUI.setName(SignUp.getNameTextField().getText());
            AuthUI.setYearOfBirth(SignUp.getYearOfBirthField().getText());
            AuthUI.setAddress(SignUp.getAddressField().getText());
            AuthUI.setPhoneNumber(SignUp.getPhoneNumber().getText());
            AuthUI.setEmail(SignUp.getEmail().getText());
        }

        /**
         * Validates that all
         * required fields are filled.
         * @return true if all
         * fields are valid, false otherwise
         */
        private boolean areAllFieldsValid() {
            return !AuthUI.getName().isEmpty()
                    && !AuthUI.getYearOfBirth().isEmpty()
                    && !AuthUI.getAddress().isEmpty()
                    && !AuthUI.getPhoneNumber().isEmpty()
                    && !AuthUI.getEmail().isEmpty()
                    && !AuthUI.getPassword().isEmpty()
                    && !AuthUI.getConfirmPassword().isEmpty();
        }

        /**
         * Registers a new user in the database.
         */
        private void registerUser() {
            final UserDTO user = new UserDTO(AuthUI.getName(),
                    AuthUI.getYearOfBirth(),
                    AuthUI.getAddress(),
                    AuthUI.getPhoneNumber(),
                    AuthUI.getEmail(),
                    AuthUI.getPassword());
            DatabaseConnect.insertData(Config.getConnection(),
                    Config.getTableName(), user);
        }

        /**
         * Clears all form fields after successful registration.
         */
        private void clearAllFields() {
            SignUp.getNameTextField().setText("");
            SignUp.getEmail().setText("");
            SignUp.getPhoneNumber().setText("");
            SignUp.getAddressField().setText("");
            SignUp.getPassword().setText("");
            SignUp.getConfirmPassword().setText("");
            SignUp.getYearOfBirthField().setText("");
        }

        /**
         * Shows success message for successful registration.
         */
        private void showSuccessMessage() {
            JOptionPane.showMessageDialog(AuthUI.getFrame(),
                    "Operation completed successfully!",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        /**
         * Shows error message for field validation failure.
         */
        private void showFieldValidationError() {
            JOptionPane
                    .showMessageDialog(AuthUI.getFrame(),
                    "Check all fields before submission!",
                    "Failure", JOptionPane.ERROR_MESSAGE);
        }

        /**
         * Shows error message for password mismatch.
         */
        private void showPasswordMismatchError() {
            JOptionPane
                    .showMessageDialog(
                    AuthUI.getFrame(), "Passwords must match!",
                    "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }
}
