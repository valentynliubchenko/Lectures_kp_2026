package ua.nure;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App
{
    public static void main( String[] args ) throws UnknownHostException {
        System.out.println( "Hello World!" );
        // 1. Локальний хост
        InetAddress local = InetAddress.getLocalHost();
        System.out.println(local);
        // наприклад: DESKTOP-123/192.168.1.5


        // 2. За доменом
        InetAddress google = InetAddress.getByName("google.com");
        System.out.println(google);
        // google.com/142.250.74.14

        // 3. За IP
        InetAddress ip = InetAddress.getByName("8.8.8.8");
        System.out.println(ip.getHostName());
        // dns.google (reverse DNS, якщо є)
    }
}
