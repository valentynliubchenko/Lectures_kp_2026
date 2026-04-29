package ua.nure;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientBasic {
    public static void main( String[] args ) {
        System.out.println( "Client Started!" );
        int port = 8080;
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),port);
            System.out.println( "Client conected!" );
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
