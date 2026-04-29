package ua.nure;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBasic2
{
    public static void main( String[] args )  {
        System.out.println( "Server starting!" );
        try (ServerSocket serverSocket = new ServerSocket( 8082 )) {
            Socket socket =serverSocket.accept();

            System.out.println( "Client conected!" );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
