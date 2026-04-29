package ua.nure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientObject {
    public static void main( String[] args ) {
        System.out.println( "Client Started!" );
        int port = 8083;
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),port);
            System.out.println( "Client conected!" );
            Person person = new Person("Микола", 45);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(person);

            System.out.println( "Client person was sent: " + person );
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
