package org.example;

import org.ui.AuthUI;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Entry point for the application, responsible for initializing the UI.
 */
public final class Main {

    /** Private constructor to prevent instantiation of utility class. */
    private Main() {
        throw new AssertionError("Utility class - do not instantiate");
    }

    /**
     * Launches the application
     * by setting the look
     * and feel and initializing
     * the authentication UI.
     * @param args command-line
     * arguments (not used)
     * @throws UnsupportedLookAndFeelException
     * if the specified look and feel is not supported
     * @throws ClassNotFoundException
     * if the look and feel class is not found
     * @throws InstantiationException
     * if the look and feel class cannot be instantiated
     * @throws IllegalAccessException
     * if access to the look and feel class is denied
     */
    public static void main(final String[] args)
            throws UnsupportedLookAndFeelException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        } catch (UnsupportedLookAndFeelException
                 | ClassNotFoundException
                 |  InstantiationException
                 | IllegalAccessException e) {
            System.err.println("Failed to set look and feel: "
                    + e.getMessage());
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }

        SwingUtilities.invokeLater(AuthUI::new);
    }
}
