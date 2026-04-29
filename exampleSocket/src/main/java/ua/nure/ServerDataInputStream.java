package ua.nure;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDataInputStream
{
    public static void main( String[] args )  {
        System.out.println( "Server starting!" );
        int port = 8081;
        try (ServerSocket serverSocket = new ServerSocket( port )) {
            while ( true ) {
                Socket socket =serverSocket.accept();

                DataInputStream in = new DataInputStream( socket.getInputStream());
                int message = in.readInt();
                System.out.println("Received message" + message );
                System.out.println( "Client conected!" );

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
