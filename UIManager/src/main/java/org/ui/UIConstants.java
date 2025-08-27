package org.ui;


/**
 * Utility class that holds UI-related constant values
 * for frame, fields, buttons, titles, fonts, borders, and dimensions.
 * <p>
 * This class cannot be instantiated.
 * </p>
 */
public final class UIConstants {

    /**
     * Private constructor to prevent instantiation of this utility class.
     *
     * @throws AssertionError if this constructor is called
     */
    private UIConstants() {
        throw new AssertionError("Utility class - do not instantiate");
    }

    /** X position of the main frame. */
    public static final int FRAME_X = 200;

    /** Y position of the main frame. */
    public static final int FRAME_Y = 300;

    /** Width of the main frame. */
    public static final int FRAME_WIDTH = 900;

    /** Height of the main frame. */
    public static final int FRAME_HEIGHT = 1200;

    /** X position of text fields. */
    public static final int FIELD_X = 280;

    /** Width of text fields. */
    public static final int FIELD_WIDTH = 700;

    /** Height of text fields. */
    public static final int FIELD_HEIGHT = 90;

    /** X position of the register button. */
    public static final int REGISTER_BUTTON_X = 145;

    /** X position of the login button. */
    public static final int LOGIN_BUTTON_X = 550;

    /** Y position of buttons. */
    public static final int BUTTON_Y = 900;

    /** Width of buttons. */
    public static final int BUTTON_WIDTH = 300;

    /** Height of buttons. */
    public static final int BUTTON_HEIGHT = 90;

    /** X position of the title label. */
    public static final int TITLE_X = 400;

    /** Y position of the title label. */
    public static final int TITLE_Y = 10;

    /** Width of the title label. */
    public static final int TITLE_WIDTH = 700;

    /** Height of the title label. */
    public static final int TITLE_HEIGHT = 40;

    /** Font size for text fields. */
    public static final int FIELD_FONT_SIZE = 32;

    /** Font size for buttons. */
    public static final int BUTTON_FONT_SIZE = 24;

    /** Font size for the title. */
    public static final int TITLE_FONT_SIZE = 32;

    /** Right border width. */
    public static final int BORDER_RIGHT = 40;

    /** Dimension width value. */
    public static final int DIMENSION_WIDTH = 2;

    /** Dimension height value. */
    public static final int DIMENSION_HEIGHT = 9;
}
