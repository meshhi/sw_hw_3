package github.meshhi.utils;

public class Warehouse {
    private static String login = "standard_user";
    private static String password = "secret_sauce";
    private static String firstName = "John";
    private static String lastName = "Doe";
    private static String postalCode = "163000";

    public static String getLogin() {
        return Warehouse.login;
    }

    public static String getPassword() {
        return Warehouse.password;
    }

    public static String getFirstName() {
        return Warehouse.firstName;
    }

    public static String getLastName() {
        return Warehouse.lastName;
    }

    public static String getPostalCode() {
        return Warehouse.postalCode;
    }
}
