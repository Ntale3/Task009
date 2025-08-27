package org.ui;

import javax.swing.JLabel;
import java.awt.Font;

/**
 * Utility class for creating UI components.
 */
public final class Component {
    /**
     * Default X position.
     */
    private static final int DEFAULT_X_POSITION = 40;
    /**
     * Default Width.
     */
    private static final int DEFAULT_WIDTH = 700;
    /**
     * Default Height.
     */
    private static final int DEFAULT_HEIGHT = 90;
    /**
     * Default Font Size.
     */
    private static final int DEFAULT_FONT_SIZE = 32;

    /**
     * add JLabel Component.
     */
    private static JLabel label;

    /**
    * Private constructor to prevent instantiation of utility class.
    */
    private Component() {
        throw new UnsupportedOperationException("Utility class");
    }


    /**
     * Creates a label component with specified text and y-axis position.
     * @param labelName The text to display on the label.
     * @param yAxis The y-coordinate position for the label.
     * @return JLabel configured with the specified parameters.
     */
    public static JLabel createLabelComponent(final String labelName,
                                              final int yAxis) {
        label = new JLabel(labelName);
        label.setBounds(DEFAULT_X_POSITION,
                yAxis, DEFAULT_WIDTH,
                DEFAULT_HEIGHT);
        label.setFont(new Font("Tahoma",
                Font.BOLD,
                DEFAULT_FONT_SIZE));

        return label;
    }
}
