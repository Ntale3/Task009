package org.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Utility class for handling PostgreSQL database connections and operations.
 */
public final class DatabaseConnect {


    /** The email value retrieved from the database. */
    private static String emailValue;
    /** The password value retrieved from the database. */
    private static String passwordValue;
    /** The address value retrieved from the database. */
    private static String address;
    /** The phone number value retrieved from the database. */
    private static String phoneNumber;
    /** The birth year value retrieved from the database. */
    private static String birthYear;
    /** The name value retrieved from the database. */
    private static String name;

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private DatabaseConnect() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Gets the stored email value.
     * @return the email value
     */
    public static String getEmailValue() {
        return emailValue;
    }

    /**
     * Gets the stored Password value.
     * @return the Password value
     */
    public static String getPasswordValue() {
        return passwordValue;
    }

    /**
     * Sets the email value.
     * @param email the email to set
     */
    public static void setEmailValue(final String email) {
        DatabaseConnect.emailValue = email;
    }

    /**
     * Sets the address value.
     * @param addr the address to set
     */
    public static void setAddress(final String addr) {
        DatabaseConnect.address = addr;
    }

    /**
     * Sets the PhoneNumber value.
     * @param phone the phoneNumber to set
     */
    public static void setPhoneNumber(final String phone) {
        DatabaseConnect.phoneNumber = phone;
    }

    /**
     * Sets the name value.
     * @param newName the name to set
     */
    public static void setName(final String newName) {
        DatabaseConnect.name = newName;
    }

    /**
     * Establishes a connection to PostgreSQL database.
     *
     * @param dbName   database name
     * @param userName username
     * @param password password
     * @return connection object
     */
    public static Connection dbConn(final String dbName,
                                    final String userName,
                                    final String password) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/"
                    + dbName, userName, password
            );

            if (conn != null) {
                System.out.println("Connected to PostgreSQL database!");
                DatabaseConnect.createTable(conn, "user_info");
            } else {
                System.out.println("Connection failed");
            }

        } catch (Exception e) {
            System.out.println("Not connected!");
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * Creates a table if it does not exist.
     * @param conn connection
     * @param tableName Table name
     */
    public static void createTable(final Connection conn,
                                   final String tableName) {
        try (Statement statement = conn.createStatement()) {
            String query = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                    + "userId SERIAL PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "yearOfBirth VARCHAR(5), "
                    + "address VARCHAR(200), "
                    + "phoneNumber VARCHAR(20), "
                    + "email VARCHAR(200) UNIQUE, "
                    + "password VARCHAR(20) NOT NULL"
                    + ");";

            statement.executeUpdate(query);
            System.out.println("Table " + tableName
                    + " created in the target database");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * Inserts a new user record.
     * @param conn the database connection
     * @param tableName the name of the table
     * @param user the email of the user

     */
    public static void insertData(final Connection conn,
                                  final String tableName,
                                  final UserDTO user
                                  ) {
        try (Statement statement = conn.createStatement()) {
            String query = String.format(
                    "INSERT INTO %s(name, yearOfBirth, address, "
                    + "phoneNumber, email, password) "
                    + "VALUES('%s', '%s', '%s', '%s', '%s', '%s');",
                    tableName, user.getNewName(),
                    user.getYearOfBirth(),
                    user.getAddressValue(),
                    user.getPhoneValue(),
                    user.getEmailValue(),
                    user.getPasswordValue()
            );

            statement.executeUpdate(query);
            System.out.println("1 row affected");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * Update User Data.
     *
     * @param conn the database connection
     * @param tableName the name of the table to create
     * @param oldValue the value to be Changed
     * @param newValue the value to be Changed
     */
    public static void updateData(final Connection conn,
                                  final String tableName,
                                  final String oldValue,
                                  final String newValue) {
        try (Statement statement = conn.createStatement()) {
            String query = String.format(
                    "UPDATE %s SET name='%s' WHERE name='%s';",
                    tableName, newValue, oldValue
            );
            statement.executeUpdate(query);
            System.out.println("Data updated");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * Reads a user record by email.
     *@param conn the database connection
    *@param tableName the name of the table to read from
    *@param email the email of the user whose data is to be read
     *
     */
    public static void readData(final Connection conn,
                                final String tableName,
                                final String email) {
        try (Statement statement = conn.createStatement()) {
            String query = String.format("SELECT * FROM %s WHERE email='%s';",
                           tableName, email);
            ResultSet res = statement.executeQuery(query);

            while (res.next()) {
                setName(res.getString("name"));
                setAddress(res.getString("address"));
                setEmailValue(res.getString("email"));
                setPhoneNumber(res.getString("phoneNumber"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * Searches for a user by email.
     * @param conn the database connection
     * @param tableName the name of the table to delete from
     * @param field the email of the  user
     */
    public static void searchBy(final Connection conn,
                                final String tableName,
                                final String field) {
        try (Statement statement = conn.createStatement()) {
            String query = String.format("SELECT * FROM %s WHERE email='%s';",
                    tableName, field);
            ResultSet res = statement.executeQuery(query);

            while (res.next()) {
                emailValue = res.getString("email");
                passwordValue = res.getString("password");
                address = res.getString("address");
                phoneNumber = res.getString("phoneNumber");
                birthYear = res.getString("yearOfBirth");
                name = res.getString("name");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    //@param conn the database connection
    //    *@param tableName the name of the table to read from

    /**
     * Deletes a user record by name.
     * @param conn the database connection
     * @param tableName the name of the table to delete from
     * @param value value to be deleted if matched;
     */
    public static void deleteUser(final Connection conn,
                                  final String tableName,
                                  final String value) {
        try (Statement statement = conn.createStatement()) {
            String query = String.format(
                    "DELETE FROM %s WHERE name='%s';", tableName, value
            );
            statement.executeUpdate(query);
            System.out.println("User deleted!");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
