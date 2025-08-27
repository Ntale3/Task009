package org.ui;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * Dashboard UI component for the application main interface.
 */
public final class DashBoard {

    /** The main dashboard panel. */
    private static final JPanel FRAME;

    /** The title label for the dashboard. */
    private static final JLabel TITLE;

    /** The label displaying user-specific information. */
    private static final JLabel LABEL;

    /** The button for retrieving data. */
    private static final JButton DATA;

    // Frame positioning and sizing constants
    /** The x-coordinate for the frame's top-left corner. */
    private static final int FRAME_X = 200;
    /** The y-coordinate for the frame's top-left corner. */
    private static final int FRAME_Y = 300;
    /** The width of the frame. */
    private static final int FRAME_WIDTH = 1000;
    /** The height of the frame. */
    private static final int FRAME_HEIGHT = 1200;

    // Title positioning constants
    /** The x-coordinate for the title label. */
    private static final int TITLE_X = 350;
    /** The y-coordinate for the title label. */
    private static final int TITLE_Y = 10;
    /** The width of the title label. */
    private static final int TITLE_WIDTH = 700;
    /** The height of the title label. */
    private static final int TITLE_HEIGHT = 40;

    // Label positioning and styling constants
    /** The width of dashboard labels. */
    private static final int LABEL_WIDTH = 400;
    /** The height of dashboard labels. */
    private static final int LABEL_HEIGHT = 90;
    /** The font size for dashboard labels. */
    private static final int LABEL_FONT_SIZE = 32;
    /** The right border size for labels. */
    private static final int BORDER_RIGHT = 40;

    // Button positioning and styling constants
    /** The x-coordinate for the data button. */
    private static final int DATA_BUTTON_X = 145;
    /** The y-coordinate for the data button. */
    private static final int DATA_BUTTON_Y = 800;
    /** The width of the data button. */
    private static final int BUTTON_WIDTH = 300;
    /** The height of the data button. */
    private static final int BUTTON_HEIGHT = 90;
    /** The width used in button dimensions. */
    private static final int DIMENSION_WIDTH = 2;
    /** The height used in button dimensions. */
    private static final int DIMENSION_HEIGHT = 9;
    /** The font size for buttons. */
    private static final int BUTTON_FONT_SIZE = 24;

    /** Background color for labels. */
    private static final Color LABEL_BACKGROUND = new Color(204, 229, 255);

    static {
        FRAME = new JPanel();
        TITLE = new JLabel();
        LABEL = new JLabel();
        DATA = new JButton();
    }

    private DashBoard() {
        throw new AssertionError("Utility class - do not instantiate");
    }

    /**
     * Creates and returns the main dashboard panel.
     * @return the configured dashboard panel
     */
    public static JPanel dashBoard() {
        FRAME.setLayout(null);
        FRAME.setBounds(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT);
        FRAME.add(createTitle());
        FRAME.add(createLoginButton());
        FRAME.setVisible(true);
        return FRAME;
    }

    /**
     * Creates the title label for the dashboard.
     * @return the configured title label
     */
    public static JLabel createTitle() {
        TITLE.setText("Welcome to the DashBoard");
        TITLE.setBounds(TITLE_X, TITLE_Y, TITLE_WIDTH, TITLE_HEIGHT);
        TITLE.setFont(new Font("Tahoma", Font.BOLD, LABEL_FONT_SIZE));
        return TITLE;
    }

    /**
     * Creates a dashboard name label with specified position and text.
     * @param y the y-coordinate for the label
     * @param x the x-coordinate for the label
     * @param labelName the text to display on the label
     * @return the configured label
     */
    public static JLabel createDashboardName(final int y,
                                             final int x,
                                             final String labelName) {
        LABEL.setText(labelName);
        LABEL.setFont(new Font("Tahoma", Font.PLAIN, LABEL_FONT_SIZE));
        LABEL.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, BORDER_RIGHT));
        LABEL.setBounds(x, y, LABEL_WIDTH, LABEL_HEIGHT);
        LABEL.setBackground(LABEL_BACKGROUND);
        LABEL.setOpaque(true);
        return LABEL;
    }

    /**
     * Creates the data button for the dashboard.
     * @return the configured data button
     */
    public static JButton createLoginButton() {
        DATA.setText("GET DATA");
        DATA.setBounds(DATA_BUTTON_X,
                DATA_BUTTON_Y,
                BUTTON_WIDTH,
                BUTTON_HEIGHT);
        DATA.setPreferredSize(new Dimension(DIMENSION_WIDTH, DIMENSION_HEIGHT));
        DATA.setFont(new Font("Tahoma", Font.BOLD, BUTTON_FONT_SIZE));
        DATA.setFocusPainted(false);
        return DATA;
    }
}
