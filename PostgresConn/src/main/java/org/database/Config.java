package org.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;

/**
 * Configuration class for environment variables and database connection.
 */
public final class Config {

    /** Dotenv instance for loading environment variables. */
    private static final Dotenv DOTENV = Dotenv.load();

    /** Database name. */
    private static final String DB_NAME = DOTENV.get("DB_NAME");

    /** Database username. */
    private static final String DB_USER = DOTENV.get("DB_USER");

    /** Database password. */
    private static final String DB_PASSWORD = DOTENV.get("DB_PASSWORD");

    /** Database table name. */
    private static final String DB_TABLE = DOTENV.get("DB_TABLE");

    /** Database connection. */
    private static final Connection DB_CONNECTION =
            DatabaseConnect.dbConn(DB_NAME, DB_USER, DB_PASSWORD);

    /** Private constructor to prevent instantiation. */
    private Config() {
        throw new AssertionError("Utility class - do not instantiate");
    }

    /** @return database name */
    public static String getDbName() {
        return DB_NAME;
    }

    /** @return database username */
    public static String getDbUser() {
        return DB_USER;
    }

    /** @return database password */
    public static String getDbPassword() {
        return DB_PASSWORD;
    }

    /** @return database table name */
    public static String getTableName() {
        return DB_TABLE;
    }

    /** @return database connection */
    public static Connection getConnection() {
        return DB_CONNECTION;
    }
}
