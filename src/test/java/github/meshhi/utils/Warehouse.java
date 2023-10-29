package github.meshhi.utils;

public class Warehouse {
    private static String login = "standard_user";
    private static String password = "secret_sauce";

    public static String getLogin() {
        return Warehouse.login;
    }

    public static String getPassword() {
        return Warehouse.password;
    }
}
