package ua.nure;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrintWriter
{
    public static void main( String[] args )  {
        System.out.println( "Server starting!" );
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket( port )) {
            Socket socket =serverSocket.accept();
            PrintWriter out = new PrintWriter( socket.getOutputStream(), true );
            out.flush();
            out.println( "My message!" );
            System.out.println( "Client conected!" );
            System.out.println( "Message was sent!" );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
