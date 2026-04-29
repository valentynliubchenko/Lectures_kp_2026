package ua.nure;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDataInputStream {
    public static void main( String[] args ) {
        System.out.println( "Client Started!" );
        int port = 8083;
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),port);
            System.out.println( "Client conected!" );
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            int message = 120;
            out.writeInt(message);
            System.out.println( "Client sent message: " + message );
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
