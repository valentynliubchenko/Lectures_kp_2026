package ua.nure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientPrintWriterUTF8 {
    public static void main( String[] args ) {
        System.out.println( "Client Started!" );
        int port = 8080;
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),port);
            System.out.println( "Client conected!" );
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            String received = in.readLine();
            System.out.println( "Client received: " + received );
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
