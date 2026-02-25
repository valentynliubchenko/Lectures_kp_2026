package ua.nure;

public class AppConfig {
    public static void main(String[] args) {
        System.out.println(Config.MAX_USERS);
        Config.MAX_USERS =123;
        Config conf = new Config();
        System.out.println(conf.MAX_USERS);
    }
}
